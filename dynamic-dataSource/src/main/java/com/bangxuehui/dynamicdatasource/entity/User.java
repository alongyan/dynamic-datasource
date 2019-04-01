package com.bangxuehui.dynamicdatasource.entity;

import lombok.Data;

/**
 * 持久层对象
 *
 * @author yw
 * @date 2019/4/1
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}