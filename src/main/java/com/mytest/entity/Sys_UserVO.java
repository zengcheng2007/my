package com.mytest.entity;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Sys_UserVO {
    private Long user_Id;
    private String user_Name;
    private String user_Pwd;
}

