package project_java.obi_projects;

import java.util.Arrays;
import java.util.Scanner;

public class po_que_mao {

    private static int[] menor_maior(int x, int y, int z)
    {
        int[] numeros = {x, y, z}; 
        Arrays.sort(numeros);
        return numeros;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n, x, y, z;

        n = scan.nextInt();
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        int[] valores = menor_maior(x, y, z);

        int maior = valores[2];
        int menor = valores[0];

        if(n < 0 || n > 1000 || x < 0 || x > 1000 || y < 0 || y > 1000 || z < 0 || z > 1000) System.out.printf("\n Fora do limite");

        int soma = x + y + z;
        int qtd = 0;

        if(soma > n)
        {
            if(soma - maior <= n)
            {
                qtd = 2;
            } else {
                if(menor <= n) qtd = 1;
            }

            System.out.printf("\n%d", qtd);
        } else {
            System.out.printf("\n3");
        }

    }

}