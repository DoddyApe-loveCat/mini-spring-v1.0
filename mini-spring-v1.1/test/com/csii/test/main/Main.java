package com.csii.test.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) throws IOException {

		InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("/resource/beans.xml");
		System.out.println(stream);

		File file = new File("resource/beans.xml");

		System.out.println(file.getAbsolutePath());
	}
}
