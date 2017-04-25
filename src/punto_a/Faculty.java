/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_a;




public class Faculty extends Employee {

    public static void main(String[] args) {
        new Faculty();
    }
    
    public Faculty(){
        System.out.println("Performs Faculty's tasks");
    }

}
/**
 *La clase hace un extends Empleado significa que hay herencia de la clase Empleado y se heredan los atributos protegidos y los metodos publicos, y asi Empleado hereda de Persona.
  Como estamos creando una Facultad, esta hereda de Empleado, asi pues, creara un Empleado, y este, a su vez, creara una Persona. Pues segun el codigo, una facultad, es un empleado, que a su vez es una persona.
  Al crear una facultad, vemos que el constructor deja un mensaje, pero al crear la facultad estamos creando un empleado, entonces se llama el contructor de Empleado, el cual arrojara dos mensajes, y seguidamente se creara una Persona, entonces se llama tambien el constructor de Persona, el cual deja un mensaje.
  Recibiremos los mensajes de contructor de las tres clases. Al crear una Facultad estamos creando no tres, sino un unico objeto de tipo Facultad pero que hereda lo de las superclases.
 */