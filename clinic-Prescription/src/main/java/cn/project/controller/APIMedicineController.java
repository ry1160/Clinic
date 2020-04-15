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
@RequestMapping("api")
@Api(tags = "负责调用药品控制器")
public class APIMedicineController {
    @Resource
    HttpClientHelper httpClientHelper;

    @ApiOperation(value = "负责调用基本数据模块中的药品控制器(根据条件查询所有药品并分页)")
    @GetMapping("getMedicine")
    public Response getMedicine(Integer prescriptionTypeId,Integer medicineTypeId,String nameOrPinYin,Integer pageNo,Integer pageSize){
        if(pageNo == null){
            pageNo = 1;
        }
        if(pageSize == null){
            pageSize = 2;
        }
        pageNo = (pageNo-1)*pageSize;
        StringBuffer buffer = new StringBuffer("?").append("pageNo=").append(pageNo).append("&pageSize=").append(pageSize);
        if(prescriptionTypeId!=null) {
            buffer.append("&prescriptionTypeId=").append(prescriptionTypeId);
        }
        if(medicineTypeId!=null) {
            buffer.append("&medicineTypeId=").append(medicineTypeId);
        }
        if(nameOrPinYin!=null) {
            buffer.append("&nameOrPinYin=").append(nameOrPinYin);
        }
        return httpClientHelper.get("http://localhost:8083/medicine/getMedicines"+buffer);
    }

    @GetMapping("getAllMedicineType")
    @ApiOperation(value = "负责调用基本数据模块中的药品控制器(根据条件查询所有药品类型)")
    public Response getAllMedicineType(Integer prescriptionTypeId){
        return httpClientHelper.get("http://localhost:8083/medicine/getMedicineType?prescriptionTypeId="+prescriptionTypeId);

    }

}
