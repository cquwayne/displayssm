package com.paper.ssm.dao;

import com.paper.ssm.entity.Element;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Element)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-29 20:53:27
 */
@Mapper
public interface ElementDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Element queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Element> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param element 实例对象
     * @return 对象列表
     */
    List<Element> queryAll(Element element);

    /**
     * 新增数据
     *
     * @param element 实例对象
     * @return 影响行数
     */
    int insert(Element element);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Element> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Element> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Element> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Element> entities);

    /**
     * 修改数据
     *
     * @param element 实例对象
     * @return 影响行数
     */
    int update(Element element);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}