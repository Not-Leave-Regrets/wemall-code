package com.wlf.index.application.service;

import com.wlf.index.application.entity.Choices;
import com.wlf.index.application.entity.SliderImg;
import com.wlf.index.application.entity.ThemeImg;
import com.wlf.index.application.mapper.ChoiceMapper;
import com.wlf.index.application.mapper.SliderImgMapper;
import com.wlf.index.application.mapper.ThemeImgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {
    @Autowired
    private SliderImgMapper sliderImgMapper;
    @Autowired
    private ThemeImgMapper themeImgMapper;
    @Autowired
    private ChoiceMapper choiceMapper;

    public List<SliderImg> sliderImgs(){
        List<SliderImg> sliderImgs = sliderImgMapper.selectAll();

        return sliderImgs;
    }
    public List<ThemeImg> themeImgs(){
        List<ThemeImg> themeImgs = themeImgMapper.selectAll();
        return themeImgs;
    }
    public List<Choices> choices(){
        List<Choices> choices = choiceMapper.selectAll();
        return choices;
    }

}
