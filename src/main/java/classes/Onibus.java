package classes;
import java.util.Scanner;
public class Onibus extends Veiculo{
    //Methods
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo do onibus: $");
        setCusto(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public String toString(){
        return "Custo do onibus: $" + getCusto();
    }

    //Constructors
    public Onibus(){
    }
}
