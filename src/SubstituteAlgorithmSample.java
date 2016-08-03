import java.util.Arrays;
import java.util.List;


public class SubstituteAlgorithmSample {

	public static void main(String args[]) {
		System.out.println("Found: " + foundPerson(new String[]{"A", "B", "C", "Kent"}));
	}
	
	private static String foundPerson(String[] people) {
		List<String> candidates = Arrays.asList(new String[]{"Don", "John", "Kent"});
		for (int i=0;i<people.length;i++) {
			if (candidates.contains(people[i])) {
				return people[i];
			}
		}
		return "";
	}
}
