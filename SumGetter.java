import java.util.Scanner;

public class SumGetter {
	public static void main ( String[] args ) {
		Scanner scan = new Scanner ( System.in );

		String item;
		int qty, price, total, sum;
		sum = 0; //kailangan ni kay mag error. wala daw naka initialize kung dili iset ang value = 0 
		for(int x = 1; x <= 3; x++){
			System.out.print("ITEM NAME: ");
			item = scan.nextLine();
			System.out.print("ITEM PRICE: ");
			price = scan.nextInt();
			System.out.print("ITEM QUANTITY: ");
			qty = scan.nextInt();

			total = price * qty;
			sum = total + sum;

			scan.nextLine(); //kung wala ni kay mag skip ang user input sa price sa 2nd ug 3rd nga loop 
		}                  //^^ dili ma input ang "item name" sa 2nd ug 3rd nga loop

		System.out.println("MASTER TOTAL: " + sum); //dapat naa sa gawas sa loop para dili mag balik balik ug print ang total
	}										  
}