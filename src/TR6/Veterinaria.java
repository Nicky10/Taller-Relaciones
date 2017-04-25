
package TR6;

import java.util.ArrayList;


public class Veterinaria {
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    
    public Veterinaria() {
        
    }
    
    public void deletePet(Mascota mascota){
        this.mascotas.remove(mascota);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
    
    public void ordenMascota(String tipo){
        System.out.println("mascotas tipo " + tipo + "\n ************* \n");
            for (int i = 0; i < mascotas.size(); i++) {
                if (mascotas.get(i).getTipo()==tipo){
                Mascota m = mascotas.get(i);
                
                System.out.println("Id " + m.getId() + "\n" +
                                    "Nombre " + m.getName() + "\n" +
                                    "Color " + m.getColor()+"\n");
                }
        }
    }
    
    
}
