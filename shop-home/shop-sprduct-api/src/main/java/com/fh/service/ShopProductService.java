package com.fh.service;

import com.fh.bean.ProductParamter;
import com.fh.bean.ShopProductBean;
import com.fh.utils.PageBean;


public interface ShopProductService {
    void queryProductList(PageBean<ShopProductBean> page, ProductParamter parameter);

}
