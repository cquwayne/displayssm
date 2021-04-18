package com.paper.ssm.dao;

import com.paper.ssm.entity.Petri;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Petri)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-21 16:12:53
 */
@Mapper
public interface PetriDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    Petri queryById(Integer pId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Petri> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
//     * @param petri 实例对象
     * @return 对象列表
     */
    List<Petri> queryAll();
//    List<Petri> queryAll(Petri petri);

    /**
     * 新增数据
     *
     * @param petri 实例对象
     * @return 影响行数
     */
    int insert(Petri petri);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Petri> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Petri> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Petri> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Petri> entities);

    /**
     * 修改数据
     *
     * @param petri 实例对象
     * @return 影响行数
     */
    int update(Petri petri);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 影响行数
     */
    int deleteById(Integer pId);

}