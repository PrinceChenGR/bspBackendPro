package com.example.bsppro.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.bsppro.entity.Cartypes;
import com.example.bsppro.service.CartypesService;
import com.example.bsppro.utils.QueryUtil;
import com.example.bsppro.utils.Response;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
@RestController
@Log4j2
@RequestMapping("/cartypes")
public class CartypesController {

    @Autowired
    public CartypesService cartypesService;

    @GetMapping("")
    public Response<IPage<Cartypes>> list(@RequestParam Map<String, Object> param) {
        log.info("cartypes");
        IPage<Cartypes> pages = cartypesService.list(QueryUtil.GetPage(param), param);
        return Response.ok(pages);
    }

    @GetMapping("/{id}")
    public Response<Cartypes> where(@PathVariable Long id) {
        log.info("cartypes/" + id);
        Cartypes cartypes = cartypesService.getById(id);
        return Response.ok(cartypes);
    }

    @PutMapping()
    public Response<Boolean> update(@RequestBody Cartypes cartypes) {
        log.info("cartypes");
        cartypesService.update(cartypes);
        return Response.ok(true);
    }

    @PostMapping("")
    public Response<Boolean> create(@RequestBody Cartypes cartypes) {
        log.info("cartypes");
        cartypesService.create(cartypes);
        return Response.ok(true);
    }

    @DeleteMapping("/{id}")
    public Response<Boolean> delete(@PathVariable Long id) {
        log.info("cartypes/"+id);
        cartypesService.removeById(id);
        return Response.ok(true);
    }

}
