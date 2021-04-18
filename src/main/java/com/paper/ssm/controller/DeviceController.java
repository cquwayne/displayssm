package com.paper.ssm.controller;

import com.paper.ssm.dao.DeviceDao;
import com.paper.ssm.entity.Device;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 基础表_基础设备表(Device)表控制层
 *
 * @author makejava
 * @since 2021-04-18 20:31:55
 */
@CrossOrigin
@RestController
@RequestMapping("device")
public class DeviceController {
    /**
     * 服务对象
     */
    @Resource
    private DeviceDao deviceDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Device selectOne(Integer id) {
        return this.deviceDao.queryById(id);
    }

    @GetMapping("list")
    public List<Device> selectAll() {
        return this.deviceDao.queryAll();
    }

}