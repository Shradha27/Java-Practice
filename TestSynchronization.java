class Table{  
	  
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
		
	public void run(){  
	Table.printTable(1);  
	}  
	}  
	  
	class MyThread2 extends Thread{ 
		Table t;
		MyThread2(Table t){
			this.t=t;
		}
	public void run(){  
		Table.printTable(10);  
	}  
	}  
	  
	class MyThread3 extends Thread{  
		Table t;
		MyThread3(Table t){
			this.t=t;
		}
		
	public void run(){  
		Table.printTable(100);  
	}  
	}  
	class MyThread4 extends Thread{ 
		Table t;
		MyThread4(Table t){
			this.t=t;
		}
	public void run(){  
		Table.printTable(1000);  
	}  
	}  
	  
public class TestSynchronization {
	public static void main(String t[]){ 
		Table obj = new Table();
		Table obj1 = new Table();
			MyThread1 t1=new MyThread1(obj);  
			MyThread2 t2=new MyThread2(obj);  
			MyThread3 t3=new MyThread3(obj);  
			MyThread4 t4=new MyThread4(obj);  
			t1.start();  
			t2.start();  
			t3.start();  
			t4.start();  
			}  
}