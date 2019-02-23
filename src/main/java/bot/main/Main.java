package bot.main;

public class Main {

	public static void main(String[] args) throws Exception {
		
		httpsRequest httpsRequest = new httpsRequest();
		
		String chat_id = "265752309";
		String text = "from main";
		
		httpsRequest.getUpdates();
		httpsRequest.sendMessage(chat_id,text);
		httpsRequest.sendLocation(chat_id, 23.788637, 53.717239);
		
		
		
		
		
		
	}
}