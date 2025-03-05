package basicSyntax;

public class Main {

	public static void main(String[] args) {
		int age = 10;
		int height = 130;
		GeekIntroduction.greeting(age, height);
		
		//num1とnum2は0より大きい値にしてください。
		int num1 = 0;
		int num2 = 1;
		GeekIntroduction.specialSkill(num1, num2);
		
		//num2はnum1より大きい値にしてください。。
		num1 = 30;
		num2 = 10;
		GeekIntroduction.specialSkill(num1, num2);
		
		//num1とnum2は300以下にしてください。
		num1 = 300;
		num2 = 400;
		GeekIntroduction.specialSkill(num1, num2);
		
		//正常
		num1 = 10;
		num2 = 30;
		GeekIntroduction.specialSkill(num1, num2);
	}

}