package project_java.my_projects;

import java.util.Scanner;
/**
 * Author: Enzo Kozoroski Giovanini
 */
public class recursive_fibonacci {

    //O método recebe a variavel num inserida na execução do programa
    public static int fibonacci(int num)
    {
        //Se o valor da variável 1 for igual à 1 ou 2, irá retornar 1, ou seja, o começo da sequência
        if(num == 1 || num == 2) return 1;
        //Senão, se o valor for acima de 2, ele retorna o valor da soma de seus números anteriores
        else return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        //Classe para inserção de dados
        Scanner scan = new Scanner(System.in);

        //Variável que recebe o valor inserido
        int num_fibonnaci = scan.nextInt();

        //Laço de repetição para mostrar a sequência em ordem
        for (int i = 0; i < num_fibonnaci; i++) {
            System.out.print(" "+fibonacci(i+1));
        }
    }

}