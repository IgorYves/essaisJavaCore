package f1jLang;

class StrBuff {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("bla bla2");
		echoSB(sb);
		for (int i=0; i<50; i++) {
			sb.append(i);
			infoSB(sb);
		}
		
		

	}
	
	private static void echoSB(StringBuffer sb){
		System.out.println(sb + " / " + sb.length() + " / " + sb.capacity() + " / " + (sb.capacity()-sb.length()));
	}
	private static void infoSB(StringBuffer sb){
		System.out.println(sb.length() + " / " + sb.capacity() + " / " + (sb.capacity()-sb.length()));
	}
}
