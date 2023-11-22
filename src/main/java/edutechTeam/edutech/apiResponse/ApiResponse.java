package edutechTeam.edutech.apiResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"success", "code", "message", "result"})
public class ApiResponse<T> {

    @JsonProperty("success")
    private final Boolean success;
    private final int code;
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;

    // 성공한 경우
    public ApiResponse(SuccessStatus status, T data) {
        this.success = status.getSuccess();
        this.code = status.getCode();
        this.message = status.getMessage();
    }
    public ApiResponse(SuccessStatus status) {
        this.success = status.getSuccess();
        this.code = status.getCode();
        this.message = status.getMessage();
    }

}
