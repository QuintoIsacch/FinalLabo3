public class Computadora extends Producto{
    private String procesador;
    private int ram;
    private int disco;

    public Computadora(String nombre, String marca, double precio, int stock, String procesador, int ram, int disco) {
        super(nombre, marca, precio, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    @Override
    public String toString(){
        return("[Nombre: "+ getNombre()+", Marca: "+getMarca()+", Precio: $"+getPrecio()+", Stock: "+getStock()+", Procesador: "+procesador+", Capacidad RAM(gb): "+ram+", Capacidad de Disco: "+disco+"]");
    }
}
