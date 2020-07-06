package org.acme.client;

import org.acme.model.Incident;
import org.acme.model.Responder;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RegisterRestClient
public interface ResponderServiceClient {

    @GET
    @Path("/responder/{id}")
    @Produces("application/json")
    Responder getResponder(@PathParam String id);

}
