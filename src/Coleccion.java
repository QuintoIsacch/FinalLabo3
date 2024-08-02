import java.util.HashSet;

public class Coleccion <T extends Producto>{
    private HashSet<T> productos;

    public Coleccion() {;
    }

    public Coleccion(HashSet<T> productos) {
        this.productos = productos;
    }

    public HashSet<T> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<T> productos) {
        this.productos = productos;
    }

    public void addProduct(T product){
        productos.add(product);
    }

    public T getByName(String name) throws ProductNotFoundException{
        T encontrado=null;
        for(T producto : productos){
            if(producto.getNombre().equals(name)){
                encontrado=producto;
            }
        }
        if(encontrado==null){
            ProductNotFoundException e = new ProductNotFoundException();
            throw e;
        }
        else{
            return encontrado;
        }
    }

    public T getByBrand(String name) throws ProductNotFoundException{
        T encontrado=null;
        for(T producto : productos){
            if(producto.getMarca().equals(name)){
                encontrado=producto;
            }
        }
        if(encontrado==null){
            ProductNotFoundException e = new ProductNotFoundException();
            throw e;
        }
        else{
            return encontrado;
        }
    }

    public void listAll(){
        for(T producto : productos){
            System.out.println(producto.toString());
            System.out.println("------------------------------------------------------------------------------------------------");
        }
    }

    public void deleteByName(String name) throws ProductNotFoundException {
        T aBorrar=null;
        for(T producto : productos){
            if(producto.getNombre().equals(name)){
                aBorrar=producto;
                productos.remove(producto);
            }
        }
        if(aBorrar==null){
            ProductNotFoundException e=new ProductNotFoundException();
            throw e;
        }
        else{
            System.out.println("El siguiente producto ha sido eliminado de la coleccion: \n");
            System.out.println(aBorrar.toString());
        }
    }

    public void buy(Coleccion compras) throws ProductNotAvailableException {
        for(T compra : compras.getProductos()){
            for(T producto : productos){
                    producto.setStock((producto.getStock()-1));
                }
                if(compra.getStock()==0){
                    ProductNotAvailableException e =new ProductNotAvailableException();
                    throw e;
                }
            }
        }
    }
}
