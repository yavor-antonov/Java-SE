import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String,StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if (item != null){
            // check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks of this item, adjust the quantity
            if (inStock != item){
                item.adjustStock(inStock.availableQuantityInStock());
            }

            list.put(item.getName(), item);
            return item.availableQuantityInStock();
        }
        return 0;
    }

    public int sellStock (String item, int quantity){
        StockItem inStock = list.get(item);
        if ((inStock !=null) && (quantity>0)){
                return inStock.finalizeStock(quantity);
        }
        return 0;
    }

    public int reserveStock (String item, int quantity){
        StockItem inStock = list.get(item);
        if ((inStock !=null) && (quantity>0)){
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unReserveStock (String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);
        if ((inStock !=null) && (quantity>0)){
            return inStock.unReserveStock(quantity);
        }
        return 0;
    }

    public StockItem get (String key){
        return this.list.get(key);
    }

    public Map<String, Double> PriceList(){
        Map<String,Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String,StockItem> item : list.entrySet()){
            prices.put(item.getKey(),item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    public Map<String,StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String,StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantityInStock();

            s = s + stockItem + ". There are " + stockItem.availableQuantityInStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }
}
