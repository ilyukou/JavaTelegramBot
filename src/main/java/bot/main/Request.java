package bot.main;

import bot.jsonObject.sendMethod.TelegramResponse;
import org.springframework.web.client.RestTemplate;

public class Request {

    public void getUpdates(String url){

        RestTemplate rst = new RestTemplate();
        bot.jsonObject.getUpdates.TelegramResponse telegramAnswer = rst.getForObject(url, bot.jsonObject.getUpdates.TelegramResponse.class);
    }

    public void sendMethod(String url){

        RestTemplate rst = new RestTemplate();
        TelegramResponse telegramAnswer = rst.getForObject(url, TelegramResponse.class);
    }


}
