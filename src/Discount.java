import java.util.List;

public  class Discount {
    private int percent;
    private List<Product>products;

    public Discount(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void discountedPrice(){
        for (int i = 0; i <products.size(); i++) {
           double dis = (double)  percent/100;
           double disPrice= products.get(i).getPrice()*dis;
           double dis1 = products.get(i).getPrice()-disPrice;
             products.get(i).setCurrentPrice((int)dis1);
        }
    }

    @Override
    public String toString() {
        return "Discount{" +
                "percent=" + percent;
    }
}
