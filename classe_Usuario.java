//Criado 01/03/2023 16:27
package minhas.finanças;

public class Usuario 
{
    //Atributos
    private String nome;
    private String senha;
    
    //Construtor
    public Usuario(String nome, String senha)
    {
        this.nome = nome;
        this.senha = senha;
    }
    
    //Getters and Setters
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
}
