package com.Cristian.GraduationProject.service;

import com.Cristian.GraduationProject.entity.Cart;
import com.Cristian.GraduationProject.repository.CartRepository;

import java.util.List;

public class CartService {

    CartRepository cartRepository;
    
    public List<Cart> getAllCarts(){
        return cartRepository.findAll();
    }

    public Cart getCartById(int id){
        return cartRepository.findById(id).get();
    }
    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
    }
    public Cart updateCart(int index, Cart cart){
        Cart cartTemp = new Cart();
        cartTemp.setCart_id(cart.getCart_id());
        cartTemp.setProduct_id(cart.getProduct_id());
        cartTemp.setQuantity(cart.getQuantity());
        cartTemp.setUser_id(cart.getUser_id());
        cartTemp.setSupplier_id(cart.getSupplier_id());
        return cartRepository.save(cartTemp);
    }
//
//    public Cart deleteCart(int id){
//        cartRepository.deleteById(id);
//        return cartRepository.findById(id).get();
//    }
}
