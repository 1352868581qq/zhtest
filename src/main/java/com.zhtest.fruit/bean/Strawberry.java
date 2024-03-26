package com.zhtest.fruit.bean;

import java.math.BigDecimal;

/**
 * @author duza
 * @create 2024 - 03 - 26 8:37
 */
public class Strawberry extends Fruit{
    private static final BigDecimal price = new BigDecimal(13);
    public Strawberry(Integer weight) {
        super(price,weight);
    }
    public Strawberry(Integer weight, BigDecimal promotionPrice) {
        super(price,weight,promotionPrice);
    }
}
