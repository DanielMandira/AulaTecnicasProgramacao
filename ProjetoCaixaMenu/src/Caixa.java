
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
public class Caixa {
    private double valor;
    private double saldo;

    public Caixa() {
        this(0.0,0.0);
    }

    public Caixa(double valor, double saldo) {
        this.valor = valor;
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
//    Metodo sem parametros e sem retorno 
    public void depositar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depósito: ")));
        setSaldo(getSaldo()+getValor());
    }
    
//    Metodo com parametro e com retorno
    public double depositar(double v){
        setSaldo(getSaldo()+v);
        return getSaldo();
    }
    
    public double sacar(){
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: ")));
        setSaldo(getSaldo() - getValor());
        return getSaldo();
    }
    
    public double saldo(){
        return getSaldo();
    }
    
}
