package guru.qa.data;

public class MirCard extends Card{
    public MirCard() {
        super(PaymentSystem.MIR);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }
    protected boolean isCountryValidForTheseCard(Country country){
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
