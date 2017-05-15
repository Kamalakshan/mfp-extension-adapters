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
import com.ibm.mfp.adapters.sample.model.DiskUsage;
import com.ibm.mfp.adapters.sample.model.MemoryUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Details about the disk and memory usage of this environment.
 */
@ApiModel(description = "Details about the disk and memory usage of this environment.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-15T10:26:38.328+05:30")
public class IndexCapacity   {
  @JsonProperty("disk_usage")
  private DiskUsage diskUsage = null;

  @JsonProperty("memory_usage")
  private MemoryUsage memoryUsage = null;

  public IndexCapacity diskUsage(DiskUsage diskUsage) {
    this.diskUsage = diskUsage;
    return this;
  }

   /**
   * Summary of the disk usage of the environment
   * @return diskUsage
  **/
  @JsonProperty("disk_usage")
  @ApiModelProperty(value = "Summary of the disk usage of the environment")

  public DiskUsage getDiskUsage() {
    return diskUsage;
  }

  public void setDiskUsage(DiskUsage diskUsage) {
    this.diskUsage = diskUsage;
  }

  public IndexCapacity memoryUsage(MemoryUsage memoryUsage) {
    this.memoryUsage = memoryUsage;
    return this;
  }

   /**
   * Summary of the memory usage of the environment
   * @return memoryUsage
  **/
  @JsonProperty("memory_usage")
  @ApiModelProperty(value = "Summary of the memory usage of the environment")

  public MemoryUsage getMemoryUsage() {
    return memoryUsage;
  }

  public void setMemoryUsage(MemoryUsage memoryUsage) {
    this.memoryUsage = memoryUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexCapacity indexCapacity = (IndexCapacity) o;
    return Objects.equals(this.diskUsage, indexCapacity.diskUsage) &&
        Objects.equals(this.memoryUsage, indexCapacity.memoryUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskUsage, memoryUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexCapacity {\n");
    
    sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
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
