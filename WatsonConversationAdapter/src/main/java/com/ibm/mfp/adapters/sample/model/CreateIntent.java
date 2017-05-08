package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.CreateExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class CreateIntent   {
  
  private String intent = null;
  private String description = null;
  private List<CreateExample> examples = new ArrayList<CreateExample>();

  /**
   * The name of the intent.
   **/
  public CreateIntent intent(String intent) {
    this.intent = intent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the intent.")
  @JsonProperty("intent")
  public String getIntent() {
    return intent;
  }
  public void setIntent(String intent) {
    this.intent = intent;
  }

  /**
   * The description of the intent.
   **/
  public CreateIntent description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The description of the intent.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * An array of user input examples.
   **/
  public CreateIntent examples(List<CreateExample> examples) {
    this.examples = examples;
    return this;
  }

  
  @ApiModelProperty(value = "An array of user input examples.")
  @JsonProperty("examples")
  public List<CreateExample> getExamples() {
    return examples;
  }
  public void setExamples(List<CreateExample> examples) {
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
    CreateIntent createIntent = (CreateIntent) o;
    return Objects.equals(intent, createIntent.intent) &&
        Objects.equals(description, createIntent.description) &&
        Objects.equals(examples, createIntent.examples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, description, examples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIntent {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
