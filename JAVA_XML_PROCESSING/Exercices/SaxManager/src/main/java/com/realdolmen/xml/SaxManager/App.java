package com.realdolmen.xml.SaxManager;


import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		try {
			SAXParserFactory sf= SAXParserFactory.newInstance();
			sf.setNamespaceAware(false);
			SAXParser parser = sf.newSAXParser();
			parser.parse(new File(ClassLoader.getSystemResource("movies.xml").toURI()), new MyHandler());
		}catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}
	}
}
