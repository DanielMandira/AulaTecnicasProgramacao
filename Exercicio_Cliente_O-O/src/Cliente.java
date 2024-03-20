
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
public class Cliente {
    private String nomeCliente;
    private String endereco;
    private String rg;
    
    public Cliente(){
        this("","","");
    }

    public Cliente(String nomeCliente, String endereco, String rg) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.rg = rg;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
      public void cadastrarCliente(){
        setNomeCliente(JOptionPane.showInputDialog("Digite o nome: "));
        setEndereco(JOptionPane.showInputDialog("Digite o endereço: "));
        setRg(JOptionPane.showInputDialog("Digite o RG: "));
        
    }
      public void listarCliente(){
          JOptionPane.showMessageDialog(null, "Dados do Cliente:\nNome: "+getNomeCliente()+"\nEndereço: "+getEndereco()+"\nRG: "+getRg());
      }
}
