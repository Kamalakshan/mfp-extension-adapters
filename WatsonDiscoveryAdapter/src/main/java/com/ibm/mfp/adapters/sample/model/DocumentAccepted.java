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

/**
 * DocumentAccepted
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class DocumentAccepted   {
  @JsonProperty("document_id")
  private String documentId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("notices")
  private List<Notice> notices = null;

  public DocumentAccepted documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * The unique identifier of the ingested document
   * @return documentId
  **/
  @JsonProperty("document_id")
  @ApiModelProperty(value = "The unique identifier of the ingested document")

  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public DocumentAccepted status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the document in the ingestion process
   * @return status
  **/
  @JsonProperty("status")
  @ApiModelProperty(value = "Status of the document in the ingestion process")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DocumentAccepted notices(List<Notice> notices) {
    this.notices = notices;
    return this;
  }

  public DocumentAccepted addNoticesItem(Notice noticesItem) {
    if (this.notices == null) {
      this.notices = new ArrayList<Notice>();
    }
    this.notices.add(noticesItem);
    return this;
  }

   /**
   * Array of notices produced by the document-ingestion process
   * @return notices
  **/
  @JsonProperty("notices")
  @ApiModelProperty(value = "Array of notices produced by the document-ingestion process")

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
    DocumentAccepted documentAccepted = (DocumentAccepted) o;
    return Objects.equals(this.documentId, documentAccepted.documentId) &&
        Objects.equals(this.status, documentAccepted.status) &&
        Objects.equals(this.notices, documentAccepted.notices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, status, notices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAccepted {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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
