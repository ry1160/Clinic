package cn.project.service.patientService;

import cn.project.entity.Patient;
import cn.project.mapper.patientMapper.PatientMapper;
import cn.project.utils.Response;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PatientServiceImpl implements PatientService {
    @Resource
    PatientMapper patientMapper;
    @Override
    public Patient getPatientById(Integer id) {
        return patientMapper.getPatientById(id);
    }
}
