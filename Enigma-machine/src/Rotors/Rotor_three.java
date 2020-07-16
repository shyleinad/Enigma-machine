package Rotors;

public class Rotor_three implements IRotor{
	private String[] permutation={"BDFHJLCPRTXVZNYEIWGAKMUSQO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	private char stepping_mechanism='W';
	private String output="";
	
	public String getOutput(String s, char init_pos) {
		int init_pos_index=permutation[1].indexOf(init_pos);
		permutation[0]=permutation[0].substring(permutation[1].indexOf(init_pos));
		permutation[1]=permutation[1].substring(permutation[1].indexOf(init_pos));
		output="";
		for (int i = 0; i < s.length(); i++) {
			try {
				output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i))+init_pos_index);
			}
			catch (StringIndexOutOfBoundsException e) {
				permutation[0]+=permutation[0];
				output+=permutation[0].charAt(permutation[1].indexOf(s.charAt(i)));
			}
		}
		System.out.println("rotor three output to rotor two: "+output);
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
