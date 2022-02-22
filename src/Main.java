
public class Main {

	public static void main(String[] args) {
		Cliente jardel = new Cliente();
		jardel.setNome("Jardel");
		
		Conta cc = new ContaCorrente(jardel);
		Conta poupanca = new ContaPoupanca(jardel);

		cc.depositar(1000);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
