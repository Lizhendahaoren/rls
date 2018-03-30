package com.rls.base.common.service;

import com.rls.base.common.result.RBaseResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: service基类
 * @Description : 定义统一的方法  IDUS
 * @date ：2018/3/24 14:43
 */
public interface RBaseService<T> {

    Optional<T> load(Long id);

    void create(T object);

    void update(T object);

    void delete(Long id);

    Page<T> findALL(Map<String, Object> params);

}
