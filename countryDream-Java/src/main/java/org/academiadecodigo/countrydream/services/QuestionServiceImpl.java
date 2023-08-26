package org.academiadecodigo.countrydream.services;

import org.academiadecodigo.countrydream.exceptions.*;
import org.academiadecodigo.countrydream.persistence.dao.AnswerDao;
import org.academiadecodigo.countrydream.persistence.dao.QuestionDao;
import org.academiadecodigo.countrydream.persistence.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionDao questionDao;
    private AnswerDao answerDao;

    /**
     * Sets the question data access object
     *
     * @param questionDao the answer DAO to set
     */
    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

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
     * @see QuestionService#get(Integer)
     */
    @Override
    public Question get(Integer id) {
        return questionDao.findById(id);
    }

    /**
     * @see QuestionService#save(Question)
     */
    @Transactional
    @Override
    public Question save(Question question) {
        return questionDao.saveOrUpdate(question);
    }

    /**
     * @see QuestionService#delete(Integer)
     */
    @Transactional
    @Override
    public void delete(Integer id) throws QuestionNotFoundException, AssociationExistsException {

        Question question = Optional.ofNullable(questionDao.findById(id))
                .orElseThrow(QuestionNotFoundException::new);

        if (!question.getAnswers().isEmpty()) {
            throw new AssociationExistsException();
        }

        questionDao.delete(id);
    }

    /**
     * @see QuestionService#list()
     */
    @Override
    public List<Question> list() {
        return questionDao.findAll();
    }

}

