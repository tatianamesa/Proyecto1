import java.util.Arrays;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        mostrarMenu();

    }

    public static void mostrarMenu() {
        while (true) {
            System.out.println("0: se detiene la ejecucion");
            System.out.println("1: se creara un Vehiuclo");
            System.out.println("2: se mostrara la informacion de todos los vehiculos");
            System.out.println("3: se mostrara la cantidad de vehiculos creados");
            System.out.println("4: se mostrara los Vehiculos con color verde");
            System.out.println("5: se mostrara todo los Vehiculos que tengan modelo entre 2000 y 2021");
            System.out.println("6: se creara un sensor");
            System.out.println("7: se mostrara la informacion de todos los sensores ");
            System.out.println("8: se mostrara la cantidad de sensores creados");
            System.out.println("9: se mostrara por pantalla la información de todos los sensores que sean de tipo “temperatura” ");
            System.out.println("666: se muestra por pantalla los sensores tipo temperatura ordenados por valor");

            Scanner scan = new Scanner(System.in);
            int numero = scan.nextInt();

            switch (numero){
                case 0:
                    System.exit(0);//Se sale del programa totalmente

                case 1:
                    if(Vehiculo.posAnadir==Vehiculo.tamano){//como el tamaño es 10 cuando el contador de 10 ya no se pueden añadir mas
                        System.out.println("Error base de datos llena");
                        continue;
                    }
                    else {
                        System.out.println("Escriba un modelo: ");
                        int modelo = scan.nextInt();

                        System.out.println("Escriba una marca: ");
                        String marca = scan.next();

                        System.out.println("Valor comercial:");
                        double valorComercial = scan.nextDouble();

                        System.out.println("Color del carro:");
                        String color = scan.next();

                        Vehiculo vehiculoNuevo = new Vehiculo(modelo,marca,valorComercial,color);//instancia del objeto vehiculo
                        Vehiculo.anadirVehiculo(vehiculoNuevo);//se envia la instancia para que la agregue
                        System.out.println("Se añadio el carro con exito");
                        //System.out.println(Arrays.toString(Vehiculo.vehiculos)); para imprimir tod el arreglo
                    }
                    break;

                case 2:
                    System.out.println(Vehiculo.toStringVehiculos());
                    break;

                case 3:
                    System.out.println("Cantidad de vehiculos hasta el momento: "+Vehiculo.cantidadVehiculos());
                    break;

                case 4:
                    System.out.println(Vehiculo.vehiculosVerdes());
                    break;
                    
                case 5:
                    System.out.println(Vehiculo.vehiculos2000a2021());
                    break;
                case 6:
                    System.out.println("Ingrese el tipo de sensor");
                    String tipo = scan.next();
                    System.out.println("Ingrese el valor del sensor");
                    double valor = scan.nextDouble();
                    Sensor sensorx = new Sensor(tipo, valor );
                    Sensor.nuevoSensor(sensorx);
                    break;
                case 7:
                    System.out.println(Sensor.toStringSensores(Sensor.sensores));
                    break;
                case 8:
                    System.out.println("Cantidad de Sensores hasta el momento: "+Sensor.cantidadSensores());
                    break;
                case 9:
                    System.out.println(Sensor.infSensoresTipoTemp(Sensor.sensores));
                    break;
                case 666:
                    
                    Sensor[] prueba = Sensor.nuevoArreglo();
                    System.out.println(Sensor.toStringSensores(prueba));
                    break;
            }

        }
    }
}

