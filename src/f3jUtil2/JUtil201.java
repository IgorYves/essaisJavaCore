package f3jUtil2;

import java.util.StringTokenizer;

class JUtil201 {

	public static void main(String[] args) {
		String s = "lorem = ipsum; dolor = sit amet; bla bla= tra tra; tram";
		StringTokenizer st = new StringTokenizer(s, ";");
		while (st.hasMoreTokens()) {
			StringTokenizer stI = new StringTokenizer(st.nextToken(), "=");
			if (stI.hasMoreTokens()) System.out.print("\"" + stI.nextToken().trim() + "\"");
			if (stI.hasMoreTokens()) System.out.print(" : \"" + stI.nextToken().trim() + "\"");
			System.out.println();
		}
	}
}
