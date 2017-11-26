package c_d_e_f_cardsWithPower;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomEnumAnnotation {
    String type() default "Enumeration";

    String description();

    String category();


}
