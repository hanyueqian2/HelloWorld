package com.idea.helloworld;

import com.idea.bean.Customer;

import java.util.Date;

public class HelloWorld {

    private static final Customer customer = new Customer();

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toLocaleString());
        System.out.println("你好世界");

    }

//    @Test
    public void test1(){
        System.out.println("hello");
    }
}
