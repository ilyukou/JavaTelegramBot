package bot.jsonObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("first_name")
	private String first_name;

	@JsonProperty("last_name")
	private String last_name;

	@JsonProperty("username")
	private String username;

	@JsonProperty("type")
	private String type;

	@JsonProperty("title")
	private String title;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}