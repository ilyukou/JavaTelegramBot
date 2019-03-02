package bot.jsonObject.sendMethod;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TelegramResponse {
    @JsonProperty("ok")
    Boolean ok;

    @JsonProperty("result")
    Result result;


    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
