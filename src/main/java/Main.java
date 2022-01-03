public class Main {

    public static void main(String[] args) {
        Cliente luiz = new Cliente();
        luiz.setNome("Luiz");

        Conta cc = new ContaCorrente(luiz);
        Conta poupanca = new ContaPoupanca(luiz);

        cc.depositar(250);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
