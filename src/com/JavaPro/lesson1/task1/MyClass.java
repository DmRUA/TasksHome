package com.JavaPro.lesson1.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by DmRG on 23.02.2017.
 */
public class MyClass  {
    public static int sum;

    static {
        Class<?> cls = MyClass.class;
        try {
            Method method = cls.getDeclaredMethod("add", int.class, int.class );
            Test test = method.getAnnotation(Test.class);
            method.invoke(cls,test.a(), test.b());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static int getSum() {
        return sum;
    }

    @Test(a = 5, b = 5)
    public void add(int a, int b) {
        System.out.println(a + b);

    }
}
