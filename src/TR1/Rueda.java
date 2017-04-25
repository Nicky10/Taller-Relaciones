package TR1;

public class Rueda {
    private double Diametro;
    private String Marca;

    public Rueda(double Diametro, String Marca) {
        this.Diametro = Diametro;
        this.Marca = Marca;
    }

    public double getDiametro() {
        return Diametro;
    }

    public String getMarca() {
        return Marca;
    }
}
