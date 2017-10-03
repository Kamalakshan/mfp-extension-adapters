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
 * Language Translator
 * Language Translator translates text from one language to another. The service offers multiple domain-specific models that you can customize based on your unique terminology and language. Use Language Translator to take news from across the globe and present it in your language, communicate with your customers in their own language, and more.
 *
 * OpenAPI spec version: 2.0.0
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
 * IdentifiedLanguage
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-10-03T18:29:51.729+05:30")
public class IdentifiedLanguage   {
  @JsonProperty("language")
  private String language = null;

  @JsonProperty("confidence")
  private Double confidence = null;

  public IdentifiedLanguage language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The code for an identified language.
   * @return language
  **/
  @JsonProperty("language")
  @ApiModelProperty(required = true, value = "The code for an identified language.")
  @NotNull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public IdentifiedLanguage confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * The confidence score for the identified language.
   * minimum: 0
   * maximum: 1
   * @return confidence
  **/
  @JsonProperty("confidence")
  @ApiModelProperty(required = true, value = "The confidence score for the identified language.")
  @NotNull
 @DecimalMin("0") @DecimalMax("1")  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) o;
    return Objects.equals(this.language, identifiedLanguage.language) &&
        Objects.equals(this.confidence, identifiedLanguage.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, confidence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifiedLanguage {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
