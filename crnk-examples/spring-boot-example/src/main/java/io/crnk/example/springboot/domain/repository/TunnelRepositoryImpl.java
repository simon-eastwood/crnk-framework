/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.Tunnel;

/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class TunnelRepositoryImpl extends ResourceRepositoryBase<Tunnel, String> implements TunnelRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, Tunnel> myHashMap = new HashMap<>();

	public TunnelRepositoryImpl() {
		super(Tunnel.class);
		System.out.println("This is tunnel");
		try {
			this.getResourceFolderFiles("tpresources");
			//this.loadFromJar();
		} catch (Exception e) {
			System.out.println("Cannot load any files");
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
		System.out.println("Tunnel findAll gets called");
		TunnelList list = new TunnelList();
		list.setMeta(new TunnelListMeta());
		list.setLinks(new TunnelListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}
	
	private void getResourceFolderFiles (String folder) {
	    ClassLoader loader = Thread.currentThread().getContextClassLoader();
	    //read from the resources folder
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
	                        System.out.println( "Full Path :"+file.getCanonicalPath() );
	                        try {
	        					fis = new FileInputStream(file);
	        				} catch (FileNotFoundException e) {
	        					// TODO Auto-generated catch block
	        					e.printStackTrace();
	        				}
	                        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
	                        String line;
	                        StringBuilder out = new StringBuilder();
	                        try {
	                            while ((line = reader.readLine()) != null) {
	                                out.append(line);
	                            }
	                        } catch (IOException e) {
	                            // do something, probably not a text file
	                            e.printStackTrace();
	                        }
	        				Tunnel t = new Tunnel (file.getName());
	        				t.payload = out.toString()  ;
	        				this.save(t);
					 }
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}