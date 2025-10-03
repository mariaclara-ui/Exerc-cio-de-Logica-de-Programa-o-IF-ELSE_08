package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem da quantidade final.");
        int quantidade= sc.nextInt();
        if (quantidade<=90){
            System.out.println("Qualidade abaixo do padrão.");
        }
        else {
            System.out.println("Qualidade aceitével.");
        }
    }
}
