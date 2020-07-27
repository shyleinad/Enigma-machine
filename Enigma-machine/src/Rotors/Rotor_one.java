package Rotors;

public class Rotor_one implements IRotor{
	private String[] permutation={"EKMFLGDQVZNTOWYHXUSPAIBRCJ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	//private char stepping_mechanism='R';
	private char output=0;
	private int self_init_pos_index;
	private int r_two_init_pos_index;
	
	public int get_self_init_pos_index() {
		return self_init_pos_index;
	}
	
	public Rotor_one(char init_pos) {
		self_init_pos_index=permutation[1].indexOf(init_pos);
		//r_two_init_pos_index=permutation[1].indexOf(r_two_init_pos);
	}
	
	public char getOutput(char s, int r_two_init_pos_index) {
		this.r_two_init_pos_index=r_two_init_pos_index;
		output=0;
		if (r_two_init_pos_index==5) {
			self_init_pos_index++;
		}
		permutation[0]+=permutation[0];
		permutation[1]+=permutation[1];
		permutation[0]=permutation[0].substring(self_init_pos_index, self_init_pos_index+26);
		permutation[1]=permutation[1].substring(r_two_init_pos_index, r_two_init_pos_index+26);
		output=permutation[0].charAt(permutation[1].indexOf(s)/*+self_init_pos_index-r_two_init_pos_index*/);
		/*try {
			output=permutation[0].charAt(permutation[1].indexOf(s)+self_init_pos_index-r_two_init_pos_index);
		} 
		catch (StringIndexOutOfBoundsException g) {
			//TODO: r1 exception handling, might works, might not (this one rather not)
			//self_init_pos_index=self_init_pos_index-permutation[1].length();
			//System.out.println("r1 index: "+self_init_pos_index);
			//output+=permutation[0].charAt(permutation[1].indexOf(s));
			
			permutation[0]+=permutation[0];
			permutation[1]+=permutation[1];
			permutation[0]=permutation[0].substring(self_init_pos_index);
			permutation[1]=permutation[1].substring(self_init_pos_index);
			output+=permutation[0].charAt(permutation[1].indexOf(s));
		}*/
		System.out.println("rotor one output to ref: "+output);
		return output;
	}
	
	public char getFromRefOutput(char s) {
		output=0;
		output=permutation[1].charAt(permutation[0].indexOf(s));
		/*try {
			//self_init_pos_index=self_init_pos_index-permutation[1].length();
			output=permutation[1].charAt(permutation[0].indexOf(s)-self_init_pos_index+r_two_init_pos_index);
		} 
		catch (StringIndexOutOfBoundsException e) {
			//TODO: exception handling
			System.out.println("r1 Baj van more!");
			System.out.println("r1 index: "+self_init_pos_index);
			output=permutation[1].charAt(permutation[0].indexOf(s)-self_init_pos_index+r_two_init_pos_index);
		}*/
		System.out.println("rotor one output to rotor two: "+output);
		return output;
	}
}
