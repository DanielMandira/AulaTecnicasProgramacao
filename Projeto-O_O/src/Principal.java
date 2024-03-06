
import java.util.Scanner;

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
        // Instanciar o Objeto da Classe Pessoa
        Scanner leia = new Scanner(System.in);
        String newNome, newEndereco, newTelefone;
        int newIdade;
        
        System.out.println("Digite o seu Nome: ");
        newNome=leia.next();
        
        System.out.println("Digite a sua Idade: ");
        newIdade=leia.nextInt();
        
        System.out.println("Digite o seu Telefone: ");
        newTelefone=leia.next();
        
        System.out.println("Digite o seu Endereço: ");
        newEndereco=leia.next();
        
        System.out.println("\n");
        Pessoa p = new Pessoa();
        p.setNome(newNome);
        p.setIdade(newIdade);
        p.setTelefone(newTelefone);
        p.setEndereco(newEndereco);
        
        p.MostraDados();
        
    }
    
}
