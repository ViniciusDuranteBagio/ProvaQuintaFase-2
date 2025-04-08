package classes;
import java.util.Scanner;
public class Patinete extends Veiculo {
    protected double qtHoras;

    //Methods
    public double vCusto(){
        return  custo * qtHoras;
    }

    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo da hora do patinete: $");
        setCusto(Double.parseDouble(scanner.nextLine()));
        System.out.print("Digite a quantidade de horas usadas do patinete no mês: ");
        setQtHoras(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Custo do patinete: $" + vCusto();
    }

    //Constructors
    public Patinete(){
    }

    //Getter & Setter
    public double getQtHoras() {
        return qtHoras;
    }
    public void setQtHoras(double qtHoras) {
        if (qtHoras >= 0) {
            this.qtHoras = qtHoras;
        } else {
            System.out.println("!Valor, não permitido. Definido como 0!");
            this.qtHoras = 0;
        }
    }
}
