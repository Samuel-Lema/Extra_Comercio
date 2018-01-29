package comercio;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Comercio {

    public static void main(String[] args) {
        
        
            // NV, refProducto, Cantidade      (Ventas)
            // 1 , refp1      , 2
            
            // refProducto, Nombre, refPrecio  (Producto)
            // refp1      , Uvas  , refPrecio1
            
            // refPrecio  , Precio             (Precio)
            // refPrecio1 , 5
        
        // Cargo los Productos desde el fichero donde existen    
        
        Ventas[] ventas = new Ventas[2];
        
        try {
            ventas = MetodosArray.leerBD(ventas);
            
        } catch (IOException ex) {
            
            Logger.getLogger(Comercio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Muestro las ventas
        
        System.out.println("<-- Mostrando ventas Registradas -->");
        
        for (Ventas venta: ventas){
            
            System.out.format("NV: %s | Cantidad: %s | Nombre: %s | Precio: %.2f\r\n", venta.getNv(), venta.getCantidade(), venta.getRefProducto().getNome(), venta.getRefProducto().getRefPrecio().getPrecio());
        }
        
        // Busco por Número de Venta
        
        MetodosArray.buscar(ventas, JOptionPane.showInputDialog("Introduce el NV a Buscar"));
        
        // Busco por Número de venta y asigno el nombre y precio estaticamente a la clase MetodosArray
        
        MetodosArray.darAtributos(ventas, JOptionPane.showInputDialog("Introduce el NV a Buscar (Estaticamente)"));
        
        System.out.format("Nombre Estatico: %s, Precio Estatico: %.2f",MetodosArray.getNomProducto(), MetodosArray.getPrecio());
        
        
    }
    
}
