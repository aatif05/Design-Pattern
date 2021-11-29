package SingletonPattern;


public class SingletonBillPugh {

	private SingletonBillPugh() {
		
	}
	
	private static class SingletonHelper{
		private static final SingletonBillPugh Instance = new SingletonBillPugh();
	}
	
	public static SingletonBillPugh getInstance() {
		return SingletonHelper.Instance;
	}
	public static void main(String[] args) {
		SingletonBillPugh a = SingletonBillPugh.getInstance();
		SingletonBillPugh b = SingletonBillPugh.getInstance();
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	
}
