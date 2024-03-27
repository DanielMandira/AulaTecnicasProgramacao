
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b;
        Calculadora calc = new Calculadora();
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n1 => Somar\n2 => Subtrair\n3 => Multiplicar\n4 => Dividir\n0 => Sair"));
            switch(op){
                case 1:
                    calc.somar();
                    break;
                case 2:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor"));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor"));
                    calc.subtrair(a, b);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Resultado da multiplicação: "+calc.multiplicar());
                    break;
                case 4:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor: "));
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é "+calc.dividir(a, b));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando Invalido!");
                break;
            }
            
        }while( op != 0);
    }
    
}
