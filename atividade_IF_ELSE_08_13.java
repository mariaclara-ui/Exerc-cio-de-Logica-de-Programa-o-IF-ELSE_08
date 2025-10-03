package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_13 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a energia captada:");
        int energia=sc.nextInt();
        System.out.println(energia>=200? "Acionar energia auxiliar." : "Energia solar suficiente.");
        sc.close();
    }
}
