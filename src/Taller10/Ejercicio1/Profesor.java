package Taller10.Ejercicio1;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor(String nombre, String asignatura){
        super(nombre);
        this.asignatura = asignatura;
    }

    @Override
    public void presentarse() {
        System.out.println(
                "Hola mucho gusto, mi nombre es "+ nombre +
                ", soy profesor y enseño la asignatura de "+ asignatura
        );
    }
}
