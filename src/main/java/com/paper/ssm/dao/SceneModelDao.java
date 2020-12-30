package com.paper.ssm.dao;

import com.paper.ssm.entity.SceneModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SceneModel)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-29 20:53:30
 */
@Mapper
public interface SceneModelDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SceneModel queryById(Long id);

    SceneModel querySimpleById(Long id);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<SceneModel> queryAllData();


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<SceneModel> queryAll();

    /**
     * 新增数据
     *
     * @param sceneModel 实例对象
     * @return 影响行数
     */
    int insert(SceneModel sceneModel);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SceneModel> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SceneModel> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SceneModel> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SceneModel> entities);

    /**
     * 修改数据
     *
     * @param sceneModel 实例对象
     * @return 影响行数
     */
    int update(SceneModel sceneModel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}