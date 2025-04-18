import java.util.*;

public class NumberGuessGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = rand.nextInt(100)+1;
		int guess;
		int count = 0;
		
		System.out.println("猜數字遊戲!請猜1~100之間的數字");
		
		while(true) {
			System.out.print("輸入猜的數字: ");
			guess = sc.nextInt();
			count++;
			
			if (guess > answer) {
				System.out.println("數字過大");
			}else if (guess < answer) {
				System.out.println("數字過小");
			}else {
				System.out.println("恭喜猜中");
				break;
			}
			
			
		}
		
		System.out.println("你總共猜了" + count + "次!。 正確數字為: " + answer);
		
	}

}
