package com.zhtest.fruit.bean;

import java.math.BigDecimal;

/**
 * @author duza
 * @create 2024 - 03 - 26 8:37
 */
public class Apple extends Fruit{

    private static final BigDecimal price = new BigDecimal(12);

    public Apple(Integer weight) {
        super(price,weight);
    }
    public Apple(Integer weight, BigDecimal promotionPrice) {
        super(price,weight,promotionPrice);
    }


}
