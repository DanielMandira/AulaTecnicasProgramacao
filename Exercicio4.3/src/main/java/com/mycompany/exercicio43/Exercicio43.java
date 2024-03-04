/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio43;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author mandirad
 */
public class Exercicio43 {

    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        double valorAtraso,
                valor,
                taxa;
        int tempo;
        System.out.println("Digite o valor da parcela: ");
        valor = leia.nextDouble();
        System.out.println("Digite o valor da Taxa de juros: ");
        taxa = leia.nextDouble();
        System.out.println("Digite o tempo(dias): ");
        tempo = leia.nextInt();
        valorAtraso = valor + (valor*(taxa/100)*tempo);
        System.out.println("O valor total apos "+tempo+" dias de atraso com uma taxa de "+deci.format(taxa)+"% é de: R$"+deci.format(valorAtraso));
    }
}
