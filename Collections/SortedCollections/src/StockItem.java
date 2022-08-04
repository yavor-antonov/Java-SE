public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock; // can be initialized later;

    private int reservedStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or here (but you wouldn't normally do both)
        this.reservedStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public int availableQuantityInStock() {
        return quantityStock-reservedStock;
    }

    public void setPrice(double price) {
        if (price>0.0){
            this.price = price;
        }
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity>=this.reservedStock){
            this.quantityStock = newQuantity;
        }
    }

    public int reserveStock(int quantity){
        if (quantity>0 && quantity <= availableQuantityInStock()){
            this.reservedStock += quantity;
            return quantity;
        }
        return 0;
    }

    public int unReserveStock(int quantity){
        if (quantity>0 && quantity<=this.reservedStock){
            this.reservedStock-=quantity;
            return quantity;
        }
        return 0;
    }

    public int finalizeStock (int quantity){
        if (quantity >0 && quantity <= this.reservedStock){
            this.reservedStock-=quantity;
            this.quantityStock-=quantity;
            System.out.println("Sold " + this.name + " quantity: " + quantity);
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj == this){
            return true;
        }
        if (obj == null || (obj.getClass()) != this.getClass()){
            return false;
        }
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o){
            return 0;
        }
        if (o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name +" : price " + this.price;
    }
}
