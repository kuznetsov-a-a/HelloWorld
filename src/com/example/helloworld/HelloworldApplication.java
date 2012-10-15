package com.example.helloworld;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class HelloworldApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Hello, World");
		Label label = new Label("Hello!");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
