
import java.util.Date;
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
public class idadePessoa {
    private int ano;
    private int idade;
    public idadePessoa(){
        this(0,0);
    }

    public idadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void calcularIdade(){
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: ")));
        setIdade(2024-ano);
    }
    public void mostrarIdade(){
        JOptionPane.showMessageDialog(null, "A Sua idade é de: "+getIdade()+" anos");
    }
}
