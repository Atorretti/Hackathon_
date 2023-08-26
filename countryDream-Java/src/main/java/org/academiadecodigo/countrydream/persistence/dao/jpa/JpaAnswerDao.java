package org.academiadecodigo.countrydream.persistence.dao.jpa;

import org.academiadecodigo.countrydream.persistence.dao.AnswerDao;
import org.academiadecodigo.countrydream.persistence.model.Answer;
import org.springframework.stereotype.Repository;

/**
 * A JPA {@link AnswerDao} implementation
 */
@Repository
public class JpaAnswerDao extends GenericJpaDao<Answer> implements AnswerDao {

    /**
     * @see GenericJpaDao#GenericJpaDao(Class)
     */
    public JpaAnswerDao() {
        super(Answer.class);
    }
}
