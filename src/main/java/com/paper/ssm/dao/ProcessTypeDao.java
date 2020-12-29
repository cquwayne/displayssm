package com.paper.ssm.dao;

import com.paper.ssm.entity.ProcessType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ProcessType)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-29 20:53:29
 */
@Mapper
public interface ProcessTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProcessType queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProcessType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param processType 实例对象
     * @return 对象列表
     */
    List<ProcessType> queryAll(ProcessType processType);

    /**
     * 新增数据
     *
     * @param processType 实例对象
     * @return 影响行数
     */
    int insert(ProcessType processType);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProcessType> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProcessType> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProcessType> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ProcessType> entities);

    /**
     * 修改数据
     *
     * @param processType 实例对象
     * @return 影响行数
     */
    int update(ProcessType processType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}