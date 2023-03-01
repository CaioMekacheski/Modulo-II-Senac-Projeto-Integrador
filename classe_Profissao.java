//Atualizado 01/03/2023 16:23

package minhas.finanças;

public class Profissao 
{
    //Atributos
    private String nome;
    private String descr;
    
    //Construtor
    public Profissao(String nome, String descr)
    {
        this.nome = nome;
        this.descr = descr;
    }
    
    //Getters and Setters
    public String getNome()
    {
        return this.nome;
    }
    
    public String getDescr()
    {
        return this.descr;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setDescr(String descr)
    {
        this.descr = descr;
    }
}
