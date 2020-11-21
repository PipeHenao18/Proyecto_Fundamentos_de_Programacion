
public class BichoAlien extends Bicho
{
    public BichoAlien(){
        super(20);
    }
    
    public String toString(){
        String str = "BA-".concat(super.toString());
        return str;
    }
}
