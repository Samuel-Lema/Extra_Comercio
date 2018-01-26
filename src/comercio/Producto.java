package comercio;

public class Producto {
    
    private String refProducto;
    private String nome;
    private Precio refPrecio;

    // Constructor
    
    public Producto(String refProducto, String nome, String refPrecio, float precio) {
        
        this.refProducto = refProducto;
        this.nome = nome;
        this.refPrecio = new Precio(refPrecio, precio);
    }

    // Set's y Get's
    
    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Precio getRefPrecio() {
        return refPrecio;
    }

    public void setRefPrecio(Precio refPrecio) {
        this.refPrecio = refPrecio;
    }
    
    
    
    
}
