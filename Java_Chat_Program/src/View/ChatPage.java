package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

public class ChatPage extends JFrame{

	private JFrame frame;
	private JPanel jpanel,jpanel2;

	
	public ChatPage() {
		ChatPageFrame();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,495,659);
		this.setVisible(true);
		this.setLocationRelativeTo(null);//프레임 실행시 중앙 위치 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void ChatPageFrame() {
		
		jpanel = new JPanel();
		jpanel2 = new JPanel();
		
		jpanel.setBackground(Color.YELLOW);
		jpanel.setBounds(100,100,495,659);
		jpanel.setLayout(null);
		
		jpanel2.setBackground(Color.GREEN);
		jpanel2.setBounds(0, 512, 495, 125);
		jpanel.add(jpanel2);
		getContentPane().add(jpanel);
	}
}
