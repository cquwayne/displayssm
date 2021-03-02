package com.paper.ssm.dao;

import com.paper.ssm.entity.ModelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ModelEntity)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-29 11:23:44
 */
@Mapper
public interface ModelEntityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ModelEntity queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ModelEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param modelEntity 实例对象
     * @return 对象列表
     */
    List<ModelEntity> queryAll(ModelEntity modelEntity);

    /**
     * 新增数据
     *
     * @param modelEntity 实例对象
     * @return 影响行数
     */
    int insert(ModelEntity modelEntity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ModelEntity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ModelEntity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ModelEntity> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ModelEntity> entities);

    /**
     * 修改数据
     *
     * @param modelEntity 实例对象
     * @return 影响行数
     */
    int update(ModelEntity modelEntity);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById(String id);

}