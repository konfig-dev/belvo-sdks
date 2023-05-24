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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Details regarding the sender. 
 */
@ApiModel(description = "Details regarding the sender. ")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoiceSenderDetailsDian {
  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_TAX_PAYER_TYPE = "tax_payer_type";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_TYPE)
  private String taxPayerType;

  public static final String SERIALIZED_NAME_REGIMEN = "regimen";
  @SerializedName(SERIALIZED_NAME_REGIMEN)
  private String regimen;

  public static final String SERIALIZED_NAME_TAX_SCHEME = "tax_scheme";
  @SerializedName(SERIALIZED_NAME_TAX_SCHEME)
  private String taxScheme;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public InvoiceSenderDetailsDian() {
  }

  public InvoiceSenderDetailsDian collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-23T21:32:55.336854Z", value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {

    
    
    
    this.collectedAt = collectedAt;
  }


  public InvoiceSenderDetailsDian taxPayerType(String taxPayerType) {

    
    
    
    
    this.taxPayerType = taxPayerType;
    return this;
  }

   /**
   * Indicates if the sender is a business or an individual. Can be either:      - &#x60;Persona Jurídica&#x60;   - &#x60;Persona Natural&#x60; 
   * @return taxPayerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Persona Natural", value = "Indicates if the sender is a business or an individual. Can be either:      - `Persona Jurídica`   - `Persona Natural` ")

  public String getTaxPayerType() {
    return taxPayerType;
  }


  public void setTaxPayerType(String taxPayerType) {

    
    
    
    this.taxPayerType = taxPayerType;
  }


  public InvoiceSenderDetailsDian regimen(String regimen) {

    
    
    
    
    this.regimen = regimen;
    return this;
  }

   /**
   * The sender&#39;s regimen type.  For detailed information regarding DIAN&#39;s regimens, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).  
   * @return regimen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Régimen Simple de Tributación - SIMPLE", value = "The sender's regimen type.  For detailed information regarding DIAN's regimens, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).  ")

  public String getRegimen() {
    return regimen;
  }


  public void setRegimen(String regimen) {

    
    
    
    this.regimen = regimen;
  }


  public InvoiceSenderDetailsDian taxScheme(String taxScheme) {

    
    
    
    
    this.taxScheme = taxScheme;
    return this;
  }

   /**
   * The sender&#39;s fiscal responsibilities.  For detailed information regarding DIAN&#39;s tax schemes, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).  
   * @return taxScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01-IVA", value = "The sender's fiscal responsibilities.  For detailed information regarding DIAN's tax schemes, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).  ")

  public String getTaxScheme() {
    return taxScheme;
  }


  public void setTaxScheme(String taxScheme) {

    
    
    
    this.taxScheme = taxScheme;
  }


  public InvoiceSenderDetailsDian country(String country) {

    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * The country where the sender pays their taxes. 
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Colombia", value = "The country where the sender pays their taxes. ")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {

    
    
    
    this.country = country;
  }


  public InvoiceSenderDetailsDian address(String address) {

    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * The sender&#39;s address. 
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Calle 144 No. 12-09", value = "The sender's address. ")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {

    
    
    
    this.address = address;
  }


  public InvoiceSenderDetailsDian phoneNumber(String phoneNumber) {

    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The sender&#39;s phone number. 
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "576606522566", value = "The sender's phone number. ")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {

    
    
    
    this.phoneNumber = phoneNumber;
  }


  public InvoiceSenderDetailsDian email(String email) {

    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The sender&#39;s email address. 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "acme_colombia@gmail.com", value = "The sender's email address. ")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {

    
    
    
    this.email = email;
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
   * @return the InvoiceSenderDetailsDian instance itself
   */
  public InvoiceSenderDetailsDian putAdditionalProperty(String key, Object value) {
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
    InvoiceSenderDetailsDian invoiceSenderDetailsDian = (InvoiceSenderDetailsDian) o;
    return Objects.equals(this.collectedAt, invoiceSenderDetailsDian.collectedAt) &&
        Objects.equals(this.taxPayerType, invoiceSenderDetailsDian.taxPayerType) &&
        Objects.equals(this.regimen, invoiceSenderDetailsDian.regimen) &&
        Objects.equals(this.taxScheme, invoiceSenderDetailsDian.taxScheme) &&
        Objects.equals(this.country, invoiceSenderDetailsDian.country) &&
        Objects.equals(this.address, invoiceSenderDetailsDian.address) &&
        Objects.equals(this.phoneNumber, invoiceSenderDetailsDian.phoneNumber) &&
        Objects.equals(this.email, invoiceSenderDetailsDian.email)&&
        Objects.equals(this.additionalProperties, invoiceSenderDetailsDian.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectedAt, taxPayerType, regimen, taxScheme, country, address, phoneNumber, email, additionalProperties);
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
    sb.append("class InvoiceSenderDetailsDian {\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    taxPayerType: ").append(toIndentedString(taxPayerType)).append("\n");
    sb.append("    regimen: ").append(toIndentedString(regimen)).append("\n");
    sb.append("    taxScheme: ").append(toIndentedString(taxScheme)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("collected_at");
    openapiFields.add("tax_payer_type");
    openapiFields.add("regimen");
    openapiFields.add("tax_scheme");
    openapiFields.add("country");
    openapiFields.add("address");
    openapiFields.add("phone_number");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceSenderDetailsDian
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoiceSenderDetailsDian.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceSenderDetailsDian is not found in the empty JSON string", InvoiceSenderDetailsDian.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("tax_payer_type").isJsonNull() && (jsonObj.get("tax_payer_type") != null && !jsonObj.get("tax_payer_type").isJsonNull()) && !jsonObj.get("tax_payer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_payer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_payer_type").toString()));
      }
      if (!jsonObj.get("regimen").isJsonNull() && (jsonObj.get("regimen") != null && !jsonObj.get("regimen").isJsonNull()) && !jsonObj.get("regimen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regimen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regimen").toString()));
      }
      if (!jsonObj.get("tax_scheme").isJsonNull() && (jsonObj.get("tax_scheme") != null && !jsonObj.get("tax_scheme").isJsonNull()) && !jsonObj.get("tax_scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_scheme").toString()));
      }
      if (!jsonObj.get("country").isJsonNull() && (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("address").isJsonNull() && (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("phone_number").isJsonNull() && (jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceSenderDetailsDian.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceSenderDetailsDian' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceSenderDetailsDian> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceSenderDetailsDian.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceSenderDetailsDian>() {
           @Override
           public void write(JsonWriter out, InvoiceSenderDetailsDian value) throws IOException {
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
           public InvoiceSenderDetailsDian read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceSenderDetailsDian instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceSenderDetailsDian given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceSenderDetailsDian
  * @throws IOException if the JSON string is invalid with respect to InvoiceSenderDetailsDian
  */
  public static InvoiceSenderDetailsDian fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceSenderDetailsDian.class);
  }

 /**
  * Convert an instance of InvoiceSenderDetailsDian to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

