package com.example.course.entities.pk;

import java.io.Serializable;

import com.example.course.entities.Order;
import com.example.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPk implements Serializable {
	private static final long serialVersionUID = 1L; 

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
    
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product Product;
    
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public Product getProduct() {
        return Product;
    }
    public void setProduct(Product product) {
        Product = product;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((order == null) ? 0 : order.hashCode());
        result = prime * result + ((Product == null) ? 0 : Product.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItemPk other = (OrderItemPk) obj;
        if (order == null) {
            if (other.order != null)
                return false;
        } else if (!order.equals(other.order))
            return false;
        if (Product == null) {
            if (other.Product != null)
                return false;
        } else if (!Product.equals(other.Product))
            return false;
        return true;
    }

    

    
}
