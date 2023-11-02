import Vehiculo.Bicicleta;
import Vehiculo.Carro;
import Vehiculo.vehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcion;
        Bicicleta bici = new Bicicleta();
        Carro car = new Carro();
        vehiculos ve = new vehiculos();

        do {
            System.out.println("escoge una opcion");
            System.out.println("1.andar en bicicleta");
            System.out.println("2.picar la bicicleta");
            System.out.println("3.andar en carro");
            System.out.println("4.quemar llanta");
            System.out.println("5.kilometros totales");
            System.out.println("6.kilometros en bicicleta");
            System.out.println("7.kilometros en carro");
            System.out.println("8.salir");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese la distancia para andar en bicicleta: ");
                    int distanciaBicicleta = scanner.nextInt();
                    bici.andar(distanciaBicicleta);
                    break;
                case 2:
                    System.out.print("Ingrese la distancia que picaste a bici: ");
                    int picar = scanner.nextInt();
                    bici.picar(picar);
                    break;
                case 3:
                    System.out.print("Ingrese la distancia para andar con el carro: ");
                    int distanciaCarro = scanner.nextInt();
                    car.andar(distanciaCarro);
                    break;
                case 4:
                    System.out.print("Ingrese la distancia para quemar llantas: ");
                    int quemar = scanner.nextInt();
                    car.quemarLlantas(quemar);
                    break;
                case 5:
                    System.out.println("Kilometraje de la bicicleta: " + ve.kilometrosTotales + " km");
                    break;
                case 6:
                    System.out.println("Kilometraje del carro: " + bici.kilometrosRecorridos + " km");
                    break;
                case 7:
                    System.out.println("Kilometraje total: " + car.kilometrosRecorridos + " km");
                    break;
            }
            System.out.println();
        }while(opcion != 8);
        System.out.println("saliendo");
        scanner.close();
    }
}