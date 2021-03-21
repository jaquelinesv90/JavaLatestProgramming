package lambdaExpressions;

public class RunnableExample {
	
	
	public static void main(String[] args) {
		//Runnable tradional example
		Runnable r = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 0; i< 10; i++) {
					sum += i;
					System.out.println("Tradional: " + sum);
				}
			}
		};
		new Thread(r).start();
		
		//Runnable lambda example
		Runnable r1 = () -> {
			int sum = 0;
			for(int i = 0; i< 10; i++) {
				sum += i;
				System.out.println("Runnable Lambda: " + sum);
			}
		};
		
		new Thread(r1).start();
	}
}
