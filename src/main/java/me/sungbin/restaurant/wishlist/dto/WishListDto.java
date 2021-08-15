package me.sungbin.restaurant.wishlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListDto {

    private Integer index;

    @NotNull
    private String title; // 음식명

    @NotNull
    private String category; // 카테고리

    @NotNull
    private String address; // 주소

    @NotNull
    private String roadAddress; // 도로명 주소

    private String homePageLink; // 홈페이지 주소

    private String imageLink; // 이미지 주소

    private boolean isVisit; // 방문여부

    private int visitCount; // 방문 카운트

    private LocalDateTime lastVisitDate; // 마지막 방문일
}
