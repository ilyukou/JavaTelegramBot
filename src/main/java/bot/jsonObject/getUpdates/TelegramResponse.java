package bot.jsonObject.getUpdates;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TelegramResponse {
    @JsonProperty("ok")
    Boolean ok;

    @JsonProperty("result")
    List<Result> result;

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}