package Reflectors;

public class ReflectorB implements IReflector{
	private String[] permutation={"ABCDEFGDIJKGMKMIEBFTCVVJAT", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char output=0;
	private int r_one_init_pos_index;
	
	public ReflectorB(char r_one_init_pos) {
		r_one_init_pos_index=permutation[1].indexOf(r_one_init_pos);
	}
	
	public char getOutput(char s, int r_one_init_pos_index) {
		//r_one_init_pos_index=permutation[1].indexOf(init_pos.charAt(0));
		String output_part="";
		output=0;
		//in:
		permutation[1]+=permutation[1];
		permutation[1]=permutation[1].substring(r_one_init_pos_index, r_one_init_pos_index+26);
		output_part+=permutation[0].charAt(permutation[1].indexOf(s));
		//out:
		output+=permutation[1].charAt(permutation[0].indexOf(output_part));
		if (s==output) {
			output=0;
			output+=permutation[1].charAt(permutation[0].lastIndexOf(output_part));
		}
		System.out.println("ref output to rotor one: "+output);
		return output;
	}
}