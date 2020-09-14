package com.liushi.response;

/**
 * @ClassName JsonResult
 * @Description 定义统一的json结构
 * @Author liushi
 * @Date 2020/9/14 20:08
 * @Version V1.0
 **/
public class JsonResult<T> {

    /**
     * 由于Jackson封装的json数据类型不确定,所有在定义统一的json结构是,我们需要用到泛型
     * 统一的json结构中属性包括数据,状态码,提示信息即可构造方法可以根据实际业务需求做响应的添加即可,
     * 一般来说,应该有默认的返回结构,也应该有用户指定的返回结构
     */

    private T data;
    private String code;
    private String msg;

    /**
     * 若没有数据返回,默认状态码为0,提示信息为:操作成功!
     */
    public JsonResult() {
        this.code = "0";
        this.msg = "操作成功!";
    }

    /**
     * 若没有数据返回,可以人为指定状态码和提示信息
     *
     * @param code 状态码
     * @param msg  提示信息
     */
    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时,状态码为0,默认提示信息为:操作成功!
     *
     * @param data 数据类型
     */
    public JsonResult(T data) {
        this.data = data;
        this.code = "0";
        this.msg = "操作成功!";
    }

    /**
     * 有数据返回时,状态码为0,可以人为指定状态码和提示信息
     *
     * @param data 数据类型
     */
    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = "0";
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
