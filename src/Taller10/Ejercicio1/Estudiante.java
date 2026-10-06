package Taller10.Ejercicio1;

public class Estudiante extends Persona{

    private String semestre;

    public Estudiante(String nombre, String curso){
        super(nombre);
        this.semestre = curso;
    }

    @Override
    public void presentarse() {
        System.out.println(
                "Hola mucho gusto, mi nombre es "+ nombre +
                ", soy estudiante y estoy cursando "+ semestre +" semestre"
        );
    }
}
