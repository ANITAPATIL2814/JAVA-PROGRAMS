package multithreading;
/*Using class
 * extends: inherit parent property
 * 
 */
public class ThreadClassEg extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadClassEg te= new ThreadClassEg();
		te.start();
		ThreadClassEg te1= new ThreadClassEg();
		te1.start();
		
	}
}
