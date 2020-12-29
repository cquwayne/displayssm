package com.paper.ssm.dao;

import com.paper.ssm.entity.AttributeType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (AttributeType)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-29 20:53:28
 */
@Mapper
public interface AttributeTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AttributeType queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AttributeType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param attributeType 实例对象
     * @return 对象列表
     */
    List<AttributeType> queryAll(AttributeType attributeType);

    /**
     * 新增数据
     *
     * @param attributeType 实例对象
     * @return 影响行数
     */
    int insert(AttributeType attributeType);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AttributeType> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AttributeType> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AttributeType> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AttributeType> entities);

    /**
     * 修改数据
     *
     * @param attributeType 实例对象
     * @return 影响行数
     */
    int update(AttributeType attributeType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}