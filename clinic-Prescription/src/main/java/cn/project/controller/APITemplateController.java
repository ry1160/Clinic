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
@Api(tags = "负责调用模板接口")
@RequestMapping("/api")
public class APITemplateController {
    @Resource
    HttpClientHelper httpClientHelper;
    @ApiOperation(value = "负责调用基本数据模块中的模板控制器(根据条件查询所有模板并分页)")
    @GetMapping("/getAllTemplate")
    public Response getAllTemplate(Integer pageNo, Integer pageSize, Integer prescriptionTypeId, Integer templatePermission, String templateNoOrName){
        if(pageNo == null) pageNo = 1;
        if(pageSize == null) pageSize = 3;
        StringBuffer buffer = new StringBuffer("?").append("pageNo=").append(pageNo).append("&pageSize=").append(pageSize);
        if(prescriptionTypeId!=null) {
            buffer.append("&prescriptionTypeId=").append(prescriptionTypeId);
        }
        if(templatePermission!=null) {
            buffer.append("&templatePermission=").append("templatePermission");
        }
        if(templateNoOrName!=null) {
            buffer.append("&templateNoOrName=").append("templateNoOrName");
        }
        return httpClientHelper.get("http://localhost:8082/template/getAllTemplate"+buffer);
    }

    @GetMapping("/getTemplateDetails")
    @ApiOperation(value = "负责调用基本数据模块中的模板控制器(根据模板ID获取模板下的处方详情)")
    public Response getTemplateDetails(Integer id){
        return httpClientHelper.get("http://localhost:8082/template/"+id);
    }

}
