package exception.ch6;

public class Flip2 {
	public static void main(String[] args) {
		String o = "-";
		String[] sa = new String[4];
		for (int i = 0; i < args.length; i++)
			sa[i] = args[i];// 0A 1B 2C 3null 
	
		for (String n : sa) {
			switch (n.toLowerCase()) {
			case "yellow":
				o += "y";
			case "red":
				o += "r";
			case "green":
				o += "g";
			}
		}
		System.out.print(o);
	}
}