public class Security {
	
	public boolean login(String userId, String password) {
		String errorMessage;
		
		if (userId == null || userId.trim().equals("")) {
			errorMessage = "User ID may not be null or empty";
			return false;
		}
		else if (password == null || password.trim().equals("")) {
			errorMessage = "Password may not be empty";
			return false;
		}
		else if (!validatePassword(password)) {
			errorMessage = "Password must be min 8 characters long with an uppercase and a number";
			return false;
		}
		else {
			errorMessage = "";
			return true;
		}
		
	}
	
	private boolean validatePassword(String password) {
		boolean hasUpper = false, hasDigit = false;
		
		if(password.length() < 8)
			return false;
		
		for (char c : password.toCharArray() ) {
			if (Character.isUpperCase(c)) {
				hasUpper = true;
				continue;
			}
			if (Character.isDigit(c)) {
				hasDigit = true;
			}
		}
		return hasUpper && hasDigit;
	}

}
