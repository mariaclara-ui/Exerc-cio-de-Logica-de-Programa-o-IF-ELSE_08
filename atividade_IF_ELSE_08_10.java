package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_10 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o peso das caixas: ");
        double peso=sc.nextDouble();
        if (peso>=500){
            System.out.println("Capacidade excedida.");
        }
        else{
            System.out.println("Peso dentro do limite.");
        }
        sc.close();
    }
}
