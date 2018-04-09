package com.rls.base.common.page;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 分页 这里使用 spring data jpa : page  Pageable
 * @Description : ${todo}
 * @date ：2018/3/25 17:57
 */
public abstract class RBasePage<T> implements Pageable, Page<T>{


}
