//Criado 01/03/2023 11:00
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
    
    //Métodos
    public abstract float calculaValor();
}
