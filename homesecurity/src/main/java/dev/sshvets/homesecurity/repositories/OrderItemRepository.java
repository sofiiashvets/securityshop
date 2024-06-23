package dev.sshvets.homesecurity.repositories;

import dev.sshvets.homesecurity.entities.OrderItem;
import dev.sshvets.homesecurity.entities.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemKey> {
}
