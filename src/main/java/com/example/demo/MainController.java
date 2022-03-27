package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/loadFile")
    @ResponseBody
    public Object loadFile(
    ) {
        return LoadFiles.loadFiles();
    }

    @RequestMapping("/saveFile")
    @ResponseBody
    public Object saveFile(
    ) {
        return LoadFiles.saveFiles();
    }
}
