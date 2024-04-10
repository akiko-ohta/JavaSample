package sample;

public class JavaSampleClass {

	public static void main(String[] args) {
		/*
		 Javaにおける数値表現
		 Author: akiko
		 */
//		System.out.println(10);
//		System.out.println(-8);
//		System.out.println(2.5);
//		System.out.println(100_000_000);
		
		// eを使った表現
		System.out.println(1.2e3); // 1.2かける10の3乗
		System.out.println(1.2e-3); // 1.2かける10の-3乗
		
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		System.out.println(10 % 3);
		System.out.println(10 + 2 * 3);
		System.out.println((10 + 2) * 3);
		
//		System.out.println(150 * 120);
//		System.out.println(150 * 130);
//		System.out.println(150 * 140);
		
//		int price;
//		price = 150;
		int price = 150;
		System.out.println(price * 120);
		System.out.println(price * 130);
		System.out.println(price * 140);
		
//		price = 151;
//		price = price + 1;
//		price += 1;
		price++;
//		price -= 1;
//		price--:
		System.out.println(price * 120);
		System.out.println(price * 130);
		System.out.println(price * 140);

	}
}