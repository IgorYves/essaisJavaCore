package f1jLang;

class JLnag4 {

	public static void main(String[] args) {
		Package pkgs[];
		pkgs = Package.getPackages();
		for (int i = 0; i < pkgs.length; i++) {
			System.out.println(
							pkgs[i].getName() + "\n\t\t" +
							pkgs[i].getImplementationTitle() + "///" +
							pkgs[i].getImplementationVendor() + "///" +
							pkgs[i].getImplementationVersion() + "///" +
							pkgs[i].toString()
					);
		}
		
	}
	
}
