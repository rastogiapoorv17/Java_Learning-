package main.string_Programs_Apoorv;


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingJson {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		JSONParser jsonp = new JSONParser();
		
		FileReader reader= new FileReader(".\\File.json");
		Object obj=jsonp.parse(reader);
        JSONObject dataobj=(JSONObject)obj;		
        String data= (String)dataobj.get("mywu.pending_promo_text");
        System.out.println(data);
		

	}

}
