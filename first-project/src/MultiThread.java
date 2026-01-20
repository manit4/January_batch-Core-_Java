
class A extends Thread {

	int total = 0;

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 20; i++) {

				total = total + i;
			}
			notify();
		}
		int j = 0;
		for(int i = 0; i < 1000; i++) {
			j++;
		}
		System.out.println("J is "+j);
	}
}

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());

		A thread = new A();
		//Thread thread = new Thread();
		thread.setName("Aeron");
		thread.start();

		synchronized (thread) {
			thread.wait();
		}
		
		System.out.println("The total is " + thread.total);
	}
}


//class A implements Runnable {
//
//	int total = 0;
//
//	public void run() {
//
//		synchronized (this) {
//			for (int i = 0; i < 20; i++) {
//
//				total = total + i;
//			}
//			notify();
//		}
//		
//		int j = 0;
//		for(int i = 0; i < 10000; i++) {
//			j++;
//		}
//		System.out.println("Final j is "+j);
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		System.out.println(Thread.currentThread().getName());
//
//		A runnable = new A();
//		Thread thread = new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//
//		synchronized (runnable) {
//			thread.wait();
//		}
//		
//		System.out.println("The total is " + runnable.total);
//	}
//}

//class A implements Runnable {
//
//	int amount = 10;
//
//	public void run() {
//
//		System.out.println(Thread.currentThread().getName() + " is going to check bacalance");
//
//		for (int i = 0; i < 10000; i++) {
//			int j = 0;
//			j++;
//		}
//
//		synchronized (this) {
//			if (amount >= 10) {
//				System.out.println(Thread.currentThread().getName() + " is going to deduct");
//				for (int i = 0; i < 1000; i++) {
//					int j = 0;
//					j++;
//				}
//
//				amount = amount - 10;
//			}
//
//			else {
//				System.out.println(Thread.currentThread().getName() + " not enough fund");
//			}
//		}
//		System.out.println(
//				"Fund available is " + amount + " and the thread checking is " + Thread.currentThread().getName());
//		for (int i = 0; i < 1000; i++) {
//			int j = 0;
//			j++;
//		}
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//
//		System.out.println(Thread.currentThread().getName());
//
//		A runnable = new A();
//		Thread thread1 = new Thread(runnable);
//		Thread thread2 = new Thread(runnable);
//		thread1.setName("Aeron");
//		thread2.setName("Lin");
//		thread1.start();
//		thread2.start();
//
//	}
//}

//
//class A implements Runnable {
//	
//	int amount = 10;
//	
//	synchronized public void run() {
//		
//		System.out.println(Thread.currentThread().getName()+" is going to check bacalance");
//	
//		if(amount >= 10) {
//			System.out.println(Thread.currentThread().getName()+" is going to deduct");
////			for(int i = 0; i < 50; i++) {
////				
////			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//			amount = amount - 10;
//		}
//		else {
//			System.out.println(Thread.currentThread().getName()+" not enough fund");
//		}
//		
//		System.out.println("Fund available is "+amount+" and the thread checking is "+Thread.currentThread().getName());
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread1 =  new Thread(runnable);
//		Thread thread2 =  new Thread(runnable);
//		thread1.setName("Aeron");    thread2.setName("Lin");
//		thread1.start();    thread2.start();      
//		
//		
//	}
//}

//class A implements Runnable {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		System.out.println(Thread.currentThread().getName()+" is running now");
//
//		for(int i = 0; i < 20; i++) {
//			
//			total = total + i;
//		}
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println("inside second for loop");
//		}
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread =  new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//		
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		System.out.println("The total is "+runnable.total);
//	}
//}

//class A implements Runnable {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		System.out.println(Thread.currentThread().getName()+" is running now");
//
//		for(int i = 0; i < 20; i++) {
//			
//			total = total + i;
//		}
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println("inside second for loop");
//		}
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread =  new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//		
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		System.out.println("The total is "+runnable.total);
//	}
//}

//class A implements Runnable {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		System.out.println(Thread.currentThread().getName()+" is running now");
//
//		for(int i = 0; i < 20; i++) {
//			
//			total = total + i;
//		}
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread =  new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//		
//		try {
//			System.out.println(Thread.currentThread().getName()+" is going to sleep ");
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("The total is "+runnable.total);
//	}
//}

//class A implements Runnable {
//	
//	int account = 10;
//	
//	synchronized public void run() {
//		
//		System.out.println("Amout is "+account+" checked by "+Thread.currentThread().getName());
//		
//		if(account >= 10) {
//			
//			for(int i = 0; i < 50; i++) {
//				System.out.println("Time wasting by "+Thread.currentThread().getName()+" "+i);
//			}
//			account = account - 10;
//		}
//		else {
//			System.out.println("Not enough money");
//		}
//		
//		System.out.println("Transaction done "+account);
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread =  new Thread(runnable);
//		Thread thread2 =  new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//		thread2.start();
//	}
//}

//class A implements Runnable {
//	
//	public void run() {
//		
//		int total = 0;
//		
//		for(int i = 0; i < 20; i++) {
//			total = total + i;
//			System.out.println(Thread.currentThread().getName());
//		}
//		System.out.println(total);
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread =  new Thread(runnable);
//		Thread thread2 =  new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//		thread2.start();
//	}
//}

//class A implements Runnable {
//	
//	public void run() {
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("hiiiiiiii");
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread =  new Thread(runnable);
//		Thread thread2 =  new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//		thread2.start();
//	}
//}

//class A implements Runnable {
//	
//	public void run() {
//		for(int i = 0; i < 20; i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		A runnable = new A();
//		Thread thread =  new Thread(runnable);
//		Thread thread2 =  new Thread(runnable);
//		thread.setName("Aeron");
//		thread.start();
//		thread2.start();
//	}
//}

//class A extends Thread {
//	
//	public void run() {
//		for(int i = 0; i < 20; i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
//	}
//}
//
//public class MultiThread {
//
//	public static void main(String[] args) {
//		
//		A thread1 = new A();//This is normal object but is not thread...
//		A thread2 = new A();
//		thread1.setName("Aeron");
//		thread2.setName("Lin");
//		thread1.start();//start() will make the  normal class object acting as a thread
//						//and put it into runnable pool making it eligible for running...
//		thread2.start();
//	}
//}
