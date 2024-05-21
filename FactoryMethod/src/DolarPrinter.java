public class DolarPrinter implements MoneyPrinter{
    
    @Override
    public Money makeMoney() {
        return new Dolar();
    }

}
