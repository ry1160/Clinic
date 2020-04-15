package cn.project.service.additionalFeesService;

import cn.project.entity.AdditionalFees;
import cn.project.mapper.additionalFees.AdditionalFeesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdditionalFeesServiceImpl implements AdditionalFeesService {
    @Resource
    AdditionalFeesMapper additionalFeesMapper;
    @Override
    public List<AdditionalFees> getAllAdditionalFees() {
        return additionalFeesMapper.getAllAdditionalFees();
    }
}
