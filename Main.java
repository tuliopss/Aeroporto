import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        int tamanhoMenu = 6;

        Menu menu = new Menu("Menu", 6);

        ArrayList<Voo> voo = new ArrayList<Voo>();
        ArrayList<Aviao> aviao = new ArrayList<Aviao>();


        int resposta;

        do {
            resposta = menu.lerOpcao();

            switch (resposta) {
                case 1:
                    Aviao aviao1 = new Aviao();
                    aviao.add(aviao1);
                    System.out.println();
                    break;

                case 2:
                    Voo voo1 = new Voo();
                    voo.add(voo1);
                    break;

                case 3:
                    for (int i = 0; i < voo.size(); i++) {
                        voo.get(i).efetuarReserva();
                    }
                    break;

                case 4:
                    for (int i = 0; i < voo.size(); i++) {
                        voo.get(i).cancelarReserva();
                    }
                    break;


                        case 5:
                    for (int i = 0; i < voo.size(); i++) {
                        voo.get(i).exibirVoo();
                        break;
                    }


            }

        } while (resposta != tamanhoMenu);

    }
}