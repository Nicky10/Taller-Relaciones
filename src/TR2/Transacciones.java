package TR2;

import java.util.Date;


public class Transacciones {
    
    private Date fecha;
    private double sInicial;
    private double cantidad;
    private Tipo tipo;

    public Transacciones(double cantidad, Tipo tipo) {
        this.fecha = new Date();
        this.sInicial = 0;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldoInicial() {
        return sInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.sInicial = saldoInicial;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    public double transaccion() {
        switch(this.tipo.movimiento()) {
            case 1:
                if(this.sInicial >= this.cantidad){                    
                    return this.sInicial - this.cantidad;
                } else {                   
                    return this.sInicial;
                }
            case 2:
                return this.sInicial + this.cantidad;
            default:
                return this.sInicial;
        }        
    }

    @Override
    public String toString() {
        String texto = "Movimiento\n\tFecha: " + fecha + 
                "\n\tSaldo Inicial: " + sInicial + "\n\t" + tipo;
        
        if(this.transaccion() == this.sInicial) {
            texto += "\n\tNo ha cambiado nada en su cuenta";
        } else {
            texto += "\n\tCantidad: " + cantidad + " Transacción realizada";
        }
        
        return texto;
    }
    
    

}
