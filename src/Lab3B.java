
public class Lab3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greeting("Shawver");
		System.out.println(newGreeting("Hayden"));
		System.out.println(test ("enumerate", 1));
		String[] words = {"slake", "betterment", "approach"};
		System.out.println(wordInArray(words, "slake"));
	}
	public static void greeting (String name) {
		System.out.println("Hello, " + name);
	}
	public static String newGreeting(String name) {
		return "Hello " + name;
	}
	public static boolean test (String word, int i) {
		return word.length() > i;
	}
	public static boolean wordInArray (String[] words, String word) {
		for (String x : words) {
			if (x.equals(word)) {
				return true;
			}
		}
		return false;
	}
}
