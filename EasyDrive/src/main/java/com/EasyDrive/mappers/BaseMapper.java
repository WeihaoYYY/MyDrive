package com.EasyDrive.mappers;

import org.apache.ibatis.annotations.Param;
import java.util.List;

interface BaseMapper<T, P> {

	// Insert
	Integer insert(@Param("bean") T t);

	// Insert or update
	Integer insertOrUpdate(@Param("bean") T t);

	// Batch insert
	Integer insertBatch(@Param("list") List<T> list);

	// Batch insert or update
	Integer insertOrUpdateBatch(@Param("list") List<T> list);

	// Select list by parameters
	List<T> selectList(@Param("query") P p);

	// Select count by parameters
	Integer selectCount(@Param("query") P p);
}
