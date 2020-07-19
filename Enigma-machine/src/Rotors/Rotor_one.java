package Rotors;

public class Rotor_one implements IRotor{
	private String[] permutation={"EKMFLGDQVZNTOWYHXUSPAIBRCJ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='R';
	private String output="";
	private int self_init_pos_index;
	private int r_two_init_pos_index;
	
	public String getOutput(String s, String init_pos) {
		self_init_pos_index=permutation[1].indexOf(init_pos.charAt(0));
		r_two_init_pos_index=permutation[1].indexOf(init_pos.charAt(1));
		/*permutation[0]=permutation[0].substring(permutation[1].indexOf(init_pos));
		permutation[1]=permutation[1].substring(permutation[1].indexOf(init_pos));*/
		output="";
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i))+self_init_pos_index-r_two_init_pos_index);
		}
		System.out.println("rotor one output to ref: "+output);
		return output;
	}
	
	public String getFromRefOutput(String s) {
		output="";
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[1].charAt(permutation[0].indexOf(s.charAt(i))+r_two_init_pos_index-self_init_pos_index);
		}
		System.out.println("rotor one output to rotor two: "+output);
		//System.out.println("rotor on permutation: "+permutation[0]+" "+permutation[1]);
		return output;
	}
}
