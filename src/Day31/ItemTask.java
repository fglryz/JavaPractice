package Day31;

public class ItemTask {

   public  String name;
   public  double unitPrice;
   public  int quantity;

    public ItemTask(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "ItemTask{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total Price $=" + unitPrice*quantity +
                '}';
    }
    public double calsCost(){
        return unitPrice*quantity;
    }
}
/*

/*
4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity
            Add a constructor to initialize all the fields
            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()
 */
