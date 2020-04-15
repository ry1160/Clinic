package cn.project.service.MedicalAdviceService;

import cn.project.entity.MedicalAdvice;
import cn.project.mapper.MedicalAdviceMapper.MedicalAdviceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MedicalAdviceServiceImpl implements MedicalAdviceService {
    @Resource
    MedicalAdviceMapper medicalAdviceMapper;
    @Override
    public List<MedicalAdvice> getAllMedicalAdvice() {
        return medicalAdviceMapper.getAllMedicalAdvice();
    }
}
