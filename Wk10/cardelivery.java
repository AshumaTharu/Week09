package Wk10;


/**
 * Write a description of class cardelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cardelivery extends deliverypartner
{
    public cardelivery(int partnerid, String name, int basepay){
        super(partnerid, name, basepay);
    }
    
    @Override
    public double calculatepayment()
    {
        return super.calculatepayment() +7000;
    }
}