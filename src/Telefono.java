public class Telefono extends Producto{
    private String so;
    private int capacidad;
    private double pulgadas;

    public Telefono(String nombre, String marca, double precio, int stock, String so, int capacidad, double pulgadas) {
        super(nombre, marca, precio, stock);
        this.so = so;
        this.capacidad = capacidad;
        this.pulgadas = pulgadas;
    }

    public Telefono() {
        super();
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString(){
        return("[Nombre: "+ getNombre()+", Marca: "+getMarca()+", Precio: $"+getPrecio()+", Stock: "+getStock()+", Sistema Operativo: "+so+", Capacidad: "+capacidad+", Tamaño de Pantalla(Pulgadas): "+pulgadas+"]");
    }
}
