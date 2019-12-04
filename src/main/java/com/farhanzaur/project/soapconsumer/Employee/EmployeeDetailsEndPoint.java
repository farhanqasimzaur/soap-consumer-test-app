package com.farhanzaur.project.soapconsumer.Employee;

import com.farhanzaur.employees.EmployeeDetails;
import com.farhanzaur.employees.GetEmployeeDetailsRequest;
import com.farhanzaur.employees.GetEmployeeDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeDetailsEndPoint {

    @PayloadRoot(namespace = "http://farhanzaur.com/employees", localPart = "GetEmployeeDetailsRequest")
    @ResponsePayload
    public GetEmployeeDetailsResponse processEmployeDetailsRequest(@RequestPayload GetEmployeeDetailsRequest request) {
        GetEmployeeDetailsResponse response = new GetEmployeeDetailsResponse();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setId(request.getId());
        employeeDetails.setName("Farhan Qasim Zaur");
        employeeDetails.setEmployeeNumber("VenD00557");
        response.setEmployeeDetails(employeeDetails);
        return response;
    }
}
