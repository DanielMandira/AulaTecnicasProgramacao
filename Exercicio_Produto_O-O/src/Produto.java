
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
public class Produto {
private String nome;
private int qtd;
private double valor;
private double total;

public Produto(){
    this("",0,0.00,0.00);
}

    public Produto(String nome, int qtd, double valor, double total) {
        this.nome = nome;
        this.qtd = qtd;
        this.valor = valor;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void calcularTotal(){
        setNome(JOptionPane.showInputDialog("Digite o nome do Produto: "));
        setQtd(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada: ")));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
        setTotal(valor*qtd);
        JOptionPane.showMessageDialog(null, "Compra: \nNome Produto: "+getNome()+"\nQuantidade: "+getQtd()+"\nValor R$"+getValor()+"\nTotal R$"+getTotal());
        
    }
}
