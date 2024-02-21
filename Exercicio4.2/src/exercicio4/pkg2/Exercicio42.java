/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4.pkg2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leia = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double area, perimetro, ladoA, ladoB;

        System.out.println("Digite o Tamanho do lado A: ");

        ladoA = leia.nextDouble();

        System.out.println("Digite o Tamanho do lado B: ");

        ladoB = leia.nextDouble();

        area = ladoA * ladoB;

        perimetro = 2 * ladoA + 2 * ladoB;

        System.out.println("A Area do retangulo é de: " + deci.format(area)
                + " Metros \n O Perimetro é de: " + deci.format(perimetro) + " Metros");

    }

}
