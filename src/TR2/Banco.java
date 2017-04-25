package TR2;

import java.util.ArrayList;


public class Banco {
    
    private final String Code;
    private String Name ;
    private ArrayList<Tipo> Tipe;
    private ArrayList<Cuenta> Accounts;
    private static int cantidad= 0x1;;
    
    
    
    public Banco() {
        this.Code = "" + ((Banco.cantidad++ *(0x999999)) & 0xFFFFFF);
        this.Tipe = new ArrayList<>();
        this.Accounts = new ArrayList<>();
        System.out.println("Banco creado");
    }

    public ArrayList<Tipo> getTipos() {
        return Tipe;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.Tipe = tipos;
    }

    public ArrayList<Cuenta> getCuentas() {
        return Accounts;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.Accounts = cuentas;
    }

    public String getCodigo() {
        return Code;
    }

    public String getNombre() {
        return Name;
    }
    
    public void addTipo(Tipo tipo) {
        this.Tipe.add(tipo);
        
    }
    
    public void addCuenta(Cuenta cuenta) {
        this.Accounts.add(cuenta);
        
    }
    
    public void removeCuenta(Cuenta cuenta) {
        if(this.Accounts.contains(cuenta)){
            this.Accounts.remove(cuenta);
        } else 
            System.out.println("Esa ceunto no existe");
        
    }

    public void removeTipo(Tipo tipo) {
        if(this.Tipe.contains(tipo)){
            this.Tipe.remove(tipo);            
        } else 
            System.out.println("Ese tipo no existe");
        
    }

    @Override
    public String toString() {
        String Mensaje = "El banco: " + Name + ". " + Code + 
                "\nTipos de transacciones disponibles: ";
        
        Mensaje = Tipe.stream().map((tipo) -> 
                "\n" + tipo.toString()).reduce(Mensaje, String::concat);
        
        Mensaje += "\nCuentas";
        
        Mensaje = Accounts.stream().map((cuenta) -> 
                "\n" + cuenta.toString()).reduce(Mensaje, String::concat);
        
        return Mensaje;
    }
    
       
}
