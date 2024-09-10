package trabajopracticon6ejercicio2;


public class Producto implements Comparable<Producto> {
    private int codigo, stock;
    private String descripcion, rubro;
    private double precio;
    

    public Producto(int codigo, String descripcion, double precio, String rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getRubro() {
        return rubro;
    }
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int compareTo(Producto otroProducto) {
        // Implementa la lógica de comparación
        // Por ejemplo, comparar por codigo:
        return Integer.compare(this.codigo, otroProducto.codigo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }
    
    
    

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nStock: " + stock + "\nDescripcion=" + descripcion + "\nRubro: " + rubro + "\nPrecio: " + precio;
    }

    
    
    
    
    
    
    
}
