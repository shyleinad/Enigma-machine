package Reflectors;

public class ReflectorB implements IReflector{
	private String[] permutation={"ABCDEFGDIJKGMKMIEBFTCVVJAT", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private String output="";
	private int r_one_init_pos_index;
	
	public String getOutput(String s, String init_pos) {
		r_one_init_pos_index=permutation[1].indexOf(init_pos.charAt(0));
		String output_part="";
		output="";
		//in:
		for (int i = 0; i < s.length(); i++) {
			output_part+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i))-r_one_init_pos_index);
		}
		//out:
		for (int i = 0; i < output_part.length(); i++) {
			output+=permutation[1].charAt(permutation[0].indexOf(output_part.charAt(i))+r_one_init_pos_index);
			if (s.charAt(i)==output.charAt(i)) {
				output=output.substring(0, output.length()-1);
				output+=permutation[1].charAt(permutation[0].lastIndexOf(output_part.charAt(i))+r_one_init_pos_index);
			}
		}
		System.out.println("ref output to rotor one: "+output);
		return output;
	}
}