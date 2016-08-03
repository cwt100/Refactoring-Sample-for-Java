
public class SeparateQueryFromModifierSample {
	
	public static void main(String args[]) {
		checkSecurity(new String[]{"A", "B", "Don"});
	}
	
	private static void checkSecurity(String[] people) {
		sendAlert(people);
		String found = foundPerson(people);
		someLaterCode(found);
	}
	
	private static void sendAlert(String[] people) {
		if (!foundPerson(people).equals("")) {
			sendAlert();
		}
	}
	
	private static String foundPerson(String[] people) {
		for (int i=0;i<people.length;i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}
			if (people[i].equals("John")) {
				return "John";
			}
		}
		return "";
	}
	
	private static void sendAlert() {
		System.out.println("ALERT");
	}
	
	private static void someLaterCode(String found) {
		System.out.println("Found: " + found);
	}
}
