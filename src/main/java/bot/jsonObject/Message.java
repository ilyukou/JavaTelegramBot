package bot.jsonObject;


import bot.jsonObject.Chat;
import bot.jsonObject.From;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

	@JsonProperty("message_id")
	private Long messageId;

	@JsonProperty("from")
	private From from;

	@JsonProperty("chat")
	private Chat chat;

	@JsonProperty("date")
	private Integer date;

	@JsonProperty("text")
	private String text;

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
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