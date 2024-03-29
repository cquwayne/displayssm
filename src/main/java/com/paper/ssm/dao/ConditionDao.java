package com.paper.ssm.dao;

import com.paper.ssm.entity.Condition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Condition)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-21 15:28:12
 */
@Mapper
public interface ConditionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    Condition queryById(Integer cId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Condition> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
//     * @param condition 实例对象
     * @return 对象列表
     */
//    List<Condition> queryAll(Condition condition);
    List<Condition> queryAll();

    /**
     * 新增数据
     *
     * @param condition 实例对象
     * @return 影响行数
     */
    int insert(Condition condition);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Condition> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Condition> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Condition> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Condition> entities);

    /**
     * 修改数据
     *
     * @param condition 实例对象
     * @return 影响行数
     */
    int update(Condition condition);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 影响行数
     */
    int deleteById(Integer cId);

}