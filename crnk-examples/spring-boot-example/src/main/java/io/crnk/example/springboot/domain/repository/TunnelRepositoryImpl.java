/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.Tunnel;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class TunnelRepositoryImpl extends ResourceRepositoryBase<Tunnel, String> implements TunnelRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, Tunnel> myHashMap = new HashMap<>();

	public TunnelRepositoryImpl() {
		super(Tunnel.class);

		String path = System.getenv("edossier.tunnel.path");
		System.out.println("Tunnel path is ");
		System.out.println(path);

		try {

			if (path != null) {
				loadFiles(path);
			} else {
				System.out.println("No tunnel path provided in properties or command-line. Not loading static json");
			}
		} catch (Exception e) {
			System.out.println("Cannot load any files from tunnel path " + path);
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
		e.setEtag(String.valueOf(System.currentTimeMillis()));
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


	private void loadFiles(String sDir) throws IOException {
		File[] faFiles = new File(sDir).listFiles();
		for (File file : faFiles) {
			if (file != null) {
				if (file.isDirectory()) {
					loadFiles(file.getAbsolutePath());
				} else if (file.getName().matches("(.*)")) {
					System.out.println(file.getAbsolutePath());

					Tunnel t = new Tunnel();
					t.setJsonApiId(file.getAbsolutePath() );
					t.payload = readFile(file.getAbsolutePath(), Charset.forName("UTF-8"));
					save(t);
				}

			}
		}
	}

	private String readFile(String path, Charset encoding)
			throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}


}