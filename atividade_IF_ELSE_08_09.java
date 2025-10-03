package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_09 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite a quantidade do material: ");
        int quantidade=sc.nextInt();
        if (quantidade>0){
            System.out.println("Impressão iniciada!");
        }
        else{
            System.out.println("Sem material disponível. ");
        }
        sc.close();
    }
}
