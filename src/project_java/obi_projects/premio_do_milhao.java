package project_java.obi_projects;

import java.util.Scanner;

public class premio_do_milhao {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, a, i;

        n = scan.nextInt();
        int soma = 0;

        for(i = 1; i <= n; i++)
        {
            a = scan.nextInt();
            soma+=a;
            if(soma >= 1000000) break;
        }
        System.out.printf("\n%d", i);
    }

}