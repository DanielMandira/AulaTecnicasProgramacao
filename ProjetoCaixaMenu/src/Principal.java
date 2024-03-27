
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
        Caixa caixa = new Caixa();
        int op;        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n1 => Depositar\n2 => Depositar(Parâmetro)\n3 => Sacar\n4 => Consultar saldo\n0 => Sair"));
            switch(op){
                case 1:
                    caixa.depositar();
                    break;
            case 2:
                double val;
                val = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Deposito: "));
                    caixa.depositar(val);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saldo Atual apos deposito: R$"+caixa.sacar());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saldo Atual: R$"+caixa.saldo());
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Finalizando Programa!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Comando Invalido!");
                break;
                
            }
        }while(op != 0);
        
        
    }
    
}
