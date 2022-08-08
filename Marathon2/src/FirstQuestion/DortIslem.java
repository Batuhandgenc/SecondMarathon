package FirstQuestion;
import java.util.Scanner;
	
public class DortIslem {
	 public static void main(String[] args) {


		char operator;
		Double number1, number2, result;


		Scanner input = new Scanner(System.in);


		System.out.println("İşlem Türünü Seçiniz");
		operator = input.next().charAt(0);


		System.out.println("İşlem yapmak istediğiniz birinci numarayı giriniz");
		number1 = input.nextDouble();

		System.out.println("İşlem yapmak istediğiniz ikinci numarayı giriniz");
		number2 = input.nextDouble();

		do {
		switch (operator) {

  
		case '+':
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
		break;

 
		case '-':
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
		break;


		case '*':
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
    	break;

		case '/':
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
    	break;

		default:
				System.out.println("Yanlış Seçim");
		break;
			}
			}	while (operator != 0);

			input.close();
		}
}