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
		System.out.println("\nPlease give the initial rotor settings (3 ASCII letters from A to Z):");
		String init_pos=sc_settings.nextLine().toUpperCase().trim().replaceAll("\\s+", "");
		Rotor_three r_three=new Rotor_three(init_pos.charAt(2));
		Rotor_two r_two=new Rotor_two(init_pos.charAt(1));
		Rotor_one r_one=new Rotor_one(init_pos.charAt(0));
		ReflectorB rB=new ReflectorB(init_pos.charAt(0));
		System.out.println("\nType in the string you want to be encoded and press enter:");
		Scanner sc_text=new Scanner(System.in);
		String input=sc_text.nextLine().toUpperCase().trim().replaceAll("\\s+", "");
		String output = "";
		/*for (int i = 0; i < input.length(); i++) {
			output+=(i!=0&&i%5==0)?" "+Character.toString(r_three.getFromRefOutput((r_two.getFromRefOutput(r_one.getFromRefOutput(rB.getOutput(r_one.getOutput(r_two.getOutput(r_three.getOutput(input.charAt(i)), r_three.get_self_init_pos_index()), r_two.get_self_init_pos_index(), r_three.get_self_init_pos_index()), r_one.get_self_init_pos_index())))))):Character.toString(r_three.getFromRefOutput((r_two.getFromRefOutput(r_one.getFromRefOutput(rB.getOutput(r_one.getOutput(r_two.getOutput(r_three.getOutput(input.charAt(i)), r_three.get_self_init_pos_index()), r_two.get_self_init_pos_index(), r_three.get_self_init_pos_index()), r_one.get_self_init_pos_index()))))));
		}*/
		for (int i = 0; i < input.length(); i++) {
			output+=(i!=0&&i%5==0)?" "+r_three.getFromRefOutput(r_two.getFromRefOutput(r_one.getFromRefOutput(rB.getOutput(r_one.getOutput(r_two.getOutput(r_three.getOutput(input.charAt(i)), r_three.get_self_init_pos_index()), r_two.get_self_init_pos_index(), r_three.get_self_init_pos_index()), r_one.get_self_init_pos_index())))):r_three.getFromRefOutput(r_two.getFromRefOutput(r_one.getFromRefOutput(rB.getOutput(r_one.getOutput(r_two.getOutput(r_three.getOutput(input.charAt(i)), r_three.get_self_init_pos_index()), r_two.get_self_init_pos_index(), r_three.get_self_init_pos_index()), r_one.get_self_init_pos_index()))));
		}
		System.out.print(output);
		/*if (output.equals("BQZGS REKON JPEEN WKLJL ESQFN UPYEX WVXQV GBHHQ BNYNV FUJFM ZGPKL OUHCT UHCMU LKKJG TMPKL YXREU VEWIF RCTGK PODLV OWVHQ MRCJM OEFZW KHLGB PHFNI KKNXU RRMZP CUWVD BFZJI GGFBD BVHSE QCODL KDYTX REXGJ EXIFW QCPQK FJCWW UVQEN YGFRH TOCPO HNJKJ ZBXLS QLKBT IUHZD IBHJL XIMDF UMJGX YVWEM OCMIM UHDQF WPOTL SYWQT PNTPW DUTMB BZZWT FBZZH YCFDQ JIYNW MQFQS PVRMU VPZDD ZPZPB GIKQB VLGEH CQPWU GOCJK DWPDC BULDT SVQGZ OTXCJ CDYWY KKEVH ZOCSP KXFHZ JQBKX QPIVP QJIMD FPMTI EIUDE OCNWO DBWZQ RXSDC POIBR XFDTV DVWKG IKIJW KOEBP JMUSX LOIBI JWWHO NXJBV ZGKHV UPTMT HSSFN UZGYD WMTUK LHKFT DDZPZ MBQQZ GCVYN RGELR FTOGQ KVVDU VXLVK SHUZR IMKGG FEBRZ UOENG GILYL OVDLG UFEBO UBDZG OWCXL TKSBT MCDLP BMUQO FXYHC XTGYJ FLINH NXSHI UNTHE ORXPQ PKOVH CBUBT ZSZSO OSTGO TFSOD BBZZL XLCYZ XIFGW FDZEE QIBMG FJBWZ")) {
			System.out.println("Minden fasza, minden jó!");
		} else {
			System.out.println("\nSZAR!");
		}*/
	}

}