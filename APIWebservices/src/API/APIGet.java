package API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

@SuppressWarnings("deprecation")
public class APIGet {

	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		HttpClient client=new DefaultHttpClient();
		HttpGet request=new HttpGet("http://117.232.120.100:9085/NRDAuthority/home.xhtml");
		HttpResponse response=client.execute(request);
		BufferedReader reader=new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line="";
		while((line=reader.readLine()) != null){
			System.out.println(line);
		}
	}

}
