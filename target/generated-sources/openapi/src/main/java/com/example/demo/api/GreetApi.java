/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.demo.api;

import com.example.demo.model.SampleMsg;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-17T12:55:17.166322+02:00[Europe/Berlin]")
@Validated
@Api(value = "greet", description = "the greet API")
public interface GreetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /greet/byStatus : Finds Greet by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (optional, default to available)
     * @return Successful response from Germany by status (status code 200)
     *         or Invalid status value (status code 400)
     */
    @ApiOperation(
        tags = { "greet" },
        value = "Finds Greet by status",
        nickname = "findGreetByStatus",
        notes = "Multiple status values can be provided with comma separated strings",
        response = SampleMsg.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Successful response from Germany by status", response = SampleMsg.class),
        @ApiResponse(code = 400, message = "Invalid status value")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/greet/byStatus",
        produces = { "application/json" }
    )
    default ResponseEntity<SampleMsg> findGreetByStatus(
        @ApiParam(value = "Status values that need to be considered for filter", allowableValues = "available, pending, sold", defaultValue = "available") @Valid @RequestParam(value = "status", required = false, defaultValue = "available") String status
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /greet : Get a greeting message
     * test description
     *
     * @return Successful response from Germany (status code 200)
     */
    @ApiOperation(
        tags = { "greet" },
        value = "Get a greeting message",
        nickname = "getCall",
        notes = "test description",
        response = SampleMsg.class
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "Successful response from Germany", response = SampleMsg.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/greet",
        produces = { "application/json" }
    )
    default ResponseEntity<SampleMsg> getCall(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
