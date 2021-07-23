package lao.wei.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private Integer uuid;
    private String userName;
    private String password;
    private String reakName;
    private Integer gender;
    private Date birthday;

}
