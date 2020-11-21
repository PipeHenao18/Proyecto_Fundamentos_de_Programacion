import java.util.*;

public class Juego
{
    public static Bicho[][] bichos = new Bicho[2][2];
    
    public static void main(String[] args){        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int cantBichos = rand.nextInt(4)+1;
        for(int i=0; i<cantBichos; i++){
            int num = rand.nextInt(2)+1;
            loop:
            for(int m=0; m<bichos.length; m++){
                for(int j=0; j<bichos[m].length; j++){
                    if(bichos[m][j]==null){
                        switch(num){
                            case 1:
                            bichos[m][j]= new BichoNormal();
                            break loop;
                            
                            case 2:
                            bichos[m][j]= new BichoAlien();
                            break loop;
                            
                            default:
                            break;
                        }
                    }             
                }
            }
        } 
        int i=0;
        while(true){
            System.out.println(Juego.tablero());
            System.out.println("En que fila deseas disparar?");
            int f = scan.nextInt();
            System.out.println("En que columna deseas disparar?");
            int c = scan.nextInt();
            try{
                if(bichos[f][c] == null){
                    System.out.println("No hay un bicho en esa posicion");
                }else{
                    bichos[f][c].reducirSalud(); 
                }
                for(int m=0; m<bichos.length; m++){
                    for(int j=0; j<bichos[m].length; j++){
                        if(bichos[m][j]!=null && bichos[m][j].getSalud()==0){
                            bichos[m][j]=null;
                            cantBichos--;
                        } 
                    }                                
                }
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("El espacio no existe");
            }
            if(cantBichos==0){
                break;
            }
            i++;
        }
        System.out.println(Juego.tablero());
        System.out.println("Fin del juego");
    }
    
    public static String tablero(){
        String str = "-------------" + "\n";
        for(int i=0; i<bichos.length; i++){
            for(int j=0; j<bichos[i].length; j++){
                if(bichos[i][j]!=null){
                    str = str.concat("|"+bichos[i][j].toString());
                }else{
                    str = str.concat("|     ");
                }                
            }
            str = str.concat("|"+"\n"+"-------------" + "\n");
        }
        return str;
    }
}
