package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.Completedtxn;

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
public class CompletedtxnApiController implements CompletedtxnApi {
	



    public ResponseEntity<Void> addCompletedtxn(@ApiParam(value = "Completed txn that needs to be added" ,required=true ) @RequestBody Completedtxn body) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCompletedtxn(@ApiParam(value = "Completedtxn id to delete",required=true ) @PathVariable("completedtxn") Long completedtxn) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

    public ResponseEntity<Completedtxn> getCompletedTxnById(@ApiParam(value = "ID of Completedtxn to return",required=true ) @PathVariable("completedtxn") Long completedtxn) {
       
        return new ResponseEntity<Completedtxn>(    new Completedtxn(),   HttpStatus.OK);
    }

    public ResponseEntity<List<Completedtxn>> getCompletedtxnByCustomerId(@ApiParam(value = "ID of customerid for which trx to be fetched",required=true ) @PathVariable("customerid") Long customerid) {
       
        return new ResponseEntity<List<Completedtxn>>( new ArrayList<Completedtxn>(), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCompletedtxn(@ApiParam(value = "Completed txn  that needs to be added" ,required=true ) @RequestBody Completedtxn body) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

}
