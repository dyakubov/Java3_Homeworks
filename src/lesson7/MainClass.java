package lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class MainClass {


    public static void start(Object object) throws InvocationTargetException, IllegalAccessException {
        Class clazz = object.getClass();
        List<Method> testCases = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++){
            for (int k = 1; k < methods.length; k++){
                if (methods[i].isAnnotationPresent(BeforeSuite.class) && methods[k].isAnnotationPresent(BeforeSuite.class)){
                    throw new RuntimeException("More then 1 Before/After method");
                }
            }

        }

        for (Method m : clazz.getDeclaredMethods()){
            if (m.isAnnotationPresent(BeforeSuite.class)){
                m.invoke(object);
            } else if (m.isAnnotationPresent(Test.class)){
                testCases.add(m);
            }
        }


        Collections.sort(testCases, new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                if (o1.getAnnotation(Test.class).priority() > o2.getAnnotation(Test.class).priority()){
                    return 1;
                } else return -1;
            }
        });

        for (Method m : testCases){
            m.invoke(object);
        }


        for (Method m : clazz.getDeclaredMethods()){
            if (m.isAnnotationPresent(AfterSuite.class)){
                m.invoke(object);
            }
        }

    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TestClass testClass = new TestClass();
        start(testClass);
    }
}
