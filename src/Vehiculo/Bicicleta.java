package Vehiculo;

public class Bicicleta extends vehiculos{

    public void andar(int distancia) {
        recorrer(distancia);
        System.out.println("estas manejando la bici");
    }

    public void picar(int distancia) {
        recorrer(distancia);
        System.out.println("Picando con la bicicleta");
    }
}
