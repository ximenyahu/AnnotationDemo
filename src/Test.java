import java.lang.annotation.*;

/**
 * created by Simon on 2020/12/12 14:03
 */

@MyAnnotation
public class Test {

    @MyAnnotation
    public static void main(String[] args) {

    }

    @MyAnnotation2(name = "Simon")
    public static void justTest() {

    }

    @MyAnnotation3("Simon")
    public void onlyTest() {

    }
}

@Target(value = {ElementType.METHOD, ElementType.TYPE}) //注释的使用范围
@Retention(value = RetentionPolicy.SOURCE) //注解的生命周期
//runtime > class > source
@Documented //表示我们的注释是否生成在JAVA doc中
@Inherited
        //子类可以继承父类的注解
@interface MyAnnotation {

}


@Target(value = {ElementType.METHOD, ElementType.TYPE})
@interface MyAnnotation2 {
    String name() default "";
}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotation3 {
    String value(); //当仅有一个时，且命名为value，那么使用的时候可以直接赋值
}
