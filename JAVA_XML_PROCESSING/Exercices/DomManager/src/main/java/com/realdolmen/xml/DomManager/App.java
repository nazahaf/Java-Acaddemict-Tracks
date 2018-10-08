package com.realdolmen.xml.DomManager;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		Map<String, Integer> hm = new HashMap<String, Integer>();

		try {
			db = dbf.newDocumentBuilder();
			Document d;

			d = db.parse(new File(ClassLoader.getSystemResource("movies.xml").toURI()));

			NodeList nodeMovies = d.getElementsByTagName("movie");

			for(int i = 0; i<nodeMovies.getLength(); ++i) {
				Element movie = (Element) nodeMovies.item(i);
				String value = movie.getTextContent();
				
				if(value.equals("type")) {
					if(hm.containsKey(value)) {
						hm.put(value, hm.get(value)+1);
					}
					else {
						hm.put(value, 1);
					}				
				}

			}

			Set<Entry<String, Integer>> setHm = hm.entrySet();
			Iterator<Entry<String, Integer>> it = setHm.iterator();
			while(it.hasNext()){
				Entry<String, Integer> e = it.next();
				System.out.println("Type : "+e.getKey()+" -> "+e.getValue());
			}
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
		catch (SAXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



}
}
