/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double media1, media2, soma, nota1, nota2, nota3, nota4, nota5, nota6;
        Scanner leia = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("Digite o valor da Nota " + 1 + ": ");
        nota1 = leia.nextDouble();
        System.out.println("Digite o valor da Nota " + 2 + ": ");
        nota2 = leia.nextDouble();
        System.out.println("Digite o valor da Nota " + 3 + ": ");
        nota3 = leia.nextDouble();
        System.out.println("Digite o valor da Nota " + 4 + ": ");
        nota4 = leia.nextDouble();
        System.out.println("Digite o valor da Nota " + 5 + ": ");
        nota5 = leia.nextDouble();
        System.out.println("Digite o valor da Nota " + 6 + ": ");
        nota6 = leia.nextDouble();
        
        media1 = (nota1 + nota2 + nota3) / 3;
        media2 = (nota4 + nota5 + nota6) / 3;
        
        soma = media1 + media2;
        
        System.out.println("A media 1 é:" + deci.format(media1) + "\n"
                + "A media 2 é:" + deci.format(media2) + "\n"
                + "A soma das medias é: " + deci.format(soma));
        
    }
}
