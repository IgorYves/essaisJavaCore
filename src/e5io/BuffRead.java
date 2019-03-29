package e5io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BuffRead {
	public static void main(String[] args) throws IOException {
		int max = 10;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = new String[max];
		System.out.println(
				"entrez votre text, <Entr> pour continuer, \"f\" pour finir");
		int i=0;
		do {s[i++] = br.readLine();} while (!s[i-1].equals("f") && i<max);
		
		System.out.println("votre text :");
		i=0;
		do {System.out.println(s[i++]);} while (!s[i-1].equals("f") && i<max);
		
	}

}
