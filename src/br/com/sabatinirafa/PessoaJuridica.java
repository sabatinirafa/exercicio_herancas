package br.com.sabatinirafa;

public class PessoaJuridica extends Pessoa {

	
	private String CNPJ;
	
	private String nomeRepresentanteLegal;
	
	private Double lucroMensal;


	
	@Override
	public Double calcularImposto() {
		return this.lucroMensal * this.getAliquotaDeImposto();
	}
	


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getNomeRepresentanteLegal() {
		return nomeRepresentanteLegal;
	}


	public void setNomeRepresentanteLegal(String representanteLegal) {
		this.nomeRepresentanteLegal = representanteLegal;
	}


	public Double getLucroMensal() {
		return lucroMensal;
	}


	public void setLucroMensal(Double lucroMensal) {
		this.lucroMensal = lucroMensal;
	}
	
}
