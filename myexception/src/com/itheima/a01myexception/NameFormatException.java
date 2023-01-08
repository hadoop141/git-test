package com.itheima.a01myexception;

public class NameFormatException extends RuntimeException {

    /*自定义异常:
        NameFormat:当前异常类的名字，表示姓名格式化有误
        Exception:表示当前类是一个异常类

        运行时异常：继承RuntimeException
        编译时异常：继承Exception
     */

    public NameFormatException(){}

    public NameFormatException(String message){
        super(message);
    }
}
