package com.sas.pc;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.sas.pc.swing.MainWindow;

public class Main {

	public static void main(String[] args) {
		
		MainWindow main = new MainWindow(null);
		
		//将UI设置为SeaGlass ，引入seaglasslookandfeel-0.2.jar
		try {
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setVisible(true);
	}

}
