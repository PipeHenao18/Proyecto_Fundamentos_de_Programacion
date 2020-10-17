
public class Sensor
{
    //Atributos
    public static Sensor[] sensores;
    private int estado;
    
    //Metodos
    
    public Sensor(){
        
    }
    
    public Sensor(int e){
        this.estado = e;
    }
    
    public int getEstado(){
        return this.estado;
    }
     
    public void setEstado(int e){
        this.estado = e;
    }    
    
    public String toString(){
        String est = "Libre";
        if(this.estado == 1){
            est = "Ocupado";
        }      
        return est;
    }
    
    public static String sensorLibre(){
        String str = "";
        for(int i = 0; i < sensores.length; i++){
            if(sensores[i] == null || sensores[i].getEstado() == 0){
                str = str.concat("(" + i + ")"+"\n");
            }
        }
        return str;
    }
    
    public static String sensoresEstado(){
        String str = "";
        for(int i = 0; i < sensores.length; i++){            
            if(sensores[i] != null){
                str = str.concat("El espacio " + i + " esta: " + sensores[i].toString() + "\n");
            } else{
                str = str.concat("El espacio " + i + " esta: " + "Libre" + "\n");
            }
        }
        return str;
    }
}
