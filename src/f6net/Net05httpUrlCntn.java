package f6net;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Net05httpUrlCntn {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.google.fr");
		HttpURLConnection httpUrlCntn = (HttpURLConnection)url.openConnection();
		
		System.out.println(new Date(httpUrlCntn.getDate()));
		System.out.println(new Date(httpUrlCntn.getExpiration()));
		System.out.println(new Date(httpUrlCntn.getLastModified()));
		System.out.println(httpUrlCntn.getContentType());
		System.out.println(httpUrlCntn.getContentLength());
		System.out.println(httpUrlCntn.getContentEncoding());
		System.out.println("--------------");
		System.out.println(httpUrlCntn.getRequestMethod());
		System.out.println(httpUrlCntn.getResponseCode());
		System.out.println(httpUrlCntn.getResponseMessage());
		System.out.println(httpUrlCntn.getFollowRedirects());
		System.out.println(httpUrlCntn.getPermission());
		System.out.println("--------------");
		Map<String, List<String>> headersMap = httpUrlCntn.getHeaderFields();
		Set<String> headersFields = headersMap.keySet();
		for (String field : headersFields) {
			System.out.println(field + " : " + headersMap.get(field));
		}
		System.out.println("--------------");
		InputStream inStream = httpUrlCntn.getInputStream();
		int c;
		while (-1 != (c=inStream.read())) {
			System.out.print((char)c);
		}
		inStream.close();
		
		
		

	}

}
