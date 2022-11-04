import java.util.Scanner;

public class Aviao {
    private String prefixo, modelo, fabricante;
    private int qntdVoo;

    Scanner prompt = new Scanner(System.in);

    public Aviao() {

        System.out.println("Informe o prefixo do avião");
        prefixo = prompt.nextLine();
        this.prefixo = prefixo;

        System.out.println("Informe o modelo do avião");
        modelo = prompt.nextLine();
        this.modelo = modelo;

        System.out.println("Informe o fabricante do avião");
        fabricante = prompt.nextLine();
        this.fabricante = fabricante;

        System.out.println("Informe a quantidade de voos do avião");
        qntdVoo = prompt.nextInt();
        this.qntdVoo = qntdVoo;

        System.out.println("Prefixo: " + getPrefixo());
        System.out.println("Modelo " +getModelo());
        System.out.println("Fabricante " + getFabricante());
        System.out.println("Prefixo " + getPrefixo());

    }

    public void statusAviao() {
        System.out.println("Prefixo: " + getPrefixo());
        System.out.println("Fabricante: " + getFabricante());
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

   /* public boolean cadastrarVoo(Voo) {
        if (getPrefixo() !=)
    }
*/
}
