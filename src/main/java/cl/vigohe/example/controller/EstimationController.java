package cl.vigohe.example.controller;

import cl.vigohe.example.repository.EstimationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * Created by vigohe on 07-05-17.
 */

@RestController
public class EstimationController {

    private final EstimationRepository estimationRepository;

    public EstimationController(EstimationRepository estimationRepository) {
        this.estimationRepository = estimationRepository;
    }

    @GetMapping("/poor/estimations")
    List getEstimations() {

        if (this.randomIntegerBeetweenOneAnd(3) == 3) {
            sleep();
        }

        return this.estimationRepository.getAll();
    }

    private int randomIntegerBeetweenOneAnd(int max) {
        return new Random().nextInt(max) + 1;
    }

    private void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
