package com.rls.base.common.manager;

import java.util.List;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: ${file_name}
 * @Description : ${todo}
 * @date ：2018/3/25 17:56
 */
public interface RbaseManager<T> {

    /**
     * 查询
     *
     * @param entity
     * @return
     */
    T selectOne(T entity);

    /**
     * 通过Id查询
     *
     * @param id
     * @return
     */
    T selectById(Object id);

    /**
     * 查询列表
     *
     * @param entity
     * @return
     */
    List<T> selectList(T entity);

    /**
     * 获取所有对象
     *
     * @return
     */
    List<T> selectListAll();

    /**
     * 查询总记录数
     *
     * @param entity
     * @return
     */
    Long selectCount(T entity);

    /**
     * 添加
     *
     * @param entity
     */
    void insert(T entity);


    /**
     * 插入 不插入null字段
     *
     * @param entity
     */
    void insertSelective(T entity);

    /**
     * 删除
     *
     * @param entity
     */
    void delete(T entity);

    /**
     * 根据Id删除
     *
     * @param id
     */
    void deleteById(Object id);

    /**
     * 根据id更新
     *
     * @param entity
     */
    void updateById(T entity);

    /**
     * 不update null
     *
     * @param entity
     */
    void updateSelectiveById(T entity);
}
