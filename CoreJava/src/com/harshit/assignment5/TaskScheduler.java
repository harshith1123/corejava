package com.harshit.assignment5;

public class TaskScheduler extends Thread {
	public static void main(String [] args) {
		TaskScheduler t1=new TaskScheduler();
		TaskScheduler t2=new TaskScheduler();
		TaskScheduler t3=new TaskScheduler();
		
			t1.scheduleTask("Task 1 is alloted",3000);
			t2.scheduleTask("Task 2 is alloted",1000);
			t3.scheduleTask("Task 3 is alloted",2000);
		
	}
	
	
	public  void scheduleTask(String task,int interval) {
			
		Task ta=(t,inter)->{	
			int i=1000;
			boolean result=true;
		while(result) {			
			try {
				System.out.println(t+" alloted @ the interval of "+ inter+"s");				
				Thread.sleep(3000);
				i+=1000;
				if(i==inter) {
					System.out.println("hello");
					result=false;
				}
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	};
	Task tb=(t,inter)->{	
		int i=1;
		while(true) {			
			try {
				
				System.out.println(t+" alloted @ the interval of "+ inter+"s");
				Thread.sleep(1000);
				i+=1000;
				if(i==inter) {
					break;
				}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			
	};
	Task tc=(t,inter)->{
		int i=1;
		while(true) {			
			try {				
				System.out.println(t+" alloted @ the interval of "+ inter+"s");
				Thread.sleep(2000);
				i+=1000;
				if(i==inter) {
					break;
				}				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	};
	
		ta.execute(task,interval);
		tb.execute(task,interval);
		tc.execute(task,interval);
	}

}
