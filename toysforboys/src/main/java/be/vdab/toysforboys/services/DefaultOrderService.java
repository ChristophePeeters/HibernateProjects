package be.vdab.toysforboys.services;

import be.vdab.toysforboys.entities.Order;
import be.vdab.toysforboys.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultOrderService implements OrderService{

    private final OrderRepository orderRepository;

    public DefaultOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> findById(long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> findUnshipped() {
        return orderRepository.findUnshipped();
    }
}
