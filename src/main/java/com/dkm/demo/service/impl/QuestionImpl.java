package com.dkm.demo.service.impl;

import com.dkm.demo.dao.QuestionMapper;
import com.dkm.demo.entity.Question;
import com.dkm.demo.service.IQuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 */
@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class QuestionImpl implements IQuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> queryQuestionAll() {
        return questionMapper.queryQuestionAll();
    }
}
