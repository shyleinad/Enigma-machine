package Rotors;

public class Rotor_three implements IRotor{
	private String[] permutation={"BDFHJLCPRTXVZNYEIWGAKMUSQO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	//private char stepping_mechanism='W';
	private char output=0;
	private int self_init_pos_index;
	
	public int get_self_init_pos_index() {
		return self_init_pos_index;
	}
	
	public Rotor_three(char init_pos) {
		self_init_pos_index=permutation[1].indexOf(init_pos);
	}

	public char getOutput(char s) {
		self_init_pos_index++;
		output=0;
		permutation[0]+=permutation[0];
		permutation[0]=permutation[0].substring(self_init_pos_index, self_init_pos_index+26);
		output+=permutation[0].charAt(permutation[1].indexOf(s));
		/*try {
			output+=permutation[0].charAt(permutation[1].indexOf(s)+self_init_pos_index);
		}
		catch (StringIndexOutOfBoundsException e) {
			self_init_pos_index=self_init_pos_index-permutation[1].length();
			//TODO: r3 exception handling, might works, might not
			//self_init_pos_index=self_init_pos_index-permutation[1].length();
			//System.out.println("r3 index: "+self_init_pos_index);
			//output+=permutation[0].charAt(permutation[1].indexOf(s));
			
			System.out.println("r3 index: "+self_init_pos_index);
			permutation[0]+=permutation[0];
			permutation[1]+=permutation[1];
			permutation[0]=permutation[0].substring(self_init_pos_index);
			permutation[1]=permutation[1].substring(self_init_pos_index);
			output+=permutation[0].charAt(permutation[1].indexOf(s));
		}*/
		System.out.println("rotor three output to rotor two: "+output);
		return output;
	}
	
	public char getFromRefOutput(char s) {
		output=0;
		permutation[1]="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		output=permutation[1].charAt(permutation[0].indexOf(s));
		return output;
	}
}
