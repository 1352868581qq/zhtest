package com.zhtest.fruit;

import com.zhtest.fruit.bean.Apple;
import com.zhtest.fruit.bean.FullDiscount;
import com.zhtest.fruit.bean.Mango;
import com.zhtest.fruit.bean.Strawberry;

import java.math.BigDecimal;

/**
 * @author duza
 * @create 2024 - 03 - 26 8:49
 */
public class Test {
    public static void main(String[] args) {

        Apple apple = new Apple(12);
        Mango mango = new Mango(12);
        Strawberry strawberry = new Strawberry(12,new BigDecimal(0.8));
        System.out.println(apple.count());;
        System.out.println(strawberry.count());
        BigDecimal count = apple.count().add(mango.count().add(strawberry.count()));
        System.out.println(count);

        FullDiscount fullDiscount = new FullDiscount(new BigDecimal(100), new BigDecimal(10));
        BigDecimal discount = fullDiscount.FullDiscount(count);
        System.out.println(discount);

    }
}
