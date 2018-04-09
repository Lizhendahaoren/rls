package com.rls.base.util.page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 对spring data jpa 分页/排序 简化
 * @Description : ${todo}
 * @date ：2018/3/30 10:13
 */
public class PageUtil {

    private static String SORT_ASC = "ASC";

    private static String SORT_DESC = "DESC";


    // 过滤map数据 处理为分页数据

    /**
     * 1.有什莫 : 前台map 包含 当前页 页显示数  排序方式   搜索条件
     * 2.干什莫 :  转换为 分页信息 pageable   和 搜索条件
     * 3.咋莫干 : a.第一步  b.第二布  c.第三布
     */


    /**
     * 构造分页参数
     *
     * @param page 页
     * @param pageSize 页面大小(默认为10条)
     * @param sort     排序字段
     * @return
     */
    public static PageRequest buildPageRequest(int pageNumber, int pageSize,
                                               String sort) {


        return null;
    }
}
