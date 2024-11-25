
package modelo;


public class Producto {
    
    private int IdProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;
    private int porcentajeiva;
    private int idcategoria;
    private int estado;
    
    public Producto(){
        this.IdProducto=0;
        this.nombre="";
        this.cantidad=0;
        this.precio=0;
        this.descripcion="";
        this.porcentajeiva=0;
        this.idcategoria=0;
        this.estado=0;
    }

    public Producto(int IdProducto, String nombre, int cantidad, double precio, String descripcion, int porcentajeiva, int idcategoria, int estado) {
        this.IdProducto = IdProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.porcentajeiva = porcentajeiva;
        this.idcategoria = idcategoria;
        this.estado = estado;
    }
    
    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentajeiva() {
        return porcentajeiva;
    }

    public void setPorcentajeiva(int porcentajeiva) {
        this.porcentajeiva = porcentajeiva;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}