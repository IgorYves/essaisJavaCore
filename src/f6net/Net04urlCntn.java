package f6net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Net04urlCntn {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.google.fr");
		URLConnection urlCntn = url.openConnection();
		
		System.out.println(new Date(urlCntn.getDate()));
		System.out.println(new Date(urlCntn.getExpiration()));
		System.out.println(new Date(urlCntn.getLastModified()));
		System.out.println(urlCntn.getContentType());
		System.out.println(urlCntn.getContentLength());
		System.out.println(urlCntn.getContentEncoding());
		System.out.println("--------------");
		Map<String, List<String>> headersMap = urlCntn.getHeaderFields();
		Set<String> headersFields = headersMap.keySet();
		for (String field : headersFields) {
			System.out.println(field + " : " + headersMap.get(field));
		}
		System.out.println("--------------");
		InputStream inStream = urlCntn.getInputStream();
		int c;
		while (-1 != (c=inStream.read())) {
			System.out.print((char)c);
		}
		inStream.close();
		
		
		

	}

}
