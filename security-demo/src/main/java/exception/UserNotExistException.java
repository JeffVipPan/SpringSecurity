package exception;

import lombok.Data;

/**
 * @author ек╥Е
 * @date 2017/12/27 обнГ10:32
 */
@Data
public class UserNotExistException extends RuntimeException  {

    private Integer id;

    private String message;



}
