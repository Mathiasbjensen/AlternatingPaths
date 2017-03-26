import java.util.Scanner;

public class AlgoExam09 {
	

	public static void main(String[] args) {
		
		AlgoMain rekursiv = new AlgoMain();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter an integer");
   
        int n = scanner.nextInt();
        System.out.println("Recursive Result: " + rekursiv.Rekur(n));
    
		System.out.println("-------------------------------------------");
		
		System.out.println("Iterative Result: " + rekursiv.Iter(n));
		
	}
	
	public static int Rekur(int n) {
		if (n <= 0) {
			return 0;
			
		}
		else {
		
			return n+Rekur(n-1)+2;
		}
		
	}
	
	public static int Iter(int n) {
		
		int x = 0;
		int i = 1;
		
		while (i <= n) {
			x = x+2+i;
			i = i+1;
			
		}
		return x;
		
	}

}
