package Rotors;

public class Rotor_one implements IRotor{
	private String[] permutation={"EKMFLGDQVZNTOWYHXUSPAIBRCJ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"};
	//private char stepping_mechanism='R';
	private char output=0;
	private int self_init_pos_index;
	private int r_two_init_pos_index;
	private int r_three_index;
	
	public int get_self_init_pos_index() {
		return self_init_pos_index;
	}
	
	public Rotor_one(char init_pos) {
		self_init_pos_index=permutation[1].indexOf(init_pos);
	}
	
	public char getOutput(char s, int r_two_init_pos_index, int r_three_index) {
		this.r_three_index=r_three_index;
		this.r_two_init_pos_index=r_two_init_pos_index;
		permutation[0]="EKMFLGDQVZNTOWYHXUSPAIBRCJ";
		permutation[1]="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		output=0;
		if (r_two_init_pos_index==5 && r_three_index==22) {
			self_init_pos_index++;
			if (self_init_pos_index>25) {
				self_init_pos_index=0;
			}
			System.out.println("r1 lépett egyet!");
			System.out.println("r1 index: "+permutation[1].charAt(self_init_pos_index));
			System.out.println("r2 index: "+permutation[1].charAt(r_two_init_pos_index));
			System.out.println("r3 index: "+permutation[1].charAt(r_three_index));
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
		/*System.out.println("rotor one output to ref: "+output);
		System.out.println("r1 index: "+self_init_pos_index);
		System.out.println(permutation[0]);
		System.out.println(permutation[1]);*/
		return output;
	}
	
	public char getFromRefOutput(char s) {
		output=0;
		output=permutation[1].charAt(permutation[0].indexOf(s));
		//System.out.println("rotor one output to rotor two: "+output);
		return output;
	}
}
