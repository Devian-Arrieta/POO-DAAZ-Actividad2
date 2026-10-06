import Taller10.Ejercicio1.Estudiante;
import Taller10.Ejercicio1.Persona;
import Taller10.Ejercicio1.Profesor;

void main() {

    Persona persona1 = new Persona("anabelle");
    Estudiante estudiante1 = new Estudiante("Devian", "segundo");
    Profesor profesor1 = new Profesor("John", "POO");

    persona1.presentarse();
    estudiante1.presentarse();
    profesor1.presentarse();
}