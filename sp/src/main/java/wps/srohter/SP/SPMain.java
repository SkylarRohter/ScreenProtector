package wps.srohter.SP;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import wps.srohter.SP.NameYUUID.MakeUser;

public class SPMain {

	public static char[] entuuidC;
	private static int whileMod = 0;
	public static Map<String, String> UserList = new HashMap<String, String>();
	public static ArrayList<String> exNames;

	public static void main(String[] args) {
		final MakeUser user = new MakeUser(exNames, UserList);
		System.out.println(user.uuid);
		final JFrame f = new JFrame("Screen Protector V-0.1");
		final JButton buy = new JButton("Buy");
		buy.setBounds(160, 200, 80, 30);
		buy.setBackground(Color.yellow);
		final JButton login = new JButton("Login");
		login.setBounds(160, 170, 80, 30);
		login.setBackground(Color.green);
		final JButton back = new JButton("Back");
		back.setBounds(160, 320, 80, 30);
		final JLabel pasLabel = new JLabel("Password:");
		pasLabel.setBounds(70, 170, 80, 30);
		pasLabel.setVisible(false);
		final JLabel uLabel = new JLabel("Username:");
		uLabel.setBounds(65, 130, 80, 30);
		uLabel.setVisible(false);
		final JLabel buyLabel = new JLabel("dm me @sk.rhtr on ig");
		buyLabel.setBounds(160, 170, 80, 30);
		buyLabel.setVisible(false);
		f.add(buyLabel);
		f.add(pasLabel);
		f.add(uLabel);
		f.add(back);
		f.add(login);
		f.add(buy);
		f.setSize(400, 400);
		f.setLocation(670, 280);
		f.setLayout(null);
		f.setVisible(true);
		mainMenu(user, f, buy, login, back, pasLabel, uLabel, buyLabel);
	}

	private static void mainMenu(final MakeUser user, final JFrame f, final JButton buy, final JButton login,
			final JButton back, final JLabel pasLabel, final JLabel uLabel, final JLabel buyLabel) {
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginMenu(user, f, buy, login, back, pasLabel, uLabel, buyLabel);
			}
		});
		buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buyMenu(user, f, buy, login, back, buyLabel);
			}
		});
	}

	private static void loginMenu(final MakeUser user, final JFrame f, final JButton buy, final JButton login,
			final JButton back, final JLabel pasLabel, final JLabel uLabel, final JLabel buyLabel) {
		login.setVisible(false);
		buy.setVisible(false);
		final JPasswordField EntUser = new JPasswordField();
		final JTextField EntPas = new JTextField();
		pasLabel.setVisible(true);
		uLabel.setVisible(true);
		EntUser.setBounds(140, 170, 120, 30);
		f.add(EntUser);
		EntUser.setVisible(true);
		EntPas.setBounds(140, 130, 120, 30);
		f.add(EntPas);
		EntPas.setVisible(true);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu(user, f, buy, login, back, pasLabel, uLabel, buyLabel);
			}
		});
		final JButton EnterText = new JButton("Enter");
		EnterText.setBounds(160, 200, 80, 30);
		f.add(EnterText);
		EnterText.setVisible(true);
		back.setVisible(true);
		EnterText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entuuidC = EntUser.getPassword();
				String entuuid = String.valueOf(entuuidC);
				System.out.println(entuuid);
				if (entuuid.equals(user.uuid)) {
					System.out.println("correct");
				} else if (!entuuid.equals(user.uuid)) {
					System.out.println("incorrect");
				}
			}
		});
	}

	private static void buyMenu(final MakeUser user, final JFrame f, final JButton buy, final JButton login,
			final JButton back, final JLabel buyLabel) {

	}
}