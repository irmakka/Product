public class Product {
   private String id;
   public String model;
   public String brand;
   public int StockAmount;
   public String color;
   public Product(String model,String brand ,int StockAmount,String color){
          this.model=model;
          this.brand=brand;
          this.StockAmount=StockAmount;
          this.color=color;
   }
    public void setId(String Id){
        this.id=Id;
    }
    public String getId(){
        return id;
    }
}