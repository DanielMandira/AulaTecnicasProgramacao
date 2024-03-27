
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
        Loja loja = new Loja();
        loja.inserirDadosLoja();
        JOptionPane.showMessageDialog(null, loja.mostrarDadosLoja());
        JOptionPane.showMessageDialog(null, "Total: R$"+loja.calcularCompraLoja());
    }
    
}
