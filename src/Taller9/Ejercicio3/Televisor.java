package Taller9.Ejercicio3;

/*
public class Televisor {

    private int pulgadas;

    public Televisor(String marca, double precio, int pulgadas) {
        super(marca, precio); // Expected no arguments but found 2
        this.pulgadas = pulgadas;
    }

    @Override // Method does not override method from its superclass
    public void mostrarInfo() {
        super.mostrarInfo(); // Cannot resolve method 'mostrarInfo' in 'Object'
        System.out.println("Pulgadas: " + pulgadas);
    }
}
*/

public class Televisor extends Electrodomestico{

    private int pulgadas;

    public Televisor(String marca, double precio, int pulgadas) {
        super(marca, precio);
        this.pulgadas = pulgadas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Pulgadas: " + pulgadas);
    }
}

/*
    // Como el atributo marca fue declarado como private en Electrodomestico, intentar acceder
    //  a él mediante super.marca genera error de compilación

    public void ejemplo(){
        System.out.println(super.marca); // 'marca' has private access in 'Taller9.Ejercicio3.Electrodomestico'
    }

    // La palabra clave super no ignora las reglas de encapsulamiento de Java ya que los atributos
    // privados solo son accesibles dentro de la propia clase donde fueron declarados
*/