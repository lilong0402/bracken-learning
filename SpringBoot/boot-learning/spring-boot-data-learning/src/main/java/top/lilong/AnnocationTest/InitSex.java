package top.lilong.AnnocationTest;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Inherited
public @interface InitSex {
    /**
     *
     */
    enum  SEX_TYPE {MAN,WOWAN}
    SEX_TYPE sex() default SEX_TYPE.MAN;
}
