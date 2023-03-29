package top.fairy.global.foodtrucksanalysis.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import top.fairy.global.foodtrucksanalysis.beans.FootTruckSetResult;
import top.fairy.global.foodtrucksanalysis.common.CommonResult;
import top.fairy.global.foodtrucksanalysis.service.IFoodTruckService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/food/truck")
public class FoodTruckController {
    private static final Logger logger = LogManager.getLogger();

    @Resource
    IFoodTruckService foodTruckServiceImpl;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<FootTruckSetResult>> showList() {
        logger.info("查询列表开始：");

        List<FootTruckSetResult> footTruckSet = foodTruckServiceImpl.listAll();
        return CommonResult.success(footTruckSet);
    }
}
