//CONDICIONALES
package condicionales;

//By: Russ Volk

import javax.swing.JOptionPane;

public class Condicionales {


    public static void main(String[] args) {
        
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        if (numero <= dato){
            JOptionPane.showMessageDialog(null, "El número ingresado es <= 5");
        }
        
        else{
            JOptionPane.showMessageDialog(null, "El número ingresado es mayor a 5");
        }
    }
    
}
/* != operador de desigualdad
== operador de igualdad
> mayor
< menor
>= mayor igual
<= menor igual

*/
