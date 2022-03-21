package com.tt.ecommerce.dto;

import com.tt.ecommerce.entity.Address;
import com.tt.ecommerce.entity.Customer;
import com.tt.ecommerce.entity.Order;
import com.tt.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
