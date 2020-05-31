package com.example.consumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired(required = false)
    private FeignClientService feignClientService;

    @RequestMapping("/api/v1/demo/get")
    public String consumer(){
//       　交给消费者处理
        return feignClientService.consumer();
    }

}
