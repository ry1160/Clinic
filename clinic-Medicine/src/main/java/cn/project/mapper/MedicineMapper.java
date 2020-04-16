package cn.project.mapper;

import cn.project.entity.CheckItem;
import cn.project.entity.CheckItemType;
import cn.project.entity.Medicine;
import cn.project.entity.MedicineType;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
@CacheConfig(cacheNames = "c1")
public interface MedicineMapper {
    @Cacheable(key = "targetClass+':'+methodName")
    List<MedicineType> getAllMedicineType();
    @Cacheable(key = "targetClass+':'+methodName")
    List<CheckItemType> getAllCheckItemType();
    @Cacheable(key = "targetClass+':'+methodName+':'+ # prescriptionTypeId + # medicineTypeId")
    List<Medicine> getAllMedicine(@Param("prescriptionTypeId")Integer prescriptionTypeId, @Param("medicineTypeId") Integer medicineTypeId, @Param("nameOrPinYin") String nameOrPinYin);
    @Cacheable(key = "targetClass+':'+methodName+':'+ # itemTypeId + # nameOrPinYin")
    List<CheckItem> getAllCheckItem(@Param("itemTypeId") Integer itemTypeId, @Param("nameOrPinYin") String nameOrPinYin);
}
