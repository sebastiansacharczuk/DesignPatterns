public class EuroPrinter implements MoneyPrinter{
    @Override
    public Money makeMoney() {
        return new Euro();
    }
}
