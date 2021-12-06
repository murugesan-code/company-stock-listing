package com.company.model;

import java.util.Objects;
import com.company.model.StockPrice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-06T20:51:16.610+05:30[Asia/Kolkata]")
public class Company   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("code")
  private String code;

  @JsonProperty("name")
  private String name;

  @JsonProperty("ceo")
  private String ceo;

  @JsonProperty("turnover")
  private Integer turnover;

  @JsonProperty("website")
  private String website;

  @JsonProperty("stockExchange")
  private String stockExchange;

  @JsonProperty("stockPrices")
  @Valid
  private List<StockPrice> stockPrices = null;

  public Company id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Company code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Company name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Company ceo(String ceo) {
    this.ceo = ceo;
    return this;
  }

  /**
   * Get ceo
   * @return ceo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCeo() {
    return ceo;
  }

  public void setCeo(String ceo) {
    this.ceo = ceo;
  }

  public Company turnover(Integer turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * Get turnover
   * minimum: 1000
   * @return turnover
  */
  @ApiModelProperty(example = "1000", required = true, value = "")
  @NotNull

@Min(1000) 
  public Integer getTurnover() {
    return turnover;
  }

  public void setTurnover(Integer turnover) {
    this.turnover = turnover;
  }

  public Company website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Company stockExchange(String stockExchange) {
    this.stockExchange = stockExchange;
    return this;
  }

  /**
   * Get stockExchange
   * @return stockExchange
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStockExchange() {
    return stockExchange;
  }

  public void setStockExchange(String stockExchange) {
    this.stockExchange = stockExchange;
  }

  public Company stockPrices(List<StockPrice> stockPrices) {
    this.stockPrices = stockPrices;
    return this;
  }

  public Company addStockPricesItem(StockPrice stockPricesItem) {
    if (this.stockPrices == null) {
      this.stockPrices = new ArrayList<>();
    }
    this.stockPrices.add(stockPricesItem);
    return this;
  }

  /**
   * Get stockPrices
   * @return stockPrices
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StockPrice> getStockPrices() {
    return stockPrices;
  }

  public void setStockPrices(List<StockPrice> stockPrices) {
    this.stockPrices = stockPrices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.id, company.id) &&
        Objects.equals(this.code, company.code) &&
        Objects.equals(this.name, company.name) &&
        Objects.equals(this.ceo, company.ceo) &&
        Objects.equals(this.turnover, company.turnover) &&
        Objects.equals(this.website, company.website) &&
        Objects.equals(this.stockExchange, company.stockExchange) &&
        Objects.equals(this.stockPrices, company.stockPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, ceo, turnover, website, stockExchange, stockPrices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ceo: ").append(toIndentedString(ceo)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    stockExchange: ").append(toIndentedString(stockExchange)).append("\n");
    sb.append("    stockPrices: ").append(toIndentedString(stockPrices)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

