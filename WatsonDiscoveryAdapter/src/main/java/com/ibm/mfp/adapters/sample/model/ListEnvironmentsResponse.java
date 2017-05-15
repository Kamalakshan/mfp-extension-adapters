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
import com.ibm.mfp.adapters.sample.model.Environment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * ListEnvironmentsResponse
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-15T10:26:38.328+05:30")
public class ListEnvironmentsResponse   {
  @JsonProperty("environments")
  private List<Environment> environments = null;

  public ListEnvironmentsResponse environments(List<Environment> environments) {
    this.environments = environments;
    return this;
  }

  public ListEnvironmentsResponse addEnvironmentsItem(Environment environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<Environment>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

   /**
   * An array of [environments] that are available for the service instance.
   * @return environments
  **/
  @JsonProperty("environments")
  @ApiModelProperty(value = "An array of [environments] that are available for the service instance.")

  public List<Environment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<Environment> environments) {
    this.environments = environments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEnvironmentsResponse listEnvironmentsResponse = (ListEnvironmentsResponse) o;
    return Objects.equals(this.environments, listEnvironmentsResponse.environments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEnvironmentsResponse {\n");
    
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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
