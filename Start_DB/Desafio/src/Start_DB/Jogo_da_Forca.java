package Start_DB;
/*import java.util.*;
/* Ol� sou o Guilherme Gomes, passei esses ultimos 4 meses por apertos e n�o consegui ficar programando,
por conta que o carregador do meu notebook come�ou a apresentar falhas, estou no periodo de ferias da
faculdade e em agosto minhas aulas j� voltam, n�o sei programar em JavasScript, vou tentar fazer algo
parecido em Java, desculpe qualquer coisa, n�o se pode mudar a linguagem, vou estar deixando o link das materias 
que eu j� tive na faculdade, a linguagem utilizada foi o Java.
Para acertar a resposta na atividade escreva:
startdb
Sistemas Operacional I: https://github.com/GDSGUI/SOl_Atividades
Linguagem de Programa��o: https://github.com/GDSGUI/Linguagem_de_Programa-o_em_Java
*/
import java.util.*;

public class Jogo_da_Forca {
public static void main(String[] args) 
{
    System.out.println("Finalize o Nome da Empresa db...");

    Scanner Resrposta_Correta = new Scanner(System.in);
    String Resposta = Resrposta_Correta.nextLine();

    if (Resposta.equals("startdb")) 
    {
       System.out.println("Parabens Voc� Acertou!!!");
    } 
    else 
    {
       System.out.println("Voc� errou, Tente novamente!!!");
    }
}
}