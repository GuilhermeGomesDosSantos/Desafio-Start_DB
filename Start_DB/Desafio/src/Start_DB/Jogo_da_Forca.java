package Start_DB;
/*import java.util.*;
/* Olá sou o Guilherme Gomes, passei esses ultimos 4 meses por apertos e não consegui ficar programando,
por conta que o carregador do meu notebook começou a apresentar falhas, estou no periodo de ferias da
faculdade e em agosto minhas aulas já voltam, não sei programar em JavasScript, vou tentar fazer algo
parecido em Java, desculpe qualquer coisa, não se pode mudar a linguagem, vou estar deixando o link das materias 
que eu já tive na faculdade, a linguagem utilizada foi o Java.
Para acertar a resposta na atividade escreva:
startdb
Sistemas Operacional I: https://github.com/GDSGUI/SOl_Atividades
Linguagem de Programação: https://github.com/GDSGUI/Linguagem_de_Programa-o_em_Java
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
       System.out.println("Parabens Você Acertou!!!");
    } 
    else 
    {
       System.out.println("Você errou, Tente novamente!!!");
    }
}
}