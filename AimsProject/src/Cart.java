package src;
public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

 // Method to add a DigitalVideoDisc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered <  itemsOrdered.length) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++; // Increment qtyOrdered when a disc is added
        } else {
            System.out.println("Cart is full!");
        }
    }

    // Method to remove a DigitalVideoDisc from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if ( itemsOrdered[i].equals(disc)) {
                // Shift discs to fill the gap
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] =  itemsOrdered[j + 1];
                }
                // itemsOrdered[qtyOrdered - 1] = null; // Clear the last slot
                qtyOrdered--; // Decrement qtyOrdered
                break;
            }
        }
    }

    public float totalCost(){
        float sum_cost = 0;
        for (int i = 0; i < qtyOrdered; i++){
            sum_cost += itemsOrdered[i].getCost();
        }
        return sum_cost;
    }

    public int getQtyOrdered() {
		return qtyOrdered;
	}
}
        

	
		
