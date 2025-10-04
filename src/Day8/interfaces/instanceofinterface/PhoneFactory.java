package Day8.interfaces.instanceofinterface;

public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new jio();
		return null;
	}
}