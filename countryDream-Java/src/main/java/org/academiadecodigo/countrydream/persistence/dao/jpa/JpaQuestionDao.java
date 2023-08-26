package org.academiadecodigo.countrydream.persistence.dao.jpa;

import org.academiadecodigo.countrydream.persistence.dao.QuestionDao;
import org.academiadecodigo.countrydream.persistence.model.Question;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link QuestionDao} implementation
 */
@Repository
public class JpaQuestionDao extends GenericJpaDao<Question> implements QuestionDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaQuestionDao() {
        super(Question.class);
    }
}
