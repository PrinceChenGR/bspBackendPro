//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.bsppro.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;

import java.util.Map;

@ApiModel(
        description = "查询条件"
)
public class QueryUtil {

    public static <T> Page<T> GetPage(Map<String, Object> query) {
        int page = 0;
        int size = 100;
        if (query.containsKey("page")) page = (int) query.get("page");
        if (query.containsKey("size")) size = (int) query.get("size");
        return new Page<T>(page, size);
    }
}
