package com.wlf.index.application.web;

//import com.wlf.index.application.entity.Choices;
import com.wlf.index.application.entity.Choices;
import com.wlf.index.application.entity.SliderImg;
import com.wlf.index.application.entity.ThemeImg;
import com.wlf.index.application.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("测试微信商城联调")
@RequestMapping("/wemall")
public class IndexController {
    @Autowired
    private IndexService indexService;

    @ApiOperation("获得轮播图列表")
    @GetMapping("/slider/list")
    public List<SliderImg> sliderImgs(){
        List<SliderImg> sliderImgs=null;
        try {
            sliderImgs = indexService.sliderImgs();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sliderImgs;
    }

    @ApiOperation("获得主题馆列表列表")
    @GetMapping("/theme/list")
    public List<ThemeImg> themeImgs(){
        List<ThemeImg> themeImgs =null;
        try{
            themeImgs =indexService.themeImgs();
        }catch (Exception e){
            e.printStackTrace();
        }
        return themeImgs;
    }

    @ApiOperation("获得精选商品列表")
    @GetMapping("/choice/list")
    public List<Choices> choices(){
        List<Choices> choices =null;
        try{
            choices =indexService.choices();
        }catch (Exception e){
            e.printStackTrace();
        }
        return choices;
    }
}
