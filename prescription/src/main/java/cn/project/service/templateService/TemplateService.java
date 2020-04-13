package cn.project.service.templateService;

import cn.project.entity.Template;

import java.util.List;
import java.util.Map;

public interface TemplateService {
    List<Template> getAllTemplate(Map<String,Object> map);
}
