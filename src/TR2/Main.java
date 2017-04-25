/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TR2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Banco b = new Banco();
        Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Digite su nombre");
        String n=sc.next();
        
        Tipo retiro = new Tipo("Retiro");
        b.addTipo(retiro);
        
        Tipo deposito = new Tipo("Deposito");
        b.addTipo(deposito);
        
        Cuenta n1 = new Cuenta(n);
        b.addCuenta(n1);
        
        n1.RealizarMovimiento(100, deposito);
        n1.RealizarMovimiento(50, retiro);
        
        System.out.println(b.toString());
    }
 
}
