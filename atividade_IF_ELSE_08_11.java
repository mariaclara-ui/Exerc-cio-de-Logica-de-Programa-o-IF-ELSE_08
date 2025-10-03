package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_11 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("O sensor dectetou presença?");
        String dectetou=sc.nextLine();
        if (dectetou.equals("sim")){
            System.out.println("Parar linha de produção.");
        }
        else if (dectetou.equals("não")){
            System.out.println("Linha operando normalmente.");
        }
        sc.close();
    }
}
