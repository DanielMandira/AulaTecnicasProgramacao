/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2.pkg3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, quadrado;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        num=leia.nextInt();
        quadrado = (int) Math.pow(num, 2);
        System.out.println("O Quadrado de "+ num +" é: "+quadrado);
        
    }
    
}
