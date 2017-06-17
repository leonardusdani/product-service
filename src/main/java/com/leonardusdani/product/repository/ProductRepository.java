/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardusdani.product.repository;

import com.leonardusdani.product.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author machine
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
    
}
