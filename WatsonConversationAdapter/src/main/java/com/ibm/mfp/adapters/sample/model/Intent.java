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
 * Conversation
 * The IBM Watson&trade; Conversation service combines machine learning, natural language understanding, and integrated dialog tools to create conversation flows between your apps and your users.
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
import org.joda.time.DateTime;
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
 * Intent
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-09-04T16:39:33.075+05:30")
public class Intent   {
  @JsonProperty("intent")
  private String intent = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("updated")
  private DateTime updated = null;

  @JsonProperty("description")
  private String description = null;

  public Intent intent(String intent) {
    this.intent = intent;
    return this;
  }

   /**
   * The name of the intent.
   * @return intent
  **/
  @JsonProperty("intent")
  @ApiModelProperty(required = true, value = "The name of the intent.")
  @NotNull
  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

   /**
   * The timestamp for creation of the intent.
   * @return created
  **/
  @JsonProperty("created")
  @ApiModelProperty(required = true, value = "The timestamp for creation of the intent.")
  @NotNull
  public DateTime getCreated() {
    return created;
  }

   /**
   * The timestamp for the last update to the intent.
   * @return updated
  **/
  @JsonProperty("updated")
  @ApiModelProperty(required = true, value = "The timestamp for the last update to the intent.")
  @NotNull
  public DateTime getUpdated() {
    return updated;
  }

  public Intent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the intent.
   * @return description
  **/
  @JsonProperty("description")
  @ApiModelProperty(value = "The description of the intent.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intent intent = (Intent) o;
    return Objects.equals(this.intent, intent.intent) &&
        Objects.equals(this.created, intent.created) &&
        Objects.equals(this.updated, intent.updated) &&
        Objects.equals(this.description, intent.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, created, updated, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intent {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
