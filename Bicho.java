
public class Bicho
{
    private int salud;
    
    public Bicho(int s){
        this.salud=s;
    }
    
    public int getSalud(){
        return this.salud;
    }  
    
    public void setSalud(int s){
        this.salud = s;
    }   
    
    public void reducirSalud(){
        this.salud = this.salud-5;
    }
    
    public String toString(){
        if(this.salud>=10){
            return ""+this.salud;
        }else{
            return "0"+this.salud;
        }
    }
}
