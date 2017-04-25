package TR6;

import java.util.ArrayList;


public class Persona {
    private String Name;
    private String id;
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>(); 

    public Persona(String nombre, String id) {
        this.Name = nombre;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
    
    public void Mascotas(){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            
            System.out.println("Mascotas:" + "\n" + "********** \n" );
            System.out.println("Mascota " + (i+1) + "\n" +
                               "Id " + m.getId() + "\n" + 
                               "Nombre " + m.getName() + "\n" + 
                               "Color " + m.getColor() + "\n");
        }
    }
}
