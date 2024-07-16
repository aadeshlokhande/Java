import java.util.Scanner;

public class noteCount
{
	public static void main(String[] args)
	{
		// 2357
		int amount,note2000, note500, note200, note100, note50, note20, note10, coin5, coin2, coin1, remain;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a amount = ");
		amount = scanner.nextInt();
		
		note2000 = amount / 2000;
		remain = amount % 2000;

		note500 = remain / 500;
		remain = remain % 500;

		note200 = remain / 200;
		remain = remain % 200;

		note100 = remain / 100;
		remain = remain % 100;

		note50 = remain / 50;
		remain = remain % 50;

		note20 = remain / 20;
		remain = remain % 20;

		note10 = remain / 10;
		remain = remain % 10;

		coin5 = remain / 5;
		remain = remain % 5;

		coin2 = remain / 2;
		coin1 = remain % 2;
		
		System.out.println("note2000 = "+note2000);
		System.out.println("note500 = "+note500);
		System.out.println("note200 = "+note200);
		System.out.println("note100 = "+note100);
		System.out.println("note50 = "+note50);
		System.out.println("note20 = "+note20);
		System.out.println("note10 = "+note10);
		System.out.println("coin5 = "+coin5);
		System.out.println("coin2 = "+coin2);
		System.out.println("coin1 = "+coin1);
		
		scanner.close();
	}
}