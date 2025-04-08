package classes;
import javax.swing.*;
import java.util.Scanner;
public class Trem extends Veiculo {
    protected double qtKm;
    protected double vlKm;

    //Methods
    public double vCusto() {
        return  custo + (qtKm * vlKm);
    }

    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo do trem $");
        setCusto(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite a quantidade de kilometros rodados no mes pelo trem: Km");
        setQtKm(Integer.parseInt(scanner.nextLine()));
        System.out.print("Digite o valor pago pelos kilometros rodados do trem: $");
        setVlKm(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Custo do trem: $" + vCusto();
    }

    //Constructors
    public Trem() {
    }

    //Getter & Setter

    public double getQtKm() {
        return qtKm;
    }
    public void setQtKm(double qtKm) {
        if (qtKm >= 0) {
            this.qtKm = qtKm;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.qtKm = 0;
        }
    }
    public double getVlKm() {
        return vlKm;
    }

    public void setVlKm(double vlKm) {
        if (vlKm >= 0) {
            this.vlKm = vlKm;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.vlKm = 0;
        }
    }
}
