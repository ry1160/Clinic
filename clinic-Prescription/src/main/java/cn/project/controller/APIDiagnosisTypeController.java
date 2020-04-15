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
@Api(tags = "负责调用诊断控制器")
@RequestMapping("api")
public class APIDiagnosisTypeController {
    @Resource
    HttpClientHelper httpClientHelper;

    @GetMapping("getAllDiagnosisType")
    @ApiOperation(value = "负责调用基础数据模块中的医嘱控制器(获取所有医嘱信息)")
    public Response getAllMedicalAdvice(){
        return httpClientHelper.get("http://localhost:8082/diagnosisType/getAllDiagnosisType");
    }
}
