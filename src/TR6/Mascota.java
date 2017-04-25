
package TR6;


public class Mascota {
    private String id;
    private String Name;
    private String color;
    private String tipo;
    private Persona Owner;

    public Mascota(String id,String color, String nombre) {
        this.id = id;
        this.Name = nombre;
        this.color=color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getOwner() {
        return Owner;
    }

    public void setOwner(Persona Owner) {
        this.Owner = Owner;
    }

    
    public void sonido(){
        System.out.println("****");
    }
    
}
