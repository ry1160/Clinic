package cn.project.mapper;

import cn.project.entity.CheckItem;
import cn.project.entity.CheckItemType;
import cn.project.entity.Medicine;
import cn.project.entity.MedicineType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineMapper {
    List<MedicineType> getAllMedicineType();
    List<CheckItemType> getAllCheckItemType();
    List<Medicine> getAllMedicine(@Param("prescriptionTypeId")Integer prescriptionTypeId, @Param("medicineTypeId") Integer medicineTypeId, @Param("nameOrPinYin") String nameOrPinYin);
    List<CheckItem> getAllCheckItem(@Param("itemTypeId") Integer itemTypeId, @Param("nameOrPinYin") String nameOrPinYin);
}
