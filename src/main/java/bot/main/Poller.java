package bot.main;

import bot.jsonObject.getUpdates.TelegramResponse;
import org.springframework.web.client.RestTemplate;

public class Poller {
    RestTemplate rest = new RestTemplate();

    TelegramResponse update = rest.getForObject(TelegramAPIUrlBuilder.buildUrlForGetUpdates(), TelegramResponse.class);
}
