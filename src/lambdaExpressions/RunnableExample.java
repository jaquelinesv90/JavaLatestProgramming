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
		
		// lambda example
		Runnable r1 = () -> {
			int sum = 0;
			for(int i = 0; i< 10; i++) {
				sum += i;
				System.out.println("Runnable Lambda: " + sum);
			}
		};
		
		new Thread(r1).start();
		
		// Implement using Thread with Lambda
		new Thread( () ->{
			int sum = 0;
			for(int i =0; i <10; i++) {
				sum = sum + i;
				System.out.println("Thread Lambda: " + sum);
			}
		}).start();
	}
}
