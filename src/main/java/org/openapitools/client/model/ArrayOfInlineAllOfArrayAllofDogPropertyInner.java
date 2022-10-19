/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.ArrayOfInlineAllOfArrayAllofDogPropertyInnerAllOf;
import org.openapitools.client.model.DogAllOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ArrayOfInlineAllOfArrayAllofDogPropertyInner
 */
@JsonPropertyOrder({
  ArrayOfInlineAllOfArrayAllofDogPropertyInner.JSON_PROPERTY_BREED,
  ArrayOfInlineAllOfArrayAllofDogPropertyInner.JSON_PROPERTY_COLOR
})
@JsonTypeName("ArrayOfInlineAllOf_array_allof_dog_property_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArrayOfInlineAllOfArrayAllofDogPropertyInner {
  public static final String JSON_PROPERTY_BREED = "breed";
  private String breed;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public ArrayOfInlineAllOfArrayAllofDogPropertyInner() { 
  }

  public ArrayOfInlineAllOfArrayAllofDogPropertyInner breed(String breed) {
    this.breed = breed;
    return this;
  }

   /**
   * Get breed
   * @return breed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBreed() {
    return breed;
  }


  @JsonProperty(JSON_PROPERTY_BREED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreed(String breed) {
    this.breed = breed;
  }


  public ArrayOfInlineAllOfArrayAllofDogPropertyInner color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public ArrayOfInlineAllOfArrayAllofDogPropertyInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this ArrayOfInlineAllOf_array_allof_dog_property_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfInlineAllOfArrayAllofDogPropertyInner arrayOfInlineAllOfArrayAllofDogPropertyInner = (ArrayOfInlineAllOfArrayAllofDogPropertyInner) o;
    return Objects.equals(this.breed, arrayOfInlineAllOfArrayAllofDogPropertyInner.breed) &&
        Objects.equals(this.color, arrayOfInlineAllOfArrayAllofDogPropertyInner.color)&&
        Objects.equals(this.additionalProperties, arrayOfInlineAllOfArrayAllofDogPropertyInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed, color, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfInlineAllOfArrayAllofDogPropertyInner {\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
