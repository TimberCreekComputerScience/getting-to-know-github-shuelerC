import java.util.Scanner;

public class HelloWorld{


     public static void main(String []args){

        

        Scanner lemonade = new Scanner (System.in);

        System.out.println("How many cups of lemonade do you want?");

        double cost = 1.50;
        int cups = lemonade.nextInt();

        double total = cost*cups;

        
        
        
        
	if(cups <= 0) {

            System.out.print("Nope.");

        }
        
	else {
            
		System.out.printf("You owe me $%.2f", total);

        }
     
}

}
