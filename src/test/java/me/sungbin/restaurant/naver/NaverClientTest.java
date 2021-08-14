package me.sungbin.restaurant.naver;

import me.sungbin.restaurant.naver.dto.SearchImageReq;
import me.sungbin.restaurant.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void searchLocalTest() {
        var search = new SearchLocalReq();
        search.setQuery("카페");

        var result = naverClient.searchLocal(search);
        System.out.println(result);
    }

    @Test
    public void searchImageTest() {
        var search = new SearchImageReq();
        search.setQuery("카페");

        var result = naverClient.searchImage(search);
        System.out.println(result);
    }

}