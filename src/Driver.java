
public class Driver {

	public static void compareToTest(String s1, String s2){
		MyString m1 = new MyString(s1);
		MyString m2 = new MyString(s2);
		System.out.println("String: " + s1.compareTo(s2) + "\tMyString: " + m1.compareTo(m2));
	}
	public static void concatTest(String s1, String s2){
		MyString m1 = new MyString(s1);
		System.out.println("String: " + s1.concat(s2) + "\tMyString: " + m1.concat(s2).toString());
	}
	public static void indexOfTest(String s1, String s2){
		MyString m1 = new MyString(s1);
		MyString m2 = new MyString(s2);
		System.out.println("String: " + s1.indexOf(s2) + "\tMyString: " + m1.indexOf(m2));
	}
	public static void lastIndexOfTest(String s1, String s2){
		MyString m1 = new MyString(s1);
		MyString m2 = new MyString(s2);
		System.out.println("String: " + s1.lastIndexOf(s2) + "\tMyString: " + m1.lastIndexOf(m2));
	}
	public static void substringTest(String s, int x, int y){
		MyString m = new MyString(s);
		System.out.println("String: " + s.substring(x, y) + "\tMyString: " + m.subString(x, y));
	}
	public static void substringTest(String s, int x){
		MyString m = new MyString(s);
		System.out.println("String: " + s.substring(x) + "\tMyString: " + m.subString(x));
	}
	public static void main(String[] args) {
		System.out.println("compareTo test:");
		compareToTest("apple", "apple");
		compareToTest("apple", "banana");
		compareToTest("banana", "apple");
		compareToTest("app", "apple");
		compareToTest("apple", "app");
		compareToTest("Apple", "apple");
		compareToTest("apple2", "apple10");
		compareToTest("", "apple");
		compareToTest("", "");

		System.out.println("\nconcat test:");
		concatTest("Hello", " World");
		concatTest("Hello", "");
		concatTest("", "World");
		concatTest("", "");
		concatTest("123", "456");
		concatTest("Hello!", " How are you?");

		System.out.println("\nindexOf test:");
		indexOfTest("Hello World", "World");
		indexOfTest("Hello World", "world");
		indexOfTest("Hello World", "o");
		indexOfTest("Hello World", "");
		indexOfTest("", "test");
		indexOfTest("1234567890", "6");
		indexOfTest("Hello World", "Hello World World");

		System.out.println("\nlastIndexOf test:");
		lastIndexOfTest("Hello World World", "World");
		lastIndexOfTest("Hello World World", "world");
		lastIndexOfTest("Hello World", "o");
		lastIndexOfTest("Hello World", "");
		lastIndexOfTest("", "test");
		lastIndexOfTest("1234567890", "6");
		lastIndexOfTest("Hello World", "Hello World World");

		System.out.println("\nsubString test:");
		substringTest("Hello World", 0, 5);
		substringTest("Hello World", 6, 11);
		substringTest("abcdef", 1, 4);
		substringTest("Time, money and space is scarce", 8, 15);
		substringTest("Hello World", 0, 11);
		substringTest("Hello World", 11, 11);
		substringTest("Hello World", 6);
		substringTest("The quick brown fox jumps over the lazy dog", 16);
		substringTest("Another test string", 0);
		substringTest("Just another example", 20);
		substringTest("", 0); 
	}

}
