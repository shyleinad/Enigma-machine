package Rotors;

public class Rotor_three implements IRotor{
	private String[] permutation={"BDFHJLCPRTXVZNYEIWGAKMUSQO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='W';
	private String output="";
	
	public String[] getPermutation() {
		return permutation;
	}
	
	public String getOutput(String s, char init_pos) {
		output="";
		for (int i = 0; i < s.length(); i++) {
			try {
				output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i))+i+1);
			}
			catch (StringIndexOutOfBoundsException e) {
				permutation[0]+=permutation[0];
				output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i))+i+1);
			}
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
