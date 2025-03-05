package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		outputCalcResult(sumNumbers(a,b));
		outputCalcResult(subNumbers(a,b));
		outputCalcResult(mulNumbers(a,b));
		outputCalcResult(divNumbers(a,b));
	}
	
	//メソッド1
	public static int sumNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	//メソッド2
	public static int subNumbers(int num1, int num2) {
		return num1 - num2;
	}
	
	//メソッド3
	public static int mulNumbers(int num1, int num2) {
		return num1 * num2;
	}
	
	//メソッド4
	public static int divNumbers(int num1, int num2) {
		return (int)num1 / num2;
	}
	
	//メソッド5
	public static void outputCalcResult(int num) {
		System.out.println("計算結果は" + num + "です。");
	}
}