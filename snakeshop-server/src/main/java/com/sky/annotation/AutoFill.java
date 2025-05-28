package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解，用于标识某个方法需要进行功能字段自动填充处理
@Target(ElementType.METHOD)//表示该注解用于方法上
@Retention(RetentionPolicy.RUNTIME)//表示该注解在运行时存在
public @interface AutoFill {
    //方法：用于指定数据库操作类型：update insert
    OperationType value();

}
