import dominio.ContaModelo;

public class ContaBanco {

    public static void main (String args[]){

        ContaModelo c1 = new ContaModelo();
        c1.Status();
        System.out.println("------------");
        c1.abrirConta("CP");
        c1.Status();
        System.out.println("------------");
        c1.sacar(50);
        c1.Status();
        c1.fecharConta();
        System.out.println("------------");
        c1.depositar(100);
        c1.Status();
        System.out.println("------------");
        c1.mensalidade();
        c1.Status();

    }

}
