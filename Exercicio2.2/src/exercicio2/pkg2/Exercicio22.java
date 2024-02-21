/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.pkg2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        
        double litros, valorPago;
        
        System.out.println("Digite a Quantidade de Litros abastecidos");
       litros = leia.nextDouble();
       
       valorPago=litros*4.39;
        System.out.println("O Valor a ser pago é de: R$"+deci.format(valorPago));
    }
    
}
