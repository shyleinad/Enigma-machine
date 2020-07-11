package Rotors;

public class Rotor_three implements IRotor{
	private String[] permutation={"BDFHJLCPRTXVZNYEIWGAKMUSQO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='W';
	private String output="";
	
	public String[] getPermutation() {
		return permutation;
	}
	
	public String getOutput(String s) {
		output="";
		for (int i = 0; i < s.length(); i++) {
			output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i)));
		}
		return output;
	}
	
	public String getFromRefOutput(String s) {
		output="";
		for (int i = 0; i < s.length(); i++) {
			output+=(i!=0&&i%5==0)?" "+permutation[1].charAt(permutation[0].indexOf(s.charAt(i))):permutation[1].charAt(permutation[0].indexOf(s.charAt(i)));
		}
		return output;
	}
}
