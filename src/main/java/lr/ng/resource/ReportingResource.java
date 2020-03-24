package lr.ng.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lr.ng.service.ReportService;
import lr.ng.service.ReportTemplateService;



/**
 * ReportingResource
 */
@Path("/getReport")
public class ReportingResource {

    @Inject
    ReportService reportService;

    @Inject
    ReportTemplateService reportTempService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/report")
    public String getReport() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";
        try {
			 jsonString = mapper.writeValueAsString(reportService.getReport());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return jsonString;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/reportTemplate")
    public String getReportTemplate() {
        return reportTempService.getReportTemplate();
    }
    
}