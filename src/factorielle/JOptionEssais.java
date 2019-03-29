package factorielle;

import javax.swing.JOptionPane;

public class JOptionEssais {

	public static void main(String[] args) {
		
		JOptionPane jop = new JOptionPane();
//////////////////////////////////////////////////////////////////////////
		jop.showMessageDialog(jop, "Message de jop PLAIN_MESSAGE", "Titre de jop", jop.PLAIN_MESSAGE);
		jop.showMessageDialog(jop, "Message de jop ERROR_MESSAGE", "Titre de jop", jop.ERROR_MESSAGE);
		jop.showMessageDialog(jop, "Message de jop INFORMATION_MESSAGE", "Titre de jop", jop.INFORMATION_MESSAGE);
		jop.showMessageDialog(jop, "Message de jop WARNING_MESSAGE", "Titre de jop", jop.WARNING_MESSAGE);
		jop.showMessageDialog(jop, "Message de jop QUESTION_MESSAGE", "Titre de jop", jop.QUESTION_MESSAGE);
//////////////////////////////////////////////////////////////////////////
		int retour;
		retour = jop.showConfirmDialog(jop, "le message", "le titre", jop.DEFAULT_OPTION);
		// x -> -1; ok -> 0
		System.out.println(retour);
		retour = jop.showConfirmDialog(jop, "le message", "le titre", jop.YES_NO_OPTION);
		// x -> -1; ok -> 0; no -> 1
		System.out.println(retour);
		retour = jop.showConfirmDialog(jop, "le message", "le titre", jop.YES_NO_CANCEL_OPTION);
		// x -> -1; ok -> 0 no -> 1; annul -> 2
		System.out.println(retour);
		retour = jop.showConfirmDialog(jop, "le message", "le titre", jop.OK_CANCEL_OPTION);
		// x -> -1; ok -> 0; annul -> 2
		System.out.println(retour);
//////////////////////////////////////////////////////////////////////////
		String str = "";
		str = JOptionPane.showInputDialog(jop, "le message", "VALEUR INITIALE");
		//annul -> null; x -> null
		System.out.println(str);
//////////////////////////////////////////////////////////////////////////
		String[] boutons = {"primo", "secundo", "tertio", "quatro", "quinto", "sextio", "septimo", "octavo"};
		retour = jop.showOptionDialog(jop, "message", "titre",
						jop.YES_NO_CANCEL_OPTION, //DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
						jop.INFORMATION_MESSAGE, //ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
						null, boutons, boutons[0]);
		//x -> -1; index of boutons Array
		System.out.println(retour);
		if(retour != jop.CLOSED_OPTION)System.out.println(retour);
//////////////////////////////////////////////////////////////////////////
		String[] options = {"primo", "secundo", "tertio", "quatro", "quinto", "sextio", "septimo", "octavo"};
		str = (String)jop.showInputDialog(jop,  "message", "titre",
				jop.QUESTION_MESSAGE,
				null,//icone
				options, options[0]);

		
//////////////////////////////////////////////////////////////////////////
		String s = "";
		for(int i=0; i<1000; i++) {
			s += ":-) ";
		}
		String[] bts = s.split(" ");
		retour = jop.showOptionDialog(jop, "message", "titre", jop.YES_NO_CANCEL_OPTION, jop.INFORMATION_MESSAGE,
						null, bts, bts[0]);
		System.out.println(retour);
//////////////////////////////////////////////////////////////////////////
		System.exit(0);
		
	}

}
