package cn.project.mapper.additionalFees;

import cn.project.entity.AdditionalFees;
import cn.project.utils.MyKeyGenerator;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import javax.annotation.Resource;
import java.util.List;
@CacheConfig(cacheNames = "c1")
public interface AdditionalFeesMapper {
    @Cacheable(key = "targetClass+':'+methodName")
    List<AdditionalFees> getAllAdditionalFees();
}
