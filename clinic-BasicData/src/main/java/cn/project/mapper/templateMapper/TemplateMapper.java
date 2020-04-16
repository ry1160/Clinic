package cn.project.mapper.templateMapper;


import cn.project.entity.PrescriptionMedicineC;
import cn.project.entity.PrescriptionMedicineX;
import cn.project.entity.PrescriptionMedicineZ;
import cn.project.entity.Template;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;
@CacheConfig(cacheNames = "c1")
public interface TemplateMapper {
    @Cacheable
    List<Template> getAllTemplate(Map<String, Object> map);
    @Cacheable
    Template getTemplateById(Integer id);
    @Cacheable
    List<PrescriptionMedicineX> getPrescriptionMedicineX(Integer templateId);
    @Cacheable
    List<PrescriptionMedicineZ> getPrescriptionMedicineZ(Integer templateId);
    @Cacheable
    List<PrescriptionMedicineC> getPrescriptionMedicineC(Integer templateId);


}
