/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author fatec-dsm2
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salarioMin, valorSalario, qtdSalarMin;
        
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite O valor do salario Minimo: ");
         salarioMin = leia.nextDouble();
         
         System.out.println("Digite o valor do salario do funcionario: ");
         
         valorSalario = leia.nextDouble();
         
         qtdSalarMin = valorSalario/salarioMin;
         
         System.out.println("O Funcionario Recebe "+deci.format(qtdSalarMin)+" Salarios Minimos");
         
        
        
    }
    
}
