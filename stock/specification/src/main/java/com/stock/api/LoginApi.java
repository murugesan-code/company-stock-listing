/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.stock.api;

import com.stock.model.Credentials;
import com.stock.model.Token;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-06T21:08:00.151+05:30[Asia/Kolkata]")
@Validated
@Api(value = "Login", description = "the Login API")
public interface LoginApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1.0/login : Login to company application
     *
     * @param credentials Credentials payload (optional)
     * @return Created token succcessfully (status code 200)
     */
    @ApiOperation(value = "Login to company application", nickname = "getAccessToken", notes = "", response = Token.class, tags={ "Login", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created token succcessfully", response = Token.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1.0/login",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Token> getAccessToken(@ApiParam(value = "Credentials payload") @Valid @RequestBody(required = false) Credentials credentials) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
