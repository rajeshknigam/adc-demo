package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.Customer;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;

@Api(value = "Customer", description = "the Customer API")
public interface CustomerApi {

    @ApiOperation(value = "Create customer", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    @RequestMapping(value = "/customer",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createCustomer(@ApiParam(value = "Created customer object" ,required=true ) @RequestBody Customer body);


    @ApiOperation(value = "Delete customer", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class) })
    @RequestMapping(value = "/customer/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCustomer(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("id") Integer id);


    @ApiOperation(value = "Get user by customer id", notes = "", response = Customer.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Customer.class),
        @ApiResponse(code = 400, message = "Invalid username supplied", response = Customer.class),
        @ApiResponse(code = 404, message = "User not found", response = Customer.class) })
    @RequestMapping(value = "/customer/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Customer> getcustomerByID(@ApiParam(value = "The id that needs to be fetched.",required=true ) @PathVariable("id") Integer id);


    @ApiOperation(value = "Updated customer", notes = "This can only be done by the logged in user.", response = Void.class, tags={ "customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class) })
    @RequestMapping(value = "/customer/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateCustomer(@ApiParam(value = "id that need to be updated",required=true ) @PathVariable("id") Integer id,
        @ApiParam(value = "Updated customer object" ,required=true ) @RequestBody Customer body);

}
