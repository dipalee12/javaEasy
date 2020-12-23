package i.string;

public class StringIntro {

	public static void main(String[] args) {
		String name = "dipalee";
		String anotherName = new String("dipalee"); //another initialization
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 6));
		System.out.println(name.contains("dipu"));
		System.out.println(name.equals(anotherName));
		

	}

}
