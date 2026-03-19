package guru.qa.data;

public class MasterCard extends Card implements ICard{

    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForTheseCard(Country country){
        return true;
    }
}
