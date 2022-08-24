public class Facturas {

    private int total;
    private int cantidad;
    private int precio;

    public Facturas(int total, int cantidad, int precio) {
        this.total = total;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void imprimir() {
        System.out.println("total = " + total);
    }
}
