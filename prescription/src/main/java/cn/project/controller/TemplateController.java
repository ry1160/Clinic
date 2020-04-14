package cn.project.controller;

import cn.project.utils.HttpClientHelper;
import cn.project.utils.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class TemplateController {
    @Resource
    HttpClientHelper httpClientHelper;
    @GetMapping("/template")
    public Response template(Integer pageNo, Integer pageSize, Integer prescriptionTypeId, Integer templatePermission, String templateNoOrName){
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

}
