package bot.jsonObject.getUpdates;

import bot.jsonObject.Message;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

	@JsonProperty("update_id")
	private Integer updateId;

	@JsonProperty("message")
	private Message message;

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

}