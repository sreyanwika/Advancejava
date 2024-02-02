package producerconsumer;
import java.io.*;
class q{
	int n;
	boolean valueset=false;
	synchronized int get() {
		while(!valueset) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("interruptedexception caught");
				
			}
		}
			valueset=false;
			notify();
			return n;
		}
synchronized void put(int n) { 

	 

while(valueset) 

try { 

wait(); 

} catch(InterruptedException e) { 

System.out.println("InterruptedException caught"); 

} 

this.n = n; 

valueset = true; 

System.out.println("Put: " + n); 

notify(); 

} 

} 

class Producer implements Runnable { 

q q1; 

Producer(q q1) { 

this.q1 = q1; 

new Thread(this, "Producer").start(); 

} 

public void run() { 

int i = 0; 

while(true) { 

q1.put(i++); 

} 

} 

} 

class Consumer implements Runnable { 

q q1; 

Consumer(q q1) { 

this.q1 = q1; 

new Thread(this, "Consumer").start(); 

} 

public void run() { 

while(true) { 

q1.get(); 

} 

} 

} 

class pcfix{ 

public static void main(String args[]) { 

q q1 = new q(); 

new Producer(q1); 

new Consumer(q1); 

System.out.println("Press Control-C to stop."); 

} 

} 

