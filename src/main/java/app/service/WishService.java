package app.service;


import app.model.entity.Wish;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public interface WishService {
    List<Wish> getAllWishes();

    Wish getWishById(int id);

    List<Wish> saveAllWishes(List<Wish> list);
}
