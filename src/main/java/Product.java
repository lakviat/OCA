 public class Product {
    double price;
    public void dosmth (){

    }
}

 /* public */ class NextProduct {
    public void somthing(){
        Product product = new Product();
        product.price = 10;
        // NOW THIS WILL THROW AN ERROR BECAUSE ANOTHER CLASS IN THE CLASS
        // WAS DECLARED AS PUBLIC WHICH WILL NOT WORK
        // THERE SHOULD BE NO PUBLIC CLASSES IN THE CLASS
    }
}

 class Test {
    public void updatePrice(Product product, double price){
        price = price * 2;
        product.price = product.price + price;
    }
    public static void main (String [] args){
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Test t = new Test();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price + " : " + newPrice);
    }
}