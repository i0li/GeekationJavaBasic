package basicSyntax;

public class ForWhile {

    public static void main(String[] args) {
        //作業1
        for (int i = 1; i <= 100; i++) {
            String outputString = "";

            if (i % 3 == 0) {
                outputString += "Fizz";
            }
            if (i % 5 == 0) {
                outputString += "Buzz";
            }
            if (outputString == "") {
                outputString = String.valueOf(i);
            }

            System.out.println(outputString);
        }

        //作業2
        String[] languages = {
            "Ruby",
            "Golang",
            "Java",
            "Python",
            "Typescript",
            "HTML",
            "Javascript",
        };
        for (String language : languages) {
            if (language == "Java") {
                System.out.println("現在学習中の言語はJavaです。");
                continue;
            }

            if (language == "HTML") {
                System.out.println("HTMLはプログラミング言語ではありません。");
                break;
            }

            System.out.println(language);
        }
    }
}
