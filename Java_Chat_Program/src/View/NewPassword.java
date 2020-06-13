package View;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NewPassword extends JFrame{
	private JTextField newPwdT1;
	private JTextField newPwdT2;
	public NewPassword() {
	
	
		setTitle("새로운 비밀번호 설정");
		JPanel p1 = new JPanel();
		
		
		p1.setBackground(Color.YELLOW);
		p1.setBounds(100, 100, 495, 516);
		p1.setLayout(null);
		
		
		this.setBounds(100,100,501,207);
		this.setVisible(true);
		this.setLocationRelativeTo(null);//프레임 실행시 중앙 위치
		this.setResizable(false);
			
		getContentPane().add(p1);
		
		JLabel lblNewLabel = new JLabel("비밀번호 재설정");
		lblNewLabel.setBounds(86, 51, 92, 16);
		p1.add(lblNewLabel);
		
		newPwdT1 = new JTextField();
		newPwdT1.setColumns(10);
		newPwdT1.setBounds(83, 71, 138, 26);
		p1.add(newPwdT1);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 재확인");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(265, 51, 92, 16);
		p1.add(lblNewLabel_1);
		
		newPwdT2 = new JTextField();
		newPwdT2.setColumns(10);
		newPwdT2.setBounds(264, 71, 138, 26);
		p1.add(newPwdT2);
		
		JButton pwdokB = new JButton("확인");
		pwdokB.setBounds(132, 125, 92, 29);
		p1.add(pwdokB);
		
		JButton pwdCancelB = new JButton("취소");
		pwdCancelB.setBounds(265, 125, 92, 29);
		p1.add(pwdCancelB);
		
	}
}