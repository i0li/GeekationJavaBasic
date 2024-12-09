package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		//作業1
		int a = 20;
		int b = 10;
		System.out.println(a>b);
		
		//作業2
		boolean isSunny = true;
		boolean isWarm = true;
		System.out.println(isSunny && isWarm);
		
		//作業3
		int x = 10;
		int y = 20;
		System.out.println(x >= 0 && y%2 == 0);
		
		//作業4
		boolean hasPermission = false;
		System.out.println(!hasPermission);
	}

}