import Taller10.Ejercicio2.Bicicleta;
import Taller10.Ejercicio2.Vehiculo;

void main() {

    Vehiculo vehiculo1 = new Vehiculo("KIA");
    Bicicleta bicicleta1 = new Bicicleta("RTK", "acrobática");

    vehiculo1.moverse();
    bicicleta1.moverse();
}