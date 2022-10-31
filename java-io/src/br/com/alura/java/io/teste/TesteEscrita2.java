package br.com.alura.java.io.teste;


import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
//
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw = new FileWriter("loren3-2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
		File arquivo = new File("lorem2-2.txt");
		/*------------------------------------------------------------------*/		
		PrintStream ps = new PrintStream(arquivo);
		ps.println("Ola mundo dos arquivos");
		ps.println();
		ps.println("pulando linha com println()");
		ps.close();
		/*------------------------------------------------------------------*/		
		PrintWriter pw = new PrintWriter(arquivo);
		pw.println("Ola mundo dos arquivos - com PrintWriter");
		pw.println();
		pw.println("pulando linha com pw.println()");
		pw.close();
	}

}
