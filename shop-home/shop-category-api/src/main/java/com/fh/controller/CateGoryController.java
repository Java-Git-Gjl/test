package com.fh.controller;

import com.fh.service.CateGoryService;
import com.fh.utils.ResponseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("categorys")
@CrossOrigin(maxAge = 4500, origins = "http://localhost:8080")
public class CateGoryController {
    @Autowired
    private CateGoryService cateGoryService;

    @Autowired
    /*private RedisService redisService;*/
    /**
     * 查询所有的类别的数据
     *
     * @return
     */
    @GetMapping
    public ResponseServer queryCategoryList() {
        List<Map<String, Object>> maps = cateGoryService.queryCategoryList();
        return ResponseServer.success(maps);

    }


}
