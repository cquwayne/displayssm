package com.paper.ssm.dao;

import com.paper.ssm.entity.AttributeMetadata;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (AttributeMetadata)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-29 20:53:29
 */
@Mapper
public interface AttributeMetadataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AttributeMetadata queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AttributeMetadata> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param attributeMetadata 实例对象
     * @return 对象列表
     */
    List<AttributeMetadata> queryAll(AttributeMetadata attributeMetadata);

    /**
     * 新增数据
     *
     * @param attributeMetadata 实例对象
     * @return 影响行数
     */
    int insert(AttributeMetadata attributeMetadata);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AttributeMetadata> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AttributeMetadata> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AttributeMetadata> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AttributeMetadata> entities);

    /**
     * 修改数据
     *
     * @param attributeMetadata 实例对象
     * @return 影响行数
     */
    int update(AttributeMetadata attributeMetadata);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}