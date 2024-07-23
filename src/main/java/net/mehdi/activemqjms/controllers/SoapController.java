package net.mehdi.activemqjms.controllers;

import net.mehdi.activemqjms.services.SoapClientResService;
import net.mehdi.activemqjms.services.SoapClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {

    @Autowired
    private SoapClientService soapClientService;
    @Autowired
    private SoapClientResService soapClientResService;

    @GetMapping("/sendSoapRequest")
    public String sendSoapRequest(@RequestParam String xmlFilePath, @RequestParam String url) {
        try {
            return soapClientService.sendSoapRequest(xmlFilePath, url);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
    @GetMapping("/sendSoapResp")
    public String sendSoapResp(@RequestParam String xmlFilePath, @RequestParam String url) {
        try {
            return soapClientResService.sendSoapRequest(xmlFilePath, url);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}

