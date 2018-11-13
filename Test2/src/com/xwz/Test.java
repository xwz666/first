//package com.xwz;
//
//public class Test implements Runnable{
//	
//	
//	private String name;
//	
//
//	public Test(String name) {
//		super();
//		this.name = name;
//	}
//
//
//	@Override
//	public synchronized void  run()  {
//		
//		for (int i = 1; i < 20; i++) {
//			
//			System.out.println(name+"运行"+i);
//			
//			try {
//				Thread.sleep((long) (Math.random()*100));
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//
//	
//	public static void main(String[] args) {
//		new Thread(new Test("a")).start();
//		new Thread(new Test("b")).start();
//	}
//	
//	
//}
