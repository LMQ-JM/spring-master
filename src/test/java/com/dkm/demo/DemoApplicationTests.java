package com.dkm.demo;

import com.dkm.demo.common.utils.FilesUtils;
import com.dkm.demo.common.utils.QrCodeUtils;
import com.dkm.demo.common.utils.TimeLimit;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() throws IOException {
      /*  File file=new File("D:/二维码.png");
        String con="https://blog.csdn.net/qq_41251714";
        QrCodeUtils qrCodeUtils=new QrCodeUtils();
        qrCodeUtils.generateQrCodeImage(con,"D:/二维码.png");*/
        TimeLimit timeLimit=new TimeLimit();
        boolean b = TimeLimit.TackBackLimit(1l, 0);
        System.out.println(b);
        //FilesUtils filesUtils=new FilesUtils();

    }

}
