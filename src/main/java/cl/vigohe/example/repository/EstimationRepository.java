package cl.vigohe.example.repository;

import cl.vigohe.example.domain.Estimation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vigohe on 09-05-17.
 */
@Component
public class EstimationRepository {

    public List getAll(){
        List<Estimation> estimations = new ArrayList<>();

        estimations.add(new Estimation("Company A", 6));
        estimations.add(new Estimation("Company X", 10));
        estimations.add(new Estimation("Company Y", 2));

        return estimations;
    }

}
