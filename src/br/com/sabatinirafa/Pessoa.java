package br.com.sabatinirafa;

public abstract class Pessoa {

	
	private String nome;
	
	private String endereco;
	
	private Double aliquotaDeImposto;

	
	
	public abstract Double calcularImposto();
	
	public void pagarImposto() {
		
		System.out.println("Imposto de " + this.calcularImposto() + " pago com sucessso por" + this.nome + "!");
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getAliquotaDeImposto() {
		return aliquotaDeImposto;
	}

	public void setAliquotaDeImposto(Double aliquotaDeImposto) {
		this.aliquotaDeImposto = aliquotaDeImposto;
	}
	
	
	
	
}
