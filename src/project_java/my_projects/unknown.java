package project_java.my_projects;

import java.util.Scanner;

public class unknown {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " "};
        //String[] alfabeto_min = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] morse = {"o- ", "-ooo ", "-o-o ", "-oo ", "o ", "oo-o ", "--o ", "oooo ", "oo ", "o--- ", "o-o- ", "o-oo ", "-- ", "-o ", "--- ", "o--o ", "--o- ", "o-o ", "ooo ", "- ", "oo- ", "ooo- ", "o-- ", "-oo- ", "-o-- ", "--oo ", " "};

        String[] text = new String[5];

        for (int i = 0; i < 5; i++) {
            text[i] = input.nextLine();
        }

        for(int i = 0; i < alfabeto.length; i++)
        {
            for (int j = 0; j < text.length; j++) {
                if(text[j].equals(alfabeto[i]))
                {
                    System.out.printf(morse[j]);
                }
            }
        }

    }

}