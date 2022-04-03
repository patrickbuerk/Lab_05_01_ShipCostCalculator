public class Main
{

    public static void main(String[] args)
    {
        var itemPrice = 15;
        double itemPriceMoreThan100 =101;

        {
            if (itemPriceMoreThan100 >100) {
                var addedValue = itemPriceMoreThan100 * .02;
                var newPrice = addedValue + itemPriceMoreThan100;
                System.out.println(newPrice + " this is the price of the items with shipping");
            }
            if (itemPrice <= 100) {
                System.out.println("the item does not need to pay for shipping the item costs "+itemPrice);
            }
        }











    }
}
