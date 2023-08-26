package org.academiadecodigo.countrydream.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.academiadecodigo.countrydream.persistence.model.Answer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The {@link Answer} data transfer object
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AnswerDto {

    private Integer id;

    @NotNull(message = "Answer is mandatory")
    @NotBlank(message = "Answer is mandatory")
    @Size(min = 3, max = 128)
    private String answer;

    @NotNull(message = "Initial value is mandatory")
    @NotBlank(message = "Initial value is mandatory")
    private String value;

    /**
     * Gets the id of the account DTO
     *
     * @return the account DTO id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id of the account DTO
     *
     * @param id the account DTO id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the account DTO value
     *
     * @return the account DTO value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the account DTO value
     *
     * @param value the account DTO value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "AnswerDto{" +
                ", value=" + value +
                '}';
    }
}
