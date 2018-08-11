package cn.edu.jxufe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 29079 on 2018/8/10.
 */
@Controller
public class SessionController {
        @RequestMapping("set")
        @ResponseBody
    public Object put(HttpSession session){
        //假设session 对象中存在次数
        Integer click=(Integer)session.getAttribute("count");
          if (click==null){
              click=new Integer(1);
          } else {
              click++;
          }
          session.setAttribute("count",click);
          return "总共刷新了"+click+"次";
    }


}

