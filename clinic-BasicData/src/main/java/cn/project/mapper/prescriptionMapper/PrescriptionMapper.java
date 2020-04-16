package cn.project.mapper.prescriptionMapper;

import cn.project.entity.PrescriptionType;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
public interface PrescriptionMapper {
    List<PrescriptionType> getAllPrescriptionType();
}
