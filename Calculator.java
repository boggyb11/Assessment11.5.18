public class Main{

public static void(String[] args){

	Calculator calculator = new Calculator();
	
	System.out.println("10 + 10 = "+calculator.add(10,10));
	System.out.println("20 - 10 = "+calculator.subtract(20,10));
	System.out.println("5 * 5 = "+calculator.multiply(5,5));
	System.out.println("20 / 5 = "+calculator.divide(20,5));
}

}


public class Calculator(){


public int add(int a, int b){
int c = a+b;

return c;


}

public int subtract(int a, int b){
int c = a-b;

return c;


}

public int multiply(int a, int b){
int c = a*b;

return c;


}

public int divide(int a, int b){
int c = a/b;

return c;


}



}