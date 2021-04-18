package com.paper.ssm.dao;

import com.paper.ssm.entity.Material;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 基础表_基础物料表(Material)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-18 20:31:58
 */
@Mapper
public interface MaterialDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Material queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Material> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Material> queryAll();

    /**
     * 新增数据
     *
     * @param material 实例对象
     * @return 影响行数
     */
    int insert(Material material);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Material> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Material> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Material> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Material> entities);

    /**
     * 修改数据
     *
     * @param material 实例对象
     * @return 影响行数
     */
    int update(Material material);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}