package com.example.myftctest.testcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName :   ftcsmall
 * @ClassName :   MyTestController
 * @Description :   TODO
 * @Authoe :   gq544
 * @Date :  2019-07-17  15:17
 * @Version :   此类
 */

@RestController
public class MyTestController {
    @RequestMapping("/test")
    public String getit(){
        return  "hello world!";
    }

    @RequestMapping("/testjson")
    public String returnjson(){


        return "";
    }
}
