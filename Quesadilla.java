public class Quesadilla extends ChipotleFood {
    private String meatType;

    // No-argument constructor
    public Quesadilla() {
        super();
        this.meatType = "Carnitas";
    }

    // Parameterized constructor
    public Quesadilla(String name, double price, boolean hasCheese, String meatType) {
        super(name, price, hasCheese);
        this.meatType = meatType;
    }

    // Accessor
    public String getMeatType() { 
      return meatType; 
  }

    // Mutator
    public void setMeatType(String meatType) { 
      this.meatType = meatType; 
    g}

  
    public String toString() {
        return super.toString() + ", Meat Type: " + meatType;
    }
}
