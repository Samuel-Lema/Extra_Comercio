package comercio;

public class Precio {
    
    private String refPrecio;
    private float precio;

    // Constructor
    
    public Precio(String refPrecio, float precio) {
        this.refPrecio = refPrecio;
        this.precio = precio;
    }
    
    // Set's y Get's

    public String getRefPrecio() {
        return refPrecio;
    }

    public void setRefPrecio(String refPrecio) {
        this.refPrecio = refPrecio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
