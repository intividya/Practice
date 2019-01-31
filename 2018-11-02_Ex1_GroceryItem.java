public class GroceryItem {
//Fields
  private String name;
  private String origin;
  private double price;

//Methods
  //Constructors
  public GroceryItem(String inputName, String inputOrigin, double inputPrice){
    name = inputName;
    origin = inputOrigin;
    price = inputPrice;
  }
  //Get-Methods
  public String getName(){
    return this.name;
  }
  public String getOrigin(){
    return this.origin;
  }
  public double getPrice(){
    return this.price;
  }
}
