package wps.srohter.SP.NameYUUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeUser extends MakeUUID {
	public ArrayList<String> exNames;
	public Map<String, String> UserList = new HashMap<String, String>();

	public MakeUser(ArrayList<String> exNames, Map<String, String> userList) {
		super();
		this.exNames = exNames;
		UserList = userList;
	}

	@Override
	public void makeUsername() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a username: ");
		String beforeCheck = input.nextLine();
		if (exNames.contains(beforeCheck)) {
			System.out.println("This name is already in use. ");
		} else if (!exNames.contains(beforeCheck)) {
			user.equals(beforeCheck);
		} else if (beforeCheck.equals(null)) {
			System.out.println("Null entry, please try again. ");
		}
		input.close();
	}
}
