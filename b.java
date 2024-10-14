import java.util.*;
public class b {
	public static double Add(double a,double b){
			return a+b;
	}
 	public static double Substraction(double a,double b){
                        return a-b; 
        }
	 public static double Multiplication(double a,double b){
                        return a*b; 
        }
	 public static double Divison(double a,double b){
                        return a/b; 
        }

	
	
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	
	double a =sc.nextInt();
	double b= sc.nextInt();
	
	String op =sc.next();
	char operator=op.charAt(0);
		
	switch(operator) {
		case '+':
			System.out.print(Add(a,b));

			break;
		case '-':
                        System.out.print(Substraction(a,b));
						break;

		case '*':
                        System.out.print(Multiplication(a,b));
						break;

		case '/':
                        System.out.print(Divison(a,b));
						break;


		default :
                        System.out.print("wrong input!");
			break;
}
}
}

