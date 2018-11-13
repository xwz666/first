//package com.xwz;
//
//public class Test2 implements Runnable {
//
//	private String name;
//	
//	private Object before;
//	
//	private Object after;
//	
//	
//	
//
//
//
//	public Test2(String name, Object before, Object after) {
//		super();
//		this.name = name;
//		this.before = before;
//		this.after = after;
//	}
//
//
//	@Override
//	public void run() {
//		int count =10;
//		
//		while(count>0){
//			synchronized (before) {
//				synchronized (after) {
//					System.out.println(name);
//					count--;
//					
//					after.notify();
//				}
//				
//				try {
//					before.wait();
//				} catch (InterruptedException e) {
//					
//					e.printStackTrace();
//				}
//				
//			}
//			
//			
//		}
//		
//		
//	}
//
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		Object a  =new Object();
//		Object b  =new Object();
//		Object c  =new Object();
//		
//		
//		Test2 aa  =  new Test2("A",c , a);
//		Test2 bb  =  new Test2("B",a , b);
//		Test2 cc  =  new Test2("C",b , c);
//		
//		new Thread(aa).start();
//		Thread.sleep(500);
//		
//		new Thread(bb).start();
//		Thread.sleep(500);
//		
//		
//		new Thread(cc).start();
//		Thread.sleep(500);
//		
//		
//	}
//	
//	
//}
