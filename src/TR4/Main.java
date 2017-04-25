package TR4;

import java.util.*;



public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc= new java.util.Scanner(System.in);
        ArrayList<Persona> personas;
        
        personas = new ArrayList();
        
        System.out.println("cuantas personas desea añadir?");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            System.out.println("Persona numero "+(i+1));
            System.out.println("Digite su nombre");
            String b=sc.next();
            System.out.println("Digite el dia del mes en el que nacio");
            int c=sc.nextInt();
   System.out.println("Digite el mes en el que nacio en numero."
                    + "1.Enero\n"
                    + "2.Febrero\n"
                    + "3.Marzo\n"
                    + "4.Abril\n"
                    + "5.Mayo\n"
                    + "6.Junio\n"
                    + "7.Julio\n"
                    + "8.Agosto\n"
                    + "9.Septiembre\n"
                    + "10.Octubre\n"
                    + "11.Noviembre\n"
                    + "12.Diciembre");
            int d=sc.nextInt();
            
            System.out.println("Ingrese su año de nacimiento");
            int e=sc.nextInt();
            System.out.println("Por ultimo, Digite su documento de identidad");
            int f=sc.nextInt();
            
        personas.add(new Persona(b,f, new Fecha(c, d, e)));
        
        
        }
        
        
        personas.forEach((Persona persona) -> {
            System.out.println(persona.toString());
        });    
    }
}
