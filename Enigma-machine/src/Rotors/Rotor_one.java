package Rotors;

public class Rotor_one implements IRotor{
	private String[] permutation={"EKMFLGDQVZNTOWYHXUSPAIBRCJ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='R';
	private char output=0;
	private int self_init_pos_index;
	private int r_two_init_pos_index;
	
	public char getOutput(char s, String init_pos) {
		self_init_pos_index=permutation[1].indexOf(init_pos.charAt(0));
		r_two_init_pos_index=permutation[1].indexOf(init_pos.charAt(1));
		output=0;
		output=permutation[0].charAt(permutation[1].indexOf(s)+self_init_pos_index-r_two_init_pos_index);
		//System.out.println("rotor one output to ref: "+output);
		return output;
	}
	
	public char getFromRefOutput(char s) {
		output=0;
		output=permutation[1].charAt(permutation[0].indexOf(s)+r_two_init_pos_index-self_init_pos_index);
		//System.out.println("rotor one output to rotor two: "+output);
		return output;
	}
}
