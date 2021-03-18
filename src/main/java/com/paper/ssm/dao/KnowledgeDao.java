package com.paper.ssm.dao;

import com.paper.ssm.entity.Knowledge;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Knowledge)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-18 00:27:55
 */
@Mapper
public interface KnowledgeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Knowledge queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Knowledge> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param knowledge 实例对象
     * @return 对象列表
     */
//    List<Knowledge> queryAll(Knowledge knowledge);

    List<Knowledge> queryAll();

    /**
     * 新增数据
     *
     * @param knowledge 实例对象
     * @return 影响行数
     */
    int insert(Knowledge knowledge);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Knowledge> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Knowledge> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Knowledge> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Knowledge> entities);

    /**
     * 修改数据
     *
     * @param knowledge 实例对象
     * @return 影响行数
     */
    int update(Knowledge knowledge);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}