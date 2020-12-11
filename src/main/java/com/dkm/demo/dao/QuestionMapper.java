package com.dkm.demo.dao;

import com.dkm.demo.entity.Question;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QuestionMapper {

    @Select("select *from tb_question_bank")
    public List<Question> queryQuestionAll();
}
