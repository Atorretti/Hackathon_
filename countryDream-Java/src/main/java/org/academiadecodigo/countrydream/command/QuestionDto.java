package org.academiadecodigo.countrydream.command;

import org.academiadecodigo.countrydream.persistence.model.Question;

import javax.validation.constraints.*;

/**
 * The {@link Question} data transfer object
 */
public class QuestionDto {

    private Integer id;

    @NotNull(message = "Question is mandatory")
    @NotBlank(message = "Question is mandatory")
    @Size(min = 3, max = 128)
    private String question;

    /**
     * Gets the id of the customer DTO
     *
     * @return the customer DTO id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id of the customer DTO
     *
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the first name of the customer DTO
     *
     * @return the customer DTO first name
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the first name of the customer DTO
     *
     * @param question the first name to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }


    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "QuestionForm{" +
                "id=" + id +
                ", question='" + question + '\'' +
                '}';
    }
}
