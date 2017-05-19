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
import javax.validation.constraints.*;

/**
 * DocumentCounts
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class DocumentCounts   {
  @JsonProperty("available")
  private Long available = null;

  @JsonProperty("processing")
  private Long processing = null;

  @JsonProperty("failed")
  private Long failed = null;

   /**
   * The total number of available documents in the collection
   * @return available
  **/
  @JsonProperty("available")
  @ApiModelProperty(value = "The total number of available documents in the collection")

  public Long getAvailable() {
    return available;
  }

   /**
   * The number of documents in the collection that are currently being processed
   * @return processing
  **/
  @JsonProperty("processing")
  @ApiModelProperty(value = "The number of documents in the collection that are currently being processed")

  public Long getProcessing() {
    return processing;
  }

   /**
   * The number of documents in the collection that failed to be ingested
   * @return failed
  **/
  @JsonProperty("failed")
  @ApiModelProperty(value = "The number of documents in the collection that failed to be ingested")

  public Long getFailed() {
    return failed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCounts documentCounts = (DocumentCounts) o;
    return Objects.equals(this.available, documentCounts.available) &&
        Objects.equals(this.processing, documentCounts.processing) &&
        Objects.equals(this.failed, documentCounts.failed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, processing, failed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCounts {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
