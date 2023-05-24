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
import com.belvo.client.model.EnumPaymentLinkAllowedPaymentMethod;
import com.belvo.client.model.EnumPaymentLinkProvider;
import com.belvo.client.model.PaymentIntentsPaymentMethodDetailsPse;
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
import java.util.UUID;

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
 * CreatePaymentIntentPse
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreatePaymentIntentPse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private UUID customer;

  public static final String SERIALIZED_NAME_ALLOWED_PAYMENT_METHOD_TYPES = "allowed_payment_method_types";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PAYMENT_METHOD_TYPES)
  private List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DETAILS = "payment_method_details";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DETAILS)
  private PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private EnumPaymentLinkProvider provider;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public CreatePaymentIntentPse() {
  }

  public CreatePaymentIntentPse description(String description) {

    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the payment. 
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Training shoes", required = true, value = "The description of the payment. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {

    
    
    
    this.description = description;
  }


  public CreatePaymentIntentPse amount(String amount) {

    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount to be paid by your customer.   For PSE, you can only send whole numbers (integers). For example: &#x60;\&quot;350000\&quot;&#x60;. 
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "350000", required = true, value = "Amount to be paid by your customer.   For PSE, you can only send whole numbers (integers). For example: `\"350000\"`. ")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {

    
    
    
    this.amount = amount;
  }


  public CreatePaymentIntentPse customer(UUID customer) {

    
    
    
    
    this.customer = customer;
    return this;
  }

   /**
   * Belvo&#39;s unique ID to reference the customer. 
   * @return customer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "06dc2f14-1217-4480-9b36-550a944a39d1", required = true, value = "Belvo's unique ID to reference the customer. ")

  public UUID getCustomer() {
    return customer;
  }


  public void setCustomer(UUID customer) {

    
    
    
    this.customer = customer;
  }


  public CreatePaymentIntentPse allowedPaymentMethodTypes(List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes) {

    
    
    
    
    this.allowedPaymentMethodTypes = allowedPaymentMethodTypes;
    return this;
  }

  public CreatePaymentIntentPse addAllowedPaymentMethodTypesItem(EnumPaymentLinkAllowedPaymentMethod allowedPaymentMethodTypesItem) {
    this.allowedPaymentMethodTypes.add(allowedPaymentMethodTypesItem);
    return this;
  }

   /**
   * A list of payment method types allowed in this payment intent. For PSE, this value must be set to &#x60;pse&#x60;.
   * @return allowedPaymentMethodTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of payment method types allowed in this payment intent. For PSE, this value must be set to `pse`.")

  public List<EnumPaymentLinkAllowedPaymentMethod> getAllowedPaymentMethodTypes() {
    return allowedPaymentMethodTypes;
  }


  public void setAllowedPaymentMethodTypes(List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes) {

    
    
    
    this.allowedPaymentMethodTypes = allowedPaymentMethodTypes;
  }


  public CreatePaymentIntentPse paymentMethodDetails(PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails) {

    
    
    
    
    this.paymentMethodDetails = paymentMethodDetails;
    return this;
  }

   /**
   * Get paymentMethodDetails
   * @return paymentMethodDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentIntentsPaymentMethodDetailsPse getPaymentMethodDetails() {
    return paymentMethodDetails;
  }


  public void setPaymentMethodDetails(PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails) {

    
    
    
    this.paymentMethodDetails = paymentMethodDetails;
  }


  public CreatePaymentIntentPse provider(EnumPaymentLinkProvider provider) {

    
    
    
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumPaymentLinkProvider getProvider() {
    return provider;
  }


  public void setProvider(EnumPaymentLinkProvider provider) {

    
    
    
    this.provider = provider;
  }


  public CreatePaymentIntentPse metadata(Object metadata) {

    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"internal_reference_id\":\"GGq73487w2\"}", value = "Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {

    
    
    
    this.metadata = metadata;
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
   * @return the CreatePaymentIntentPse instance itself
   */
  public CreatePaymentIntentPse putAdditionalProperty(String key, Object value) {
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
    CreatePaymentIntentPse createPaymentIntentPse = (CreatePaymentIntentPse) o;
    return Objects.equals(this.description, createPaymentIntentPse.description) &&
        Objects.equals(this.amount, createPaymentIntentPse.amount) &&
        Objects.equals(this.customer, createPaymentIntentPse.customer) &&
        Objects.equals(this.allowedPaymentMethodTypes, createPaymentIntentPse.allowedPaymentMethodTypes) &&
        Objects.equals(this.paymentMethodDetails, createPaymentIntentPse.paymentMethodDetails) &&
        Objects.equals(this.provider, createPaymentIntentPse.provider) &&
        Objects.equals(this.metadata, createPaymentIntentPse.metadata)&&
        Objects.equals(this.additionalProperties, createPaymentIntentPse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, amount, customer, allowedPaymentMethodTypes, paymentMethodDetails, provider, metadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentIntentPse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    allowedPaymentMethodTypes: ").append(toIndentedString(allowedPaymentMethodTypes)).append("\n");
    sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("customer");
    openapiFields.add("allowed_payment_method_types");
    openapiFields.add("payment_method_details");
    openapiFields.add("provider");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("allowed_payment_method_types");
    openapiRequiredFields.add("payment_method_details");
    openapiRequiredFields.add("provider");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePaymentIntentPse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreatePaymentIntentPse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePaymentIntentPse is not found in the empty JSON string", CreatePaymentIntentPse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePaymentIntentPse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("customer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("allowed_payment_method_types") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("allowed_payment_method_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_payment_method_types` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_payment_method_types").toString()));
      }
      // validate the required field `payment_method_details`
      PaymentIntentsPaymentMethodDetailsPse.validateJsonObject(jsonObj.getAsJsonObject("payment_method_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePaymentIntentPse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePaymentIntentPse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePaymentIntentPse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePaymentIntentPse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePaymentIntentPse>() {
           @Override
           public void write(JsonWriter out, CreatePaymentIntentPse value) throws IOException {
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
           public CreatePaymentIntentPse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreatePaymentIntentPse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreatePaymentIntentPse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePaymentIntentPse
  * @throws IOException if the JSON string is invalid with respect to CreatePaymentIntentPse
  */
  public static CreatePaymentIntentPse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePaymentIntentPse.class);
  }

 /**
  * Convert an instance of CreatePaymentIntentPse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

