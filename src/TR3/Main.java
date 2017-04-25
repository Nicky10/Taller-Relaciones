
package TR3;
import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido, indique cuantas"
                + " salas va a programar");
        int a = sc.nextInt();
        Programacion po = new Programacion(a);
        po.Programar();
        System.out.println("¿Desea conocer la lista de funciones?\n1. Si\n2. No");
        int b = sc.nextInt();
        switch (b){
            
            case 1:
                po.listaFuncion();
            
                break;
        
            case 2: 
                System.out.println("Gracias por usar nuestro programa");
                
                break;
            default:
        }
    }
    
}
