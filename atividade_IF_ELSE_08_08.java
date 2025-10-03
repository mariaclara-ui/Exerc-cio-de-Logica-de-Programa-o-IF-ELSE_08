package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_08 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem do nivel de óleo:");
        int porcentagem=sc.nextInt();
        if (porcentagem<=30){
            System.out.println("Adicionar óleo.");
        }
        else {
            System.out.println("Nível adequado.");
        }
    }
}
