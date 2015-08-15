package org.qindi.thinkinjava.ch14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ShowMethods {

    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("show all methods in class");
            System.exit(0);
        }
        
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] ctors = c.getConstructors();
            for(Method method : methods) {
                System.out.println(method.toString());
            }
            for(Constructor<?> ctor : ctors) {
                System.out.println(ctor.toString());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class:" + e);
        }
    }
}
