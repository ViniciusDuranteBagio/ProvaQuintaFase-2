package classes;
import java.util.Scanner;
public class Taxi extends Veiculo{
    protected double vlCorrida;
    protected int qtCorrida;

    //Methods
    public double vCusto(){
        return  custo + (vlCorrida * qtCorrida);
    }

    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo do Taxi: $");
        setCusto(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite o valor da corrida do taxi: $");
        setVlCorrida(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite a quantidade de corridas do taxi ");
        setQtCorrida(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Custo do taxi: $" + vCusto();
    }

    //Constructors
    public Taxi(){
    }

    //Getter & Setter

    public double getVlCorrida() {
        return vlCorrida;
    }
    public void setVlCorrida(double vlCorrida) {
        if (vlCorrida >= 0) {
            this.vlCorrida = vlCorrida;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.vlCorrida = 0;
        }
    }
    public int getQtCorrida() {
        return qtCorrida;
    }
    public void setQtCorrida(int qtCorrida) {
        if (qtCorrida >= 0) {
            this.qtCorrida = qtCorrida;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.qtCorrida = 0;
        }
    }
}
