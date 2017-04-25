
package TR3;
import java.util.*;

public class Semana
{
 private int N;
 private ArrayList<Segmento> s;
 private Dia[] diasTrabajo;
 Scanner sc = new Scanner(System.in);
 int t;
         
 public Semana (int n, int nd)
 {
     this.N = n;
     this.diasTrabajo = new Dia[nd];
 }
 
 public void Dias()
 {
     for (int i = 0; i < diasTrabajo.length; i++) 
     {
         System.out.println("Ingrese el nombre del dia que trabaja la sala "
         + "seguido de la fecha");
         String name = sc.next();
         String date = sc.next();
         this.diasTrabajo[i]= new Dia(name, date);        
     }
     System.out.println("En formato 24h\nIngrese la hora de inicio de las "
                + "actividades en la sala.");
     int hi = sc.nextInt();
     System.out.println("Ingrese la hora de finalizacion de las actividades "
                + "de la sala.");
     int hf = sc.nextInt();
     if (hf < 24)
     {
     System.out.println("Ingrese el numero de funciones de la sala "
        + "teniendo en cuenta que esta se reserva para dos horas.");
     int seg = sc.nextInt();
     if (seg ==((hf-hi)/2))
     {
     for (Dia diasTrabajo : diasTrabajo)
     {
         diasTrabajo.numSegmentos(seg,  hf);
     }
     } else {
         System.out.println("Por favor ingrese en formatos de dos horaa.");
     }
     } else {
         System.out.println("Ingrese el tiempo en un formato valido.");
     }
     t = ((hi-hf)/2);
 }
  
 public void listarDias()
 {
     for (int i = 0; i < diasTrabajo.length; i++)
     {
         System.out.print("En el dia " + this.diasTrabajo[i].getName() + " "
         + this.diasTrabajo[i].getDate() + " estan disponibles las seguientes"
                 + " funciones ");
         this.diasTrabajo[i].listarSegmentos();
     }
 }

    public int getNumero() {
        return N;
    }
 
}
