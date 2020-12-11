package com.dkm.demo.controller;

import com.dkm.demo.common.constanct.CodeType;
import com.dkm.demo.common.exception.ApplicationException;
import com.dkm.demo.entity.Question;
import com.dkm.demo.service.IQuestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mq
 */
@Api(tags = "题库Api")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Slf4j
@RequestMapping("/QuestionController")
public class QuestionController {


    @Autowired
    private IQuestionService iQuestionService;

    /**
     *
     *  查询所有题库
     * @return
     */
    @ApiOperation(value = "查询所有题库",notes = "成功返回数据 反则为空")
    @ResponseBody
    @GetMapping("/queryQuestionAll")
    public List<Question> queryQuestionAll(){
        List<Question> questions = iQuestionService.queryQuestionAll();
        return questions;
    }
}
