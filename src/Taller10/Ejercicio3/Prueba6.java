import Taller10.Ejercicio3.Guitarra;
import Taller10.Ejercicio3.Instrumento;

void main() {

    Instrumento instrumento1 = new Instrumento("xyz");
    Guitarra guitarra1 = new Guitarra("zxy", 4);

    instrumento1.tocar();
    guitarra1.tocar();
}