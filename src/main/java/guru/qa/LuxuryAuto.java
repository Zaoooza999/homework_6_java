package guru.qa;

public class LuxuryAuto {
    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LuxuryAuto that = (LuxuryAuto) o;
        if (manufactureYear != that.manufactureYear) return false;
        if (dollarPrice != that.dollarPrice) return false;
        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = result + manufactureYear;
        result = result + dollarPrice;
        return result;
    }
}
