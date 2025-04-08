package classes;

import java.util.Scanner;

public abstract class Veiculo{
    protected double custo;

    //Getter & Setters
    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        if (custo >= 0) {
            this.custo = custo;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.custo = 0;
        }
    }
}
