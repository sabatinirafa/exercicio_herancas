package br.com.sabatinirafa;

public class PessoaFisica extends Pessoa {

	
	String CPF;
	
	String nomeDaMae;
	
	Double rendaMensal;
	
	

	@Override
	public Double calcularImposto() {
		return this.rendaMensal * this.getAliquotaDeImposto();
	}
	
	
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public Double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

}
