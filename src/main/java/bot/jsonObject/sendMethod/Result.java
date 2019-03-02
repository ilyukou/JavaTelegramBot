package bot.jsonObject.sendMethod;

//import bot.updates.Chat;
//import bot.updates.From;

import bot.jsonObject.Chat;
import bot.jsonObject.From;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

    @JsonProperty("message_id")
    private Integer messageId;

    @JsonProperty("from")
    private From from;

    @JsonProperty("chat")
    private Chat chat;

    @JsonProperty("date")
    private Integer date;

    @JsonProperty("text")
    private String text;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}