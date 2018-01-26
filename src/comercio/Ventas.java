package comercio;

public class Ventas {
    
    private String nv;
    private Producto refProducto = null;
    private float cantidade = 0;
    
    // Constructor

    public Ventas(String nv, Producto refProducto, float cantidade) {
        
        this.nv = nv;
        this.refProducto = refProducto;
        this.cantidade = cantidade;
    }
    
    // Set' y Get's

    public String getNv() {
        return nv;
    }

    public void setNv(String nv) {
        this.nv = nv;
    }

    public Producto getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(Producto refProducto) {
        this.refProducto = refProducto;
    }

    public float getCantidade() {
        return cantidade;
    }

    public void setCantidade(float cantidade) {
        this.cantidade = cantidade;
    }
}
