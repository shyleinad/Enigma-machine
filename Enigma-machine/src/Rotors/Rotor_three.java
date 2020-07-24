package Rotors;

public class Rotor_three implements IRotor{
	private String[] permutation={"BDFHJLCPRTXVZNYEIWGAKMUSQO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='W';
	private char output=0;
	private int self_init_pos_index;
	
	public int get_self_init_pos_index() {
		return self_init_pos_index;
	}
	
	public Rotor_three(char init_pos) {
		self_init_pos_index=permutation[1].indexOf(init_pos);
		//r_two_init_pos_index=permutation[1].indexOf(r_two_init_pos);
	}

	public char getOutput(char s) {
		self_init_pos_index++;
		output=0;
		try {
			output+=permutation[0].charAt(permutation[1].indexOf(s)+self_init_pos_index);
		}
		catch (StringIndexOutOfBoundsException e) {
			//TODO: exception handling
			output+=permutation[0].charAt(permutation[1].indexOf(s));
		}
		System.out.println("rotor three output to rotor two: "+output);
		return output;
	}
	
	public char getFromRefOutput(char s) {
		output=0;
		try {
			output=permutation[1].charAt(permutation[0].indexOf(s)-self_init_pos_index);
		}
		catch (StringIndexOutOfBoundsException e) {
			//TODO: exception handling
			output=permutation[1].charAt(permutation[0].indexOf(s)-self_init_pos_index);
		}
		return output;
	}
}
