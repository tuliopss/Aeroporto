import java.util.Date;
import java.util.Scanner;

public class Voo {
    Scanner prompt = new Scanner(System.in);

    public String getDataVoo() {
        return dataVoo;
    }
    String dataVoo;
    String destino, origem, nrVoo;
    int qntdLugares;

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }



    public Voo() {
        System.out.println("Informe a data do voo");
        dataVoo = prompt.nextLine();
        this.dataVoo = dataVoo;

        System.out.println("Informe o destino da viagem");
        destino = prompt.nextLine();
        this.destino = destino;

        System.out.println("Informe a origem da viagem");
        origem = prompt.nextLine();
        this.origem = origem;

        System.out.println("Informe o número do voo");
        nrVoo = prompt.nextLine();
        this.nrVoo = nrVoo;

        System.out.println("Informe a quantidade de lugares");
        qntdLugares = prompt.nextInt();
        this.qntdLugares = qntdLugares;

        System.out.println(getDataVoo());
        System.out.println(getDestino());
        System.out.println(getOrigem());
        System.out.println(getNrVoo());
        System.out.println(getQntdLugares());

    }


    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getNrVoo() {
        return nrVoo;
    }

    public void setNrVoo(String nrVoo) {
        this.nrVoo = nrVoo;
    }

    public int getQntdLugares() {
        return qntdLugares;
    }

    public void setQntdLugares(int qntdLugares) {
        this.qntdLugares = qntdLugares;
    }



    public boolean efetuarReserva() {
        if (qntdLugares > 100) {
            setQntdLugares(getQntdLugares()-1);
            System.out.println("Reserva efetuada.");
            return true;
        } else {
            System.out.println("Avião cheio");
            return false;
        }
    }

    public boolean cancelarReserva() {
        if (qntdLugares != 0) {
            setQntdLugares(getQntdLugares()+1);
            System.out.println("Reserva cancelada.");
            return true;
        } else {
            System.out.println("O avião está vazio"); //n possui reservas
            return false;
        }
    }

    public void exibirVoo() {
        System.out.println(getDataVoo());
        System.out.println(getNrVoo());
        System.out.println(getOrigem());
    }
}
