package Bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class ExampleBean {

    public ExampleBean(){
        System.out.println("实例化ExampleBean");
    }


    public void init(){
        System.out.println("初始化ExampleBean");
    }

    public void destroy(){
        System.out.println("销毁ExampleBean");
    }
    public void execute(){
        System.out.println("执行ExampleBean");
    }
}
