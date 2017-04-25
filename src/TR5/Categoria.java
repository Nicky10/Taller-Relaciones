
package TR5;

import java.util.ArrayList;


public class Categoria extends DomainObject{
    
    private String Name;
    private String Description;
    private ArrayList<Producto> productos;

    public Categoria(String Name,String Description, String a) {
        super(a);
        this.Name = Name;
        this.Description=Description;
        this.productos = new ArrayList<Producto>();
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

     public void addProducto(Producto producto) {
        this.productos.add(producto);
    }
    public void informacionTotalProductos(){
        System.out.println("Categoria " + this.Name + "\n");
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            
            System.out.println("Nombre producto: " + p.getName() + "\n" +
                               "Descripción: " + p.getDescription() + "\n" +
                               "Items del producto: \n"  );
            for (int j = 0; j < p.getItems().size(); j++) {
                Item it = p.getItems().get(j);
                
                System.out.println("Nombre del item: " + it.getName() + "\n" +
                                   "Costo unidad: " + it.getUnitCost() + "\n");
                System.out.println("");
                
            }
        }
    
    }
    
}
