package org.academiadecodigo.countrydream.services;

import org.academiadecodigo.countrydream.persistence.dao.AnswerDao;
import org.academiadecodigo.countrydream.persistence.dao.QuestionDao;
import org.academiadecodigo.countrydream.persistence.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * An {@link AnswerService} implementation
 */
@Service
public class AnswerServiceImpl implements AnswerService {

    private AnswerDao answerDao;
    private QuestionDao questionDao;

    /**
     * Sets the answer data access object
     *
     * @param answerDao the answer DAO to set
     */
    @Autowired
    public void setAnswerDao(AnswerDao answerDao) {
        this.answerDao = answerDao;
    }

    /**
     * Sets the question data access object
     *
     * @param questionDao the question DAO to set
     */
    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    /**
     * @see AnswerService#get(Integer)
     */
    @Override
    public Answer get(Integer id) {
        return answerDao.findById(id);
    }

}
