package com.chunhui.service;


import com.chunhui.controller.vo.NewBeeMallCouponVO;
import com.chunhui.controller.vo.NewBeeMallMyCouponVO;
import com.chunhui.controller.vo.NewBeeMallShoppingCartItemVO;
import com.chunhui.entity.NewBeeMallCoupon;
import com.chunhui.util.PageQueryUtil;
import com.chunhui.util.PageResult;

import java.util.List;

public interface NewBeeMallCouponService {

    PageResult getCouponPage(PageQueryUtil pageUtil);

    boolean saveCoupon(NewBeeMallCoupon newBeeMallCoupon);

    boolean updateCoupon(NewBeeMallCoupon newBeeMallCoupon);

    NewBeeMallCoupon getCouponById(Long id);

    boolean deleteCouponById(Long id);

    /**
     * 查询可用优惠卷
     *
     * @param userId
     * @return
     */
    List<NewBeeMallCouponVO> selectAvailableCoupon(Long userId);

    /**
     * 用户领取优惠劵
     *
     * @param couponId 优惠劵ID
     * @param userId   用户ID
     * @return boolean
     */
    boolean saveCouponUser(Long couponId, Long userId);

    /**
     * 查询我的优惠卷
     *
     * @param userId 用户ID
     * @return
     */
    List<NewBeeMallCouponVO> selectMyCoupons(Long userId);

    /**
     * 查询当前订单可用的优惠卷
     *
     * @param myShoppingCartItems
     * @param priceTotal
     * @param userId
     * @return
     */
    List<NewBeeMallMyCouponVO> selectOrderCanUseCoupons(List<NewBeeMallShoppingCartItemVO> myShoppingCartItems, int priceTotal, Long userId);

    /**
     * 删除用户优惠卷
     *
     * @param couponUserId
     * @return
     */
    boolean deleteCouponUser(Long couponUserId);

    /**
     * 回复未支付的优惠卷
     * @param orderId
     */
    void releaseCoupon(Long orderId);
}
