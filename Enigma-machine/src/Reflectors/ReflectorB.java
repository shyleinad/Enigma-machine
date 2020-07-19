package Reflectors;

public class ReflectorB implements IReflector{
	private String[] permutation={"ABCDEFGDIJKGMKMIEBFTCVVJAT", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char output=0;
	private int r_one_init_pos_index;
	
	public char getOutput(char s, String init_pos) {
		r_one_init_pos_index=permutation[1].indexOf(init_pos.charAt(0));
		String output_part="";
		output=0;
		//in:
		output_part+=permutation[0].charAt(permutation[1].indexOf(s)-r_one_init_pos_index);
		//out:
		output+=permutation[1].charAt(permutation[0].indexOf(output_part)+r_one_init_pos_index);
		if (s==output) {
			output=0;
			output+=permutation[1].charAt(permutation[0].lastIndexOf(output_part)+r_one_init_pos_index);
		}
		//System.out.println("ref output to rotor one: "+output);
		return output;
	}
}