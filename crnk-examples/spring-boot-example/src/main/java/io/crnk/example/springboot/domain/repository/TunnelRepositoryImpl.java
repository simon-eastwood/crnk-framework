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
import java.net.URL;
import java.security.CodeSource;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import java.io.*;
import java.net.URL;
import java.security.CodeSource;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;



/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class TunnelRepositoryImpl extends ResourceRepositoryBase<Tunnel, String> implements TunnelRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, Tunnel> myHashMap = new HashMap<>();

	public TunnelRepositoryImpl() {
		super(Tunnel.class);


		/*ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource("rsrc:tpresources");
		String path = url.getPath();


		System.out.println("Tunnel path is ");
		System.out.println(path);
		*/

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


        private void loadFromJar() throws Exception {
            CodeSource src = TunnelRepositoryImpl.class.getProtectionDomain().getCodeSource();
            List<String> list = new ArrayList<String>();

            if (src != null) {
                URL jar = src.getLocation();
                ZipInputStream zip = new ZipInputStream(jar.openStream());
                ZipEntry ze = null;

                while ((ze = zip.getNextEntry()) != null) {
                    String entryName = ze.getName();

                    if (entryName.startsWith("tpresources") && (entryName.endsWith(".json") || entryName.endsWith(".xml")) ) {
                        System.out.println( entryName );
                        StringBuilder s = readTxtFile( zip );

			TunnelRepositoryImpl t = new TunnelRepositoryImpl ();
			t.setPayload (s.toString() ) ;
			this.save (t);
                    }
                }

            }

        }

        private  StringBuilder readTxtFile(InputStream in)  {
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


}