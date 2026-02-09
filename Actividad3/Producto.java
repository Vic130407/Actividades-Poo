public class Producto {
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;
    public String getDescripcion() {
        return descripcion; 
    }
    public String getCodigo() {
        return codigo; 
    }
    public String getTipo() {
        return tipo;
    }
    public Double getCosto() {
        return costo;
    }
    public Double getImpuesto() {
        return impuesto;
    }
    public void setDescripcion(String descripcion) throws NullPointerException {
        this.descripcion = descripcion;
    }
    public void setCodigo(String codigo) throws NullPointerException {
        this.codigo = codigo;
    }
    public void setTipo(String tipo)throws NullPointerException {
        this.tipo = tipo;
    }
    public void setCosto(Double costo) throws NullPointerException{
        this.costo = costo;
    }
    public void setImpuesto(Double impuesto) throws NullPointerException{
        this.impuesto = impuesto;
    }
    public void muestraProducto() {
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Codigo: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: " + costo);
        System.out.println("Impuesto: " + impuesto);
    }
    public double calcularPrecio(double utilidad) {
        double precioutil = costo + (costo * utilidad / 100);
        double preciofin = precioutil + (precioutil * impuesto / 100);
        return preciofin;
    }
}
