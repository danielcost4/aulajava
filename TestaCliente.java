package POO;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		//Instanciando um objeto da Classe cliente
		
	Cliente cliente1 = new Cliente ("Daniel","Rua Dr Miranda de Azevedo", "20/08", "11989599170", 350 );
	Cliente cliente2 = new Cliente ("André","Rua das Palmeiras", "17/06", "11998325840", 120 );
	Cliente cliente3 = new Cliente ("Cláudia","Rua São Nicolau", "10/05", "11924874682", 98 );
	Cliente cliente4 = new Cliente ("Everaldo","Rua Madalena", "23/12", "11978954620", 326 );
	Cliente cliente5 = new Cliente ("Beatriz","Rua Catão", "14/02", "11999542136", 145 );
	
	System.out.println("\n Dados do Cliente número 1:");
	cliente1.visualizarCliente();
	System.out.println("\n Dados do Cliente número 2:");
	cliente2.visualizarCliente();
	
}
}