package classes;
import java.util.Scanner;
public class Bicicleta extends Veiculo {
        protected int qtBicicletas;

        //Methods
        public double vCusto(){
            return  custo * qtBicicletas;
        }
        public void cadastrar(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o custo da bicicleta: $");
            setCusto(Double.parseDouble(scanner.nextLine()));
            System.out.print("Digite a quantidade de bicicletas: ");
            setQtBicicletas(Integer.parseInt(scanner.nextLine()));
        }

        @Override
        public String toString(){
            return "Custo mensal da(s) bicicleta(s): $" + vCusto();
        }

        //Constructors
        public Bicicleta(){
        }

        //Getter & Setter

        public int getQtBicicletas() {
            return qtBicicletas;
        }
        public void setQtBicicletas(int qtBicicletas) {
            if (qtBicicletas >= 0) {
                this.qtBicicletas = qtBicicletas;
            } else {
                System.out.println("!Valor, não permitido. Definido como 0!");
                this.qtBicicletas = 0;
            }
        }
}
