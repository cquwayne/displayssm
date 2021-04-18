package com.paper.ssm.dao;

import com.paper.ssm.entity.Node;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Node)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-16 19:41:20
 */
@Mapper
public interface NodeDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Node queryById(String id);

    List<Node> queryBySceneDataId(String sceneDataId);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Node> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param node 实例对象
     * @return 对象列表
     */
    List<Node> queryAll(Node node);

    /**
     * 新增数据
     *
     * @param node 实例对象
     * @return 影响行数
     */
    int insert(Node node);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Node> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Node> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Node> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Node> entities);

    /**
     * 修改数据
     *
     * @param node 实例对象
     * @return 影响行数
     */
    int update(Node node);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteBySceneDataId(String sceneDataId);

}