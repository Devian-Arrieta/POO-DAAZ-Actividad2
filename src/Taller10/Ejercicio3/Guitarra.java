package Taller10.Ejercicio3;

public class Guitarra extends Instrumento {
    private int numeroCuerdas;

    public Guitarra(String marca, int numeroCuerdas) {
        super(marca);
        this.numeroCuerdas = numeroCuerdas;
    }

    /*
    Al agregar @Override pero alterar los parámetros del metodo, Java detecta que
    la firma no coincide con la del metodo base, provocando error

    @Override // Error: Method does not override method from its superclass
    public void tocar(String cancion) {
        System.out.println("Tocando la canción " + cancion + " en la guitarra");
    }
    */


    /*
    El siguiente bloque compila Y funciona correctamente, pero representa
    una mala práctica de programación en Java
    */

    public void tocar() {
        System.out.println("La guitarra de " + numeroCuerdas + " cuerdas marca " + marca + " está sonando");
    }

    /*
    - @Override le exige al compilador verificar que el metodo realmente existe en la clase
      padre con la misma firma

    - Si por error se cambia el nombre del metodo y sin @Override Java no marcará
      ningún error, simplemente asumirá que se creó un metodo totalmente nuevo
      y no se ejecutará la sobrescritura

    - Si se cambia el nombre del metodo en la clase padre, las clases hijas perderán
       el comportamiento polimórfico sin lanzar ningún aviso durante la compilación
    */
}