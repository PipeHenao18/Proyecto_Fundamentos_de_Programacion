
public class Carro extends Vehiculo
{
    public Carro(){
        
    }
    public Carro(String p, String m, String c){
        super(p,m,c);
    }
    public Carro(String p, String m, String c, int v){
        super(p,m,c,v);
    }
    public String tipoVehiculo(){
        return "Carro";
    }
    public String toString(){
        String str = super.toString().concat("   Tipo de vehiculo: Carro");
        return str;
    }
}
