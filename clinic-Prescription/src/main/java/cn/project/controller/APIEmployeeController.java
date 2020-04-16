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
@Api(tags = "负责调用员工控住器")
@RequestMapping("api")
public class APIEmployeeController {
    @Resource
    HttpClientHelper httpClientHelper;

    @GetMapping("/getAllEmployee")
    @ApiOperation(value = "负责调用基本数据模块中的员工控制器")
    public Response getAdditionalFees(Integer id){
        return httpClientHelper.get("http://localhost:8082/employee/getAllEmployee?id="+id);
    }
}
