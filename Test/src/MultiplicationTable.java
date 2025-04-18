public class MultiplicationTable{
	
	public static void main(String[] args) {
	
		//外層:代表 第幾段 乘法
		for(int i = 1; i <= 9; i++) {
			
			//內層:每一段裡要乘的數字
			for (int j = 1; j <= 9; j++) {
				
				//計算乘積
				int result = i * j ;
				
				// 印出格式化結果
				System.out.printf("%d x %d = %2d\n", i, j, result); // 每印一個就換行
				
			}
			
		}
		
	}
}