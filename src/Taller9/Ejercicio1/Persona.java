package Taller9.Ejercicio1;

public class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println(
                "DETALLES DE LA PERSONA \n"+
                "Nombre: "+ nombre +"\n"+
                "Edad: "+ edad
        );
    }
}
