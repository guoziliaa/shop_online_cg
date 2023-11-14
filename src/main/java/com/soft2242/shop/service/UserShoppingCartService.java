package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.CartQuery;
import com.soft2242.shop.query.EditCartQuery;
import com.soft2242.shop.vo.CartGoodsVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ycshang
 * @since 2023-11-09
 */
public interface UserShoppingCartService extends IService<UserShoppingCart> {

//    加入购物车
    CartGoodsVO addShopCart(CartQuery query);

//    获取购物车列表
    List<CartGoodsVO> shopCartList(Integer userId);

//    修改购物车
    CartGoodsVO editCart(EditCartQuery query);

//    删除购物车
    void removeCartGoods(Integer userId,List<Integer> ids);

    void editCartSelected(Boolean selected,Integer userId);
}
