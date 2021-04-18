package com.paper.ssm.dao;

import com.paper.ssm.entity.Energy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基础表_基础能源表(Energy)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-18 20:31:55
 */
@Mapper
public interface EnergyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Energy queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Energy> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Energy> queryAll();

    /**
     * 新增数据
     *
     * @param energy 实例对象
     * @return 影响行数
     */
    int insert(Energy energy);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Energy> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Energy> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Energy> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Energy> entities);

    /**
     * 修改数据
     *
     * @param energy 实例对象
     * @return 影响行数
     */
    int update(Energy energy);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}