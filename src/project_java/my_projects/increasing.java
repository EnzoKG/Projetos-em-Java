package project_java.my_projects;

import java.util.Scanner;
/**
 * Author: Enzo Kozoroski Giovanini
 */
public class increasing {

    //Método para fazer a troca de valores entre parâmetros com o auxiliador.
    public static void trade(int[] vector, int from, int to)
    {
        int aux = vector[from];
        vector[from] = vector[to];
        vector[to] = aux;
    }

    //Método para fazer a ordem crescente.
    public static void ordemCrescente(int[] sequence)
    {
        //Percorre o 1 laço até a penultima posição.
        for (int i = 0; i < sequence.length - 1; i++) {
            //Segundo laço verifica a última posição.
            for (int j = i+1; j < sequence.length; j++) {
                //Se o valor do 1 laço for maior que o valor do 2 laço, então realiza a troca.
                if(sequence[i] > sequence[j])
                {
                    trade(sequence, i, j);
                } 
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Vetor com exemplo de números.
        int[] numeros = {3, 3, 4, 4, 5, 4, 6, 7, 8, 4, 6, 0, 6, 3, 1, 1, 2, 2, 2, 5} ;

        //Inserir o vetor no método.
        ordemCrescente(numeros);

        //Realizar a escrita do resultado.
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d ", numeros[i]);
        }

    }
}