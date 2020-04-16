package cn.project.mapper.medicalAdviceMapper;

import cn.project.entity.MedicalAdvice;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
@CacheConfig(cacheNames = "c1")
public interface MedicalAdviceMapper {
    @Cacheable(key = "targetClass+':'+methodName")
    List<MedicalAdvice> getAllMedicalAdvice();
}
