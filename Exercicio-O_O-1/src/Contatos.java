
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
class Contatos {
    Scanner leia = new Scanner(System.in);
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public Contatos() {
        this("","","","");
    }

    public Contatos(String nome, String telefone, String endereco, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
   public void CadastrarDados(){
       System.out.println("Digite o seu Nome: ");
       nome = leia.nextLine();
       System.out.println("Digite o seu Telefone: ");
       telefone = leia.nextLine();
       System.out.println("Digite o seu Endereço: ");
       endereco = leia.nextLine();
       System.out.println("Digite o seu Cidade: ");
       cidade = leia.nextLine();
   }
   public void MostrarDados(){
       System.out.println("Nome: "+getNome()+"\n"
       + "Telefone: "+getTelefone()+"\n"
               + "Endereço: "+getEndereco()+"\n"
               + "Cidade: "+getCidade());
         
   }
}
