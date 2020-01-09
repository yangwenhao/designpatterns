package com.yangwenhao.designpatterns.singleton;

public class TaskManager {

	private static TaskManager taskManager = null;

	private TaskManager() {
	}

	public static TaskManager newInstance() {
		if (taskManager == null) {
			taskManager = new TaskManager();
		}
		return taskManager;
	}
}
