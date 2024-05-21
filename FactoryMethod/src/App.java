public class App {
    public static void main(String[] args) throws Exception {
        DolarPrinter dolarPrinter = new DolarPrinter();
        Money dolar = dolarPrinter.makeMoney();
        dolar.printCurrency();
    }
}
