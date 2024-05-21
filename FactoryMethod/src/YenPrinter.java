public class YenPrinter implements MoneyPrinter{

    @Override
    public Money makeMoney() {
        return new Yen();
    }

}
