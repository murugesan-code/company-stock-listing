/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.company.api;

import com.company.model.Company;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-06T20:51:16.610+05:30[Asia/Kolkata]")
@Validated
@Api(value = "Company", description = "the Company API")
public interface CompanyApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1.0/market/company/register : Register a new company
     *
     * @param company Company payload (required)
     * @return Company succesfully registered (status code 200)
     */
    @ApiOperation(value = "Register a new company", nickname = "createCompany", notes = "", response = String.class, tags={ "Company", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Company succesfully registered", response = String.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1.0/market/company/register",
        produces = { "text/plain" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> createCompany(@ApiParam(value = "Company payload", required = true) @Valid @RequestBody Company company) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1.0/market/company/delete/{companyCode} : Delete company information by its code
     *
     * @param companyCode To get company information need company code (required)
     * @return Company deleted successfully (status code 200)
     */
    @ApiOperation(value = "Delete company information by its code", nickname = "deleteCompanyByCode", notes = "", tags={ "Company", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Company deleted successfully") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1.0/market/company/delete/{companyCode}"
    )
    default ResponseEntity<Void> deleteCompanyByCode(@ApiParam(value = "To get company information need company code", required = true) @PathVariable("companyCode") String companyCode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1.0/market/company/getall : Get companies
     *
     * @return Company details reterived successfully (status code 200)
     */
    @ApiOperation(value = "Get companies", nickname = "getCompanies", notes = "", response = Company.class, responseContainer = "List", tags={ "Company", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Company details reterived successfully", response = Company.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1.0/market/company/getall",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Company>> getCompanies() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"stockExchange\" : \"stockExchange\", \"website\" : \"website\", \"code\" : \"code\", \"name\" : \"name\", \"stockPrices\" : [ { \"endDate\" : \"2021-01-30T00:00:00.000+0000\", \"id\" : 6, \"stockPrice\" : \"\", \"startDate\" : \"2021-01-30T00:00:00.000+0000\" }, { \"endDate\" : \"2021-01-30T00:00:00.000+0000\", \"id\" : 6, \"stockPrice\" : \"\", \"startDate\" : \"2021-01-30T00:00:00.000+0000\" } ], \"id\" : 0, \"ceo\" : \"ceo\", \"turnover\" : 1000 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1.0/market/company/info/{companyCode} : Get company information by its code
     *
     * @param companyCode To get company information need company code (required)
     * @return Company details reterived successfully (status code 200)
     */
    @ApiOperation(value = "Get company information by its code", nickname = "getCompanyByCode", notes = "", response = Company.class, tags={ "Company", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Company details reterived successfully", response = Company.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1.0/market/company/info/{companyCode}",
        produces = { "application/json" }
    )
    default ResponseEntity<Company> getCompanyByCode(@ApiParam(value = "To get company information need company code", required = true) @PathVariable("companyCode") String companyCode) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"stockExchange\" : \"stockExchange\", \"website\" : \"website\", \"code\" : \"code\", \"name\" : \"name\", \"stockPrices\" : [ { \"endDate\" : \"2021-01-30T00:00:00.000+0000\", \"id\" : 6, \"stockPrice\" : \"\", \"startDate\" : \"2021-01-30T00:00:00.000+0000\" }, { \"endDate\" : \"2021-01-30T00:00:00.000+0000\", \"id\" : 6, \"stockPrice\" : \"\", \"startDate\" : \"2021-01-30T00:00:00.000+0000\" } ], \"id\" : 0, \"ceo\" : \"ceo\", \"turnover\" : 1000 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
