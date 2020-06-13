package View;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class MembershipB extends JFrame {
	JLabel nameL, idL, pwdL, phoneL, ageL, emailL,sexL;
	JTextField nameT, idT, tel2T, tel3T, emailT;
	JPasswordField pwdF;
	JComboBox<String> telC, emailC, ageYearC, ageMonthC, ageDayC;
	JButton idoverlabB,SubmitB,CancleB;
	JRadioButton sexF, sexM;
	
	public MembershipB() {
		
		
		setTitle("회원가입");
		
		String [] tel = { "010", "02", "031", "032", "033", "041", "042", "043", "044", "051", "052", "053", "054",
				"055", "061", "062", "063", "064" };
		String[] ageYear = { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
				"1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
				"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016",
				"2017", "2018", "2019" };
		String[] ageMonth = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
		String[] ageDay = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		//String [] email = { "naver.com", "google.com", "sina.com", "yahoo.com" };
				
		
		telC = new JComboBox<String>(tel);
		ageYearC = new JComboBox<String>(ageYear);
		ageMonthC = new JComboBox<String>(ageMonth);
		ageDayC = new JComboBox<String>(ageDay);

		//emailC = new JComboBox<String>(email);
		
		
		
//		nameL = new JLabel("이름");
//		nameT = new JTextField(10);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.YELLOW);
		p1.setBounds(100, 100, 495, 659);
		p1.setLayout(null);
		
		idL = new JLabel("ID");
		idL.setHorizontalAlignment(SwingConstants.RIGHT);
		idL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		idL.setBounds(311, 62, 72, 16);
		p1.add(idL);
		
		idT = new JTextField();
		idT.setBackground(Color.WHITE);
		idT.setBounds(92, 75, 291, 29);
		p1.add(idT);
		idT.setColumns(10);
		
		idoverlabB = new JButton("중복확인");
		idoverlabB.setBounds(93, 49, 117, 29);
		p1.add(idoverlabB);
		
		pwdL = new JLabel("Password");
		pwdL.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		pwdL.setBounds(311, 126, 72, 16);
		p1.add(pwdL);
		
		pwdF = new JPasswordField();
		pwdF.setHorizontalAlignment(SwingConstants.RIGHT);
		pwdF.setColumns(10);
		pwdF.setBackground(Color.WHITE);
		pwdF.setBounds(92, 138, 291, 29);
		p1.add(pwdF);
		
		nameL = new JLabel("Name");
		nameL.setHorizontalAlignment(SwingConstants.RIGHT);
		nameL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		nameL.setBounds(311, 179, 72, 16);
		p1.add(nameL);
		
		nameT = new JTextField();
		nameT.setColumns(10);
		nameT.setBackground(Color.WHITE);
		nameT.setBounds(92, 197, 291, 29);
		p1.add(nameT);
		
		phoneL = new JLabel("Phone");
		phoneL.setHorizontalAlignment(SwingConstants.RIGHT);
		phoneL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		phoneL.setBounds(311, 238, 72, 16);
		p1.add(phoneL);
		
		telC.setBounds(92, 255, 80, 29);
		p1.add(telC);
		
		tel2T = new JTextField();
		tel2T.setColumns(10);
		tel2T.setBounds(199, 254, 80, 26);
		p1.add(tel2T);
		
		tel3T = new JTextField();
		tel3T.setColumns(10);
		tel3T.setBounds(303, 254, 80, 26);
		p1.add(tel3T);
		
		ageL = new JLabel("BirthYear");
		ageL.setHorizontalAlignment(SwingConstants.RIGHT);
		ageL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		ageL.setBounds(311, 292, 72, 16);
		p1.add(ageL);
		
		ageYearC.setBounds(92, 312, 80, 29);
		p1.add(ageYearC);
		
		ageMonthC.setBounds(199, 313, 80, 29);
		p1.add(ageMonthC);
		
		ageDayC.setBounds(311, 313, 80, 29);
		p1.add(ageDayC);
		
		sexL = new JLabel("sex");
		sexL.setHorizontalAlignment(SwingConstants.RIGHT);
		sexL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		sexL.setBounds(311, 349, 72, 16);
		p1.add(sexL);
		
		sexF = new JRadioButton("여성");
		sexF.setBounds(242, 377, 141, 23);
		p1.add(sexF);
		
		sexM = new JRadioButton("남성");
		sexM.setBounds(89, 377, 141, 23);
		p1.add(sexM);
		
		emailL = new JLabel("email");
		emailL.setHorizontalAlignment(SwingConstants.RIGHT);
		emailL.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		emailL.setBounds(311, 412, 72, 16);
		p1.add(emailL);
		
		SubmitB = new JButton("등록");
		SubmitB.setForeground(Color.BLACK);
		SubmitB.setBackground(Color.YELLOW);
		SubmitB.setBounds(113, 553, 117, 29);
		p1.add(SubmitB);
		
		CancleB = new JButton("취소");
		CancleB.setForeground(Color.BLACK);
		CancleB.setBackground(Color.YELLOW);
		CancleB.setBounds(253, 553, 117, 29);
		p1.add(CancleB);
		
		this.add(p1);
		
		//his.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setBounds(100,100,495,659);
		this.setVisible(true);
		this.setLocationRelativeTo(null);//프레임 실행시 중앙 위치
		this.setResizable(false);
		
	}
}
