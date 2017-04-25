package TR5;

import java.util.ArrayList;


public class Producto extends DomainObject{
    
    private String Name;
    private String Description;
    private ArrayList<Item> items;
    private Categoria categoria;

    public Producto(String Name,String Description, String id) {
        super(id);
        this.Name = Name;
        this.Description=Description;
        this.items = new ArrayList<Item>();
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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    
    
    
}