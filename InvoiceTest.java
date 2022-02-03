package Invoice;
import java.util.Scanner;


public class InvoiceTest {

	public static void main(String[] args) {
		
		//Create a scanner for input
		Scanner input = new Scanner(System.in);
		
		// Instantiate invoice 
		Invoice invoice1 = new Invoice("2567", "screw", 3, .67);
		
		// Confirm Invoice creation and print relevant details
		System.out.println("Invoice created for part number 2567, screws. 3 quantity at $.67 a piece.");
		
		//Test print get methods
		System.out.printf("Part number: %s \n", invoice1.getPart_number());
		System.out.printf("Part description: %s \n", invoice1.getDescrip());
		System.out.printf("Quantity: %s \n",  invoice1.getQuantity());
		System.out.printf("Price: %.2f \n", invoice1.getPrice());
		System.out.printf("Total amount: %.2f \n", invoice1.getInvoiceAmount());
		System.out.println("-------------------------------------------------------------");
		
		//Test an invoice that accepts custom arguments to test set methods
		
		Invoice invoice2 = new Invoice("0", "0", 0, 0);
		
		//Test print to confirm blank values 
		System.out.printf("Part number: %s \n", invoice2.getPart_number());
		System.out.printf("Part description: %s \n", invoice2.getDescrip());
		System.out.printf("Quantity: %s \n",  invoice2.getQuantity());
		System.out.printf("Price: %.2f \n", invoice2.getPrice());
		System.out.printf("Total amount: %.2f \n", invoice2.getInvoiceAmount());
		
		//Test setter methods
		System.out.println("Please enter the part number:");
		String new_part = input.nextLine();
		invoice2.setPart_number(new_part);
		
		System.out.println("Please enter the part description:");
		String new_descrip = input.nextLine();
		invoice2.setDescrip(new_descrip);
		
		System.out.println("Please enter the quantity:");
		int new_quantity = input.nextInt();
		invoice2.setQuantity(new_quantity);
		
		System.out.println("Please enter the price:");
		double new_price = input.nextDouble();
		invoice2.setPrice(new_price);
		
		//Print the new invoice with set values 
		System.out.printf("Part number: %s \n", invoice2.getPart_number());
		System.out.printf("Part description: %s \n", invoice2.getDescrip());
		System.out.printf("Quantity: %s \n",  invoice2.getQuantity());
		System.out.printf("Price: %.2f \n", invoice2.getPrice());
		System.out.printf("Total amount: %.2f \n", invoice2.getInvoiceAmount());
		
		//Test invoice to negative values
		invoice2.setQuantity(-3);
		invoice2.setPrice(-6);
		
		System.out.println("Invoice quantity and price set to negative values. Should print 0.");
		
		System.out.printf("New quantity: %s \n", invoice2.getQuantity());
		System.out.printf("New price: %.2f \n", invoice2.getPrice());
	}

}
