package Taller9.Ejercicio2;

public class Animal {

    String especie;

    public Animal(String especie){
        this.especie = especie;
    }

    public void mostrarEspecie(){
        System.out.println(
                "DESTALLES ANIMAL \n"+
                "Especie: "+ especie
        );
    }
}
