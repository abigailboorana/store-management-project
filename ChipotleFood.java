// superclass
public class ChipotleFood {
    private String name;
    private double price;
    private boolean hasCheese;

// no-argument constructor
    public ChipotleFood() {
        this.name = "Burrito Bowl";
        this.price = 12.49;
        this.hasCheese = true;
    }

  // parameterized constructor
    public ChipotleFood(String name, double price, boolean hasCheese) {
        this.name = name;
        this.price = price;
        this.hasCheese = hasCheese;
    }

  // accessors
    public String getName(){ 
      return name; 
  }
    public double getPrice(){ 
      return price; 
  }
    public boolean getHasCheese(){ 
      return hasCheese; 
}

// mutators
    public void setName(String name) { 
      this.name = name;
}
  
    public void setPrice(double price) { 
      this.price = price; 
      
}
    public void setHasCheese(boolean hasCheese) {
      this.hasCheese = hasCheese;
}

    public String toString() {
        return "Food Item: " + name + "\nPrice: $" + price + "\nDoes it inlcude Cheese? " + hasCheese;
    }
}
