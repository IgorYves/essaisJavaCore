package tpPropeties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class GetPropr {

	public static void main(String[] args) {
		Properties pr = System.getProperties();
		System.out.println(pr);
		System.out.println("----------------------");
		Set<?> prk = pr.keySet();
		Iterator<?> it =  prk.iterator();
		while (it.hasNext()) {
			String str = (String)it.next();
			if (str.matches("os[.].*")) {
				System.out.println(str + "\t :\t" + pr.getProperty(str));
			}
		}
		it =  prk.iterator();
		while (it.hasNext()) {
			String str = (String)it.next();
			if (str.matches("java[.]vm[.].*")) {
				System.out.println(str + "\t :\t" + pr.getProperty(str));
			}
		}
		it =  prk.iterator();
		while (it.hasNext()) {
			String str = (String)it.next();
			if (str.matches("user[.].*")) {
				System.out.println(str + "\t :\t" + pr.getProperty(str));
			}
		}
		
	}

}
