import javax.swing.*;
import java.util.Scanner;
class BankApp {
	int balance = 600000;
  	int clothes = 30;
  	int car = 35000;
  	int meal_one_serving = 4;
    int phone = 350;
 	int laptop = 500;
  	int house = 900000;
  	int academics_for_child = 250000; 
  	int electricity = 360;
  	int income_per_year = 170000;
  	int amt_to_put_away_retirement_yr = 17000;
  	boolean yearPassed;
  	Scanner scanner = new Scanner(System.in); 
    boolean yr_passed=false;
 	BankApp(){
      
    }
  
  	public boolean has_year_passed(){
    	yearPassed=false;
      for (int i=0;i<10;i++){
          System.out.println("Has one year passed?(write either false or true)");
          if(scanner.hasNextBoolean()){ 
    		yr_passed = scanner.nextBoolean();
            
      	  }
           yearPassed = yr_passed;
        	System.out.println(yearPassed);
    	}
      return yearPassed;
    }
  	public void buying(){
      System.out.println("What do you want to buy?(write one of these: clothes, car, one serving of food, phone, laptop, house, academics, electricity)");
      
    }
  
  
  	public static void main(String[] args){
		BankApp bank = new BankApp();
      	bank.has_year_passed();
    }
}
      	