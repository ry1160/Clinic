package cn.project.service.DiagnosisTypeService;

import cn.project.entity.DiagnosisType;
import cn.project.mapper.diagnosisTypeMapper.DiagnosisTypeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DiagnosisTypeServiceImpl implements DiagnosisTypeService {
    @Resource
    DiagnosisTypeMapper diagnosisTypeMapper;
    @Override
    public List<DiagnosisType> getAllDiagnosisType() {
        return diagnosisTypeMapper.getAllDiagnosisType();
    }
}
