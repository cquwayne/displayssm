package com.paper.ssm.dao;

import com.paper.ssm.entity.EntityElementData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (EntityElementData)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-29 16:05:07
 */
@Mapper
public interface EntityElementDataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param modelEntityId 主键
     * @return 实例对象
     */
    EntityElementData queryByModelEntityId(String modelEntityId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EntityElementData> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param entityElementData 实例对象
     * @return 对象列表
     */
    List<EntityElementData> queryAll(EntityElementData entityElementData);

    /**
     * 新增数据
     *
     * @param entityElementData 实例对象
     * @return 影响行数
     */
    int insert(EntityElementData entityElementData);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<EntityElementData> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<EntityElementData> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<EntityElementData> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<EntityElementData> entities);

    /**
     * 修改数据
     *
     * @param entityElementData 实例对象
     * @return 影响行数
     */
    int update(EntityElementData entityElementData);

    /**
     * 通过主键删除数据
     *
     * @param modelEntityId 主键
     * @return 影响行数
     */
    int deleteById(String modelEntityId);

}