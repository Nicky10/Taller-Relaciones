/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_a;

/**
 *
 * @author SantiMahecha
 */
class Employee extends Person{
    public Employee(){
            this("Invoke Employee's");
            System.out.println("Performs Employee's tasks");
        }
    public Employee(String s){
            System.out.println(s);
        }
}
