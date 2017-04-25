package TR1;

public class Carro {

    private String Placa;
    private String Marca;
    private String Modelo;
    private Rueda[] Ruedas;
    private Chasis Chasis;
    private Motor Motor;

    public Carro(String Placa, String Marca, String Modelo, Rueda[] Ruedas, Motor Motor) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ruedas = Ruedas;
        this.Motor = Motor;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public Rueda[] getRuedas() {
        return Ruedas;
    }

    public Chasis getChasis() {
        return Chasis;
    }

    public void setChasis(String Material, String Tipo) {
        Chasis = new Chasis(Material, Tipo);
    }

    public Motor getMotor() {
        return Motor;
    }
}
