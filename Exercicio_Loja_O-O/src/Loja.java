
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
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;
    
    public Loja(){
        this("","",0,0,0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    public void inserirDadosLoja(){
        setRazaoSocial(JOptionPane.showInputDialog("Insrira a RazaoSocial da Loja: "));
        setCpfCliente(JOptionPane.showInputDialog("Insira o CPF do Cliente: "));
        setValorCompra(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do item comprado: R$")));
        setQtdItensComp(Double.parseDouble(JOptionPane.showInputDialog("Insira a Quantidade Comprada: ")));
    }
    
    public String mostrarDadosLoja(){
        return "Loja: "+getRazaoSocial()+"\n"
                + "CPF Cliente: "+getCpfCliente()+"\n"
                + "Valor Item: R$"+getValorCompra()+"\n"
                + "Quantidade Comprada: "+getQtdItensComp();
    }
    public double calcularCompraLoja(){
        return valorTotalCompra = valorCompra * qtdItensComp;
    }
    
}
