package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_14 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite quantas peças foram montadas: ");
        int pecas= sc.nextInt();
        if (pecas==0){
            System.out.println("Erro: Verificar robô. ");
        }
        else {
            System.out.println("Montagem em andamento. ");
        }

    }
}
