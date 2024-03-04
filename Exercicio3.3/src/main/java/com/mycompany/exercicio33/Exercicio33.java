/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio33;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author mandirad
 */
public class Exercicio33 {

    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        double salarioFixo=1000, 
                bonus=50,
                salarioTotal;
        int moveisVendidos;
        System.out.println("Digite a Quantidade de Moveis Vendidos: ");
        moveisVendidos = leia.nextInt();
        salarioTotal = salarioFixo + (bonus*moveisVendidos);
        System.out.println("O Valor total do salario será de: R$"+deci.format(salarioTotal));
        
    }
}
