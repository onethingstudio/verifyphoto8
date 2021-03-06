package com.shcy.yyzzj.module.orderdetail;

import android.support.annotation.Nullable;

import com.shcy.yyzzj.base.BasePresenter;
import com.shcy.yyzzj.base.BaseView;
import com.shcy.yyzzj.bean.login.ResultBean;
import com.shcy.yyzzj.bean.order.Order;
import com.shcy.yyzzj.bean.pay.PrePayInfoBean;

/**
 * Created by licong on 2018/10/12.
 */

public class OrderDetailContract {

    interface View extends BaseView<Presenter>{
        void showOrderDetail(Order order);

        void showPayStatus(Order order);

        void confirmOrder(ResultBean resultBean);

        void loading();

        void loadingEnd();

        void prepaySuccess(PrePayInfoBean bean);

        void prepayFailed();
    }

    interface Presenter extends BasePresenter{
        void getOrderDetail(@Nullable int orderId, @Nullable String orderNumber);

        void PrintOrderConfirm(String order);

        void prepay(String orderNumber,String payType);

        void getOrderStatus(int orderId,String orderNumber,int type);

    }
}
