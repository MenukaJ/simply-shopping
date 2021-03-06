package com.devcrawlers.simply.shopping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devcrawlers.simply.shopping.domain.OrderItem;

/**
 * Order Item Repository
 * 
 ********************************************************************************************************
 *  ###   Date         Author    IT No.        Description
 *-------------------------------------------------------------------------------------------------------
 *    1   05-10-2021   MiyuruW   IT19020990     Created
 *    
 ********************************************************************************************************
 */

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	public List<OrderItem> findByStatus(String status);

	public List<OrderItem> findByOrderId(Long id);

	public Optional<OrderItem> findByIdAndOrderId(Long id, Long orderId);
	
	public Boolean existsByOrderIdAndItemId(Long id, Long itemId);

	public void deleteByOrderId(Long id);
	
	public void deleteByIdAndOrderId(Long id, Long orderId);
	
	public void deleteById(Long id);
	
}
