package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_02 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("O estoque está com quantas quantidades?");
        int estoque=sc.nextInt();
        if (estoque<20){
            System.out.println("Reabastecer imediatamente");
        }
        else{
            System.out.println("Estoque suficiente.");
        }
    }
}
