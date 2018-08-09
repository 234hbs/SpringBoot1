package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Advertisement;
import cn.edu.jxufe.service.AdvertisementService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RespectBinding;
import java.util.List;

/**
 * Created by 29079 on 2018/8/7.
 */

@Controller

public class PageController {
    @Autowired
    private AdvertisementService advertisementService;

    @RequestMapping("page/{page}")
    public String pageCheck(@PathVariable("page")String page){
      return page;
    }

}
