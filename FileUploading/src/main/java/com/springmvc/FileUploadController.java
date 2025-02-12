package com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


@Controller
public class FileUploadController {

    @Autowired
    private  MultipartFile multipartFile;
    @RequestMapping("/fileForm")
    public String showUploadForm() {


        return "fileForm";

    }
    @RequestMapping(value = "/uploading", method = RequestMethod.POST)
    public String fileupload(@RequestParam("profile") MultipartFile file,  HttpSession s, Model m) throws IOException {
        System.out.println("file upload handler");
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());


        // There is no method getStorageDescription() in MultipartFile
        byte[] data = file.getBytes();
        String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator+
                "resource" + File.separator+"image" + File.separator+file.getOriginalFilename();


        System.out.println(path);
        try{
            FileOutputStream fos= new FileOutputStream(path);
            fos.write(data);
            fos.close();
            System.out.println("file uploaded");
            m.addAttribute("msg" ," uploaded Suceessfully");
m.addAttribute("filename" , file.getOriginalFilename());

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Uploading erro");
            m.addAttribute("msg" , " Uploading error");
        }
        return "filesuccess";
    }




//    @RequestMapping(value = "/uploading" , method = RequestMethod.POST)
//    public String fileupload(@RequestParam("profile") CommonsMultipartFile file) {
//        System.out.println("file upload handler");
//        System.out.println(file.getSize());
//        System.out.println(file.getContenType());
//        System.out.println(file.getOriginalFilename());
//        System.out.println(file.getStorageDescription());
//        return "filesuccess";
//
//    }
}
