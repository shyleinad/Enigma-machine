import java.util.Scanner;

import Reflectors.ReflectorB;
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
		ReflectorB rB=new ReflectorB();
		System.out.println("\nType in the string you want to be encoded and press enter:");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine().toUpperCase().trim().replaceAll("\\s+", "");
		String output=r_three.getFromRefOutput(r_two.getFromRefOutput(r_one.getFromRefOutput(rB.getOutput(r_one.getOutput(r_two.getOutput(r_three.getOutput(input)))))));
		System.out.println(output);
	}

}