package ee.mrts.service;

import ee.mrts.model.Speaker;

import javax.ejb.Local;
import java.util.List;

@Local
public interface SpeakerService {

    List<Speaker> findAll();

}
