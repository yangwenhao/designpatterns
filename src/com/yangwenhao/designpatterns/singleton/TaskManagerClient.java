package com.yangwenhao.designpatterns.singleton;

import java.util.concurrent.CyclicBarrier;

public class TaskManagerClient implements Runnable {

	private CyclicBarrier barrier = new CyclicBarrier(2);

	public static void main(String[] args) {
		TaskManagerClient client = new TaskManagerClient();

		new Thread(client).run();
		new Thread(client).run();
	}

	@Override
	public void run() {
		try {
			barrier.await();
		} catch (Exception e) {
		}

		System.out.println(Thread.currentThread().getName() + " is running");
		TaskManager tm = TaskManager.newInstance();
		System.out.println("TaskManager instance is " + tm);
	}
}
