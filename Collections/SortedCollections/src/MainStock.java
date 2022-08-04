import java.util.Map;

public class MainStock {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car",12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("chair",62.0,10);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.50,200);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp = new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice",2.50,36);
        stockList.addStock(temp);

        temp = new StockItem("phone",96.99,35);
        stockList.addStock(temp);

        temp = new StockItem("towel",2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("vase",8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList);

//        for (String s: stockList.Items().keySet()){
//            System.out.println(s);
//        }

        Basket timsBasket = new Basket("Tim");
        addItemToBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);

        addItemToBasket(timsBasket,"car" ,1);
        System.out.println(timsBasket);

        addItemToBasket(timsBasket,"car" ,1);
        addItemToBasket(timsBasket, "spanner",5);
        System.out.println(timsBasket);

        addItemToBasket(timsBasket,"juice" ,4);
        addItemToBasket(timsBasket,"cup" ,12);
        addItemToBasket(timsBasket,"bread", 1);
        System.out.println(timsBasket);

        removeItemFromBasket(timsBasket,"bread", 1);
        System.out.println(timsBasket);

        checkOutBasket(timsBasket);

        System.out.println(stockList);

        for (Map.Entry<String,Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int sellItem(String item, int quantity){
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        return stockList.sellStock(item, quantity);
    }

    public static int addItemToBasket (Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0){
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItemFromBasket (Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if ((!basket.Items().containsKey(stockItem)) || stockItem == null){
            System.out.println("This item was not found in the basket " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem,quantity) == quantity) {
            return stockList.unReserveStock(stockItem.getName(), quantity);
        }
        return 0;
    }

    public static void checkOutBasket(Basket basket){
        if (basket != null) {
            System.out.println("Checking basket out");
            for (Map.Entry<StockItem, Integer> itemInBasket : basket.Items().entrySet()) {
                stockList.sellStock(itemInBasket.getKey().getName(),itemInBasket.getValue());
            }
            basket.clearBasket();
        }
    }
}
