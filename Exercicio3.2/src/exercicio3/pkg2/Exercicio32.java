/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3.pkg2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        
        String nome;
        
        int qtd;
        double precoUnit, total;
        
        System.out.println("Digite o nome do Produto: ");
        nome=leia.next();
        
        System.out.println("Digite a Quantidade Comprada: ");
        qtd = leia.nextInt();
        
        System.out.println("Digite o Preço Unitario: ");
        precoUnit=leia.nextDouble();
        
        total = qtd * precoUnit;
        
        System.out.println("O Valor total a se pagar pelo produto "+nome+" é de: R$"+deci.format(total));
        
        
        
    }
    
}
