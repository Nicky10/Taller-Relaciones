
package punto_b;


public class ABCDmain {

    public static void main(String[] args) {
        G[] elements = {new G(),new F(),new H(),new E()}; 
        
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i] );
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
        
        
    }
    
}
/*
        F hereda de G, E hereda de F y tambien de G, H hereda de E  tambien hereda de Fy de G. G no hereda de nadie.

        Primer paso:
        - En la primera linea el for muestra el objeto que esta en la posición 0 del vector elements.El elemento 0 es un new G(), es decir estamos creando un elemento de la clase G que nos retorna una cadena "G".
        - En la segunda linea se pide un method1 para el elemento. Como estamos sobre un objeto de la clase G el method1() nos muestra "G 1".
        - En la tercera linea se pide un method2 para el elemento. Como estamos sobre un objeto de la clase G el method2() nos muestra "G 2".
        
        Segundo paso:
        - En la primera linea se  muestra el objeto que estan en la posición 1 del vector elements. El elemento 1 es un new F(),estamos creando un elemento de la clase F que hereda de G.
          El constructor de F retorna un "F"
        - En la segunda linea se pide el method1 para el elemento. Es el que hereda de G, por lo tanto el method1 nos arrojara "G 1".
        - En la tercera linea se pide el method2 para el elemento. Este method2() se sobreescribe para que retorne un "F 2 ", pero a su vez llame el method2() de quien hereda que en este caso es G. Arrojara un "F 2" y un "G 2". 
        
        Tercer paso:
        - En la primera linea se muestra el objeto que esta en la posición 2 del vector elements. El elemento 2 es un new H(),estamos creando un elemento de la clase H que hereda de E, y esta clase E hereda de F, y F hereda de G. El constructor de H es el mismo contructor para E, ya que en la clase H no se define constructor, pero la clase E tampoco tiene constructor, entonces se ejecuta el constructor de F. Por lo tanto retorna "F".
        - En la segunda linea se pide el method1 para el elemento. Este se sobreescribe y retorna "H 1 ".
        - En la tercera linea se pide el method2 para el elemento. La clase H no lo tiene, por lo tanto se ejecuta el de la clase de la cual hereda que en este caso es la clase E, el cual arroja "E 2", pero a su vez ejecuta el method1() de H (por lo que no usa super), y que arroja un "H 1". Tendremos un "E 2" y un "H 1".
          
        Cuarto paso:
        - En la primera linea muestra el objeto que esta en la posición 3 del vector elements El elemento 3 es un new E(), es decir estamos creando un elemento de la clase E, la cual hereda de F. La clase E hereda el contructor de F ya que esta no lo tiene definido. Por lo tanto retorna un "F"
        - En la segunda linea se pide el method1 para el elemento. La clase E no lo tiene definido, por lo tanto se ejecuta el de la clase que hereda, que en este caso es F, pero F tambien hereda este metodo de G, por lo tanto se retorna un "G 1"
        - En la tercera linea se pide el method2 para el elemento. Este se sobreescribe para que retorne un "E 2 ", pero a su vez llama el method1 de la clase E  pero E hereda method1 , por lo tanto arrojara un "G 1". Al final tendremos un "E 2" y un "G 1"
        */