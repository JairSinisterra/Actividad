public class CuantoOrdenador {
    public static void main(String[] args) {
        System.out.println("");

        var costoTienda = 660;
        var costoDescuento = costoTienda * 0.1;

        var costoPagar = costoTienda - costoDescuento;
        System.out.println("El costo a pagar es: "+costoPagar );
    }
}
