package cn.sdadgz.smarthousekeeping.common;

import cn.hutool.core.lang.Dict;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

/**
 * 我们的老熟人返回结果集
 *
 * <p>
 * 废物本物
 * </p>
 *
 * @author sdadgz
 * @since 2023/3/22 21:00:44
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    /**
     * 返回数组
     */
    @JsonIgnore
    public static final String LIST = "list";

    /**
     * 返回总数
     */
    @JsonIgnore
    public static final String TOTAL = "total";


    /**
     * 代码
     */
    private String code;
    /**
     * 信息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;


    /**
     * 成功返回
     *
     * @return 成功
     */
    public static Result success() {
        return new Result(Constants.CODE_200, "操作成功", null);
    }

    /**
     * 成功返回
     *
     * @param data 数据
     * @return 成功
     */
    public static Result success(Object data) {
        return new Result(Constants.CODE_200, "", data);
    }


    /**
     * 分页
     *
     * @param list  数据
     * @param total 总数
     * @return 成功
     */
    @SuppressWarnings("rawtypes")
    public static Result success(Collection list, Long total) {
        return success(Dict.create().set(LIST, list).set(TOTAL, total));
    }


    /**
     * 返回错误
     *
     * @param code 代码
     * @param msg  信息
     * @return 错误
     */
    public static Result error(String code, String msg) {
        return new Result(code, msg, null);
    }

}
