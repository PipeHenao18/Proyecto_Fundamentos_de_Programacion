
public class BichoNormal extends Bicho
{
    public BichoNormal(){
        super(10);
    }
    
    public String toString(){
        String str = "BN-".concat(super.toString());
        return str;
    }
}
