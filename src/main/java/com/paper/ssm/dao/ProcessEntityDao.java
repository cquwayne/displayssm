package com.paper.ssm.dao;

import com.paper.ssm.entity.ProcessEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ProcessEntity)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-29 11:23:47
 */
@Mapper
public interface ProcessEntityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProcessEntity queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProcessEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param processEntity 实例对象
     * @return 对象列表
     */
    List<ProcessEntity> queryAll(ProcessEntity processEntity);

    /**
     * 新增数据
     *
     * @param processEntity 实例对象
     * @return 影响行数
     */
    int insert(ProcessEntity processEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProcessEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProcessEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProcessEntity> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ProcessEntity> entities);

    /**
     * 修改数据
     *
     * @param processEntity 实例对象
     * @return 影响行数
     */
    int update(ProcessEntity processEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}