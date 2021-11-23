package com.hcl.springboot.canceltrx.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Customer
 */

public class Customer  implements Serializable {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("customername")
  private String customername = null;

  @JsonProperty("accountnumber")
  private String accountnumber = null;

  @JsonProperty("accounttype")
  private String accounttype = null;

  @JsonProperty("accountbalance")
  private Integer accountbalance = null;

  public Customer id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Customer customername(String customername) {
    this.customername = customername;
    return this;
  }

   /**
   * Get customername
   * @return customername
  **/
  @ApiModelProperty(value = "")
  public String getCustomername() {
    return customername;
  }

  public void setCustomername(String customername) {
    this.customername = customername;
  }

  public Customer accountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
    return this;
  }

   /**
   * Get accountnumber
   * @return accountnumber
  **/
  @ApiModelProperty(value = "")
  public String getAccountnumber() {
    return accountnumber;
  }

  public void setAccountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
  }

  public Customer accounttype(String accounttype) {
    this.accounttype = accounttype;
    return this;
  }

   /**
   * Get accounttype
   * @return accounttype
  **/
  @ApiModelProperty(value = "")
  public String getAccounttype() {
    return accounttype;
  }

  public void setAccounttype(String accounttype) {
    this.accounttype = accounttype;
  }

  public Customer accountbalance(Integer accountbalance) {
    this.accountbalance = accountbalance;
    return this;
  }

   /**
   * Get accountbalance
   * @return accountbalance
  **/
  @ApiModelProperty(value = "")
  public Integer getAccountbalance() {
    return accountbalance;
  }

  public void setAccountbalance(Integer accountbalance) {
    this.accountbalance = accountbalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.customername, customer.customername) &&
        Objects.equals(this.accountnumber, customer.accountnumber) &&
        Objects.equals(this.accounttype, customer.accounttype) &&
        Objects.equals(this.accountbalance, customer.accountbalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customername, accountnumber, accounttype, accountbalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customername: ").append(toIndentedString(customername)).append("\n");
    sb.append("    accountnumber: ").append(toIndentedString(accountnumber)).append("\n");
    sb.append("    accounttype: ").append(toIndentedString(accounttype)).append("\n");
    sb.append("    accountbalance: ").append(toIndentedString(accountbalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

