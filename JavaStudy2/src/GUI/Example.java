package GUI;

import java.awt.*;

public class Example {
	Frame frame = new Frame("프레임 이름");
	Button button = new Button("버튼 이름");
	
	public void createFrame()
	{
		frame.add(button);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		//프레임 열기
		Example frm = new Example();
		frm.createFrame();
        }
  }