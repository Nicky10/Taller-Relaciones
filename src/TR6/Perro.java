
package TR6;


public class Perro extends Mascota{
    
    private String Breed;

    public Perro(String Breed, String id,String color, String nombre) {
        super(id,color, nombre);
        this.Breed = Breed;
        
    }
    

   
    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }
    
    
    @Override
    public void sonido(){
        System.out.println("Guau..... !!");
    }
    
   
}
