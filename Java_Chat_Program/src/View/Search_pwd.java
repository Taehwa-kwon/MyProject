package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Search_pwd extends JFrame implements ActionListener{

	JLabel idL,emailL,telL;
	JTextField nameT,emailT, tel2T,tel3T,telokT, emailadductionT;
	JButton newPwdB,CancleB, emailB, emailokB , telB , telokB;
	JComboBox<String> emailC,telC, ageYearC, ageMonthC, ageDayC;

	public Search_pwd () {
		setTitle("비밀번호 찾기");
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.YELLOW);
		p1.setBounds(100, 100, 495, 516);
		p1.setLayout(null);
		
	
	
		
//		String [] tel = { "010", "02", "031", "032", "033", "041", "042", "043", "044", "051", "052", "053", "054",
//				"055", "061", "062", "063", "064" };
//		String[] ageYear = { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
//				"1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
//				"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
//				"2017", "2018", "2019" };
//		String[] ageMonth = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
//		String[] ageDay = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
//				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		
		
		
		
		newPwdB = new JButton("비밀번호 재설정");
		newPwdB.setBounds(132, 445, 117, 29);
		newPwdB.setForeground(Color.BLACK);
		newPwdB.setBackground(Color.YELLOW);
		p1.add(newPwdB);
		
		CancleB = new JButton("취소");
		CancleB.setBounds(266, 445, 117, 29);
		CancleB.setForeground(Color.BLACK);
		CancleB.setBackground(Color.YELLOW);
		p1.add(CancleB);
		
		idL = new JLabel("ID");
		idL.setBounds(311, 62, 72, 16);
		idL.setHorizontalAlignment(SwingConstants.RIGHT);
		idL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		p1.add(idL);
		
		nameT = new JTextField();
		nameT.setBounds(92, 75, 291, 29);
		nameT.setColumns(10);
		nameT.setBackground(Color.WHITE);
		p1.add(nameT);
		
		emailL = new JLabel("Email");
		emailL.setBounds(311, 116, 72, 16);
		emailL.setHorizontalAlignment(SwingConstants.RIGHT);
		emailL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		p1.add(emailL);
		
		emailT = new JTextField();
		emailT.setColumns(10);
		emailT.setBackground(Color.WHITE);
		emailT.setBounds(92, 132, 130, 29);
		p1.add(emailT);
		
		emailC = new JComboBox();
		emailC.setBounds(259, 133, 124, 29);
		p1.add(emailC);
		
		telL = new JLabel("Tel");
		telL.setHorizontalAlignment(SwingConstants.RIGHT);
		telL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		telL.setBounds(311, 230, 72, 16);
		p1.add(telL);
		
		tel3T = new JTextField();
		tel3T.setColumns(10);
		tel3T.setBackground(Color.WHITE);
		tel3T.setBounds(301, 242, 82, 29);
		p1.add(tel3T);
		
		tel2T = new JTextField();
		tel2T.setColumns(10);
		tel2T.setBackground(Color.WHITE);
		tel2T.setBounds(191, 242, 82, 29);
		p1.add(tel2T);
		
		telC = new JComboBox();
		telC.setBounds(92, 243, 82, 29);
		p1.add(telC);
		
		emailB = new JButton("이메일 인증");
		emailB.setBounds(92, 186, 95, 29);
		p1.add(emailB);
		
		emailadductionT = new JTextField();
		emailadductionT.setColumns(10);
		emailadductionT.setBackground(Color.WHITE);
		emailadductionT.setBounds(191, 282, 95, 29);
		p1.add(emailadductionT);
		
		
		telokT = new JTextField();
		telokT.setColumns(10);
		telokT.setBackground(Color.WHITE);
		telokT.setBounds(191, 185, 94, 29);
		p1.add(telokT);
		
		emailokB = new JButton("확인");
		emailokB.setBounds(311, 283, 64, 29);
		p1.add(emailokB);
		
		telB = new JButton("휴대폰 인증");
		telB.setBounds(92, 283, 95, 29);
		p1.add(telB);
		
		telokB = new JButton("확인");
		telokB.setBounds(319, 186, 64, 29);
		p1.add(telokB);
		
		ageYearC = new JComboBox();
		ageYearC.setBounds(92, 346, 82, 27);
		p1.add(ageYearC);
		
		ageMonthC = new JComboBox();
		ageMonthC.setBounds(191, 346, 82, 27);
		p1.add(ageMonthC);
		
		ageDayC = new JComboBox();
		ageDayC.setBounds(301, 346, 82, 27);
		p1.add(ageDayC);
		
		//his.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setBounds(100,100,501,413);
		this.setVisible(true);
		this.setLocationRelativeTo(null);//프레임 실행시 중앙 위치
		this.setResizable(false);
		
		newPwdB.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newPwdB) {
			new NewPassword();
			
		}
		
	}
}

