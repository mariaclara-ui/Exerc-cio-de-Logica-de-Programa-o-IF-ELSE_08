package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_12 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite qual foi a eficiência da produção: ");
        int valor= sc.nextInt();
        if (valor>=85){
            System.out.println("Eficiência aceitavel. ");
        }
        else {
            System.out.println("Manutenção recomendade. ");
        }
    }
}
