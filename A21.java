import java.util.Scanner;
class SimpleCalculator{
	int number;
	String operation;
	

	SimpleCalculator(int number){
		this.number = number;
	}
	void addInteger(){
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int sum = this.number + number;
		System.out.println(sum);
	}
	void subtractInteger(){
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int subtract = this.number - number;
		System.out.println(subtract);
	}
	void multiplyInteger(){
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int multiply = this.number * number;
		System.out.println(multiply);
	}
	void divideInteger(){
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int divide = this.number / number;
		System.out.println(divide);
	}
	void performCalculation(){
		Scanner s = new Scanner(System.in);
		this.operation = s.nextLine();
		char op = operation.charAt(0);
		switch (op){
			case '+':{
				addInteger();
				break;
			}
			case '-':{
				subtractInteger();
				break;
			}
			case '*':{
				multiplyInteger();
				break;
			}
			case '/':{
				divideInteger();
				break;
			}
			default :
			System.out.println("Invalid operator");
		}
	}
	 public static void main(String[] args) {
	 	SimpleCalculator sc = new
	 	SimpleCalculator(30);
	 	sc.performCalculation();
		
	}
}
