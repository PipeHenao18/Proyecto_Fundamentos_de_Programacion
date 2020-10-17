
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
        cantidad++;
    }
    
    public Vehiculo(String p, String m, String c, int v){
        this.placa = p;
        this.marca = m;
        this.color = c;
        this.valorComercial = v;
        cantidad++;
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
        return "Placa: "+this.placa+"   "+"Marca: "+this.marca+"    "+"Color: "+this.color+"    "+"Valor comercial: "+this.valorComercial + "\n";
    }
    
    public static String toStringVehiculos(){
        String str = "";
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null){
                str = str.concat(vehiculos[i].toString());
            }
        }
        return str;
    }
    
    public static int cantidadVehiculos(){
        return cantidad;
    }
    
    public static String vehiculosColor(String c){
        String str = "";
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null){
                String color = vehiculos[i].getColor();
                if(color.equalsIgnoreCase(c)){
                    str = str.concat(vehiculos[i].toString());
                }
            }
        }        
        return str;
    }
    
    public static String ordenValorComercial(){
        String str = "";
        Vehiculo temp;
        Vehiculo[] arr = vehiculos;
        int n = vehiculos.length;
        
        for(int i = 1; i < n ; i++){        
            for(int j = 0; j < n - i; j++){                
                 if(arr[j]==null){
                     temp = arr[j];                    
                     arr[j] = arr[n-i];                    
                     arr[n-i] = temp;
                     break;
                 }else if(arr[j+1]==null){
                     temp = arr[j+1];                    
                     arr[j+1] = arr[n-i];                    
                     arr[n-i] = temp;
                     break;
                 }else if(arr[j].getValorComercial()>arr[j+1].getValorComercial()){                
                     temp = arr[j];                    
                     arr[j] = arr[j+1];                    
                     arr[j+1] = temp;                    
                 }                
            }            
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                str = str.concat(arr[i].toString());
            }
        }
        return str;
    }
}
