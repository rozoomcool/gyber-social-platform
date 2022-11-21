package security;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserDataSecurity {
    @Bean(initMethod = "init", destroyMethod = "destroy")

    public void init() {
        System.out.println("this is init method1");
    }

    public void destroy() {
        System.out.println("this is destroy method1");
    }

    public int hashSHA1(){
        return 0;
    }
    public int hashSHA256(){
        return 0;
    }
    public int hashAES256(){
        return 0;
    }
}
