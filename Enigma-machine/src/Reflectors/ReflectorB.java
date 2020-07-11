package Reflectors;

public class ReflectorB implements IReflector{
	private String[] permutation={"ABCDEFGDIJKGMKMIEBFTCVVJAT", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private String output="";
	
	public String getOutput(String s) {
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i)));
		}
		return output;
	}
	
	public String getToRotorOneOutput(String s) {
		output="";
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[1].charAt(permutation[0].indexOf(s.charAt(i)));
		}
		return output;
	}
}
