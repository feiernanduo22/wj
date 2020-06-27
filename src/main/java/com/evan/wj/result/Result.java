package com.evan.wj.result;

/**
 * Result class
 *
 * @auther Yvqanlee
 * @data 2020/6/21 22:31
 */
public class Result {
    //响应代码
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Result(int code) {
        this.code = code;
    }
}
