package com.harutya.nasb.controller.api;

import com.harutya.nasb.controller.response.BaseResponse;
import com.harutya.nasb.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
@Api(value = "article", tags = "article manager")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping
    @ApiOperation(value = "get all articles",httpMethod = "GET")
    public BaseResponse<String> article(){
        return BaseResponse.success("Hello World","szg nmmmdl!");
    }
}
