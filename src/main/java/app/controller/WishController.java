package app.controller;


import app.model.entity.Wish;
import app.service.ParseServer;
import app.service.WishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
@RequiredArgsConstructor
public class WishController {
    private final WishService wishService;
    private final ParseServer parseServer;


    @GetMapping
    public List<Wish> getAllWishes() {
        return wishService.getAllWishes();
    }

    @GetMapping(value = "/{id}")
    public Wish getWishById(@PathVariable int id) {
        return wishService.getWishById(id);
    }

    @GetMapping(path = "/wishes")
    public List<Wish> saveAlllWishes() {
        return parseServer.getPozdravlenie();
    }


}
