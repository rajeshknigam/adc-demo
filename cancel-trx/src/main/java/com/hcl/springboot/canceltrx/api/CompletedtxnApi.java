package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.Completedtxn;

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

@Api(value = "Completedtxn", description = "the Completedtxn API")
public interface CompletedtxnApi {

    @ApiOperation(value = "Add a new completed txn ", notes = "", response = Void.class, tags={ "completedtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/completedtxn",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addCompletedtxn(@ApiParam(value = "Completed txn that needs to be added" ,required=true ) @RequestBody Completedtxn body);


    @ApiOperation(value = "Deletes a Completedtxn", notes = "", response = Void.class, tags={ "completedtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Completedtxn not found", response = Void.class) })
    @RequestMapping(value = "/completedtxn/{completedtxn}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCompletedtxn(@ApiParam(value = "Completedtxn id to delete",required=true ) @PathVariable("completedtxn") Long completedtxn);


    @ApiOperation(value = "Find Completedtxn by ID", notes = "Returns a single Completedtxn", response = Completedtxn.class, tags={ "completedtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Completedtxn.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Completedtxn.class),
        @ApiResponse(code = 404, message = "Completedtxn not found", response = Completedtxn.class) })
    @RequestMapping(value = "/completedtxn/{completedtxn}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Completedtxn> getCompletedTxnById(@ApiParam(value = "ID of Completedtxn to return",required=true ) @PathVariable("completedtxn") Long completedtxn);


    @ApiOperation(value = "Find completedtxn by customer ID", notes = "", response = Completedtxn.class, responseContainer = "List", tags={ "completedtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Completedtxn.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Completedtxn.class),
        @ApiResponse(code = 404, message = "Customer not found", response = Completedtxn.class) })
    @RequestMapping(value = "/completedtxn/customer/{customerid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Completedtxn>> getCompletedtxnByCustomerId(@ApiParam(value = "ID of customerid for which trx to be fetched",required=true ) @PathVariable("customerid") Long customerid);


    @ApiOperation(value = "Update an existing Completedtxn", notes = "", response = Void.class, tags={ "completedtxn", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Pet not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    @RequestMapping(value = "/completedtxn",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateCompletedtxn(@ApiParam(value = "Completed txn  that needs to be added" ,required=true ) @RequestBody Completedtxn body);

}
