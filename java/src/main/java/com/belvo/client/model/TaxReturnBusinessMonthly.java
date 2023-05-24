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
import java.io.File;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
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
 * TaxReturnBusinessMonthly
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxReturnBusinessMonthly {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_INFORMACION_GENERAL = "informacion_general";
  @SerializedName(SERIALIZED_NAME_INFORMACION_GENERAL)
  private Object informacionGeneral;

  public static final String SERIALIZED_NAME_DETERMINACION_ISR = "determinacion_isr";
  @SerializedName(SERIALIZED_NAME_DETERMINACION_ISR)
  private Object determinacionIsr;

  public static final String SERIALIZED_NAME_DETALLE_PAGO_ISR = "detalle_pago_isr";
  @SerializedName(SERIALIZED_NAME_DETALLE_PAGO_ISR)
  private Object detallePagoIsr;

  public static final String SERIALIZED_NAME_DETERMINACION_IVA = "determinacion_iva";
  @SerializedName(SERIALIZED_NAME_DETERMINACION_IVA)
  private Object determinacionIva;

  public static final String SERIALIZED_NAME_DETALLE_PAGO_IVA = "detalle_pago_iva";
  @SerializedName(SERIALIZED_NAME_DETALLE_PAGO_IVA)
  private Object detallePagoIva;

  public static final String SERIALIZED_NAME_PDF = "pdf";
  @SerializedName(SERIALIZED_NAME_PDF)
  private File pdf;

  public static final String SERIALIZED_NAME_RECEIPT_PDF = "receipt_pdf";
  @SerializedName(SERIALIZED_NAME_RECEIPT_PDF)
  private File receiptPdf;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public TaxReturnBusinessMonthly() {
  }

  public TaxReturnBusinessMonthly id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier created by Belvo used to reference the current Tax Return.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0d3ffb69-f83b-456e-ad8e-208d0998d71d", value = "Unique identifier created by Belvo used to reference the current Tax Return.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public TaxReturnBusinessMonthly collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {

    
    
    
    this.collectedAt = collectedAt;
  }


  public TaxReturnBusinessMonthly createdAt(OffsetDateTime createdAt) {

    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", value = "The ISO-8601 timestamp of when the data point was last updated in Belvo's database.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {

    
    
    
    this.createdAt = createdAt;
  }


  public TaxReturnBusinessMonthly informacionGeneral(Object informacionGeneral) {

    
    
    
    
    this.informacionGeneral = informacionGeneral;
    return this;
  }

   /**
   * General information regarding the tax return (year, RFC, return type, person/company name, and so on).
   * @return informacionGeneral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "General information regarding the tax return (year, RFC, return type, person/company name, and so on).")

  public Object getInformacionGeneral() {
    return informacionGeneral;
  }


  public void setInformacionGeneral(Object informacionGeneral) {

    
    
    
    this.informacionGeneral = informacionGeneral;
  }


  public TaxReturnBusinessMonthly determinacionIsr(Object determinacionIsr) {

    
    
    
    
    this.determinacionIsr = determinacionIsr;
    return this;
  }

   /**
   * Information used to calculate the provisional income tax for the period.
   * @return determinacionIsr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information used to calculate the provisional income tax for the period.")

  public Object getDeterminacionIsr() {
    return determinacionIsr;
  }


  public void setDeterminacionIsr(Object determinacionIsr) {

    
    
    
    this.determinacionIsr = determinacionIsr;
  }


  public TaxReturnBusinessMonthly detallePagoIsr(Object detallePagoIsr) {

    
    
    
    
    this.detallePagoIsr = detallePagoIsr;
    return this;
  }

   /**
   * Information on the monthly provisional payments for the income tax.
   * @return detallePagoIsr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information on the monthly provisional payments for the income tax.")

  public Object getDetallePagoIsr() {
    return detallePagoIsr;
  }


  public void setDetallePagoIsr(Object detallePagoIsr) {

    
    
    
    this.detallePagoIsr = detallePagoIsr;
  }


  public TaxReturnBusinessMonthly determinacionIva(Object determinacionIva) {

    
    
    
    
    this.determinacionIva = determinacionIva;
    return this;
  }

   /**
   * Information used to calculate the provisional VAT tax for the period.
   * @return determinacionIva
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information used to calculate the provisional VAT tax for the period.")

  public Object getDeterminacionIva() {
    return determinacionIva;
  }


  public void setDeterminacionIva(Object determinacionIva) {

    
    
    
    this.determinacionIva = determinacionIva;
  }


  public TaxReturnBusinessMonthly detallePagoIva(Object detallePagoIva) {

    
    
    
    
    this.detallePagoIva = detallePagoIva;
    return this;
  }

   /**
   * Information on the monthly provisional payments for the VAT tax.
   * @return detallePagoIva
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Information on the monthly provisional payments for the VAT tax.")

  public Object getDetallePagoIva() {
    return detallePagoIva;
  }


  public void setDetallePagoIva(Object detallePagoIva) {

    
    
    
    this.detallePagoIva = detallePagoIva;
  }


  public TaxReturnBusinessMonthly pdf(File pdf) {

    
    
    
    
    this.pdf = pdf;
    return this;
  }

   /**
   * Tax return PDF as a binary.
   * @return pdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@2b0eec25", required = true, value = "Tax return PDF as a binary.")

  public File getPdf() {
    return pdf;
  }


  public void setPdf(File pdf) {

    
    
    
    this.pdf = pdf;
  }


  public TaxReturnBusinessMonthly receiptPdf(File receiptPdf) {

    
    
    
    
    this.receiptPdf = receiptPdf;
    return this;
  }

   /**
   * The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   * @return receiptPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[B@59525774", value = "The acknowledgement receipt from the fiscal institution confirming that they received the tax return.")

  public File getReceiptPdf() {
    return receiptPdf;
  }


  public void setReceiptPdf(File receiptPdf) {

    
    
    
    this.receiptPdf = receiptPdf;
  }


  public TaxReturnBusinessMonthly type(String type) {

    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of tax return. Can be either monthly or annual.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "monthly", required = true, value = "The type of tax return. Can be either monthly or annual.")

  public String getType() {
    return type;
  }


  public void setType(String type) {

    
    
    
    this.type = type;
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
   * @return the TaxReturnBusinessMonthly instance itself
   */
  public TaxReturnBusinessMonthly putAdditionalProperty(String key, Object value) {
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
    TaxReturnBusinessMonthly taxReturnBusinessMonthly = (TaxReturnBusinessMonthly) o;
    return Objects.equals(this.id, taxReturnBusinessMonthly.id) &&
        Objects.equals(this.collectedAt, taxReturnBusinessMonthly.collectedAt) &&
        Objects.equals(this.createdAt, taxReturnBusinessMonthly.createdAt) &&
        Objects.equals(this.informacionGeneral, taxReturnBusinessMonthly.informacionGeneral) &&
        Objects.equals(this.determinacionIsr, taxReturnBusinessMonthly.determinacionIsr) &&
        Objects.equals(this.detallePagoIsr, taxReturnBusinessMonthly.detallePagoIsr) &&
        Objects.equals(this.determinacionIva, taxReturnBusinessMonthly.determinacionIva) &&
        Objects.equals(this.detallePagoIva, taxReturnBusinessMonthly.detallePagoIva) &&
        Objects.equals(this.pdf, taxReturnBusinessMonthly.pdf) &&
        Objects.equals(this.receiptPdf, taxReturnBusinessMonthly.receiptPdf) &&
        Objects.equals(this.type, taxReturnBusinessMonthly.type)&&
        Objects.equals(this.additionalProperties, taxReturnBusinessMonthly.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectedAt, createdAt, informacionGeneral, determinacionIsr, detallePagoIsr, determinacionIva, detallePagoIva, pdf, receiptPdf, type, additionalProperties);
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
    sb.append("class TaxReturnBusinessMonthly {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    informacionGeneral: ").append(toIndentedString(informacionGeneral)).append("\n");
    sb.append("    determinacionIsr: ").append(toIndentedString(determinacionIsr)).append("\n");
    sb.append("    detallePagoIsr: ").append(toIndentedString(detallePagoIsr)).append("\n");
    sb.append("    determinacionIva: ").append(toIndentedString(determinacionIva)).append("\n");
    sb.append("    detallePagoIva: ").append(toIndentedString(detallePagoIva)).append("\n");
    sb.append("    pdf: ").append(toIndentedString(pdf)).append("\n");
    sb.append("    receiptPdf: ").append(toIndentedString(receiptPdf)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("collected_at");
    openapiFields.add("created_at");
    openapiFields.add("informacion_general");
    openapiFields.add("determinacion_isr");
    openapiFields.add("detalle_pago_isr");
    openapiFields.add("determinacion_iva");
    openapiFields.add("detalle_pago_iva");
    openapiFields.add("pdf");
    openapiFields.add("receipt_pdf");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("informacion_general");
    openapiRequiredFields.add("determinacion_isr");
    openapiRequiredFields.add("detalle_pago_isr");
    openapiRequiredFields.add("determinacion_iva");
    openapiRequiredFields.add("detalle_pago_iva");
    openapiRequiredFields.add("pdf");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxReturnBusinessMonthly
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxReturnBusinessMonthly.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxReturnBusinessMonthly is not found in the empty JSON string", TaxReturnBusinessMonthly.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxReturnBusinessMonthly.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonNull() && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxReturnBusinessMonthly.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxReturnBusinessMonthly' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxReturnBusinessMonthly> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxReturnBusinessMonthly.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxReturnBusinessMonthly>() {
           @Override
           public void write(JsonWriter out, TaxReturnBusinessMonthly value) throws IOException {
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
           public TaxReturnBusinessMonthly read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxReturnBusinessMonthly instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxReturnBusinessMonthly given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxReturnBusinessMonthly
  * @throws IOException if the JSON string is invalid with respect to TaxReturnBusinessMonthly
  */
  public static TaxReturnBusinessMonthly fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxReturnBusinessMonthly.class);
  }

 /**
  * Convert an instance of TaxReturnBusinessMonthly to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

