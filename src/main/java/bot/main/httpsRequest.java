package bot.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class httpsRequest {

	
	public void getUpdates() throws Exception {
		String comand_type ="getUpdates";

		
		sendMethod(comand_type, "");
		
	}
	
	
	public void sendMessage(String chat_id, String text) throws Exception {
		String comand_type ="sendMessage";
		
		String title_chat_id="chat_id=";
		String title_text="text=";
		
		sendMethod(comand_type, title_chat_id+chat_id +"&"+title_text+text);
		
	}
	
	public void sendLocation(String chat_id, double longitude, double latitude) throws Exception {
		String comand_type ="sendLocation";
		
		String title_chat_id="chat_id=";
		
		String title_longitude="longitude=";
		String title_latitude="latitude=";	
		
		
		sendMethod(comand_type, title_chat_id + chat_id +"&"+ title_longitude + longitude + "&" + title_latitude + latitude);
		
	}
	
	public void sendPhoto(String chat_id, String photo) throws Exception { //InputFile or String
		String comand_type ="sendPhoto";
		String title_chat_id="chat_id=";
		
		String title_photo="photo=";
		
		sendMethod(comand_type, title_chat_id + chat_id +"&"+title_photo + photo);
		
	}
	
	public void sendDocument(String chat_id, String document) throws Exception { //	InputFile or String
		String comand_type ="sendDocument";
		String title_chat_id="chat_id=";
		
		String title_document="document=";
		
		sendMethod(comand_type, title_chat_id + chat_id +"&"+title_document + document);
		
	}
	
	

	
	
	
	
	
	
    public void sendMethod(String method, String date) throws Exception{
    	 String TOKEN = "778752898:AAEVdKRlxalz33hrH1gFfnsq-R7R28_HwGA";
    	
    	if(date.length() == 0) {
    		sendUrlRequest("https://api.telegram.org/bot"+TOKEN+"/"+ method);
    	}else if(date.length() != 0){
    		sendUrlRequest("https://api.telegram.org/bot"+TOKEN+"/"+ method +"?"+date);
    	} 
	
    }
    private void sendUrlRequest(String urlText) throws Exception{
    	URL url = new URL(urlText);
    	URLConnection uc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
