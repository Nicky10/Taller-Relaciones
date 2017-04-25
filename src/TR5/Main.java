
package TR5;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Bienvenido\n\n");
        System.out.println("¿Cuantas categorias de productos desea añadir?");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
        
            System.out.println("Digite el nombre de la categoria");
            String b=sc.next();
            System.out.println("Digite el numero id de la categoria "+b);
            String d=sc.next();
            System.out.println("Digite una descripcion de la categoria");
            String z=sc.next();
            Categoria c  = new Categoria(b,z,d);
            System.out.println("¿Cuantos productos desea añadir a esta categoria?");
            int e=sc.nextInt();
            for(int j=0;j<e;j++){                
                System.out.println("Digite el nombre del producto"+(j+1));
                String f=sc.next();
                System.out.println("Ahora el id del producto");
                String g=sc.next();
                System.out.println("Digite una descripcion del producto");
                String zz=sc.next();
                c.addProducto(new Producto(f,zz,g));
                
                    System.out.println("Digite el nombre del item");
                    String t=sc.next();
                    System.out.println("Ahora el id del item");
                    String w=sc.next();
                    c.getProductos().get(j).addItem(new Item(t,w));
                    System.out.println("Digite el costo unitario del item");
                    int q=sc.nextInt();
                    c.getProductos().get(j).getItems().get(i).setUnitCost(q);
                   
                }
            c.informacionTotalProductos();
            }
        
        
        
    }
    
}
