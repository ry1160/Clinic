package cn.project.controller;

import cn.project.utils.HttpClientHelper;
import cn.project.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "负责调用处方接口")
@RequestMapping("api")
public class APIPrescriptionController {
    @Resource
    HttpClientHelper httpClientHelper;

    @GetMapping("/getPrescriptionType")
    @ApiOperation(value = "负责调用基本数据模块中的处方控制器(获得所有处方类型)")
    public Response getPrescriptionType(){
        return httpClientHelper.get("http://localhost:8082/prescription/getAllPrescriptionType");
    }
}