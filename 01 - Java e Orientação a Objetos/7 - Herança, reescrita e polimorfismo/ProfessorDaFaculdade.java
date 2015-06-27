class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;
	
	double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
	}
	String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: "
		+ this.horasDeAula;
		return informacao;
	}	
	
	public void setHorasDeAula(int horasDeAula){
		this.horasDeAula = horasDeAula;
	}
	
	public int getHorasDeAula(){
		return this.horasDeAula;
	}
	
	
}