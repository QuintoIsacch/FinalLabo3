import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProductNotFoundException, ProductNotAvailableException {
        Coleccion coleccion = new Coleccion<>();
        Telefono tel1 = new Telefono("IPhone 13", "Apple", 1200, 24, "IOS 15.2", 128, 8.3);
        Telefono tel2 = new Telefono("Galaxy 9", "Samsung", 750, 17, "Android 12", 64, 7.5);
        Computadora com1 = new Computadora("MAC X", "Apple", 2000, 10, "MACOS 14.1", 10, 1024);
        Computadora com2 = new Computadora("Infinit Ultra", "DELL", 3500, 7, "Windows 14", 15, 1024);
        Accesorio acc1 = new Accesorio("Funda IPhone X original", "Apple", 50, 43, "Lightning", "iphone x");
        Accesorio acc2 = new Accesorio("Cargador inalambrico", "Samsung", 120, 20, "USB C", "Con cualquier celular con carga inalalmbrica");
        coleccion.addProduct(tel1);
        coleccion.addProduct(tel2);
        coleccion.addProduct(com1);
        coleccion.addProduct(com2);
        coleccion.addProduct(acc1);
        coleccion.addProduct(acc2);

        //Productos para comprar
        Coleccion compra=new Coleccion<>();
        compra.addProduct(tel2);
        compra.addProduct(acc1);

        int cont;
        int opcion;
        int opcionX;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("BIENVENIDO A UTN-ELECTRONICS!\n");
            System.out.println("Elija una opcion e ingrese el numero de la misma\n");
            System.out.println("1- Eliminar un producto de la coleccion por nombre\n");
            System.out.println("2- Buscar un producto por nombre\n");
            System.out.println("3- Mostrar toda la coleccion de productos\n");
            System.out.println("4- Realizar una compra\n");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    String x=null;
                    System.out.println("Ingrese el nombre de3l producto que desea eliminar\n");
                    x = scanner.next();
                    try {
                        coleccion.deleteByName(x);
                    } catch (ProductNotFoundException e) {
                        System.out.println("ERROR: Producto no encontrado" + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    String xx = null;
                    System.out.println("Ingrese el nombre de3l producto que desea eliminar\n");
                    x = scanner.next();
                    try {
                        coleccion.getByName(xx);
                    } catch (IOException e) {
                        System.out.println("ERROR: Producto no encontrado" + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    coleccion.listAll();
                    break;

                case 4:
                    try{
                        coleccion.buy(compra);
                        System.out.println("Compra Realizada Con Exito!");
                    }
                    catch(ProductNotAvailableException e){
                        System.out.println("ERROR: Producto no disponible "+e.getMessage());
                        e.printStackTrace();
                    }
                    break;
            }
            System.out.println("Desea realizar otra accion? (1-Si/2-No)\n");
            cont=scanner.nextInt();
        }while (cont == 1) ;
    }
}