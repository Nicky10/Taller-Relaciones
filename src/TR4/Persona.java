package TR4;


public class Persona {
    
    private String nombre;
    private int Documento;
    private Fecha cumpleaños;
    private static int cantidad = 0;

    public Persona(String nombre,int Documento, Fecha cumpleaños) {
        Persona.cantidad++;
        this.nombre = nombre;
        this.Documento = Documento;
        this.cumpleaños = cumpleaños;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return Documento;
    }

    public void setCedula(int cedula) {
        this.Documento = cedula;
    }

    public Fecha getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Fecha cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    @Override
    public String toString() {
        return   nombre + ".\nDnumero de documento : " + Documento + 
                ".\n Tu naciste el: " + cumpleaños;
    }
    
    
}
