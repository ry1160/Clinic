package cn.project.controller;

import cn.project.service.DiagnosisTypeService.DiagnosisTypeService;
import cn.project.utils.Response;
import cn.project.utils.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "诊断类型控制器")
@RequestMapping("diagnosisType")
public class DiagnosisTypeController {
    @Resource
    DiagnosisTypeService diagnosisTypeService;

    @GetMapping("getAllDiagnosisType")
    @ApiOperation(value = "获取所有诊断类型")
    public Response getAllDiagnosisType(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(diagnosisTypeService);
    }
}
