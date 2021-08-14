package me.sungbin.restaurant.wishlist.repository;

import me.sungbin.restaurant.wishlist.entity.WishListEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class WishListRepositoryTest {

    @Autowired
    private WishListRepository wishListRepository;

    private WishListEntity create() {
        var wisList = new WishListEntity();
        wisList.setTitle("title");
        wisList.setCategory("category");
        wisList.setAddress("address");
        wisList.setRoadAddress("roadAddress");
        wisList.setHomePageLink("");
        wisList.setImageLink("");
        wisList.setVisit(false);
        wisList.setVisitCount(0);
        wisList.setLastVisitDate(null);

        return wisList;
    }

    @Test
    public void saveTest() {
        var wishList = create();
        var expected =  wishListRepository.save(wishList);

        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1, expected.getIndex());
    }

    @Test
    public void updateTest() {
        var wishList = create();
        var expected =  wishListRepository.save(wishList);

        expected.setTitle("update Test");
        var saveEntity = wishListRepository.save(expected);

        Assertions.assertEquals("update Test", saveEntity.getTitle());
        Assertions.assertEquals(1, wishListRepository.findAll().size());
    }

    @Test
    public void findByIdTest() {
        var wishList = create();
        wishListRepository.save(wishList);

        var expected = wishListRepository.findById(1);

        assertTrue(expected.isPresent());
        Assertions.assertEquals(1, expected.get().getIndex());
    }

    @Test
    public void deleteTest() {
        var wishList = create();
        wishListRepository.save(wishList);

        wishListRepository.deleteById(1);

        int count = wishListRepository.findAll().size();

        Assertions.assertEquals(0, count);
    }

    @Test
    public void listAllTest() {
        var wishList1 = create();
        wishListRepository.save(wishList1);

        var wishList2 = create();
        wishListRepository.save(wishList2);

        int count = wishListRepository.findAll().size();
        Assertions.assertEquals(2, count);
    }
}