package bot.main;

import bot.jsonObject.getUpdates.TelegramResponse;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

public class Main {
    public static final int DELAY_IN_MILLISECONDS = 640;

	public static void main(String[] args) throws Exception {

		RestTemplate rest = new RestTemplate();
        UpdateHandler handler = new UpdateHandler();

        while (true){
            TelegramResponse update = rest.getForObject(TelegramAPIUrlBuilder.buildUrlForGetUpdates(), TelegramResponse.class);
            handler.handle(update);
            TimeUnit.MILLISECONDS.sleep(DELAY_IN_MILLISECONDS);

        }
	}
}