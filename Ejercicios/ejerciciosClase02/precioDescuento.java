public class precioDescuento {
    public static void main(String[] args) {
       var valorPagado = 34;
       var valorDescuento = valorPagado * 0.15;
       var precioAntes = valorPagado - valorDescuento;

       System.out.println("El valor anterior era: "+precioAntes);
    }
}
