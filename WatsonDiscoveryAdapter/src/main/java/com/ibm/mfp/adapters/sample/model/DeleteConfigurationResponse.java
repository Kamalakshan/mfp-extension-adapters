/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


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
import com.ibm.mfp.adapters.sample.model.Notice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


/**
 * DeleteConfigurationResponse
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T17:22:26.527+05:30")
public class DeleteConfigurationResponse   {
  @JsonProperty("configuration_id")
  private String configurationId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("notices")
  private List<Notice> notices = null;

  public DeleteConfigurationResponse configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * The unique identifier for the configuration
   * @return configurationId
  **/
  @JsonProperty("configuration_id")
  @ApiModelProperty(required = true, value = "The unique identifier for the configuration")
  @NotNull
  public String getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }

  public DeleteConfigurationResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the configuration. A deleted configuration has the status deleted
   * @return status
  **/
  @JsonProperty("status")
  @ApiModelProperty(required = true, value = "Status of the configuration. A deleted configuration has the status deleted")
  @NotNull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DeleteConfigurationResponse notices(List<Notice> notices) {
    this.notices = notices;
    return this;
  }

  public DeleteConfigurationResponse addNoticesItem(Notice noticesItem) {
    if (this.notices == null) {
      this.notices = new ArrayList<Notice>();
    }
    this.notices.add(noticesItem);
    return this;
  }

   /**
   * An array of notice messages, if any
   * @return notices
  **/
  @JsonProperty("notices")
  @ApiModelProperty(value = "An array of notice messages, if any")
  public List<Notice> getNotices() {
    return notices;
  }

  public void setNotices(List<Notice> notices) {
    this.notices = notices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteConfigurationResponse deleteConfigurationResponse = (DeleteConfigurationResponse) o;
    return Objects.equals(this.configurationId, deleteConfigurationResponse.configurationId) &&
        Objects.equals(this.status, deleteConfigurationResponse.status) &&
        Objects.equals(this.notices, deleteConfigurationResponse.notices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationId, status, notices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteConfigurationResponse {\n");
    
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notices: ").append(toIndentedString(notices)).append("\n");
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

