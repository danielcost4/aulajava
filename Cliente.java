package POO;

public class Cliente {

	// Declaração dos atributos da classe Cliente

	private String nomeCliente;
	private String enderecoCliente;
	private String aniversarioCliente;
	private String celularCliente;
	private double valorCompra;

		// Declaração dos métodos da classe

	public Cliente(String nomeCliente, String enderecoCliente, String aniversarioCliente, String celularCliente,
			int valorCompra) {
		super();
		this.nomeCliente = nomeCliente;
		this.enderecoCliente = enderecoCliente;
		this.aniversarioCliente = aniversarioCliente;
		this.celularCliente = celularCliente;
		this.valorCompra = valorCompra;
	
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getAniversarioCliente() {
		return aniversarioCliente;
	}

	public void setAniversarioCliente(String aniversarioCliente) {
		this.aniversarioCliente = aniversarioCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}

	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public void visualizarCliente () {
		System.out.println("\n O valor da compra do cliente " + nomeCliente + ", residente em " + enderecoCliente + ", cujo número de celular é: " + celularCliente + ", e que faz aniversário no dia: " + aniversarioCliente + ", foi de R$: " + valorCompra);
		
	}

}
