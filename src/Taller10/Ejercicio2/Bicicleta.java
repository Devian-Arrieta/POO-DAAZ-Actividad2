package Taller10.Ejercicio2;

public class Bicicleta extends Vehiculo {

    private String tipo;

    public Bicicleta(String marca, String tipo){
        super(marca);
        this.tipo = tipo;
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta de marca "+ marca +" y de tipo "+ tipo +" se está moviendo");
    }
}
