package com.zhtest.fruit.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author duza
 * @create 2024 - 03 - 26 8:38
 */
public abstract class Fruit {
    private BigDecimal price;
    private Integer weight;
    private BigDecimal promotionPrice = new BigDecimal(1);//折扣

    public Fruit(BigDecimal price, Integer weight) {
        this.price = price;
        this.weight = weight;
    }

    public Fruit(BigDecimal price, Integer weight, BigDecimal promotionPrice) {
        this.price = price;
        this.weight = weight;
        this.promotionPrice = promotionPrice;
    }

    public BigDecimal count() {
        return price.multiply(new BigDecimal(weight).multiply(promotionPrice)).setScale(2, RoundingMode.HALF_UP);
    }



}
