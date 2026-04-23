package dominio;

public class TarjetaDeCredito {

    protected String nombreBanco;
    protected String numeroTarjeta;
    protected double saldo;
    private String nombreCompleto;



    public TarjetaDeCredito(String nombreBanco, String numeroTarjeta, double saldo, String nombreCompleto) {
        this.nombreBanco = nombreBanco;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.nombreCompleto = nombreCompleto;
    }

    //Metodos

    /*public boolean tieneSaldo(double) {}
    public void descontar(double) {}
    public string nombreTitular () {}
    public string toString () {}*/


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public TarjetaDeCredito(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
