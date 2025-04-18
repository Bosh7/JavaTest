import java.util.*;

public class CarDealer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> carList = new ArrayList<>();
		Set<String> brandSet = new HashSet<>();
		
		while(carList.size() < 8) {
			System.out.print("請輸入車輛品牌 (或輸入 Quit 結束):");
			String brand = sc.nextLine();
			
			if(brand.equalsIgnoreCase("Quit")) {
				break;
			}
			
			if(brandSet.contains(brand)) {
				System.out.println("以收購該品牌，跳過儲存。");
				continue;
			}
			
			
			carList.add(brand);
			brandSet.add(brand);
			
		}
		
		System.out.println("車庫儲存內容: ");
		for(int i = 0; i<carList.size(); i++) {
			System.out.println("位置" + i + "="+carList.get(i));
		}
		
		System.out.println("擁有品牌(Set)");
		System.out.println(brandSet);

	}

}
