package utility;

import model.User;
public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{
	@Override
	public boolean checkUser(User user) {
		int userAge=user.getAge();
		int userHeight=user.getHeight();
		int userWeight=user.getWeight();
		String userCountry=user.getCountry();
		if ((userAge>=18 && userAge<=35) && (userWeight>=55 && userWeight<=90) && (userHeight>=155 && userHeight<=170) && (userCountry=="ProGrad"))
		{
			return true;
		}
		else {
			return false;
		}	
	}
	@Override
	public boolean checkQuizAnswer(String points) {
	int	userPoints = Integer.parseInt(points);
	if(userPoints>80) {
		return true;
	}
	else {
		return false;
	}
	}

	@Override
	public
	boolean basicEligibilityCheck(User user) {
	if(	checkUser(user)) {
		return true;
	}
	else {
		return false;
	}
		
	}
}








