package edutechTeam.edutech.apiResponse;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static lombok.AccessLevel.PRIVATE;


@Getter
@RequiredArgsConstructor(access = PRIVATE)
public enum SuccessStatus {


    /** Education **/
    EDU_READ(true, 200, "교육 정보값이 조회되었습니다."),

    /** ItMachine **/
    ITMACHINE_READ(true, 200, "IT기기 정보값이 조회되었습니다."),

    /** Government **/
    GOVERN_READ(true, 200, "정부정책 정보값이 조회되었습니다.");

    private final Boolean success;
    private final int code;
    private final String message;


}
