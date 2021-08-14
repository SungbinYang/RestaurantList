package me.sungbin.restaurant.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.sungbin.restaurant.wishlist.dto.WishListDto;
import me.sungbin.restaurant.wishlist.service.WishListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {

    private final WishListService wishListService;

    @GetMapping("/search")
    public WishListDto search(@RequestParam String query) {
        return wishListService.search(query);
    }

    @PostMapping("")
    public WishListDto add(@RequestBody WishListDto wishListDto) {
        log.info("{}", wishListDto);

        return wishListService.add(wishListDto);
    }

    @GetMapping("/all")
    public List<WishListDto> findAll() {
        return wishListService.findAll();
    }
}
