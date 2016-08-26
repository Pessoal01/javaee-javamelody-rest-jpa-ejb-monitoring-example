package ee.mrts.rest;

import ee.mrts.model.Speaker;
import ee.mrts.service.SpeakerService;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@ApplicationPath("/resources")
@Path("speakers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SpeakerResource extends Application {

    @EJB
    private SpeakerService speakerService;

    @GET
    public List<Speaker> listSpeakers() {
        return speakerService.findAll();
    }

}
