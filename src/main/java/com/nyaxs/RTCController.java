package com.nyaxs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RTCController {

    @GetMapping("/live")
    public String live(){
        return "live";
    }

    @GetMapping("/rtc")
    public String rtc(){
        return "rtc";
    }
}
