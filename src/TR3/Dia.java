
package TR3;
import java.util.*;

public class Dia 
{
 private String Fecha;
 private String Nombre;
 private Segmento[] segmentos; 
 Scanner sc = new Scanner(System.in);
 
 public Dia(String d, String n)
 {
     this.Fecha = d;
     this.Nombre = n;
 }

    public void numSegmentos(int seg, int hf)
    {
        this.segmentos = new Segmento[seg];        
        for (int i = 0; i < segmentos.length; i++) {
            this.segmentos[i] = new Segmento( 1 + ":00", hf + ":00");            
        }
        for (int j = 0; j < segmentos.length; j++)
        {
            System.out.println("Ingrese el nombre de la funcion de las "
                    + this.segmentos[j].getInicio());
            String nm = sc.next();
            this.segmentos[j].setNombre(nm);
            this.segmentos[j].setBool(true);
        }
    }
            
    public String getDate()
    {
        return Fecha;
    }

    public String getName() 
    {
        return Nombre;
    }

    public Segmento[] getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(Segmento[] segmentos) {
        this.segmentos = segmentos;
    }
        
    public void setDate(String date)
    {
        this.Fecha = date;
    }

    public void setName(String Nombre)
    {
        this.Nombre = Nombre;
    }
    
    public void listarSegmentos()
    {
        for (int i = 0; i < segmentos.length; i++)
        {
            System.out.println("La funcion " + this.segmentos[i].getNombre() 
                    + " inicia a las " + this.segmentos[i].getInicio()
            + " y finaliza a las " + this.segmentos[i].getFin());
        }        
    }
 
 }
