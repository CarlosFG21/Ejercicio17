
package ejercicio17video22;

import java.util.*;
import javax.swing.JOptionPane;

public class correo {
    
    public void verificador(){
        
    Long resultado = 1L;
    
    int numero = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN NUMERO"));
    
    for(int i=numero; i > 0; i--){
        
        resultado = resultado*i;
    }
    
    System.out.println("EL FACTORIAL DE " + numero + " ES " + resultado);
    
    }
    
}
