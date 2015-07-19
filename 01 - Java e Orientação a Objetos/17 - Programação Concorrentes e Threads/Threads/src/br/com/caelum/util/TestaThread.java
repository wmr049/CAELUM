package br.com.caelum.util;

public class TestaThread {

	public static void main(String[] args) {
		/*
		 * GeraPDF gerapdf = new GeraPDF(); Thread threadDoPdf = new
		 * Thread(gerapdf); threadDoPdf.start(); try { Thread.sleep(3 * 1000); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * BarraDeProgresso barraDeProgresso = new BarraDeProgresso(); Thread
		 * threadDaBarra = new Thread(barraDeProgresso); threadDaBarra.start();
		 */

		Programa p1 = new Programa();
		p1.setId(1);
		Thread t1 = new Thread(p1);
		t1.start();
		Programa p2 = new Programa();
		p2.setId(2);
		Thread t2 = new Thread(p2);
		t2.start();
	}

}
