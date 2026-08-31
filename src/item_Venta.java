public class item_Venta {
    static int contador=0;
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public item_Venta()
    {
        contador+=1;
        this.id=contador;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double precioTotal()
    {
        return (this.precioUnitario*this.cantidad);
    }
    public void imprimir()
    {
        System.out.println("id=" +this.id);
        System.out.println("descripcion= "+this.descripcion);
        System.out.println("cantidad= "+this.cantidad);
        System.out.println("precio unitario= "+ precioUnitario);
        System.out.println("precio total= "+ precioTotal());
    }
}
