package in.com.java.daemon.thread;

public class BackgroundThread extends Thread{
	
	//Daemon thread are supporting and background threads
	//It support main thread
	//When main thread execution is completed daemon thread also stop execution
	
	String name = null;
	
	public BackgroundThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name);
		}
	}

}
