package cn.project.mapper.additionalFees;

import cn.project.entity.AdditionalFees;
import cn.project.entity.Prescription_AdditionalFees;
import cn.project.utils.MyKeyGenerator;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.parameters.P;

import javax.annotation.Resource;
import java.util.List;
@CacheConfig(cacheNames = "c2")
public interface AdditionalFeesMapper {
    @Cacheable(key = "targetClass+':'+methodName")
    List<AdditionalFees> getAllAdditionalFees();
    int addAdditionalFees(@Param("p") Prescription_AdditionalFees prescription_additionalFees);
}
