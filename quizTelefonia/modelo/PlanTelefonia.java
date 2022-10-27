package modelo;

public class PlanTelefonia 
{
        //--------------------------
    //Atributos
    //--------------------------
    private String operador;
    private double numero;
    private int minutos;
    private int costoMinuto;
    private int saldo;
    
    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    public PlanTelefonia(String pOperador, double pNumero, int pMinutos, int pCostoMinuto)
    {
        this.operador = pOperador;
        this.numero = pNumero;
        this.minutos = pMinutos;
        this.costoMinuto = pCostoMinuto;
        this.saldo = 0;
    }
    
    public String getOperador()
    {
        return this.operador;
    }
    
    public double getNumero()
    {
        return this.numero;
    }
    
    public int getMinutos()
    {
        return this.minutos;
    }
    
    public int getCostoMinuto()
    {
        return this.costoMinuto;
    }
    
    public int getSaldo()
    {
        return this.saldo;
    }
    
    public void setOperador(String pOperador)
    {
        this.operador = pOperador;
    }
    
    public void setNumero(double pNumero)
    {
        this.numero = pNumero;
    }
    
    public void setMinutos(int pMinutos)
    {
        this.minutos = pMinutos;
    }
    
    public void setCostoMinuto(int pCostoMinuto)
    {
        this.costoMinuto = pCostoMinuto;
    }
    
    public void setSaldo(int pSaldo)
    {
        this.saldo = pSaldo;
    }

    public void Descuento(String operador)
    {
        if(operador == "Movilujo")
        {
            setSaldo(getSaldo() / 2);
        }
    }

    public void CalcularSaldo(int Minutos, int Costo)
    {
        setSaldo(Costo * Minutos);
    }

    public String resultado()
    {
        return "DATOS DEL PLAN \nNumero de celular: " + numero + "\nMinutos deseados: " + minutos + "\nOperador: " + operador + "\nCosto por Minuto: "+ costoMinuto + "\nSaldo a pagar: " + getSaldo();
    }
}
