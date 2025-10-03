package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_05 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Qual e a velocidade do veiculo? ");
        double velocidade=sc.nextDouble();
        if(velocidade>=120){
            System.out.println("Reduzir a velocidade, imediatamente!");
        }
        else{
            System.out.println("Velocidade dentro do limite.");
        }
    }
}

