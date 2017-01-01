/*
   ServiceResource.java
   Sample RESTful Java Web Service 

   ------------------------------------------

   Copyright (c) 2015 Vic Hargrave
   
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
   
       http://www.apache.org/licenses/LICENSE-2.0
   
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.vichargrave;
 
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
 
@Path("service")
public class ServiceResource {
 
    @Context
    private UriInfo context;
 
    public ServiceResource() {
    }
 
    @GET
    @Produces("text/html")
    public String getHandler() {
        return "<h1>Get some REST!<h1>";
    }
 
    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces("text/plain")
    public String postHandler(String content) {
        return content;
    }
}
