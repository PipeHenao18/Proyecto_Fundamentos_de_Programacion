import java.util.Scanner;
import java.util.Date;
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
        
        System.out.println("Ingrese el valor a cobrar por hora para carros");
        int costoCarros = scan.nextInt();
        System.out.println("Ingrese el valor a cobrar por hora para motos");
        int costoMotos = scan.nextInt();
        
        System.out.println("**********************************************************");
        System.out.println("0 - Finalizar programa");
        System.out.println("1 - Mostrar los espacios desocupados");
        System.out.println("2 - Ingresar un nuevo vehículo omitiendo el valor comercial");
        System.out.println("3 - Ingresar un nuevo vehículo sin omitir valor comercial");
        System.out.println("4 - Información de todos los vehículos parqueados");
        System.out.println("5 - Cantidad de vehiculos parqueados");
        System.out.println("6 - Consultar el estado de un espacio");
        System.out.println("7 - Mostrar el estado de todos los espacios");
        System.out.println("8 - Consultar los vehículos de un color");
        System.out.println("9 - Mostrar los vehículos ordenados por valor comercial");
        System.out.println("10 - Desactivar sensor manualmente");
        System.out.println("11 - Exportar la información de los vehículos");
        System.out.println("**********************************************************");
        
        int i = scan.nextInt(); 
        int espacio;
        while(i!=0){
            switch(i){
                case 1:
                System.out.println("Los espacios desocupados son: "+"\n"+Sensor.sensorLibre());
                break;
                
                case 2:
                System.out.println("En que espacio desea parquear?");
                espacio = scan.nextInt();
                try{
                    if(Sensor.sensores[espacio] != null){
                        System.out.println("El espacio esta ocupado, no es posible realizar la acción");
                    }else{
                        System.out.println("Ingrese la placa del vehículo");
                        String placa = scan.next();
                        System.out.println("Ingrese la marca del vehículo");
                        String marca = scan.next();
                        System.out.println("Ingrese el color del vehículo");
                        String color = scan.next();
                        System.out.println("Ingrese el tipo de vehiculo que va a parquear (Carro o Moto)");
                        String tipo = scan.next();
                        if(tipo.equalsIgnoreCase("Carro")){
                            Vehiculo.vehiculos[espacio] = new Carro(placa, marca, color);
                            Sensor.sensores[espacio] = new Sensor(1);
                            System.out.println("La información del vehículo en el espacio "+espacio+" es la siguente :"+"\n"+Vehiculo.vehiculos[espacio].toString()+"\n"); 
                        }else if(tipo.equalsIgnoreCase("Moto")){
                            Vehiculo.vehiculos[espacio] = new Moto(placa, marca, color);
                            Sensor.sensores[espacio] = new Sensor(1);
                            System.out.println("La información del vehículo en el espacio "+espacio+" es la siguente :"+"\n"+Vehiculo.vehiculos[espacio].toString()+"\n"); 
                        }else{
                            System.out.println("El tipo de vehiculo es incorrecto"+"\n");
                        }                        
                    }
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("El espacio ingresado no existe"+"\n");
                }
                break;
                
                case 3:
                System.out.println("En que espacio desea parquear?");
                espacio = scan.nextInt();
                try{
                    if(espacio<0 || espacio>=espacios){
                        System.out.println("El espacio no existe");
                    }else if(Sensor.sensores[espacio] != null){
                        System.out.println("El espacio esta ocupado, no es posible realizar la acción");
                    }else{
                        System.out.println("Ingrese la placa del vehículo");
                        String placa = scan.next();
                        System.out.println("Ingrese la marca del vehículo");
                        String marca = scan.next();
                        System.out.println("Ingrese el color del vehículo");
                        String color = scan.next();
                        System.out.println("Ingrese el valor comercial del vehículo");
                        int valorComercial = scan.nextInt();
                        System.out.println("Ingrese el tipo de vehiculo que va a parquear (Carro o Moto)");
                        String tipo = scan.next();
                        if(tipo.equalsIgnoreCase("Carro")){
                            Vehiculo.vehiculos[espacio] = new Carro(placa, marca, color, valorComercial);
                            Sensor.sensores[espacio] = new Sensor(1);
                            System.out.println("La información del vehículo en el espacio "+espacio+" es la siguente :"+"\n"+Vehiculo.vehiculos[espacio].toString()+"\n"); 
                        }else if(tipo.equalsIgnoreCase("Moto")){
                            Vehiculo.vehiculos[espacio] = new Moto(placa, marca, color,valorComercial);
                            Sensor.sensores[espacio] = new Sensor(1);
                            System.out.println("La información del vehículo en el espacio "+espacio+" es la siguente :"+"\n"+Vehiculo.vehiculos[espacio].toString()+"\n"); 
                        }else{
                            System.out.println("El tipo de vehiculo es incorrecto");
                        }                        
                    }
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("El espacio ingresado no existe");
                }
                break;
                
                case 4:
                System.out.println("La información de los vehículos parqueados es la siguiente: "+"\n"+Vehiculo.toStringVehiculos());
                break;
                
                case 5:
                switch(Vehiculo.cantidadVehiculos()){
                    case 0:
                    System.out.println("Aún no hay vehículos parqueados"+"\n");
                    break;
                    
                    case 1:
                    System.out.println("Hay " + Vehiculo.cantidadVehiculos() + " vehículo parqueado"+"\n");
                    break;
                    
                    default:
                    System.out.println("Hay " + Vehiculo.cantidadVehiculos() + " vehículos parqueados"+"\n");
                    break;
                }
                break;
                
                case 6:
                System.out.println("Ingrese el espacio que desea consultar");
                espacio = scan.nextInt();
                try{
                    if(Sensor.sensores[espacio]!= null){
                        System.out.println("El espacio " + espacio +" esta: "+Sensor.sensores[espacio].toString()+"\n");
                    }else{
                        System.out.println("El espacio " + espacio +" esta: Libre"+"\n");
                    }
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("El espacio ingresado no existe");
                }
                break;
                
                case 7:
                System.out.println(Sensor.sensoresEstado());
                break;
                
                case 8:
                System.out.println("Ingrese el color que quiere buscar");
                String color = scan.next();
                if(Vehiculo.vehiculosColor(color).equals("")){
                    System.out.println("No hay ningun vehículo de ese color");
                }else{
                    System.out.println("Los vehiculos con el color "+color+" son los siguentes: "+"\n"+Vehiculo.vehiculosColor(color));
                }
                break;
                
                case 9:
                System.out.println("Los vehículos ordenados por el valor comercial de menor a mayor son los siguientes: "+"\n"+Vehiculo.ordenValorComercial());
                break;
                
                case 10:
                
                break;
                
                case 11:
                
                break;
                
                default:
                System.out.println("Comando incorrecto"+"\n");
                break;
            }
            System.out.println("********************");
            System.out.println("Ingrese otro comando");
            System.out.println("********************");
            i = scan.nextInt();
        }
        System.out.println("Fin del programa");
    }
}
