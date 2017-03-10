package paLab1;
import java.util.*;
public class Pb1 {

	public static void main(String[] args) {
		int a,b;
		Scanner citire = new Scanner(System.in);
		a = citire.nextInt();
		b = citire.nextInt();
		int prod=0;
		while(a>0)
		{
			if(a%2==1)
				prod=prod+b;
			a = a/2;
			b = b+b;
		}
		
		System.out.println(prod);

	}

}
