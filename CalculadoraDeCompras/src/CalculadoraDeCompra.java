public class CalculadoraDeCompra {

    public double calcularSubtotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public boolean esCompraValida(double precio, int cantidad) {
        return precio > 0 && cantidad > 0;
    }

    public double calcularDescuento(double subtotal) {
        if (subtotal >= 1000) {
            return subtotal * 0.10;
        }
        return 0.0;
    }

    public double calcularPrecioFinal(double subtotal) {
        double descuento = calcularDescuento(subtotal);
        return subtotal - descuento;
    }
}
