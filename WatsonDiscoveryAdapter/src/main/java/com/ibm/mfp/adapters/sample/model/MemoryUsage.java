/*
 * Discovery
 * The IBM Watson&trade; Discovery Service is a cognitive search and content analytics engine that you can add to applications to identify patterns, trends and actionable insights to drive better decision-making. Securely unify structured and unstructured data with pre-enriched content, and use a simplified query language to eliminate the need for manual filtering of results. 
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * Summary of the memory usage statistics for this environment
 */
@ApiModel(description = "Summary of the memory usage statistics for this environment")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class MemoryUsage   {
  @JsonProperty("used_bytes")
  private BigDecimal usedBytes = null;

  @JsonProperty("total_bytes")
  private BigDecimal totalBytes = null;

  @JsonProperty("used")
  private String used = null;

  @JsonProperty("total")
  private String total = null;

  @JsonProperty("percent_used")
  private Double percentUsed = null;

   /**
   * Number of bytes used in the environment's memory capacity
   * @return usedBytes
  **/
  @JsonProperty("used_bytes")
  @ApiModelProperty(value = "Number of bytes used in the environment's memory capacity")

  public BigDecimal getUsedBytes() {
    return usedBytes;
  }

   /**
   * Total number of bytes available in the environment's memory capacity
   * @return totalBytes
  **/
  @JsonProperty("total_bytes")
  @ApiModelProperty(value = "Total number of bytes available in the environment's memory capacity")

  public BigDecimal getTotalBytes() {
    return totalBytes;
  }

   /**
   * Amount of memory capacity used, in KB or GB format
   * @return used
  **/
  @JsonProperty("used")
  @ApiModelProperty(value = "Amount of memory capacity used, in KB or GB format")

  public String getUsed() {
    return used;
  }

   /**
   * Total amount of the environment's memory capacity, in KB or GB format
   * @return total
  **/
  @JsonProperty("total")
  @ApiModelProperty(value = "Total amount of the environment's memory capacity, in KB or GB format")

  public String getTotal() {
    return total;
  }

   /**
   * Percentage of the environment's memory capacity that is being used
   * @return percentUsed
  **/
  @JsonProperty("percent_used")
  @ApiModelProperty(value = "Percentage of the environment's memory capacity that is being used")

  public Double getPercentUsed() {
    return percentUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoryUsage memoryUsage = (MemoryUsage) o;
    return Objects.equals(this.usedBytes, memoryUsage.usedBytes) &&
        Objects.equals(this.totalBytes, memoryUsage.totalBytes) &&
        Objects.equals(this.used, memoryUsage.used) &&
        Objects.equals(this.total, memoryUsage.total) &&
        Objects.equals(this.percentUsed, memoryUsage.percentUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usedBytes, totalBytes, used, total, percentUsed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoryUsage {\n");
    
    sb.append("    usedBytes: ").append(toIndentedString(usedBytes)).append("\n");
    sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    percentUsed: ").append(toIndentedString(percentUsed)).append("\n");
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
