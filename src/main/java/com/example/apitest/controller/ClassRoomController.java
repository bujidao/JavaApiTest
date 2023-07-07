package com.example.apitest.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.apitest.entity.ClassRoom;
import com.example.apitest.service.ClassRoomService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ClassRoom)表控制层
 *
 * @author makejava
 * @since 2021-07-06 15:12:04
 */
@RestController
@RequestMapping("classRoom")
public class ClassRoomController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ClassRoomService classRoomService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param classRoom 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ClassRoom> page, ClassRoom classRoom) {
        return success(this.classRoomService.page(page, new QueryWrapper<>(classRoom)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.classRoomService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param classRoom 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ClassRoom classRoom) {
        return success(this.classRoomService.save(classRoom));
    }

    /**
     * 修改数据
     *
     * @param classRoom 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ClassRoom classRoom) {
        return success(this.classRoomService.updateById(classRoom));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.classRoomService.removeByIds(idList));
    }
}
