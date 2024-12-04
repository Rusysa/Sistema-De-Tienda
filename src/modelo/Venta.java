
package modelo;


public class Venta {
    
    private int idVenta;
    private int idUsuario;
    private int idProducto;
    private int Cantidad;
    private double PrecioProducto;
    private double TotalPagar;
    private int estado;

    public Venta(){
      this.idVenta=0;
      this.idUsuario=0;
      this.idProducto=0;
      this.Cantidad=0;
      this.PrecioProducto=0;
      this.TotalPagar=0;
      this.estado=0;
    }
    public Venta(int idVenta, int idUsuario, int idProducto, int Cantidad, double PrecioProducto, double TotalPagar, int estado) {
        this.idVenta = idVenta;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.Cantidad = Cantidad;
        this.PrecioProducto = PrecioProducto;
        this.TotalPagar = TotalPagar;
        this.estado = estado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(double TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
