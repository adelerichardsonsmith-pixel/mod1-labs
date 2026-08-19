package lab4;

public class NameString {

	public static void main(String[] args) {

		String name = "Adele";
		System.out.println(name);
		System.out.println(name.charAt(3));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		for (char c : name.toCharArray() ) {
			System.out.print(c + "\t");
		}
		System.out.println();
		System.out.println(name.startsWith("Geoff"));
		System.out.println(name.startsWith("Ad"));
		System.out.println(name.endsWith("Geoff"));
		System.out.println(name.endsWith("le"));
		System.out.println(name.indexOf("e"));
		System.out.println(name.indexOf("p"));
		String fullname = name + " " + "Smith";
		System.out.println(fullname);
		System.out.println();
		
		StringBuilder sb = new StringBuilder("Adele Smith ");
		sb.append("is the artist ever");
		sb.insert(18, " greatest");
		sb.replace(28, 34, "pop star");
		String string = sb.toString();
		System.out.println(string);
		}

}
