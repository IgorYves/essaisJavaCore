package s48_afpa_ex.ex09;

import java.util.Scanner;

class Item4 {

	public static void main(String[] args) {
		String urlStr = "https://toto:brrr@sdom.docs.oracle.com:8080/javase/tutorial/java/javaOO/enum.html?param1=5&param2=32#a1";
		System.out.println();
		System.out.println("\t****************");
		System.out.println("\t** URL Parser **");
		System.out.println("\t****************");
		System.out.println();
		System.out.println("On utilise les urls absolues uniquement");
		System.out.println("Les protocoles admis :");
		for (Protocol pr : Protocol.values()) {
			System.out.print(pr + "  ");
		};
		System.out.println();
		System.out.println();
		System.out.println("si vous voulez utiliser autre url entrez la :");
		System.out.println("(laissez vide et <Entr> pour defaut)");
		
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		userStr = ConsoleIn.nextLine();
		if(userStr.length() > 0) {
			System.out.println("Vous avez entrée :");
			System.out.println(userStr);
			urlStr = userStr;
		};
		
		System.out.println("-----------------------");
		System.out.println("On utilise url suivante");
		System.out.println(urlStr);
		System.out.println();
		
		Url ParsedURL = new Url(urlStr);
		System.out.println(ParsedURL.getErrMess());
		System.out.println("Protocole : " + ParsedURL.getProtocole());
		System.out.println("Utilisateur autentification : " + ParsedURL.getAutentification());
		System.out.println("Domaine : " + ParsedURL.getDomainePrincipal());
		System.out.println("Sous domaines : " + ParsedURL.getSousDomaines());
		System.out.println("Porte : " + ParsedURL.getPorte());
		System.out.println("Path : " + ParsedURL.getPath());
		System.out.println("Page : " + ParsedURL.getPage());
		System.out.println("Parametres : " + ParsedURL.getParams());
		System.out.println("Ancre : " + ParsedURL.getAnchor());
		
		System.out.println();
		System.out.println("Nota Bene : pas tous les cas des tous \n"
								+ "\tles protocoles existants sont realisés");
		System.out.print("(");
		for (Protocol pr : Protocol.values()) {
			System.out.print(pr + " ");
		};
		System.out.println(")");
		System.out.println();
		System.out.println("Nota Bene 2 : realisé sans emploi try/catch, \n"
								+ "\t\"à l'ancienne\"");
		
		System.out.print("\n------------\n\tfin");
		ConsoleIn.close();//fermeture de Scanner

	}
}



class Url{
	private String url = "";
	private String protocole = "";
	private String autentification = "";
	private String[] domaine;
	private String porte = "";
	private String[] path;
	private String page = "";
	private String[] supParams;
	private String anchor = "";
	private String errorMess = "";
	
	Url(String url){
		if(url.length() > 0 && isValidProtocol(url)) {
			this.url = url;
			String currStr = url;
			if(currStr.indexOf(":") != -1 && isProtocol(currStr.split(":", 2)[0])) {
				protocole = currStr.split(":", 2)[0];
				currStr = currStr.split(":", 2)[1];
			}
			if(currStr.length() > 0 && currStr.indexOf("@") != -1) {
				autentification = currStr.split("@", 2)[0].replaceAll("/", "");
				currStr = currStr.split("@", 2)[1];
			}
			
			
			
		}
		else {errorMess = "URL semble d'être non valide";};
		
		
		
	};
	public String getErrMess(){return errorMess;};
	public String getURL(){return url;};
	public String getProtocole(){return protocole;};
	public String getAutentification(){return autentification;};
	public String getDomaine(){
		return "";
	};
	public String[] getDomaineArr(){
		String [] dom = {};
		return dom;
	};
	public String getDomainePrincipal(){
		return "";
	};
	public String getSousDomaines(){
		return "";
	};
	public String getPorte(){return porte;};
	public String getPath(){
		return "";
	};
	public String[] getPathArr(){
		String [] path = {};
		return path;
	};
	public String getPage(){return page;};
	public String getParams(){
		return "";
	};
	public String[] getParamsArr(){
		String [] params = {};
		return params;
	};
	public String getAnchor(){return anchor;};
	
	private boolean isValidProtocol(String str) {
		boolean rep = false;
		for (Protocol p : Protocol.values()) {
			if(str.indexOf(p.toString()) != -1) {rep = true;};
		}
		return rep;
	}
	private boolean isProtocol(String str) {
		boolean rep = false;
		for (Protocol p : Protocol.values()) {
			if(str.equals(p.toString())) {rep = true;};
		}
		return rep;
	}
};
