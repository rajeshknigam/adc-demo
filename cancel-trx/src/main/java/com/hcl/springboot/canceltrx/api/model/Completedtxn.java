package com.hcl.springboot.canceltrx.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Completedtxn
 */

public class Completedtxn  implements Serializable {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("txndate")
  private DateTime txndate = null;

  @JsonProperty("merchant")
  private String merchant = null;

  @JsonProperty("txnvalue")
  private Long txnvalue = null;

  @JsonProperty("startdate")
  private DateTime startdate = null;

  @JsonProperty("enddate")
  private DateTime enddate = null;

  @JsonProperty("paymentcount")
  private Long paymentcount = null;

  @JsonProperty("totalvalue")
  private Long totalvalue = null;

  public Completedtxn id(Long id) {
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

  public Completedtxn txndate(DateTime txndate) {
    this.txndate = txndate;
    return this;
  }

   /**
   * Get txndate
   * @return txndate
  **/
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @NotNull
  public DateTime getTxndate() {
    return txndate;
  }

  public void setTxndate(DateTime txndate) {
    this.txndate = txndate;
  }

  public Completedtxn merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(example = "doggie", value = "")
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public Completedtxn txnvalue(Long txnvalue) {
    this.txnvalue = txnvalue;
    return this;
  }

   /**
   * Get txnvalue
   * @return txnvalue
  **/
  @ApiModelProperty(example = "100", value = "")
  public Long getTxnvalue() {
    return txnvalue;
  }

  public void setTxnvalue(Long txnvalue) {
    this.txnvalue = txnvalue;
  }

  public Completedtxn startdate(DateTime startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Get startdate
   * @return startdate
  **/
  @ApiModelProperty(example = "01/01/2019", value = "")
  public DateTime getStartdate() {
    return startdate;
  }

  public void setStartdate(DateTime startdate) {
    this.startdate = startdate;
  }

  public Completedtxn enddate(DateTime enddate) {
    this.enddate = enddate;
    return this;
  }

   /**
   * Get enddate
   * @return enddate
  **/
  @ApiModelProperty(example = "12/12/2019", value = "")
  public DateTime getEnddate() {
    return enddate;
  }

  public void setEnddate(DateTime enddate) {
    this.enddate = enddate;
  }

  public Completedtxn paymentcount(Long paymentcount) {
    this.paymentcount = paymentcount;
    return this;
  }

   /**
   * Get paymentcount
   * @return paymentcount
  **/
  @ApiModelProperty(example = "12", value = "")
  public Long getPaymentcount() {
    return paymentcount;
  }

  public void setPaymentcount(Long paymentcount) {
    this.paymentcount = paymentcount;
  }

  public Completedtxn totalvalue(Long totalvalue) {
    this.totalvalue = totalvalue;
    return this;
  }

   /**
   * Get totalvalue
   * @return totalvalue
  **/
  @ApiModelProperty(example = "1200", value = "")
  public Long getTotalvalue() {
    return totalvalue;
  }

  public void setTotalvalue(Long totalvalue) {
    this.totalvalue = totalvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Completedtxn completedtxn = (Completedtxn) o;
    return Objects.equals(this.id, completedtxn.id) &&
        Objects.equals(this.txndate, completedtxn.txndate) &&
        Objects.equals(this.merchant, completedtxn.merchant) &&
        Objects.equals(this.txnvalue, completedtxn.txnvalue) &&
        Objects.equals(this.startdate, completedtxn.startdate) &&
        Objects.equals(this.enddate, completedtxn.enddate) &&
        Objects.equals(this.paymentcount, completedtxn.paymentcount) &&
        Objects.equals(this.totalvalue, completedtxn.totalvalue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, txndate, merchant, txnvalue, startdate, enddate, paymentcount, totalvalue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Completedtxn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    txndate: ").append(toIndentedString(txndate)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    txnvalue: ").append(toIndentedString(txnvalue)).append("\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
    sb.append("    paymentcount: ").append(toIndentedString(paymentcount)).append("\n");
    sb.append("    totalvalue: ").append(toIndentedString(totalvalue)).append("\n");
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

