package br.com.sabatinirafa;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		PessoaJuridica mcdonalds = new PessoaJuridica();
		mcdonalds.setNome("McDonalds");
		mcdonalds.setEndereco("Av Mcdonalds, 120");
		mcdonalds.setCNPJ("12.345.678/0001-01");
		mcdonalds.setNomeRepresentanteLegal("José da Silva");
		mcdonalds.setLucroMensal(20000000d);
		mcdonalds.setAliquotaDeImposto(.40d);
		mcdonalds.pagarImposto();
		
		
		PessoaFisica joseDaSilva = new PessoaFisica();
		joseDaSilva.setNome("José da Silva");
		joseDaSilva.setEndereco("Av Paulista, 1500");
		joseDaSilva.setCPF("123.456.789-10");
		joseDaSilva.setNomeDaMae("Maria da SIlva");
		joseDaSilva.setRendaMensal(50000d);
		joseDaSilva.setAliquotaDeImposto(.30d);
		joseDaSilva.pagarImposto();
		
		
	}

}
