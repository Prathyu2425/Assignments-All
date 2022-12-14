package com.Annotations;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info {
    int AuthorId();

    String Date();

    String Time();

    double Version();
}

@info(AuthorId=123,Date="01-nov-2022", Time="12:00",Version=1.0)
 class Developer {
    int size;
    String Date;
    String Time;
    Double Version;

    public Developer(int size, String date, String time, double version) {
        this.size = size;
        this.Date = date;
        this.Time = time;
        this.Version = version;

    }
}

public class Annotation2 {
    public static void main(String args[])
    {
        Developer n=new Developer(123, "01-nov-2022", "12:00", 1.0);
                Class c1=n.getClass();
        Annotation o=c1.getAnnotation(info.class);
        info s=(info)o;
        System.out.println(s.AuthorId());
        System.out.println(s.Date());
        System.out.println(s.Time());
        System.out.println(s.Version());

    }
}
