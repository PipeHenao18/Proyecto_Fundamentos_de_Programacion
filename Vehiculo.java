
public class Vehiculo
{
    //Atributos
    public static Vehiculo[] vehiculos;
    public static int cantidad = 0;
    private String placa, marca, color;
    private int valorComercial;
    
    //Metodos
    public Vehiculo(){
        
    }
    
    public Vehiculo(String p, String m, String c){
        this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial = 30000000;
    }
    
    public Vehiculo(String p, String m, String c, int v){
        this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial = v;
    }
    
    public String getPlaca(){
        return this.placa;
    } 
    
    public void setPlaca(String p){
        this.placa = p;
    } 
    
    public String getMarca(){
        return this.marca;
    } 
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public int getValorComercial(){
        return this.valorComercial;
    }
    
    public void setValorComercial(int v){
        this.valorComercial = v;
    }
    
    public String toString(){
        return "(" + this.placa + ", " + this.marca + ", " + this.color + ", " + this.valorComercial + ")";
    }
    
    public static String toStringVehiculos(){
        String inf = "";
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null){
                inf = inf.concat(vehiculos[i].toString());
            }
        }
        return inf;
    }
    
    public static int cantidadVehiculos(){
        return cantidad;
    }
}
