import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String titulo;
    private ArrayList<String> alternativas = new ArrayList<String>();


    public Menu(String titulo, int qntdAlternativas) {
        this.titulo = titulo;
        if (qntdAlternativas > 0) {
            Scanner prompt = new Scanner(System.in);
            for (int i = 0; i < qntdAlternativas; i++) {
                System.out.println("Digite a " + (i + 1) + " opção");
                String opcao = prompt.nextLine();
                alternativas.add(opcao);
            }
        }
    }

    public int lerOpcao() {
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(this.titulo);
            System.out.println("--------------------");
            for (int i = 0; i < alternativas.size(); i++) {
                System.out.println("" + (i+1)+ "- " + alternativas.get(i));
            }
            System.out.println("-------------------");
            System.out.println("Digite a opção desejada.");
            opcao = ler.nextInt();
        } while( (opcao <= 0)|| opcao > alternativas.size());
        return opcao;
    }
}
