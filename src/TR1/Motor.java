package TR1;

public class Motor {
    private String Modelo;
    private int CaballosDeFuerza;
    private double Volumen;

    public Motor(String Modelo, int CaballosDeFuerza, double Volumen) {
        this.Modelo = Modelo;
        this.CaballosDeFuerza = CaballosDeFuerza;
        this.Volumen = Volumen;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getCaballosDeFuerza() {
        return CaballosDeFuerza;
    }
    
    public double getVolumen() {
        return Volumen;
    }
}
