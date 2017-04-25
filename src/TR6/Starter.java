
package TR6;

import java.util.Scanner;


public class Starter {

    
    public static void readPets(Veterinaria v){
        System.out.println("Mascotas en la Veterinaria: \n\n");
        for (int i = 0; i < v.getMascotas().size(); i++) {
            Mascota Pet = v.getMascotas().get(i);
            
            System.out.println("Id mascota: " + Pet.getId() + "\n" +
                               "Nombre mascota: " + Pet.getName() + "\n" +
                               "color mascota: " + Pet.getColor() + "\n" +
                               "tipo mascota: " + Pet.getTipo() + "\n" +
                               "dueño: " + Pet.getOwner().getName() + "\n" );
        }
    }
        
    
    public static void main(String[] args) {
        Veterinaria v = new Veterinaria();
        Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Bienvenido\n\n");
        System.out.println("¿Cuantas mascotas desea registrar?");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
        System.out.println("ingrese la mascota "+(i+1)+"\n"
                + "1.Perro\n"
                + "2.Gato\n"
                + "3.Hamster\n");
        int b=sc.nextInt();
        if(b==1){
            System.out.println("Ingrese la raza del perro");
            String q=sc.next();
            System.out.println("Ingrese el id del perro");
            String w=sc.next();
            System.out.println("Ingrese nombre del perro");
            String t=sc.next();
            System.out.println("Ingrese el color de "+t);
            String co=sc.next();
            Perro p = new Perro(q,w,co,t);
            System.out.println("ingrese el nombre del dueño de "+t);
            String o=sc.next();
            System.out.println("ingrese el documento del dueño de "+t);
            String u=sc.next();
            Persona per = new Persona(o,u);
            p.setOwner(per);
            p.setTipo("perro");
            v.addMascota(p);
        }
        else if(b==2){
        
            System.out.println("Ingrese el id del gato");
            String w=sc.next();
            System.out.println("Ingrese nombre del gato");
            String t=sc.next();
            System.out.println("Ingrese el color de "+t);
            String co=sc.next();
            Gato g = new Gato(w,co,t);
            System.out.println("ingrese el nombre del dueño de "+t);
            String o=sc.next();
            System.out.println("ingrese el documento del dueño de "+t);
            String u=sc.next();
            Persona per = new Persona(o,u);
            g.setOwner(per);
            g.setTipo("gato");
            v.addMascota(g);
        }
            
            
        else if (b==3){
            System.out.println("Ingrese el peso del hamster");
            int q=sc.nextInt();
            System.out.println("Ingrese el id del hamster");
            String w=sc.next();
            System.out.println("Ingrese nombre del hamster");
            String t=sc.next();
            System.out.println("Ingrese el color de "+t);
            String co=sc.next();
            Hamster h = new Hamster(q,w,co,t);
            System.out.println("ingrese el nombre del dueño de "+t);
            String o=sc.next();
            System.out.println("ingrese el documento del dueño de "+t);
            String u=sc.next();
            Persona per = new Persona(o,u);
            h.setOwner(per);
            h.setTipo("hamster"); 
            v.addMascota(h);
                }
        }
        readPets(v);
    }
    
}
