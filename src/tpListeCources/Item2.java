package tpListeCources;

import java.util.LinkedList;

import javax.swing.JOptionPane;

class Item2 {
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		int kog;
		String article = "";
		LinkedList<String> caddy = new LinkedList<String>();
		do {
		article = JOptionPane.showInputDialog(jop, "Good shopping :\n"
							+ "Entrez le nom d'article que vous voulez acheter");
		System.out.println(article);
		if (article != null) {
			caddy.add(article);
		}
		String articles = "";
		if (caddy.size() != 0) {
			for (String s : caddy) {
				articles += "\n - " + s;
			}
		}
		kog = jop.showConfirmDialog(jop, "Caddy : " + caddy.size() + " articles"
					+ articles + "\nOn continue ?", "Coures", jop.YES_NO_OPTION);
		} while (kog == 0);
		System.out.println();
		System.out.println("----------------");
		if (caddy.size() != 0) {
			System.out.println("Vos achats :");
			for (String s : caddy) {
				System.out.println("- " + s);
			}
		}
		System.out.println("Passez à la caisse SVP");
		System.out.println("\n-----------\n\tfin");
	}

}
