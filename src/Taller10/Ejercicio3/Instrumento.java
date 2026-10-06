package Taller10.Ejercicio3;

public class Instrumento {

    protected String marca;

    public Instrumento(String marca) {
        this.marca = marca;
    }

    public void tocar() {
        System.out.println("El instrumento de marca " + marca + " está sonando");
    }
}
