package comercio;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MetodosArray {
    
    private static String nomProducto;
    private static float precio;

    // Get's y Set's
    
    public static String getNomProducto() {
        return nomProducto;
    }

    public static float getPrecio() {
        return precio;
    }
    
    // Lee un fichero y añade la información leida a las Ventas, Productos y Precios. Devuelve un array con las Ventas.
    
    public static Ventas[] leerBD(Ventas[] ventas) throws FileNotFoundException, IOException {

        String archivo = "/home/local/DANIELCASTELAO/slemagonzalez/Escritorio/ventas.txt";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int i = 0;
        String linea = b.readLine();
        
        while(linea != null){

            String[] refP = linea.split(" * ");
            Producto producto = new Producto(refP[2], refP[4], refP[6], Float.parseFloat(refP[8]));
            ventas[i] = new Ventas(String.valueOf(i + 1), producto, Float.parseFloat(refP[0]));
            i++;
            linea = b.readLine();
        }
        b.close();
        
        return ventas;
    }
    
    // Recibe un array con las ventas y en Nº de Venta. Y busca si existe, en caso de existir lo muestra.
    // Si existe, muestra: (Nº de Venta | Nombre del Producto | Precio Final [cantidad * precio])
    
    public static void buscar(Ventas[] array, String busqueda) {
        
        boolean atopado = false;
        
        for(Ventas object: array){
            
            if (busqueda.equals(object.getNv())){
                
                atopado = true;
                System.out.println("<-- Mostrando la Venta Buscada -->");
                System.out.println(object.getNv() + " | " + object.getRefProducto().getNome() + " | " + object.getRefProducto().getRefPrecio().getPrecio() * object.getCantidade()); break;
            }
        }
        
        if (atopado == false){
            System.out.println("No existe la Venta que ha buscado.");
        } 
    }
    
    public static void darAtributos(Ventas[] array, String busqueda){
        
        boolean atopado = false;
        
        for(Ventas object: array){
            
            if (busqueda.equals(object.getNv())){
                
                atopado = true;
                nomProducto = object.getRefProducto().getNome();
                precio = object.getRefProducto().getRefPrecio().getPrecio();
                break;
            }
        }
        
        if (atopado == false){
            System.out.println("No existe la Venta que ha buscado.");
        } 
    }
}
