package bot.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class httpsRequest {

	
	public void getUpdates() throws Exception {
		String command_type ="getUpdates";
		
		sendMethod(command_type, "");

		
	}
	
	
	public void sendMessage(int chat_id, String text) throws Exception {
		String command_type ="sendMessage";
		
		String title_chat_id="chat_id=";
		String title_text="text=";
		
		sendMethod(command_type, title_chat_id+chat_id +"&"+title_text+text);
		
	}
	
	public void sendLocation(int chat_id, double longitude, double latitude) throws Exception {
		String command_type ="sendLocation";
		
		String title_chat_id="chat_id=";
		
		String title_longitude="longitude=";
		String title_latitude="latitude=";	
		
		
		sendMethod(command_type, title_chat_id + chat_id +"&"+ title_longitude + longitude + "&" + title_latitude + latitude);
		
	}
	
	public void sendPhoto(String chat_id, String photo) throws Exception { //InputFile or String
		String command_type ="sendPhoto";
		String title_chat_id="chat_id=";
		
		String title_photo="photo=";
		
		sendMethod(command_type, title_chat_id + chat_id +"&"+title_photo + photo);
		
	}
	
	public void sendDocument(String chat_id, String document) throws Exception { //	InputFile or String
		String command_type ="sendDocument";
		String title_chat_id="chat_id=";
		
		String title_document="document=";
		
		sendMethod(command_type, title_chat_id + chat_id +"&"+title_document + document);
		
	}
	

	
    public void sendMethod(String method, String date) throws Exception{
    	 String TOKEN = "";

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
