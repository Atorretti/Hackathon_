package org.academiadecodigo.countrydream.controller.rest;

import org.academiadecodigo.countrydream.command.ResultDto;
import org.academiadecodigo.countrydream.persistence.model.Question;
import org.academiadecodigo.countrydream.persistence.model.Result;
import org.academiadecodigo.countrydream.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.SortedMap;
import java.util.TreeMap;


/**
 * REST controller responsible for {@link Question} related CRUD operations
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/result")
public class RestResultController {

    /**
     * Retrieves a representation of the given question
     *
     * @param rid the question id
     * @return the response entity
     */
    @RequestMapping(method = RequestMethod.GET, path = "/{rid}")
    public ResponseEntity<ResultDto> showResult(@PathVariable Integer rid) {

        int aux = getNumber(rid);

        if (aux == -1) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Result result = Result.values()[aux - 1];

        ResultDto resultDto = new ResultDto(result.getImage(), result.getTitle(), result.getText());

        return new ResponseEntity<>(resultDto, HttpStatus.OK);
    }

    private int getNumber(int rid) {
        SortedMap<Integer, Integer> categoryBounds = new TreeMap<>();
        categoryBounds.put(1, 1);
        categoryBounds.put(4, 2);
        categoryBounds.put(7, 9);
        categoryBounds.put(10, 3);
        categoryBounds.put(13, 4);
        categoryBounds.put(16, 10);
        categoryBounds.put(19, 5);
        categoryBounds.put(23, 6);
        categoryBounds.put(27, 7);
        categoryBounds.put(32, 8);

        for (Integer upperBound : categoryBounds.keySet()) {
            if (rid <= upperBound) {
                return categoryBounds.get(upperBound);
            }
        }

        return -1;
    }


}

