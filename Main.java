 public class Main {
 
    public static void main(String[] args) {
      ProductManager productManager=new  ProductManager();
      Product product=new Product("Skinny Jean",  "Mavi", 50, "blue");
      productManager.add(product);
       System.out.println(product.model+product.brand+product.StockAmount+product.color+product.getId());
      
    }
}
