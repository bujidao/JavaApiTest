package com.example.apitest.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.apitest.domain.Doctor;
import com.example.apitest.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Doctor)表控制层
 *
 * @author makejava
 * @since 2021-07-06 13:33:18
 */
@RestController
@RequestMapping("doctor")
public class DoctorController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private DoctorService doctorService;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param doctor 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Doctor> page, Doctor doctor) {
        return success(this.doctorService.page(page, new QueryWrapper<>(doctor)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.doctorService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param doctor 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Doctor doctor) {
        return success(this.doctorService.save(doctor));
    }

    /**
     * 修改数据
     *
     * @param doctor 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Doctor doctor) {
        return success(this.doctorService.updateById(doctor));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.doctorService.removeByIds(idList));
    }
}
