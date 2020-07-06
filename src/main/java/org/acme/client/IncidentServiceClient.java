package org.acme.client;

import org.acme.model.Incident;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;
import java.util.Set;

@Path("/incidents")
@RegisterRestClient
public interface IncidentServiceClient {

    @GET
    @Path("/incident/{id}")
    @Produces("application/json")
    Incident getIncident(@PathParam String id);

}
