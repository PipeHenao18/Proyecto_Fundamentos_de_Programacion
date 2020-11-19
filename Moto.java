
public class Moto extends Vehiculo
{
    public Moto(){
        
    }
    public Moto(String p, String m, String c){
        super(p,m,c);
    }
    public Moto(String p, String m, String c, int v){
        super(p,m,c,v);
    }
    public String tipoVehiculo(){
        return "Moto";
    }
    public String toString(){
        String str = super.toString().concat("   Tipo de vehiculo: Moto");
        return str;
    }
}
