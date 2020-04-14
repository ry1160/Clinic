package cn.project.service.templateService;


import cn.project.entity.Template;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface TemplateService {
    PageInfo<Template> getAllTemplate(Map<String, Object> map);
}
