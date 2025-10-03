package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_04 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double peso=sc.nextDouble();
        if(peso>=5){
            System.out.println("Peça pesada.");
        }
        else{
            System.out.println("Peça leve.");
        }
    }
}
