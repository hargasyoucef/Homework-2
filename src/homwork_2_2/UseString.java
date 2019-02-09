package homwork_2_2;

public class UseString {

	public static void main(String[] args) {
	
		String a = "BestBy";
		String b = "Good Morning";
		String c="Bye";
		String d = "Nice to meet you";
		String f= " I AM HERE TO LISTEN TO YOU";
		
		System.out.println(a.codePointAt(2));
		System.out.println(b.charAt(3));
		System.out.println(c.codePointBefore(2));
		System.out.println(a.codePointCount(1, 4));
		System.out.println(c.compareTo(a));
		System.out.println(b.concat(c));
		System.out.println(c.endsWith(b));
		System.out.println(a.hashCode());
		System.out.println(b.lastIndexOf(a));
		System.out.println(d.length());
		System.out.println(d.startsWith(b));
		System.out.println(d.toUpperCase());
		System.out.println(f.toLowerCase());
		System.out.println(f.repeat(3));
		System.out.println(a.stripLeading());
		System.out.println(f.replaceFirst(f, b));
		System.out.println(d.trim());
		System.out.println(a.getBytes());
		System.out.println(c.split(f));
		System.out.println(b.valueOf(d));

		


		



		
		
		

	}

}
