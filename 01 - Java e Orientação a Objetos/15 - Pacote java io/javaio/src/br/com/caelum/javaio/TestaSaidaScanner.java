package br.com.caelum.javaio;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaSaidaScanner {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("arquivo_scanner.txt");

		while (s.hasNextLine()) {
			ps.println(s.nextLine());
		}
	}
}
