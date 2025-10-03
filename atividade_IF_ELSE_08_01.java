package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_01 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Qual e a temperatura atual?");
        double temperatura=sc.nextDouble();
        if (temperatura>80){
            System.out.println("ALERTA! maquina desligada por super aquecimento! ");
        }
        else{
            System.out.println("maquina operando normalmente");
        }
    }
}

