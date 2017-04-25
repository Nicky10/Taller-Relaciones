
package TR5;


public class Item extends DomainObject {
    
    private String Name;
    private double UnitCost;
    private Producto producto;

    public Item(String nombre, String id) {
        super(id);
        this.Name = nombre;
    }

    public Producto getProducto() {
        return producto;
    }

    public void addProducto(Producto producto) {
        this.producto = producto;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(double UnitCost) {
        this.UnitCost = UnitCost;
    }
    
    
    
    
    
    
}
