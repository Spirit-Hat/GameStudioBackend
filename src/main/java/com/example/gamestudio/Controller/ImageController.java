package com.example.gamestudio.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/image")
public class ImageController {

    public List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
        add(new HashMap<String, String>() {{
            put("id", "1");
            put("text", "First Message");
        }});
        add(new HashMap<String, String>() {{
            put("id", "2");
            put("text", "2 Message");
        }});
        add(new HashMap<String, String>() {{
            put("id", "3");
            put("text", "3 Message");
        }});

    }};

    @GetMapping
    public List<Map<String, String>> list() {
        return this.messages;
    }


    @GetMapping("product")
    public int product() {
        return 5;
    }


    @PostMapping("/upload")
    public void uplaodImage(@RequestParam("image") MultipartFile file) throws IOException {
        System.out.println("huiehfiuhweiu");
        System.out.println(file.getBytes());
        System.out.println(file.getOriginalFilename());

    }

}
