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
import com.belvo.client.model.InvoiceDetailRetainedTaxSat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.belvo.client.JSON;

/**
 * InvoiceDetailSat
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoiceDetailSat {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRODUCT_IDENTIFICATION = "product_identification";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDENTIFICATION)
  private String productIdentification;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_UNIT_CODE = "unit_code";
  @SerializedName(SERIALIZED_NAME_UNIT_CODE)
  private String unitCode;

  public static final String SERIALIZED_NAME_UNIT_DESCRIPTION = "unit_description";
  @SerializedName(SERIALIZED_NAME_UNIT_DESCRIPTION)
  private String unitDescription;

  public static final String SERIALIZED_NAME_UNIT_AMOUNT = "unit_amount";
  @SerializedName(SERIALIZED_NAME_UNIT_AMOUNT)
  private Float unitAmount;

  public static final String SERIALIZED_NAME_TAX_TYPE = "tax_type";
  @SerializedName(SERIALIZED_NAME_TAX_TYPE)
  private String taxType;

  public static final String SERIALIZED_NAME_PRE_TAX_AMOUNT = "pre_tax_amount";
  @SerializedName(SERIALIZED_NAME_PRE_TAX_AMOUNT)
  private Float preTaxAmount;

  public static final String SERIALIZED_NAME_TAX_PERCENTAGE = "tax_percentage";
  @SerializedName(SERIALIZED_NAME_TAX_PERCENTAGE)
  private Float taxPercentage;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Float taxAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Float totalAmount;

  public static final String SERIALIZED_NAME_RETAINED_TAXES = "retained_taxes";
  @SerializedName(SERIALIZED_NAME_RETAINED_TAXES)
  private List<InvoiceDetailRetainedTaxSat> retainedTaxes = null;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public InvoiceDetailSat() {
  }

  public InvoiceDetailSat description(String description) {
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the invoice item (an invoice can have one or more items).
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "December 2019 accounting fees", required = true, value = "The description of the invoice item (an invoice can have one or more items).")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    this.description = description;
  }


  public InvoiceDetailSat productIdentification(String productIdentification) {
    
    
    this.productIdentification = productIdentification;
    return this;
  }

   /**
   * The identification code of the product or the service, as defined by the legal entity in the country. - 🇲🇽 [Mexico](http://200.57.3.89/Pys/catPyS.aspx) 
   * @return productIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "84101600", required = true, value = "The identification code of the product or the service, as defined by the legal entity in the country. - 🇲🇽 [Mexico](http://200.57.3.89/Pys/catPyS.aspx) ")

  public String getProductIdentification() {
    return productIdentification;
  }


  public void setProductIdentification(String productIdentification) {
    
    this.productIdentification = productIdentification;
  }


  public InvoiceDetailSat quantity(Integer quantity) {
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of this invoice item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", required = true, value = "The quantity of this invoice item.")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    
    this.quantity = quantity;
  }


  public InvoiceDetailSat unitCode(String unitCode) {
    
    
    this.unitCode = unitCode;
    return this;
  }

   /**
   * The unit of measure, as defined by the legal entity in the country.  - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) 
   * @return unitCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "E48", required = true, value = "The unit of measure, as defined by the legal entity in the country.  - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) ")

  public String getUnitCode() {
    return unitCode;
  }


  public void setUnitCode(String unitCode) {
    
    this.unitCode = unitCode;
  }


  public InvoiceDetailSat unitDescription(String unitDescription) {
    
    
    this.unitDescription = unitDescription;
    return this;
  }

   /**
   * The description of the item, as defined by the legal entity in the country. - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) 
   * @return unitDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unidad de servicio", required = true, value = "The description of the item, as defined by the legal entity in the country. - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code) ")

  public String getUnitDescription() {
    return unitDescription;
  }


  public void setUnitDescription(String unitDescription) {
    
    this.unitDescription = unitDescription;
  }


  public InvoiceDetailSat unitAmount(Float unitAmount) {
    
    
    this.unitAmount = unitAmount;
    return this;
  }

   /**
   * The price of one a singular item.
   * @return unitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", required = true, value = "The price of one a singular item.")

  public Float getUnitAmount() {
    return unitAmount;
  }


  public void setUnitAmount(Float unitAmount) {
    
    this.unitAmount = unitAmount;
  }


  public InvoiceDetailSat taxType(String taxType) {
    
    
    this.taxType = taxType;
    return this;
  }

   /**
   * **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. 
   * @return taxType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Note**: This field is not applicable for DIAN Colombia and will return `null`. ")

  public String getTaxType() {
    return taxType;
  }


  public void setTaxType(String taxType) {
    
    this.taxType = taxType;
  }


  public InvoiceDetailSat preTaxAmount(Float preTaxAmount) {
    
    
    this.preTaxAmount = preTaxAmount;
    return this;
  }

   /**
   * The total price for this item before tax is applied (&#x60;quantity&#x60; x &#x60;unit_amount&#x60;).
   * @return preTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400", required = true, value = "The total price for this item before tax is applied (`quantity` x `unit_amount`).")

  public Float getPreTaxAmount() {
    return preTaxAmount;
  }


  public void setPreTaxAmount(Float preTaxAmount) {
    
    this.preTaxAmount = preTaxAmount;
  }


  public InvoiceDetailSat taxPercentage(Float taxPercentage) {
    
    
    this.taxPercentage = taxPercentage;
    return this;
  }

   /**
   * The tax percentage to apply.
   * @return taxPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16", required = true, value = "The tax percentage to apply.")

  public Float getTaxPercentage() {
    return taxPercentage;
  }


  public void setTaxPercentage(Float taxPercentage) {
    
    this.taxPercentage = taxPercentage;
  }


  public InvoiceDetailSat taxAmount(Float taxAmount) {
    
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * The amount of tax for this invoice item (&#x60;pre_tax_amount&#x60; x &#x60;tax_percentage&#x60;).
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "64", required = true, value = "The amount of tax for this invoice item (`pre_tax_amount` x `tax_percentage`).")

  public Float getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(Float taxAmount) {
    
    this.taxAmount = taxAmount;
  }


  public InvoiceDetailSat totalAmount(Float totalAmount) {
    
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total price for this invoice item (&#x60;pre_tax_amount&#x60; + &#x60;tax_amount&#x60;).
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "464", required = true, value = "The total price for this invoice item (`pre_tax_amount` + `tax_amount`).")

  public Float getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Float totalAmount) {
    
    this.totalAmount = totalAmount;
  }


  public InvoiceDetailSat retainedTaxes(List<InvoiceDetailRetainedTaxSat> retainedTaxes) {
    
    
    this.retainedTaxes = retainedTaxes;
    return this;
  }

  public InvoiceDetailSat addRetainedTaxesItem(InvoiceDetailRetainedTaxSat retainedTaxesItem) {
    if (this.retainedTaxes == null) {
      this.retainedTaxes = new ArrayList<>();
    }
    this.retainedTaxes.add(retainedTaxesItem);
    return this;
  }

   /**
   * The retained tax on the invoice item.
   * @return retainedTaxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The retained tax on the invoice item.")

  public List<InvoiceDetailRetainedTaxSat> getRetainedTaxes() {
    return retainedTaxes;
  }


  public void setRetainedTaxes(List<InvoiceDetailRetainedTaxSat> retainedTaxes) {
    
    this.retainedTaxes = retainedTaxes;
  }


  public InvoiceDetailSat collectedAt(OffsetDateTime collectedAt) {
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
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
   * @return the InvoiceDetailSat instance itself
   */
  public InvoiceDetailSat putAdditionalProperty(String key, Object value) {
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
    InvoiceDetailSat invoiceDetailSat = (InvoiceDetailSat) o;
    return Objects.equals(this.description, invoiceDetailSat.description) &&
        Objects.equals(this.productIdentification, invoiceDetailSat.productIdentification) &&
        Objects.equals(this.quantity, invoiceDetailSat.quantity) &&
        Objects.equals(this.unitCode, invoiceDetailSat.unitCode) &&
        Objects.equals(this.unitDescription, invoiceDetailSat.unitDescription) &&
        Objects.equals(this.unitAmount, invoiceDetailSat.unitAmount) &&
        Objects.equals(this.taxType, invoiceDetailSat.taxType) &&
        Objects.equals(this.preTaxAmount, invoiceDetailSat.preTaxAmount) &&
        Objects.equals(this.taxPercentage, invoiceDetailSat.taxPercentage) &&
        Objects.equals(this.taxAmount, invoiceDetailSat.taxAmount) &&
        Objects.equals(this.totalAmount, invoiceDetailSat.totalAmount) &&
        Objects.equals(this.retainedTaxes, invoiceDetailSat.retainedTaxes) &&
        Objects.equals(this.collectedAt, invoiceDetailSat.collectedAt)&&
        Objects.equals(this.additionalProperties, invoiceDetailSat.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, productIdentification, quantity, unitCode, unitDescription, unitAmount, taxType, preTaxAmount, taxPercentage, taxAmount, totalAmount, retainedTaxes, collectedAt, additionalProperties);
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
    sb.append("class InvoiceDetailSat {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productIdentification: ").append(toIndentedString(productIdentification)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    preTaxAmount: ").append(toIndentedString(preTaxAmount)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    retainedTaxes: ").append(toIndentedString(retainedTaxes)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("product_identification");
    openapiFields.add("quantity");
    openapiFields.add("unit_code");
    openapiFields.add("unit_description");
    openapiFields.add("unit_amount");
    openapiFields.add("tax_type");
    openapiFields.add("pre_tax_amount");
    openapiFields.add("tax_percentage");
    openapiFields.add("tax_amount");
    openapiFields.add("total_amount");
    openapiFields.add("retained_taxes");
    openapiFields.add("collected_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("product_identification");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("unit_code");
    openapiRequiredFields.add("unit_description");
    openapiRequiredFields.add("unit_amount");
    openapiRequiredFields.add("pre_tax_amount");
    openapiRequiredFields.add("tax_percentage");
    openapiRequiredFields.add("tax_amount");
    openapiRequiredFields.add("total_amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoiceDetailSat
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoiceDetailSat.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailSat is not found in the empty JSON string", InvoiceDetailSat.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceDetailSat.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("product_identification").isJsonNull() && !jsonObj.get("product_identification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_identification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_identification").toString()));
      }
      if (!jsonObj.get("unit_code").isJsonNull() && !jsonObj.get("unit_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_code").toString()));
      }
      if (!jsonObj.get("unit_description").isJsonNull() && !jsonObj.get("unit_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_description").toString()));
      }
      if (!jsonObj.get("tax_type").isJsonNull() && (jsonObj.get("tax_type") != null && !jsonObj.get("tax_type").isJsonNull()) && !jsonObj.get("tax_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_type").toString()));
      }
      if (jsonObj.get("retained_taxes") != null && !jsonObj.get("retained_taxes").isJsonNull()) {
        JsonArray jsonArrayretainedTaxes = jsonObj.getAsJsonArray("retained_taxes");
        if (jsonArrayretainedTaxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("retained_taxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `retained_taxes` to be an array in the JSON string but got `%s`", jsonObj.get("retained_taxes").toString()));
          }

          // validate the optional field `retained_taxes` (array)
          for (int i = 0; i < jsonArrayretainedTaxes.size(); i++) {
            InvoiceDetailRetainedTaxSat.validateJsonObject(jsonArrayretainedTaxes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailSat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailSat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailSat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailSat.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailSat>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailSat value) throws IOException {
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
           public InvoiceDetailSat read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoiceDetailSat instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoiceDetailSat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailSat
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailSat
  */
  public static InvoiceDetailSat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailSat.class);
  }

 /**
  * Convert an instance of InvoiceDetailSat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

