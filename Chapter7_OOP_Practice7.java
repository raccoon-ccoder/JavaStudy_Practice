// 아래의 EventHandler를 익명 클래스로 변경하시

import java.awt.*;
import java.awt.event.*;

public class Chapter7_OOP_Practice7 {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0); 
				}
			}
		);
	}
}

// class EventHandler extends WindowAdapter
//{
//	public void windowClosing(WindowEvent e) {
//	e.getWindow().setVisible(false);
//	e.getWindow().dispose();
//	System.exit(0);
//	}
//} 