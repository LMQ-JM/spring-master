package com.dkm.demo.service;

import com.dkm.demo.entity.Question;

import java.util.List;

/**
 * @author Administrator
 */
public interface IQuestionService {

    /**
     * 查询题库
     * @return
     */
    List<Question> queryQuestionAll();
}
