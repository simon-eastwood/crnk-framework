/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.springframework.stereotype.Component;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.Tunnel;

/**
 * ResourceRepositoryBase-based example with the base class providing some base
 * functionality.
 */
@Component
public class TunnelRepositoryImpl extends ResourceRepositoryBase<Tunnel, String> implements TunnelRepository {
	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);
	private Map<String, Tunnel> myHashMap = new HashMap<>();

	public TunnelRepositoryImpl() {
		super(Tunnel.class);
		try {
			this.loadFromJar();
		} catch (Exception e) {
			System.out.println("Cannot load any files from jar ");
			System.out.println(e);
		}
	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends Tunnel> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.seteTag(String.valueOf(System.currentTimeMillis()));
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized TunnelList findAll(QuerySpec querySpec) {
		TunnelList list = new TunnelList();
		list.setMeta(new TunnelListMeta());
		list.setLinks(new TunnelListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

	private void loadFromJar() throws Exception {
		CodeSource src = TunnelRepositoryImpl.class.getProtectionDomain().getCodeSource();
		if (src != null) {
			URL jar = src.getLocation();
			if (jar.getPath().contains(".jar")) {
				ZipInputStream zip = new ZipInputStream(jar.openStream());
				ZipEntry ze = null;
				while ((ze = zip.getNextEntry()) != null) {
					String entryName = ze.getName();
					if (entryName.startsWith("tpresources")
							&& (entryName.endsWith(".json") || entryName.endsWith(".xml"))) {
						StringBuilder s = readTxtFile(zip);

						Tunnel t = new Tunnel(entryName);
						t.payload = s.toString();
						this.save(t);
					}
				}
			} else {
				this.getResourceFolderFiles("tpresources");
			}
		}
	}

	private StringBuilder readTxtFile(InputStream in) {
		StringBuilder out = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				out.append(line);
			}
		} catch (IOException e) {
			// do something, probably not a text file
			e.printStackTrace();
		}
		return out;
	}

	private void getResourceFolderFiles(String folder) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		// read from the resources folder
		URL url = loader.getResource(folder);
		String path = url.getPath();
		File file = new File(path);
		displayDirectoryContents(file);
	}

	public void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					displayDirectoryContents(file);
				} else {
					FileInputStream fis = null;
					if (file.getCanonicalPath().endsWith(".json") || file.getCanonicalPath().endsWith(".xml")) {
						try {
							fis = new FileInputStream(file);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						StringBuilder out = this.readTxtFile(fis);
						Tunnel t = new Tunnel(file.getName());
						t.payload = out.toString();
						this.save(t);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}