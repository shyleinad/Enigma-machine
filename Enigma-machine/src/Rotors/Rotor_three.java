package Rotors;

public class Rotor_three implements IRotor{
	private String[] permutation={"BDFHJLCPRTXVZNYEIWGAKMUSQO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='W';
	private String output="";
	
	public String[] getPermutation() {
		return permutation;
	}
	
	public String getOutput(String s) {
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i)));
		}
		return output;
	}
}
