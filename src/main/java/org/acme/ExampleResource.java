package org.acme;

import org.acme.client.IncidentServiceClient;
import org.acme.client.ResponderServiceClient;
import org.acme.model.Incident;
import org.acme.model.Responder;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class ExampleResource {

    @Inject
    @RestClient
    IncidentServiceClient incidentServiceClient;

    @Inject
    @RestClient
    ResponderServiceClient responderServiceClient;

    @GET
    @Path("/inc")
    @Produces(MediaType.APPLICATION_JSON)
    public Incident incidentDemo() {

        return incidentServiceClient.getIncident("09c1c368-ad4d-4efe-a689-561c52878628");
    }


    @GET
    @Path("/res")
    @Produces(MediaType.APPLICATION_JSON)
    public Responder resDemo() {

        return responderServiceClient.getResponder("21");
    }

}