package teste;


// create a new resource class

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/run")
@Produces(MediaType.APPLICATION_JSON)
@Consumes("application/json")
public class RunnerResource {

    @Inject
    SumarioSchedule sumarioSchedule;

     public void run() {
            sumarioSchedule.populaDadosSumario();
     }


}
