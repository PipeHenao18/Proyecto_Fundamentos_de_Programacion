import java.util.Scanner;
public class Principal
{
    public static void main(String[] args){
        Principal.mostrarMenu();
    }    
    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de espacios en el parqueadero");
        int espacios = scan.nextInt();
        Vehiculo.vehiculos = new Vehiculo[espacios];
        Sensor.sensores = new Sensor[espacios];        
        
        System.out.println("Que desea hacer?");
        System.out.println("0 - Finalizar programa");
        System.out.println("1 - Espacios desocupados");
        System.out.println("2 - Ingresar un nuevo vehículo sin valor comercial");
        System.out.println("3 - Ingresar un nuevo vehículo con valor comercial");
        System.out.println("4 - Información de todos los vehículos parqueados");
        System.out.println("5 - Cantidad de vehiculos parqueados");
        System.out.println("6 - Estado de los sensores");
        System.out.println("7 - Vehículos de un color");
        System.out.println("8 - Vehículos ordenados por valor comercial");
        
        int i = scan.nextInt(); 
        int espacio;
        while(i>0){
            switch(i){
                case 1:
                System.out.println(Sensor.sensorLibre());
                break;
                
                case 2:
                System.out.println("En que espacio desea parquear");
                espacio = scan.nextInt();
                if(Sensor.sensores[espacio] != null){
                    System.out.println("No se puede realizar la acción");
                }else{
                    System.out.println("Ingrese la placa del vehículo");
                    String placa = scan.next();
                    System.out.println("Ingrese la marca del vehículo");
                    String marca = scan.next();
                    System.out.println("Ingrese el color del vehículo");
                    String color = scan.next();
                    Vehiculo.vehiculos[espacio] = new Vehiculo(placa, marca, color);
                    Sensor.sensores[espacio] = new Sensor(1);
                    System.out.println(Vehiculo.vehiculos[espacio].toString());
                    Vehiculo.cantidad++;
                }
                break;
                
                case 3:
                System.out.println("En que espacio desea parquear");
                espacio = scan.nextInt();
                if(Sensor.sensores[espacio] != null){
                    System.out.println("No se puede realizar la acción");
                }else{
                    System.out.println("Ingrese la placa del vehículo");
                    String placa = scan.next();
                    System.out.println("Ingrese la marca del vehículo");
                    String marca = scan.next();
                    System.out.println("Ingrese el color del vehículo");
                    String color = scan.next();
                    System.out.println("Ingrese el valor comercial del vehículo");
                    int valorComercial = scan.nextInt();
                    Vehiculo.vehiculos[espacio] = new Vehiculo(placa, marca, color, valorComercial);
                    Sensor.sensores[espacio] = new Sensor(1);
                    System.out.println(Vehiculo.vehiculos[espacio].toString());
                    Vehiculo.cantidad++;
                }
                break;
                
                case 4:
                System.out.println(Vehiculo.toStringVehiculos());
                break;
                
                case 5:
                System.out.println("Hay " + Vehiculo.cantidadVehiculos() + "vehículos parqueados");
                break;
                
                case 6:
                System.out.println("Ingrese el espacio");
                espacio = scan.nextInt();
                if(Sensor.sensores[espacio] != null){
                    System.out.println(Sensor.sensores[espacio].toString());
                }else{
                    System.out.println("(Libre)");
                }
                break;
                
                case 7:
                System.out.println(Sensor.sensoresEstado());
                break;
                
                case 8:
                break;
                
                case 9:
                break;
                
                default:
                System.out.println("Comando incorrecto");
                break;
            }
            
            System.out.println("");
            System.out.println("Que desea hacer?");
            System.out.println("0 - Finalizar programa");
            System.out.println("1 - Espacios desocupados");
            System.out.println("2 - Ingresar un nuevo vehículo sin valor comercial");
            System.out.println("3 - Ingresar un nuevo vehículo con valor comercial");
            System.out.println("4 - Información de todos los vehículos parqueados");
            System.out.println("5 - Cantidad de vehiculos parqueados");
            System.out.println("7 - Estado un sensor");
            System.out.println("7 - Estado de los sensores");
            System.out.println("8 - Vehículos de un color");
            System.out.println("9 - Vehículos ordenados por valor comercial");
            i = scan.nextInt();
        }
        System.out.println("Fin del programa");
    }
}
