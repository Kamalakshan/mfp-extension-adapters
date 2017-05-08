package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.ExampleResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class ExampleCollection   {
  
  private List<ExampleResponse> examples = new ArrayList<ExampleResponse>();

  /**
   * An array of user input examples.
   **/
  public ExampleCollection examples(List<ExampleResponse> examples) {
    this.examples = examples;
    return this;
  }

  
  @ApiModelProperty(value = "An array of user input examples.")
  @JsonProperty("examples")
  public List<ExampleResponse> getExamples() {
    return examples;
  }
  public void setExamples(List<ExampleResponse> examples) {
    this.examples = examples;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExampleCollection exampleCollection = (ExampleCollection) o;
    return Objects.equals(examples, exampleCollection.examples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleCollection {\n");
    
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
