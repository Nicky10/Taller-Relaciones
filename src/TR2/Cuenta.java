package TR2;

import java.util.ArrayList;
import java.util.Date;


public class Cuenta {
    
    private final int nCuenta;
    private double saldo;
    private final Date Fecha;
    private String Cliente;
    private ArrayList<Transacciones> transacciones;
    private static int cantidad = 1;

    public Cuenta(String nombreCliente) {
        this.nCuenta = Cuenta.cantidad++;
        this.saldo = 0;
        this.Fecha = new Date();
        this.Cliente = nombreCliente;
        this.transacciones = new ArrayList<>();
    }

    public int getNumeroCuenta() {
        return nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFechaCreacion() {
        return Fecha;
    }

    public String getNombreCliente() {
        return Cliente;
    }

    public ArrayList<Transacciones> getTransacciones() {
        return transacciones;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.Cliente = nombreCliente;
    }

    public void setTransacciones(ArrayList<Transacciones> transacciones) {
        this.transacciones = transacciones;
    }

    public static void setCantidad(int cantidad) {
        Cuenta.cantidad = cantidad;
    }
    
    public void RealizarMovimiento(double cDinero, Tipo tipo) {        
        Transacciones m = new Transacciones(cDinero, tipo);
        m.setSaldoInicial(this.saldo);
        if((tipo.getCodigo().equals("Retiro")) && (this.saldo < cDinero)){
            System.out.println("No tiene suficiente dinero en la cuenta");          
        } else {
            this.saldo = m.transaccion();
            System.out.println("Transacción Realizada exitosamente");
        }        
        this.transacciones.add(m);
        
    }

    @Override
    public String toString() {
        String texto = "Hola " + Cliente + ". Esta es tu cuenta:\n\t" + 
                nCuenta + "\n\tFecha de Creación: " + Fecha + 
                "\nSaldo: " + saldo;
        
        texto = transacciones.stream().map((transaccione) -> 
                "\n" + transaccione.toString()).reduce(texto, String::concat);
        
        texto += "\nConsulta hecha el: " + new Date() + 
                "\nMuchas gracias";
        
        return texto;
    }
        
}
