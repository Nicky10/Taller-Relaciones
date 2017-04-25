package TR1;

import java.util.ArrayList;

public class Persona {

    private String Nombre;
    private String Telefono;
    private String Direccion;
    private ArrayList<Carro> Carros;

    public Persona(String Nombre, String Telefono, String Direccion) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Carros = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public ArrayList<Carro> getCarro() {
        return Carros;
    }

    public void addCarro(Carro c) {
        Carros.add(c);
    }

    public String ListarCarros() {
        String listaDeCarros = "Carro de " + this.Nombre+ "\n\n";
        for (int i = 0; i < Carros.size(); i++) {
            listaDeCarros +=  "\nPlaca: " + Carros.get(i).getPlaca()
                    + "\nMarca: " + Carros.get(i).getMarca()
                    + "\nModelo: " + Carros.get(i).getModelo()
                    + "\nModelo del Motor: " + Carros.get(i).getMotor().getModelo()
                    + "\nCaballos de Fuerza: " + Carros.get(i).getMotor().getCaballosDeFuerza()
                    + "\nMarca de Ruedas: " + Carros.get(i).getRuedas()[0].getMarca();
        }
        return listaDeCarros;
    }
}
