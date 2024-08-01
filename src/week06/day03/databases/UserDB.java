package week06.day03.databases;

import week06.day03.entities.User;
import week06.day03.utility.DatabaseManager;

import javax.xml.crypto.Data;

public class UserDB extends DatabaseManager<User> {
	
	public boolean existByEmail(String mail) {
		for (User user : arrayList) {
			if (user.getMail().equals(mail)) {
				return true;
			}
		}
		return false;
	}
	public User findByEmail(String mail) {
		for (User user : arrayList) {
			if (user.getMail().equals(mail)) {
				return user;
			}
		}
		return null;
	}
	
	 public boolean existByTc(String tcno) {
		for (User user : arrayList) {
			if (user.getTC().equals(tcno)) {
				return true;
			}
		}
		return false;
	}
	
	public User findByUsernameAndPassword(String username, String password) {
		for (User user : arrayList) {
			if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	
	
	public int findTcNoIndex(String tcno) {
		if (arrayList == null) {
			return -1;
		}
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getTC().equals(tcno)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean existByUserName(String username) {
		for (User user : arrayList) {
			if (user.getUserName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	public void updatePasword(String newPassword, int userIndex) {
		
		if (arrayList != null) {
			arrayList.get(userIndex).setPassword(newPassword);
		}
		
	}
	
	public User findById(int id) {
		
		for (User user : arrayList) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
		
	}
	
	
	public User findByTcEmail(String tc, String mail) {
		for (User user : arrayList) {
			if (user.getTC().equals(tc) && user.getMail().equals(mail)) {
				return user;
			}
		}
		return null;
	}
	
	
}