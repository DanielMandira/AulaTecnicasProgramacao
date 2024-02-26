/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1.pkg3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, dobro, triplo;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro Numero: ");
        num1=leia.nextInt();
        System.out.println("Digite o segundo Numero: ");
        num2=leia.nextInt();
        dobro=num1*2;
        triplo=num2*3;
        
        System.out.println("O Dobro de "+ num1+" é "+dobro+"\n"
                + "O Triplo de "+num2+" é "+triplo);
        
        
        
        
    }
    
}
