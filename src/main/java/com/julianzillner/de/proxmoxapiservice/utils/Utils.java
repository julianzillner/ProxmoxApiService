package com.julianzillner.de.proxmoxapiservice.utils;

import okhttp3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.cert.X509Certificate;

@RestController
@RequestMapping("api/")
public class Utils {


    @GetMapping("/login")
    void loginTest() throws Exception {
        //login(null, null);
    }

}
