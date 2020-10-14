
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
        String est = "";
        if(this.estado == 1){
            est = "Ocupado";
        }else if(this.estado == 0){
            est = "Libre";
        }        
        return "(" + est + ")";
    }
    
    public static String sensorLibre(){
        String inf = "";
        for(int i = 0; i < sensores.length; i++){
            if(sensores[i] == null){
                inf = inf.concat("(" + i + ")");
            }
        }
        return inf;
    }
    
    public static String sensoresEstado(){
        String inf = "";
        for(int i = 0; i < sensores.length; i++){
            String est = "";
            if(sensores[i].getEstado() == 1){
                est = "Ocupado";
            }else if(sensores[i].getEstado() == 0){
                est = "Libre";
            }
            inf = inf.concat("(" + i + " " + est + ")");
        }
        return inf;
    }
}
