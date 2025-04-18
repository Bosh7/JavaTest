import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入你的體重(公斤): ");
		double weight = sc.nextDouble();
		
		System.out.print("請輸入你的身高(公分): ");
		double height = sc.nextDouble();
		
		double heightM = height/100;
		
		double bmi = weight / (heightM * heightM);
		
		System.out.printf("你的BMI是：%.0f\n", bmi);
		
//		if(bmi < 18.5) {
//			System.out.println("體重過輕");
//		}else if (bmi < 24) {
//			System.out.println("體重正常");
//		}else if (bmi < 27) {
//			System.out.println("體重過重");
//		}else {
//			System.out.println("體重過胖");	}
		String result = (bmi < 18.5) ? "體重過輕":
						(bmi < 24) ? "體重正常":
						(bmi < 27) ? "體重過重" : 
							"體重肥胖";
		System.out.println(result);
		
	
		sc.close();
	}

}
