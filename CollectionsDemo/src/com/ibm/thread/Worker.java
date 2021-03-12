package com.ibm.thread;

public class Worker extends Thread{
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	System.out.println(Thread.currentThread());
}
}
