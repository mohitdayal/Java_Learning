package com.test.java.general;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadFile {
public static void main(String[] args) {
	File f = new File("warmstart.dat");
char[] cbuf = new char[5000];
	try {
		FileReader fileread = new FileReader(f);
		BufferedReader br = new BufferedReader(fileread);
		br.read(cbuf, 0, 5000);
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for (char c : cbuf) {
		System.out.print(c);
	}
}
}
