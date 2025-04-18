interface Appliance {
    void turnOn();
    int getPowerUsage();
   
}

class TV implements Appliance {
	private int powerUsage = 120;
	
    @Override
    public void turnOn(){
      System.out.println("電視開啟中:正在載入頻道...");
    }
    
    @Override
    public int getPowerUsage() {
    	return powerUsage;
    }
}

class Washer implements Appliance {
	private int powerUsage = 500;
	
    @Override
    public void turnOn(){
      System.out.println("洗衣機開機中:準備洗衣!");
    }
    
    @Override
    public int getPowerUsage() {
    	return powerUsage;
    }
}

class AirConditioner implements Appliance {
	private int powerUsage = 1500;
	
    @Override
    public void turnOn(){
        System.out.println("冷氣開機中:開始降溫囉~");
    }
    
    @Override
    public int getPowerUsage() {
    	return powerUsage;
    }
}  
class Microwave implements Appliance{
	private int powerUsage = 700;
	
	@Override
	public void turnOn() {
		System.out.println("微波爐開機中:開始微波");
	}
	
	public int getPowerUsage() {
		return powerUsage;
	}
		
}
    


public class Main {
    public static void main(String[] args) {
        Appliance tv = new TV();
        Appliance washer = new Washer();
        Appliance act = new AirConditioner();
        Appliance microwave = new Microwave();
        
        Appliance[] appliances = {tv, washer, act, microwave};

        int totalPower = 0;
        
        for(Appliance a : appliances){
          a.turnOn();
          int usage = a.getPowerUsage();
          System.out.println("耗電量:" + usage +"w\n" );
          totalPower += usage;
        }
        
        System.out.println("--- 總電量: " + totalPower + "w ---" );
        
        if(totalPower > 2000) {
        	System.out.println("用電過載:請將部分設備關閉");
        }
        
    }
}
