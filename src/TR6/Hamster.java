
package TR6;


public class Hamster extends Mascota{
    
    private double Weight;

    public Hamster(double peso, String id,String color, String nombre) {
        super(id,color, nombre);
        this.Weight = peso;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }
    
    @Override
    public void sonido(){
        System.out.println("t-t-t-t-tt");
    }
}
