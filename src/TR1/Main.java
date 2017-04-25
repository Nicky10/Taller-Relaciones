package TR1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Digite su nombre ");
        String a,b,c;
        a = sc.next();
        System.out.println("Digite su direccion");
        c = sc.next();
        System.out.println("Digite su telefono");
        b = sc.next();
        Persona p = new Persona(a, b, c);
        
        Rueda[] r = new Rueda[4];
        
        for(int i=0;i<r.length;i++){
        
            System.out.println("Digite la marca de la llanta "+(i+1)+" de su auto");
            String marca=sc.next();
            System.out.println("Digite el diametro de la llanta");
            int diametro= sc.nextInt();
            r[i] = new Rueda(diametro, marca);
            
        }
        System.out.println("Digite el modelo de su motor");
        String e= sc.next();
        System.out.println("Digite los caballos de Fuerza del motor");
        int t =sc.nextInt();
        System.out.println("Digite el volumen del motor");
        int y=sc.nextInt();
        Motor m = new Motor(e, t, y);
        
        System.out.println("Digite la placa del auto");
        String u=sc.next();
        System.out.println("Digite la marca del auto");
        String i=sc.next();
        System.out.println("Digite la referencia de su auto");
        String o=sc.next();
        Carro z = new Carro(u, i, o, r, m);
        
        System.out.println("Digite el material del chasis");
        String s=sc.next();
        System.out.println("Digite el tipo de chasis");
        String d=sc.next();
        z.setChasis(s, d);
        
                
        
        p.addCarro(z);
        
        
        System.out.println(p.ListarCarros());
    }
    
}
