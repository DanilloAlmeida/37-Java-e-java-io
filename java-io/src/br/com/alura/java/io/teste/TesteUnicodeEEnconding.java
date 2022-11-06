package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "ABCDÇÁã";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
//		System.out.println(bytes.length + ": padrão linux");
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length + ": padrão Linux");
		
		bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ": windows-1252");
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ": UTF-16");
		
		
//		System.out.println(bytes[0]);
//		System.out.println(bytes[1]);
//		System.out.println(bytes[2]);
//		System.out.println(bytes[3]);
//		System.out.println(bytes[4]);
//		System.out.println(bytes[5]);
		
	}

}
