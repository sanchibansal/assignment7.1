import java.util.*;
public class IntToString {
    public static void main(String args[]){
    	Scanner g= new Scanner(System.in);			
    	System.out.println("enter any number");
    	int a=g.nextInt();					//inputting number from scanner
    	g.close();
    	String numberAsString = Integer.toString(a); 		//converting int to string using inbuilt function
    	System.out.println("The Int varibale converted to String is "+numberAsString);	//printing the int converted to string value
    }
}
