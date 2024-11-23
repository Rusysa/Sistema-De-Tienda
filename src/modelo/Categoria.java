package modelo;

public class Categoria {

    private int IdCategoria;
    private String Descripcion;
    private int Estado;

    public Categoria() {
        this.IdCategoria = 0;
        this.Descripcion = "";
        this.Estado = 0;
    }

    public Categoria(int IdCategoria, String Descripcion, int Estado) {
        this.IdCategoria = IdCategoria;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

}
