
public class Main {

	public static void main(String[] args) {
		Cliente Alexandre = new Cliente();
		Alexandre.setNome("Alexandre");
		
		Banco nomeBanco = new Banco();
		nomeBanco.setNome("O Poderoso");
		
		Conta cc = new ContaCorrente();
		cc.depositar(300);
		Conta poupanca = new ContaPoupanca();
		
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
