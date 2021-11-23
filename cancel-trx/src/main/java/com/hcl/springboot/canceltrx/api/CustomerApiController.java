package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.Customer;

import io.swagger.annotations.*;
import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import java.util.List;

import javax.validation.constraints.*;

@Controller
public class CustomerApiController implements CustomerApi {
	



    public ResponseEntity<Void> createCustomer(@ApiParam(value = "Created customer object" ,required=true ) @RequestBody Customer body) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCustomer(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("id") Integer id) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

    public ResponseEntity<Customer> getcustomerByID(@ApiParam(value = "The id that needs to be fetched.",required=true ) @PathVariable("id") Integer id) {
       
        return new ResponseEntity<Customer>(    new Customer(),   HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCustomer(@ApiParam(value = "id that need to be updated",required=true ) @PathVariable("id") Integer id,
        @ApiParam(value = "Updated customer object" ,required=true ) @RequestBody Customer body) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

}
