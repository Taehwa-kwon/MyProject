package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage1 extends JFrame implements ActionListener{

	private JFrame frame; //프레임이 제일 바깥
	private JPanel jpanel; //그다음 작은 패널
	private JTextField jId; // 로그인 ID 입력
	private JPasswordField jPwd; //로그인 Password 입력
	private JButton btnLogin; //로그인버튼
	private JButton membershipB; //회원가입 
	private JButton search_id;  //아이디 찾기
	private JButton search_pwd; //패스워드 찾기
	private Socket socket; //소켓 생성
	private BufferedReader br;
	private PrintWriter pw;
	
	MembershipB membersShipF; //회원가입 클래스 
	Search_id searchs_id; //아이디찾기 클래스 
	Search_pwd searchs_pwd; //비밀번호 찾기 클래스
	

	public static void main(String[] args) {
		new LoginPage1();
	}

	public  LoginPage1() {
		super("태화의 kakaotalk");
		CreateUI(); //이거의 순서도 중요하네.. 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,495,659);
		this.setVisible(true);
		this.setLocationRelativeTo(null);//프레임 실행시 중앙 위치 
	}

	public void CreateUI() {
		//network();// 네트워크 메소드 생성 
		
		frame = new JFrame();
		jpanel = new JPanel();
		searchs_id = new Search_id();
		membersShipF = new MembershipB();
		
		jId = new JTextField();
		jPwd = new JPasswordField();
		
		btnLogin = new JButton("로그인");
		membershipB = new JButton("회원가입");
		search_id = new JButton("아이디찾기");
		search_pwd = new JButton("비밀번호찾기");
		
		jpanel.setBackground(Color.YELLOW);
		jpanel.setBounds(100, 100, 495, 659);
		jpanel.setLayout(null);
		
		
		jId.setBounds(141, 362, 199, 40);
		jId.setColumns(10);
		jpanel.add(jId);
		
		
		jPwd.setEchoChar('*'); //암호화 시키기 
		jPwd.setBounds(141, 400, 199, 39);
		jpanel.add(jPwd);
		
		btnLogin.setBounds(187, 451, 117, 29);
		jpanel.add(btnLogin);
		
		
		membershipB.setBounds(141, 583, 61, 16);
		jpanel.add(membershipB);
		
		search_id = new JButton("아이디 찾기");
		search_id.setBounds(224, 583, 61, 16);
		jpanel.add(search_id);
		
		search_pwd = new JButton("비밀번호 찾기");
		search_pwd.setBounds(315, 583, 61, 16);
		jpanel.add(search_pwd);
		
		this.add(jpanel);
		event();
		
	}

	private void event() {
		membershipB.addActionListener(this);
	}

	private void network() {
		try {
			socket = new Socket("localhost",1010);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
//소켓통신에는 getInputStream 바이트단위로 주고받는데 ->  InputStreamReader 이 보조스트림이 바이트스트림을 문자로 변환시켜준다. ->BufferedReader을 통해 더 빠르게 읽고 쓸수 있다.
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을수가 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결이 불안정합니다. ");
			e.printStackTrace();
			System.exit(0);
		}
		//스레드 생성 : 서버는 하나의 클라이언트와만 접촉하는게 아니기 때문에 스레드를 생성해준다.
//		Thread t = new Thread(this);
//		t.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == membershipB) {
			this.setVisible(false);
			membershipB.setVisible(true);
		}
		if (e.getSource() == btnLogin) {
			String id=jId.getText();
			String pwd=jPwd.getText();
			
			if(id.equals("1")&&pwd.equals("1")) {
				jpanel.setOpaque(false);
				new ChatPage();
				//JOptionPane.showConfirmDialog(frame, "you are sucessfully logined");
			}
			else 
			{
				JOptionPane.showConfirmDialog(frame, "Invaild username or password");
			}
			
		}
		
	}

}
