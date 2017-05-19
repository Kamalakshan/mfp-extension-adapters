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
import com.ibm.mfp.adapters.sample.model.DocumentCounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.constraints.*;

/**
 * A collection for storing documents
 */
@ApiModel(description = "A collection for storing documents")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class Collection   {
  @JsonProperty("collection_id")
  private String collectionId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("updated")
  private DateTime updated = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("configuration_id")
  private String configurationId = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("document_counts")
  private DocumentCounts documentCounts = null;

   /**
   * The unique identifier of the collection
   * @return collectionId
  **/
  @JsonProperty("collection_id")
  @ApiModelProperty(value = "The unique identifier of the collection")

  public String getCollectionId() {
    return collectionId;
  }

  public Collection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the collection
   * @return name
  **/
  @JsonProperty("name")
  @ApiModelProperty(value = "The name of the collection")
 @Size(min=0,max=255)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Collection description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the collection
   * @return description
  **/
  @JsonProperty("description")
  @ApiModelProperty(value = "The description of the collection")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The creation date of the collection in the format yyyy-MM-dd'T'HH:mmcon:ss.SSS'Z'
   * @return created
  **/
  @JsonProperty("created")
  @ApiModelProperty(value = "The creation date of the collection in the format yyyy-MM-dd'T'HH:mmcon:ss.SSS'Z'")

  public DateTime getCreated() {
    return created;
  }

   /**
   * The timestamp of when the collection was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
   * @return updated
  **/
  @JsonProperty("updated")
  @ApiModelProperty(value = "The timestamp of when the collection was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")

  public DateTime getUpdated() {
    return updated;
  }

   /**
   * The status of the collection
   * @return status
  **/
  @JsonProperty("status")
  @ApiModelProperty(value = "The status of the collection")

  public String getStatus() {
    return status;
  }

  public Collection configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * The unique identifier of the collection's configuration
   * @return configurationId
  **/
  @JsonProperty("configuration_id")
  @ApiModelProperty(value = "The unique identifier of the collection's configuration")

  public String getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }

  public Collection language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of the documents stored in the collection. The only currently accepted value is en_us (U.S. English)
   * @return language
  **/
  @JsonProperty("language")
  @ApiModelProperty(value = "The language of the documents stored in the collection. The only currently accepted value is en_us (U.S. English)")

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Collection documentCounts(DocumentCounts documentCounts) {
    this.documentCounts = documentCounts;
    return this;
  }

   /**
   * The object providing information about the documents in the collection. Present only when retrieving details of a colleciton
   * @return documentCounts
  **/
  @JsonProperty("document_counts")
  @ApiModelProperty(value = "The object providing information about the documents in the collection. Present only when retrieving details of a colleciton")

  public DocumentCounts getDocumentCounts() {
    return documentCounts;
  }

  public void setDocumentCounts(DocumentCounts documentCounts) {
    this.documentCounts = documentCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collection collection = (Collection) o;
    return Objects.equals(this.collectionId, collection.collectionId) &&
        Objects.equals(this.name, collection.name) &&
        Objects.equals(this.description, collection.description) &&
        Objects.equals(this.created, collection.created) &&
        Objects.equals(this.updated, collection.updated) &&
        Objects.equals(this.status, collection.status) &&
        Objects.equals(this.configurationId, collection.configurationId) &&
        Objects.equals(this.language, collection.language) &&
        Objects.equals(this.documentCounts, collection.documentCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, name, description, created, updated, status, configurationId, language, documentCounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collection {\n");
    
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    documentCounts: ").append(toIndentedString(documentCounts)).append("\n");
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
