
package TR6;


public class Gato extends Mascota{
    
    private boolean Caza;
    

    
    public Gato(String id,String color, String Name) {
        super(id,color, Name);
        
        
    }

    public boolean Caza() {
        return Caza;
    }

    public void setCaza(boolean Caza) {
        this.Caza = Caza;
    }
    
    @Override
    public void sonido(){
        System.out.println("Miau...... !!");
    }
    
    
}
