
package TR3;
import java.util.*;

public class Sala 
{
    private Semana[] semanas;
    private int numeroSala;
    Scanner tec = new Scanner(System.in);
    
    public Sala(int nSala)
    {
        this.numeroSala = nSala;        
    }
    
    public void semanaSala(int s)
    {
        this.semanas = new Semana[s];
        System.out.println("Digite la cantidad de dias de trabajo de la sala"
                + " por semana.");
        int dw = tec.nextInt();
        if (dw < 8)
        {
        for (int i = 0; i < semanas.length; i++) {
            this.semanas[i] = new Semana((i+1), dw);
            System.out.println("Semana "+ this.semanas[i].getNumero()+"\n  \n");
            this.semanas[i].Dias();
        }            
        } else {
            System.out.println("ERROR!\nLa semana tiene 7 dias.");
        }
    }

    public Semana[] getSemanas() {
        return semanas;
    }

    public int getNumSala() {
        return numeroSala;
    }

    public Scanner getTec() {
        return tec;
    }

    public void setSemanas(Semana[] semanas) {
        this.semanas = semanas;
    }

    public void setNumSala(int numSala) {
        this.numeroSala = numSala;
    }

    public void setTec(Scanner tec) {
        this.tec = tec;
    }

    public void listaSemana()
    {
        for (int i = 0; i < semanas.length; i++)
        {
            System.out.println("para la semana " + semanas[i].getNumero() + ":" );
            this.semanas[i].listarDias();
        }
    }
    
}
