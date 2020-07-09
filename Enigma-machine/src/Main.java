import java.util.Scanner;
import Rotors.Rotor_one;
import Rotors.Rotor_three;
import Rotors.Rotor_two;

public class Main {
	public static void printLogo() {
		System.out.println("▓█████  ███▄    █  ██▓  ▄████  ███▄ ▄███▓ ▄▄▄      \r\n" + 
				"▓█   ▀  ██ ▀█   █ ▓██▒ ██▒ ▀█▒▓██▒▀█▀ ██▒▒████▄    \r\n" + 
				"▒███   ▓██  ▀█ ██▒▒██▒▒██░▄▄▄░▓██    ▓██░▒██  ▀█▄  \r\n" + 
				"▒▓█  ▄ ▓██▒  ▐▌██▒░██░░▓█  ██▓▒██    ▒██ ░██▄▄▄▄██ \r\n" + 
				"░▒████▒▒██░   ▓██░░██░░▒▓███▀▒▒██▒   ░██▒ ▓█   ▓██▒\r\n" + 
				"░░ ▒░ ░░ ▒░   ▒ ▒ ░▓   ░▒   ▒ ░ ▒░   ░  ░ ▒▒   ▓▒█░\r\n" + 
				" ░ ░  ░░ ░░   ░ ▒░ ▒ ░  ░   ░ ░  ░      ░  ▒   ▒▒ ░\r\n" + 
				"   ░      ░   ░ ░  ▒ ░░ ░   ░ ░      ░     ░   ▒   \r\n" + 
				"   ░  ░         ░  ░        ░        ░         ░  ░\r\n" + 
				"                                                   ");
	}

	public static void main(String[] args) {
		printLogo();
		Rotor_three r_three=new Rotor_three();
		Rotor_two r_two=new Rotor_two();
		Rotor_one r_one=new Rotor_one();
		System.out.println("\nType in the string you want to be encoded or decoded and press enter:");
		Scanner sc=new Scanner(System.in);
		String input="";
		input=sc.nextLine();
		String output=r_one.getOutput(r_two.getOutput(r_three.getOutput(input)));
		System.out.println(output);
	}

}
/*
Random szöveg
Új sor
Harmadik sor
*/