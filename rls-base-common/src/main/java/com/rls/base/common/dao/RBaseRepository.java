package com.rls.base.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

/**
 * @author ：lz
 * @version ： 1.0
 * @Title: 这里使用spring data jpa 的基类
 *      PagingAndSortingRepository/JpaSpecificationExecutor
 * @Description : ${todo}
 * @date ：2018/3/25 17:56
 */
public interface RBaseRepository<T> extends JpaRepository<T, Long>,
        JpaSpecificationExecutor<T>{

}
