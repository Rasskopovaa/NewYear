package app.repository;

import app.model.entity.Wish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishRepository extends CrudRepository<Wish, Integer> {
    Wish findById(int id);
}
