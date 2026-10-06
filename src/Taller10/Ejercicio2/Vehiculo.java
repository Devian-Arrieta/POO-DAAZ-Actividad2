package Taller10.Ejercicio2;

public class Vehiculo {

    protected String marca;

    public Vehiculo(String marca){
        this.marca = marca;
    }

    public void moverse(){
        System.out.println("El vehiculo de marca "+ marca +" se está moviendo");
    }
}
