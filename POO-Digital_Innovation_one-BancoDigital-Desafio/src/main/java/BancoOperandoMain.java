public class BancoOperandoMain {

    public static void main(String[] args) {

        Cliente um = new Cliente("Marcel Pinotti", "333.444.555-66", "77.888.999-0");
        Cliente dois = new Cliente();
        dois.setNome("José Antônio");
        dois.setCpf("111.222.333-44");
        dois.setRg("55.666.777-8");

        Conta ccUm = new ContaCorrente(um);
        Conta ppUm = new ContaPoupanca(um);

        ContaCorrente ccDois = new ContaCorrente(dois);
        ContaPoupanca ppDois = new ContaPoupanca(dois);

        ccUm.depositar(100);
        ccUm.transferir(100, ppUm);

        ccUm.imprimirExtrato();
        ppUm.imprimirExtrato();


        ccDois.depositar(200);
        ccDois.transferir(50, ccUm);

        ccDois.imprimirExtrato();
        ccUm.imprimirExtrato();


    }
}
