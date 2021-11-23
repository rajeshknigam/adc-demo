package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.Scheduledtxn;

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

@Api(value = "Scheduledtxn", description = "the Scheduledtxn API")
public interface ScheduledtxnApi {

    @ApiOperation(value = "Add a new scheduled txn ", notes = "", response = Void.class, tags={ "scheduledtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/scheduledtxn",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addScheduledtxn(@ApiParam(value = "Scheduled txn that needs to be added" ,required=true ) @RequestBody Scheduledtxn body);


    @ApiOperation(value = "Deletes a Scheduledtxn", notes = "", response = Void.class, tags={ "scheduledtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Scheduledtxn not found", response = Void.class) })
    @RequestMapping(value = "/scheduledtxn/{scheduledtxn}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteScheduledtxn(@ApiParam(value = "Scheduledtxn id to delete",required=true ) @PathVariable("scheduledtxn") Long scheduledtxn);


    @ApiOperation(value = "Find Scheduledtxn by ID", notes = "Returns a single Scheduledtxn", response = Scheduledtxn.class, tags={ "scheduledtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Scheduledtxn.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Scheduledtxn.class),
        @ApiResponse(code = 404, message = "Scheduledtxn not found", response = Scheduledtxn.class) })
    @RequestMapping(value = "/scheduledtxn/{scheduledtxn}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Scheduledtxn> getScheduledTxnById(@ApiParam(value = "ID of Scheduledtxn to return",required=true ) @PathVariable("scheduledtxn") Long scheduledtxn);


    @ApiOperation(value = "Find scheduledtxn by customer ID", notes = "", response = Scheduledtxn.class, responseContainer = "List", tags={ "scheduledtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Scheduledtxn.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Scheduledtxn.class),
        @ApiResponse(code = 404, message = "Customer not found", response = Scheduledtxn.class) })
    @RequestMapping(value = "/scheduledtxn/customer/{customerid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Scheduledtxn>> getScheduledtxnByCustomerId(@ApiParam(value = "ID of customerid for which trx to be fetched",required=true ) @PathVariable("customerid") Long customerid);


    @ApiOperation(value = "Update an existing Scheduledtxn", notes = "", response = Void.class, tags={ "scheduledtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    @RequestMapping(value = "/scheduledtxn",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateScheduledtxn(@ApiParam(value = "Scheduled txn  that needs to be added" ,required=true ) @RequestBody Scheduledtxn body);

}
