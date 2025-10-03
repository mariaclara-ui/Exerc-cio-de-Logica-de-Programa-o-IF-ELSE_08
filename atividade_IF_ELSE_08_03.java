package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_03 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Qual e a porcentagem de energia do robô?");
        double porcentagem=sc.nextDouble();
        if(porcentagem>=50){
            System.out.println("Robô iniciando pintagem.");
        }
        else{
            System.out.println("Energia insuficiente. RECARREGAR!");
        }
    }
}