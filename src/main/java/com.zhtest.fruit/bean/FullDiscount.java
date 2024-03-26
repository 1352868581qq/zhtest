package com.zhtest.fruit.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author duza
 * @create 2024 - 03 - 26 9:50
 */
public class FullDiscount {

    private BigDecimal full;
    private BigDecimal discount;

    public FullDiscount(BigDecimal full, BigDecimal discount) {
        this.full = full;
        this.discount = discount;
    }
    public BigDecimal FullDiscount(BigDecimal countPrice){
        BigDecimal count = countPrice;
        //是否有满减，满100-10.那么满200-20
        BigDecimal divide = countPrice.divide(full).setScale(0,RoundingMode.HALF_UP);
        System.out.println(divide);
        if (divide.compareTo(new BigDecimal(1)) >= 0){
            count = countPrice.subtract(discount.multiply(divide));
        }
        return count;
    }

}
