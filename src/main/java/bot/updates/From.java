package bot.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class From {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("is_bot")
	@Expose
	private Boolean isBot;
	@SerializedName("first_name")
	@Expose
	private String firstName;
	@SerializedName("username")
	@Expose
	private String username;
	@SerializedName("language_code")
	@Expose
	private String languageCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsBot() {
		return isBot;
	}

	public void setIsBot(Boolean isBot) {
		this.isBot = isBot;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

}