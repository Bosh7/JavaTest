import java.io.*;

public class ExceptionMain {

	public static void main(String[] args) {
		try {
			System.out.println("Reading from file:" + args[0]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("未輸入檔案名稱,程式結束");
			System.exit(0);
		}
		BufferedReader b = null;
		try {
			 b = new BufferedReader(new FileReader(args[0]));
			String s = null;
			while((s = b.readLine()) != null) {
				System.out.println(s);
			}
		}catch (FileNotFoundException fe) {
			System.err.printf("%s不存在!%n", args[0]);
		}catch (IOException ie) {
			System.err.printf("%s內容讀取失敗!%n", args[0]);
		}finally {
			if(b!=null) {
				try {
					b.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("程式結束!");
	}
	
}
