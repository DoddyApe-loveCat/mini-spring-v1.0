package com.csii.minispring.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.csii.minispring.io.ClassPathResource;
import com.csii.minispring.io.Resource;

public class ClassPathResourceTest {

	@Test
	public void testClassPathResource() throws Exception {
		Resource location = new ClassPathResource("classpath:beans.xml");

		try {
			File file = location.getFile();
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream stream = location.getInputStream();
		System.out.println(stream);

	}
}
