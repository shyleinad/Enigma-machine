package Rotors;

public class Rotor_two implements IRotor{
	private String[] permutation={"AJDKSIRUXBLHWTMCQGZNPYFVOE", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='F';
	private String output="";
	
	public String getOutput(String s, char init_pos) {
		int init_pos_index=permutation[1].indexOf(init_pos);
		permutation[0]=permutation[0].substring(permutation[1].indexOf(init_pos));
		permutation[1]=permutation[1].substring(permutation[1].indexOf(init_pos));
		output="";
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i))+init_pos_index);
		}
		System.out.println("rotor two output to rotor one: "+output);
		return output;
	}
	
	public String getFromRefOutput(String s) {
		output="";
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[1].charAt(permutation[0].indexOf(s.charAt(i)));
		}
		System.out.println("rotor two output to rotor three: "+output);
		return output;
	}
}
