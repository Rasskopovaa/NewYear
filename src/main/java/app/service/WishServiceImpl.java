package app.service;

import app.model.entity.Wish;
import app.repository.WishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class WishServiceImpl implements WishService {

    private final WishRepository wishRepository;

    @Override
    public List<Wish> getAllWishes() {
        return (List<Wish>) wishRepository.findAll();
    }

    @Override
    public Wish getWishById(int id) {
        return wishRepository.findById(id);
    }

    @Override
    public List<Wish> saveAllWishes(List<Wish> list) {
        return (List<Wish>) wishRepository.saveAll(list);
    }
}
