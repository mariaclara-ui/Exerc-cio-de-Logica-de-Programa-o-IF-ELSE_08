package ExercíciosdeLogicadeProgramacaoIndustria40;
import java.util.Scanner;
public class atividade_IF_ELSE_08_07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a quantidade de defeitos?");
        int quantidade = sc.nextInt();

        if (quantidade >= 5) {
            System.out.println("Lote reprovado.");
        } else {
            System.out.println("Lote aprovado.");
        }

    }
}
