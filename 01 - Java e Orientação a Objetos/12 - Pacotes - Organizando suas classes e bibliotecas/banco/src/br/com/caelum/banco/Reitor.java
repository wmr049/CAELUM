package br.com.caelum.banco;

class Reitor extends EmpregadoDaFaculdade {
	// informações extras
	String getInfo() {
		return super.getInfo() + " e ele é um reitor";
	}
	// não sobrescrevemos o getGastos!!!
}