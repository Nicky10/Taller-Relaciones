/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TR3;
import java.util.*;


public class Programacion 
{
    private Sala[] salas;
    Scanner sc = new Scanner(System.in);
    
    public Programacion(int s)
    {
        this.salas = new Sala[s];
    } 
    
    public void Programar()
    {
        for (int i = 0; i < salas.length; i++)
        {
            this.salas[i] = new Sala(i+1);
            System.out.println("Cuantas semanas de trabajo tiene cada sala");
            int ss = sc.nextInt();
            this.salas[i].semanaSala(ss);
        }
    }
    
    public void listaFuncion()
    {
        for (int i = 0; i < salas.length; i++)
        {
            System.out.print("Para la sala " + (i+1) + " y ");
            this.salas[i].listaSemana();
        }
    }
}
