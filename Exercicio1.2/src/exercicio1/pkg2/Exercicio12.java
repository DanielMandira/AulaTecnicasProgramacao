/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1.pkg2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double salarioAtual, novoSalario, percent;
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor do Salario atual: ");
        salarioAtual = leia.nextDouble();
        
        System.out.println("Digite o Percentual de Reajuste: ");
        percent = leia.nextDouble();
        
        novoSalario = salarioAtual + (salarioAtual * percent)/100;
        
        System.out.println("O valor do novo salario é de: R$"+deci.format(novoSalario));
        
    }
    
}
