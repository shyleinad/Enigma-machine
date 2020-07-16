package Reflectors;

public class ReflectorB implements IReflector{
	private String[] permutation={"ABCDEFGDIJKGMKMIEBFTCVVJAT", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private String output="";
	
	public String getOutput(String s) {
		String output_part="";
		output="";
		//in:
		for (int i = 0; i < s.length(); i++) {
			output_part+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i)));
		}
		//out:
		for (int i = 0; i < output_part.length(); i++) {
			if (s.charAt(i)==output_part.charAt(i)) {
				output+=permutation[1].charAt(permutation[0].lastIndexOf(output_part.charAt(i)));
			}
			else {
				output+=permutation[1].charAt(permutation[0].indexOf(output_part.charAt(i)));
			}
		}
		return output;
	}
}