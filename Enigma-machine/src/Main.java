import java.util.Scanner;

import Reflectors.ReflectorB;
import Rotors.Rotor_one;
import Rotors.Rotor_three;
import Rotors.Rotor_two;

public class Main {
	public static void printLogo() {
		System.out.println(
				"▓█████  ███▄    █  ██▓  ▄████  ███▄ ▄███▓ ▄▄▄      \r\n" + 
				"▓█   ▀  ██ ▀█   █ ▓██▒ ██▒ ▀█▒▓██▒▀█▀ ██▒▒████▄    \r\n" + 
				"▒███   ▓██  ▀█ ██▒▒██▒▒██░▄▄▄░▓██    ▓██░▒██  ▀█▄  \r\n" + 
				"▒▓█  ▄ ▓██▒  ▐▌██▒░██░░▓█  ██▓▒██    ▒██ ░██▄▄▄▄██ \r\n" + 
				"░▒████▒▒██░   ▓██░░██░░▒▓███▀▒▒██▒   ░██▒ ▓█   ▓██▒\r\n" + 
				"░░ ▒░ ░░ ▒░   ▒ ▒ ░▓   ░▒   ▒ ░ ▒░   ░  ░ ▒▒   ▓▒█░\r\n" + 
				" ░ ░  ░░ ░░   ░ ▒░ ▒ ░  ░   ░ ░  ░      ░  ▒   ▒▒ ░\r\n" + 
				"   ░      ░   ░ ░  ▒ ░░ ░   ░ ░      ░     ░   ▒   \r\n" + 
				"   ░  ░         ░  ░        ░        ░         ░  ░\r\n" + 
				"                                                   "
				);
	}

	public static void main(String[] args) {
		printLogo();
		Scanner sc_settings=new Scanner(System.in);
		System.out.println("\nPlease give the initial rotor settings (3 ASCII characters from A to Z):");
		String init_pos=sc_settings.nextLine().toUpperCase().trim().replaceAll("\\s+", "");
		Rotor_three r_three=new Rotor_three(init_pos.charAt(2));
		Rotor_two r_two=new Rotor_two(init_pos.charAt(1));
		Rotor_one r_one=new Rotor_one(init_pos.charAt(0));
		ReflectorB rB=new ReflectorB(init_pos.charAt(0));
		System.out.println("\nType in the string you want to be encoded and press enter:");
		Scanner sc_text=new Scanner(System.in);
		String input=sc_text.nextLine().toUpperCase().trim().replaceAll("\\s+", "");
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output+=Character.toString(r_three.getFromRefOutput((r_two.getFromRefOutput(r_one.getFromRefOutput(rB.getOutput(r_one.getOutput(r_two.getOutput(r_three.getOutput(input.charAt(i)), r_three.get_self_init_pos_index()), r_two.get_self_init_pos_index()), r_one.get_self_init_pos_index()))))));
		}
		System.out.print(output);
	}

}