package Taller9.Ejercicio3;

public class Electrodomestico {

    private String marca;
    protected double precio;

    public Electrodomestico(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println(
                "INFORMACIÓN DEL ELECTRODOMESTICO \n"+
                "Marca: " + marca +"\n"+
                "Precio: $" + precio
        );
    }
}
