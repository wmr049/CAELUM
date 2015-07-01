class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada(){
		return Integer.toString(dia) + "/" + Integer.toString(mes) + "/" + Integer.toString(ano);
	}
}