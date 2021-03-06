package com.csii.minispring.dtd;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import com.csii.minispring.io.ClassPathResource;

public class DtdValidateTest {

	@Test
	public void testValidateDtd() {

		ClassPathResource configResource = new ClassPathResource("classpath:beans-dtd.xml");

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setValidating(true);

		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			dBuilder.setErrorHandler(new ErrorHandler() {
				public void error(SAXParseException exception) throws SAXException {
					throw exception;
				}

				public void fatalError(SAXParseException exception) throws SAXException {
					throw exception;
				}

				public void warning(SAXParseException exception) throws SAXException {
				}
			});
			Document doc = dBuilder.parse(configResource.getFile());
			doc.getDocumentElement().normalize();

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {

		} catch (IOException e) {

		}
	}
}
