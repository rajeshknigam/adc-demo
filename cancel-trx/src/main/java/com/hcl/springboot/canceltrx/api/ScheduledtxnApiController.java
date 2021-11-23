package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.Scheduledtxn;

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
public class ScheduledtxnApiController implements ScheduledtxnApi {
	



    public ResponseEntity<Void> addScheduledtxn(@ApiParam(value = "Scheduled txn that needs to be added" ,required=true ) @RequestBody Scheduledtxn body) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteScheduledtxn(@ApiParam(value = "Scheduledtxn id to delete",required=true ) @PathVariable("scheduledtxn") Long scheduledtxn) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

    public ResponseEntity<Scheduledtxn> getScheduledTxnById(@ApiParam(value = "ID of Scheduledtxn to return",required=true ) @PathVariable("scheduledtxn") Long scheduledtxn) {
       
        return new ResponseEntity<Scheduledtxn>(    new Scheduledtxn(),   HttpStatus.OK);
    }

    public ResponseEntity<List<Scheduledtxn>> getScheduledtxnByCustomerId(@ApiParam(value = "ID of customerid for which trx to be fetched",required=true ) @PathVariable("customerid") Long customerid) {
       
        return new ResponseEntity<List<Scheduledtxn>>( new ArrayList<Scheduledtxn>(), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateScheduledtxn(@ApiParam(value = "Scheduled txn  that needs to be added" ,required=true ) @RequestBody Scheduledtxn body) {
       
        return new ResponseEntity<Void>(      HttpStatus.OK);
    }

}
