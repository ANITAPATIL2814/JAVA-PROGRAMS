package multithreading;
/*
 * Using interface
 * it only allow run method
 */

public class RunnableEg implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}	
	}
	public static void main(String[] args) {
		RunnableEg re= new RunnableEg();
		Thread ret= new Thread(re);//create parent(Thread) class obj and give class obj
		ret.start();	
	}
}
