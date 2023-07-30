package br.com.sabatinirafa;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		PessoaJuridica arcosdourados = new PessoaJuridica();
		arcosdourados.setNome("McDonalds");
		arcosdourados.setEndereco("Av Mcdonalds, 120");
		arcosdourados.setCNPJ("12.345.678/0001-01");
		arcosdourados.setRepresentanteLegal("José da Silva");
		arcosdourados.setLucroMensal(20000000d);
		arcosdourados.setAliquotaDeImposto(.40d);
		arcosdourados.pagarImposto();
		
		
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
