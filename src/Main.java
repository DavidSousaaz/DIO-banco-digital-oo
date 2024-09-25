
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Banco-1");
		
		Cliente venilton = new Cliente();
		Cliente jose = new Cliente();
		venilton.setNome("Venilton");
		jose.setNome("jose");
		
		Conta veniltonCC = new ContaCorrente(venilton);
		Conta veniltonPoupanca = new ContaPoupanca(venilton);
		Conta joseCC = new ContaCorrente(jose);

		
		
		veniltonCC.depositar(1000);
		veniltonCC.transferir(100, veniltonPoupanca);
		veniltonPoupanca.depositar(1200);
		
		joseCC.depositar(2500);
		joseCC.sacar(200);
		joseCC.transferir(300, veniltonCC);
		
		banco.addConta(joseCC);
		banco.addConta(veniltonCC);
		banco.addConta(veniltonPoupanca);
		
		banco.imprimirContas();
		
		System.out.println("\nImprimindo somente contas correntes:");
		banco.imprimirContasCorrente();
		
		System.out.println("\nImprimindo somente contas Poupanças:");
		banco.imprimirContasPoupancas();
	}

}
