/*
 * Belvo API Docs
 * # Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you'll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you'll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
 *
 * The version of the OpenAPI document: 1.35.0
 * Contact: support@belvo.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.belvo.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.belvo.client.model.TaxStatusAddressBetweenStreetDian;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.belvo.client.JSON;

/**
 * The tax payer&#39;s address details.
 */
@ApiModel(description = "The tax payer's address details.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxStatusAddressDian {
  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STREET_TYPE = "street_type";
  @SerializedName(SERIALIZED_NAME_STREET_TYPE)
  private String streetType;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_EXTERIOR_NUMBER = "exterior_number";
  @SerializedName(SERIALIZED_NAME_EXTERIOR_NUMBER)
  private String exteriorNumber;

  public static final String SERIALIZED_NAME_INTERIOR_NUMBER = "interior_number";
  @SerializedName(SERIALIZED_NAME_INTERIOR_NUMBER)
  private String interiorNumber;

  public static final String SERIALIZED_NAME_SUBURB = "suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_MUNICIPALITY = "municipality";
  @SerializedName(SERIALIZED_NAME_MUNICIPALITY)
  private String municipality;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_BETWEEN_STREET = "between_street";
  @SerializedName(SERIALIZED_NAME_BETWEEN_STREET)
  private List<TaxStatusAddressBetweenStreetDian> betweenStreet = null;

  public TaxStatusAddressDian() {
  }

  public TaxStatusAddressDian postalCode(String postalCode) {

    
    
    
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postcode of the address. 
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "332-55", required = true, value = "The postcode of the address. ")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {

    
    
    
    this.postalCode = postalCode;
  }


  public TaxStatusAddressDian streetType(String streetType) {

    
    
    
    
    this.streetType = streetType;
    return this;
  }

   /**
   * The &#x60;street&#x60; type.
   * @return streetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CALLE", value = "The `street` type.")

  public String getStreetType() {
    return streetType;
  }


  public void setStreetType(String streetType) {

    
    
    
    this.streetType = streetType;
  }


  public TaxStatusAddressDian street(String street) {

    
    
    
    
    this.street = street;
    return this;
  }

   /**
   * The tax payers street.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LA MALINCHE", value = "The tax payers street.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {

    
    
    
    this.street = street;
  }


  public TaxStatusAddressDian exteriorNumber(String exteriorNumber) {

    
    
    
    
    this.exteriorNumber = exteriorNumber;
    return this;
  }

   /**
   * The street number.
   * @return exteriorNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "432", value = "The street number.")

  public String getExteriorNumber() {
    return exteriorNumber;
  }


  public void setExteriorNumber(String exteriorNumber) {

    
    
    
    this.exteriorNumber = exteriorNumber;
  }


  public TaxStatusAddressDian interiorNumber(String interiorNumber) {

    
    
    
    
    this.interiorNumber = interiorNumber;
    return this;
  }

   /**
   * Additional address information.
   * @return interiorNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AP 306", value = "Additional address information.")

  public String getInteriorNumber() {
    return interiorNumber;
  }


  public void setInteriorNumber(String interiorNumber) {

    
    
    
    this.interiorNumber = interiorNumber;
  }


  public TaxStatusAddressDian suburb(String suburb) {

    
    
    
    
    this.suburb = suburb;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return suburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public String getSuburb() {
    return suburb;
  }


  public void setSuburb(String suburb) {

    
    
    
    this.suburb = suburb;
  }


  public TaxStatusAddressDian locality(String locality) {

    
    
    
    
    this.locality = locality;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {

    
    
    
    this.locality = locality;
  }


  public TaxStatusAddressDian municipality(String municipality) {

    
    
    
    
    this.municipality = municipality;
    return this;
  }

   /**
   * The municipality of the address.
   * @return municipality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bogota DC", value = "The municipality of the address.")

  public String getMunicipality() {
    return municipality;
  }


  public void setMunicipality(String municipality) {

    
    
    
    this.municipality = municipality;
  }


  public TaxStatusAddressDian state(String state) {

    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * The state that the address is in.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bogota DC", value = "The state that the address is in.")

  public String getState() {
    return state;
  }


  public void setState(String state) {

    
    
    
    this.state = state;
  }


  public TaxStatusAddressDian betweenStreet(List<TaxStatusAddressBetweenStreetDian> betweenStreet) {

    
    
    
    
    this.betweenStreet = betweenStreet;
    return this;
  }

  public TaxStatusAddressDian addBetweenStreetItem(TaxStatusAddressBetweenStreetDian betweenStreetItem) {
    if (this.betweenStreet == null) {
      this.betweenStreet = new ArrayList<>();
    }
    this.betweenStreet.add(betweenStreetItem);
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return betweenStreet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public List<TaxStatusAddressBetweenStreetDian> getBetweenStreet() {
    return betweenStreet;
  }


  public void setBetweenStreet(List<TaxStatusAddressBetweenStreetDian> betweenStreet) {

    
    
    
    this.betweenStreet = betweenStreet;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TaxStatusAddressDian instance itself
   */
  public TaxStatusAddressDian putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxStatusAddressDian taxStatusAddressDian = (TaxStatusAddressDian) o;
    return Objects.equals(this.postalCode, taxStatusAddressDian.postalCode) &&
        Objects.equals(this.streetType, taxStatusAddressDian.streetType) &&
        Objects.equals(this.street, taxStatusAddressDian.street) &&
        Objects.equals(this.exteriorNumber, taxStatusAddressDian.exteriorNumber) &&
        Objects.equals(this.interiorNumber, taxStatusAddressDian.interiorNumber) &&
        Objects.equals(this.suburb, taxStatusAddressDian.suburb) &&
        Objects.equals(this.locality, taxStatusAddressDian.locality) &&
        Objects.equals(this.municipality, taxStatusAddressDian.municipality) &&
        Objects.equals(this.state, taxStatusAddressDian.state) &&
        Objects.equals(this.betweenStreet, taxStatusAddressDian.betweenStreet)&&
        Objects.equals(this.additionalProperties, taxStatusAddressDian.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode, streetType, street, exteriorNumber, interiorNumber, suburb, locality, municipality, state, betweenStreet, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxStatusAddressDian {\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    exteriorNumber: ").append(toIndentedString(exteriorNumber)).append("\n");
    sb.append("    interiorNumber: ").append(toIndentedString(interiorNumber)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    betweenStreet: ").append(toIndentedString(betweenStreet)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("postal_code");
    openapiFields.add("street_type");
    openapiFields.add("street");
    openapiFields.add("exterior_number");
    openapiFields.add("interior_number");
    openapiFields.add("suburb");
    openapiFields.add("locality");
    openapiFields.add("municipality");
    openapiFields.add("state");
    openapiFields.add("between_street");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("postal_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxStatusAddressDian
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxStatusAddressDian.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxStatusAddressDian is not found in the empty JSON string", TaxStatusAddressDian.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxStatusAddressDian.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("postal_code").isJsonNull() && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if (!jsonObj.get("street_type").isJsonNull() && (jsonObj.get("street_type") != null && !jsonObj.get("street_type").isJsonNull()) && !jsonObj.get("street_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_type").toString()));
      }
      if (!jsonObj.get("street").isJsonNull() && (jsonObj.get("street") != null && !jsonObj.get("street").isJsonNull()) && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
      if (!jsonObj.get("exterior_number").isJsonNull() && (jsonObj.get("exterior_number") != null && !jsonObj.get("exterior_number").isJsonNull()) && !jsonObj.get("exterior_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exterior_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exterior_number").toString()));
      }
      if (!jsonObj.get("interior_number").isJsonNull() && (jsonObj.get("interior_number") != null && !jsonObj.get("interior_number").isJsonNull()) && !jsonObj.get("interior_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interior_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interior_number").toString()));
      }
      if (!jsonObj.get("suburb").isJsonNull() && (jsonObj.get("suburb") != null && !jsonObj.get("suburb").isJsonNull()) && !jsonObj.get("suburb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suburb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suburb").toString()));
      }
      if (!jsonObj.get("locality").isJsonNull() && (jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonNull()) && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if (!jsonObj.get("municipality").isJsonNull() && (jsonObj.get("municipality") != null && !jsonObj.get("municipality").isJsonNull()) && !jsonObj.get("municipality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `municipality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("municipality").toString()));
      }
      if (!jsonObj.get("state").isJsonNull() && (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (jsonObj.get("between_street") != null && !jsonObj.get("between_street").isJsonNull()) {
        JsonArray jsonArraybetweenStreet = jsonObj.getAsJsonArray("between_street");
        if (jsonArraybetweenStreet != null) {
          // ensure the json data is an array
          if (!jsonObj.get("between_street").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `between_street` to be an array in the JSON string but got `%s`", jsonObj.get("between_street").toString()));
          }

          // validate the optional field `between_street` (array)
          for (int i = 0; i < jsonArraybetweenStreet.size(); i++) {
            TaxStatusAddressBetweenStreetDian.validateJsonObject(jsonArraybetweenStreet.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxStatusAddressDian.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxStatusAddressDian' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxStatusAddressDian> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxStatusAddressDian.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxStatusAddressDian>() {
           @Override
           public void write(JsonWriter out, TaxStatusAddressDian value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxStatusAddressDian read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxStatusAddressDian instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxStatusAddressDian given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxStatusAddressDian
  * @throws IOException if the JSON string is invalid with respect to TaxStatusAddressDian
  */
  public static TaxStatusAddressDian fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxStatusAddressDian.class);
  }

 /**
  * Convert an instance of TaxStatusAddressDian to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

