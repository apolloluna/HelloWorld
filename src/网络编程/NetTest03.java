package ÍøÂç±à³Ì;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NetTest03 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.hao123.com/");
		URLConnection conn =url.openConnection();
		System.out.println("connectTimeout"+conn.getConnectTimeout());
		System.out.println("ReadTimeout"+conn.getReadTimeout());
		System.out.println("connectType"+ conn.getContentType());
		System.out.println("headerField Detail:");
		Map map =conn.getHeaderFields();
		Set set = map.entrySet();
		Iterator iterator =set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mE = (Map.Entry)iterator.next();
			System.out.println(mE.getKey()+" "+mE.getValue());
		}
		
		
		
		/*BufferedReader bfReader = new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine;
		while((inputLine = bfReader.readLine())!=null) {
			System.out.println(inputLine);
		}
		bfReader.close();
		*/
	}

}
