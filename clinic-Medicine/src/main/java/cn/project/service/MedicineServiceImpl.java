package cn.project.service;

import cn.project.entity.CheckItem;
import cn.project.entity.CheckItemType;
import cn.project.entity.Medicine;
import cn.project.entity.MedicineType;
import cn.project.mapper.MedicineMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MedicineServiceImpl implements MedicineService {
    @Resource
    MedicineMapper medicineMapper;
    @Override
    public List<MedicineType> getAllMedicineType() {
        return medicineMapper.getAllMedicineType();
    }

    @Override
    public List<CheckItemType> getAllCheckItemType() {
        return medicineMapper.getAllCheckItemType();
    }

    @Override
    public PageInfo<Medicine> getAllMedicine(Integer prescriptionTypeId,Integer medicineTypeId, String nameOrPinYin,Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Medicine> list = medicineMapper.getAllMedicine(prescriptionTypeId,medicineTypeId,nameOrPinYin);
        System.out.println(list);
        PageInfo<Medicine> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<CheckItem> getAllCheckItem(Integer itemTypeId, String nameOrPinYin,Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<CheckItem> list = medicineMapper.getAllCheckItem(itemTypeId,nameOrPinYin);
        PageInfo<CheckItem> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
