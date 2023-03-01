//Criado 01/03/2023 16:34
package minhas.finanças;

public abstract class Beneficio 
{
    //Atributos
    public String descr;
    public float valorBase;
    public float adicional;
    public float valorBruto;
    public float desconto;
    public float valorLiquido;
    public int periodo;
    
    //Construtor
    public Beneficio(String descr, float valorBase, float adicional, float desconto, int periodo)
    {
        this.descr = descr;
        this.valorBase = valorBase;
        this.adicional = adicional;
        this.desconto = desconto;
        this.periodo = periodo;
    }
    
    //Getters and Setters
    public String getDescr()
    {
        return this.descr;
    }
    
    public float getValorBase()
    {
        return this.valorBase;
    }
    
    public float getAdicional()
    {
        return this.adicional;
    }
    
    public float getValorBruto()
    {
        return this.valorBruto;
    }
    
    public float getDesconto()
    {
        return this.desconto;
    }
    
    public float getValorLiquido()
    {
        return this.valorLiquido;
    }
    
    public int getPeriodo()
    {
        return this.periodo;
    }
    
    //Métodos
    public abstract float calculaValor();
}
