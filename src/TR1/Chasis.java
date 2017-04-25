package TR1;

public class Chasis {
    private String Material;
    private String Tipo;

    public Chasis(String Material, String Tipo) {
        this.Material = Material;
        this.Tipo = Tipo;
    }

    public String getMaterial() {
        return Material;
    }

    public String getTipo() {
        return Tipo;
    }
}
