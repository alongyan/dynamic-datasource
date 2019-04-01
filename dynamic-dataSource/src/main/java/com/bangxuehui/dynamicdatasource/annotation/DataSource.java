package com.bangxuehui.dynamicdatasource.annotation;

import java.lang.annotation.*;

/**
 * 注解定义
 *
 * @author yw
 * @date 2019/4/1
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}