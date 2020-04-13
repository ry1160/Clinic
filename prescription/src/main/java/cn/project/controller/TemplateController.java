package cn.project.controller;

import cn.project.service.templateService.TemplateService;
import cn.project.utils.HttpRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@Api(value = "处方模板控制器")
@RestController
@RequestMapping("/template")
public class TemplateController {
    @Resource
    TemplateService templateService;
    @ApiOperation(value = "获取所有模板",notes = "根据处方类别、处方权限、模板编码/模板名称来筛选模板并进行分页显示")
    @GetMapping("/getAllTemplate")
    public HttpRequest getAllTemplate(Integer pageNo,Integer pageSize,Integer prescriptionTypeId,Integer templatePermission,String templateNoOrName){
        Map<String,Object> map = new HashMap<>();
        map.put("pageNo",(pageNo-1)*pageSize);
        map.put("pageSize",pageSize);
        map.put("prescriptionTypeId",prescriptionTypeId);
        map.put("templatePermission",templatePermission);
        map.put("templateNoOrName",templateNoOrName);
        return HttpRequest.ok("获取模板成功",templateService.getAllTemplate(map));
    }
}
