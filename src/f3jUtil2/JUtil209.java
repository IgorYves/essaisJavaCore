package f3jUtil2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class JUtil209 {

	public static void main(String[] args) throws FileNotFoundException {
		String unString = "Lorem ipsum \n dolor sit amet";
		Scanner scanStr = new Scanner(unString);
		
		FileReader fileIn = new FileReader("tels.txt");
		Scanner scanFile = new Scanner(fileIn);
		
		Scanner scanConsole = new Scanner(System.in);
		
		while (scanStr.hasNext()) {
			System.out.println(scanStr.next());
		}
		scanStr.close();
		System.out.println("----------");
		
		scanStr = new Scanner(unString);
		while (scanStr.hasNextLine()) {
			System.out.println(scanStr.nextLine());
		}
		scanStr.close();
		System.out.println("----------");
		
		scanStr = new Scanner(unString);
		scanStr.findWithinHorizon("dolor", 0);
		if (scanStr.hasNext()) System.out.println(scanStr.next());
		
		scanStr.close();
		System.out.println("----------");
		
		while (scanFile.hasNextLine()) {
			System.out.println(scanFile.nextLine());
		}
		scanFile.close();
		System.out.println("----------");
		
		fileIn = new FileReader("tels.txt");
		scanFile = new Scanner(fileIn);
		scanFile.useDelimiter("[=.]");
		while (scanFile.hasNext()) {
			System.out.println(scanFile.next());
		}
		scanFile.close();
		System.out.println("----------");
		
		while (scanConsole.hasNext()) {
			if (scanConsole.hasNextInt()) break;
			System.out.println(scanConsole.nextLine());
		}
		System.out.println("----------");
		
		while (scanConsole.hasNext()) {
			if (scanConsole.hasNextInt()) {
				System.out.println("int : " + scanConsole.nextInt());
			}
			else if (scanConsole.hasNextDouble()) {
				System.out.println("double : " + scanConsole.nextDouble());
			}
			else if (scanConsole.hasNextLine()) {
				String s = scanConsole.next();
				System.out.println("string : " + s);
				if (s.equals("f")) break;
			}	
		}
		scanConsole.close();
		
		
		
		System.out.println("----------\nFin");
		
		
		
	}
}
