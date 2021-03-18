package com.paper.ssm.dao;

import com.paper.ssm.entity.Envload;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Envload)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-18 00:27:59
 */
@Mapper
public interface EnvloadDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Envload queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Envload> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param envload 实例对象
     * @return 对象列表
     */
    List<Envload> queryAll(Envload envload);

    /**
     * 新增数据
     *
     * @param envload 实例对象
     * @return 影响行数
     */
    int insert(Envload envload);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Envload> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Envload> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Envload> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Envload> entities);

    /**
     * 修改数据
     *
     * @param envload 实例对象
     * @return 影响行数
     */
    int update(Envload envload);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}