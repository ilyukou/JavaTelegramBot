package bot.updates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Chat {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("first_name")
	@Expose
	private String firstName;
	@SerializedName("username")
	@Expose
	private String username;
	@SerializedName("type")
	@Expose
	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}