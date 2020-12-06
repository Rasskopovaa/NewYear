package app.service;

import app.model.entity.Wish;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ParseServer {
    private final WishService wishService;

    public List<Wish> getPozdravlenie() {

        String url = "http://pozdravok.ru/pozdravleniya/prazdniki/noviy-god/proza.htm";
        Document document = null;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements elements = document.select("div.content > p ");
        List<Wish> result = elements.stream()
                .map(element -> new Wish()
                        .setTitle(element.text()))
                .collect(Collectors.toList());

        return wishService.saveAllWishes(result);
    }
}

