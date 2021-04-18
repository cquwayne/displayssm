package com.paper.ssm.dao;

import com.paper.ssm.entity.Feature;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Feature)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-21 15:28:15
 */
@Mapper
public interface FeatureDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fId 主键
     * @return 实例对象
     */
    Feature queryById(Integer fId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Feature> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
//     * @param feature 实例对象
     * @return 对象列表
     */
//    List<Feature> queryAll(Feature feature);

    List<Feature> queryAll();

    /**
     * 新增数据
     *
     * @param feature 实例对象
     * @return 影响行数
     */
    int insert(Feature feature);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Feature> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Feature> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Feature> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Feature> entities);

    /**
     * 修改数据
     *
     * @param feature 实例对象
     * @return 影响行数
     */
    int update(Feature feature);

    /**
     * 通过主键删除数据
     *
     * @param fId 主键
     * @return 影响行数
     */
    int deleteById(Integer fId);

}