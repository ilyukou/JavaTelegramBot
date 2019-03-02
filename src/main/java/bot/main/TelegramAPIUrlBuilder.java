package bot.main;

public class TelegramAPIUrlBuilder {

    public static String buildUrlForGetUpdates() {
        String command_type = "getUpdates";

        return buildUrl(command_type, "");

    }

    public static String buildUrlForSendMessage(int chat_id, String text) {
        String command_type = "sendMessage";

        String title_chat_id = "chat_id=";
        String title_text = "text=";

        return buildUrl(command_type, title_chat_id + chat_id + "&" + title_text + text);

    }

    public static String buildUrlForSendLocation(int chat_id, double longitude, double latitude) {
        String command_type = "sendLocation";

        String title_chat_id = "chat_id=";

        String title_longitude = "longitude=";
        String title_latitude = "latitude=";


        return buildUrl(command_type, title_chat_id + chat_id + "&" + title_longitude + longitude + "&" + title_latitude + latitude);
    }

    public static String buildUrlForSendPhotoString(String chat_id, String photo) { //InputFile or String
        String command_type = "sendPhoto";
        String title_chat_id = "chat_id=";

        String title_photo = "photo=";

        return buildUrl(command_type, title_chat_id + chat_id + "&" + title_photo + photo);
    }

    public static String buildUrlForSendDocument(String chat_id, String document) { //	InputFile or String
        String command_type = "sendDocument";
        String title_chat_id = "chat_id=";

        String title_document = "document=";

        return buildUrl(command_type, title_chat_id + chat_id + "&" + title_document + document);
    }

    public static String buildUrl(String method, String date) {
        String TOKEN = "778752898:AAEVdKRlxalz33hrH1gFfnsq-R7R28_HwGA";

        if (date.length() == 0) {
            return "https://api.telegram.org/bot" + TOKEN + "/" + method;
        } else {
            return "https://api.telegram.org/bot" + TOKEN + "/" + method + "?" + date;
        }
    }
}

