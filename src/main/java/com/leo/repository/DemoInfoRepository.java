package com.leo.repository;

import org.springframework.data.repository.CrudRepository;

import com.leo.bean.DemoInfo;
 
/**
 * DemoInfo持久化类
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {
 
}
