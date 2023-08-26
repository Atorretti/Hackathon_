package org.academiadecodigo.countrydream.persistence.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * A generic account model entity to be used as a base for concrete types of accounts
 */
@Entity
@Table(name = "answer")
public class Answer extends AbstractModel {

    private String answer;

    private Integer value = 0;

    @JsonBackReference
    @ManyToOne
    private Question question;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                ", value=" + value +
                ", question=" + question +
                '}';
    }
}
