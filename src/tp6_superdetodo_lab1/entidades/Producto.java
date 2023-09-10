 
package tp6_superdetodo_lab1.entidades;

 
public class Producto implements Comparable<Producto>{
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private EnumCategoria categoria;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public EnumCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    public Producto(String descripcion, int codigo, double precio, int stock, EnumCategoria categoria) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Producto() {
    }
    
    @Override
    //retorna 0 si son iguales, 1 si es mayor, -1 si es menor
    public int compareTo(Producto o) {
        if (codigo == o.codigo ) {
        return 0;
        }else if (codigo > o.codigo) {
            return 1;
        }else {
            return -1;
        }
        
    }
    
    
}
