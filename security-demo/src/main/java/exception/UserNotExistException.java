package exception;

import lombok.Data;

/**
 * @author �˷�
 * @date 2017/12/27 ����10:32
 */
@Data
public class UserNotExistException extends RuntimeException  {

    private Integer id;

    private String message;



}
