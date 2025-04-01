public class Teste {

    public static void main(String[] args) {
        
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");
        
        
        Conta cc = new ContaCorrente(bruno);
        cc.depositar(100);
        cc.depositar(200);
    

        Conta poupanca = new ContaPoupanca(bruno);

        cc.transferir(150, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
