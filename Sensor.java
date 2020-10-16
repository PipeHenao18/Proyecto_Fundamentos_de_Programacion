
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
        }else if(this.estado == 1){
            est = "Libre";
        }        
        return "(" + est + ")";
    }
    
    public static String sensorLibre(){
        String str = "";
        for(int i = 0; i < sensores.length; i++){
            if(sensores[i] == null || sensores[i].getEstado() == 0){
                str = str.concat("(" + i + ")");
            }
        }
        return str;
    }
    
    public static String sensoresEstado(){
        String str = "";
        for(int i = 0; i < sensores.length; i++){
            if(sensores[i] != null){
                str = str.concat("(" + i + " " + sensores[i].toString().substring(1, sensores[i].toString().length() - 1) + ")");
            } else{
                str = str.concat("(" + i + " Libre)");
            }
        }
        return str;
    }
}
