package be.vdab.toysforboys.services;

import be.vdab.toysforboys.entities.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Optional<Order> findById(long id);
    List<Order> findUnshipped();
}
