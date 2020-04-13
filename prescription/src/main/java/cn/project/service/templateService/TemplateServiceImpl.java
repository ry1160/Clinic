package cn.project.service.templateService;

import cn.project.entity.Template;
import cn.project.mapper.templateMapper.TemplateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class TemplateServiceImpl implements TemplateService {
    @Resource
    TemplateMapper templateMapper;
    @Override
    public List<Template> getAllTemplate(Map<String, Object> map) {
        return templateMapper.getAllTemplate(map);
    }
}
