package Invoice;
// 3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.


public class Invoice {
	
	// Create instance variables
	
	private String part_number;
	private String descrip;
	private int quantity;
	private double price;
	
	
	// Generate getters and setters 
	
	public String getPart_number() {
		return part_number;
	}
	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = (quantity < 0) ? 0 : quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = (price < 0.0) ? 0.0 : price; 
	}
	
	
	// Create a constructor for the four variables 
	public Invoice (String part_number, String descrip, int quantity, double price) {
		this.part_number = part_number;
		this.descrip = descrip;
		this.quantity = quantity;
		this.price = price;	
		
	}
	
	
	public double getInvoiceAmount() {
			return getQuantity() * getPrice();
		}
		

	}
