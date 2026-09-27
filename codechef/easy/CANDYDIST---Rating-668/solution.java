
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if (n % m == 0 && (n / m) % 2 == 0){
		        System.out.println("Yes");
		        
		    } else {
		        System.out.println("No");
		    }
		}
    }
}