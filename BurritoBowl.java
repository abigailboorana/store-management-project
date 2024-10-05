public class BurritoBowl extends ChipotleFood {
    private boolean hasCheese;

// no-argument constructor
    public BurritoBowl() {
        super();
        this.hasCheese = false;
    }

// parameterized constructor
    public BurritoBowl(String name, double price, boolean hasCheese) {
        super(name, price, hasCheese);
        this.hasCheese = hasCheese;
    }

// accessor methods
    public boolean hasCheese() { 
      return hasCheese; 
}

// mutator methods
    public void setHasCheese(boolean hasCheese) { 
      this.hasCheese = hasCheese; 
}


    public String toString() {
        return super.toString() + ", Has Cheese: " + (hasCheese ? "Yes" : "No");
    }
}
