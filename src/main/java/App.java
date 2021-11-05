import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat =
                (Cat) applicationContext.getBean("cat");
        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        boolean compareHello = bean == bean1;
        boolean compareCat = cat == cat1;
        System.out.println("HelloWorld должно вернуться " + compareHello);
        System.out.println(bean1.getMessage());
        System.out.println(bean.getMessage());
        System.out.println("Cat должно вернуться " + compareCat);
        System.out.println(cat.getMessage());
        System.out.println(cat1.getMessage());
    }
}