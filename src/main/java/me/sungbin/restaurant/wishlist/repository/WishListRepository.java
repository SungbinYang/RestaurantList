package me.sungbin.restaurant.wishlist.repository;

import me.sungbin.restaurant.db.MemoryDbRepositoryAbstract;
import me.sungbin.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}
