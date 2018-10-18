package com.forezp.helloworld;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication


public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
//    @GetMapping("/hi")
//    public String hi(){
//        return "hi,I'm forefzvvp!!!！";
//    }
//@RestController
//    public class HelloController{
//      @GetMapping("/hello")
//      public String index(){
//        return "fsdf!!！";
//      }
//    }
//    @Component
//    public  class MailServiceImpl implements MailService{
//        private final Logger logger =
//                LoggerFactory.getLogger(this.getClass());
//        @Autowired
//        private JavaMailSender mailSender;
//        @Value("${spring.mail.username}")
//        private String from;
//        @Override
//        public  void sendSimpleMail(String to,String subject,String content){
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setFrom(from);
//            message.setTo(to);
//            message.setSubject(subject);
//            message.setText(content);
//            try{
//                mailSender.send(message);
//                logger.info("简单邮件已经发送。")；
//            }catch (Exception e){
//                logger.error("发送简单邮件时发生异常！"，e);
//            }
//        }
//    }
    @ConfigurationProperties(prefix = "my")
    @Component
    public  class ConfigBean{
        private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;
    }
    @RestController
    @EnableConfigurationProperties({ConfigBean.class})
    public class LucyController {
        @Autowired
        ConfigBean configBean;
        @RequestMapping(value = "/lucy")
        public String miya(){
            return "ok";
        }


    }

}
