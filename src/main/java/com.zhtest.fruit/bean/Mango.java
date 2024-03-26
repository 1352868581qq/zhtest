package com.zhtest.fruit.bean;

import java.math.BigDecimal;

/**
 * @author duza
 * @create 2024 - 03 - 26 8:37
 */
public class Mango extends Fruit{
    private static final BigDecimal price = new BigDecimal(20);

    public Mango(Integer weight) {
        super(price, weight);
    }

    public Mango(Integer weight, BigDecimal promotionPrice) {
        super(price,weight,promotionPrice);
    }


}
