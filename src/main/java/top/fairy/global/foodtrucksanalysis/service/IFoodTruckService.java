package top.fairy.global.foodtrucksanalysis.service;


import top.fairy.global.foodtrucksanalysis.beans.FootTruckSetResult;

import java.util.List;

public interface IFoodTruckService {
    /**
     * @auth: jzg
     * @date:20230329
     * @details: 查询列表
     * **/
    List<FootTruckSetResult> listAll();
}
