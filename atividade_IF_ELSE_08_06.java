package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_06 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual e a receita da produção?");
        int receita=sc.nextInt();
        if(receita>=1000){
            System.out.println("Meta atingida.");
        }
        else{
            System.out.println("Produção abeixo da meta.");
        }
    }
}