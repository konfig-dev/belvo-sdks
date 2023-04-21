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
import com.belvo.client.model.PaymentIntentPaymentMethodDetailsBodyBusinessOfpi;
import com.belvo.client.model.PaymentIntentPaymentMethodDetailsBusinessOfpi;
import com.belvo.client.model.PaymentIntentPaymentMethodDetailsIndividualOfpi;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.belvo.client.JSON;

@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentIntentOfpiPaymentMethodDetails extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PaymentIntentOfpiPaymentMethodDetails.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PaymentIntentOfpiPaymentMethodDetails.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PaymentIntentOfpiPaymentMethodDetails' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PaymentIntentPaymentMethodDetailsBusinessOfpi> adapterPaymentIntentPaymentMethodDetailsBusinessOfpi = gson.getDelegateAdapter(this, TypeToken.get(PaymentIntentPaymentMethodDetailsBusinessOfpi.class));
            final TypeAdapter<PaymentIntentPaymentMethodDetailsIndividualOfpi> adapterPaymentIntentPaymentMethodDetailsIndividualOfpi = gson.getDelegateAdapter(this, TypeToken.get(PaymentIntentPaymentMethodDetailsIndividualOfpi.class));

            return (TypeAdapter<T>) new TypeAdapter<PaymentIntentOfpiPaymentMethodDetails>() {
                @Override
                public void write(JsonWriter out, PaymentIntentOfpiPaymentMethodDetails value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentIntentPaymentMethodDetailsBusinessOfpi`
                    if (value.getActualInstance() instanceof PaymentIntentPaymentMethodDetailsBusinessOfpi) {
                        JsonObject obj = adapterPaymentIntentPaymentMethodDetailsBusinessOfpi.toJsonTree((PaymentIntentPaymentMethodDetailsBusinessOfpi)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentIntentPaymentMethodDetailsIndividualOfpi`
                    if (value.getActualInstance() instanceof PaymentIntentPaymentMethodDetailsIndividualOfpi) {
                        JsonObject obj = adapterPaymentIntentPaymentMethodDetailsIndividualOfpi.toJsonTree((PaymentIntentPaymentMethodDetailsIndividualOfpi)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: PaymentIntentPaymentMethodDetailsBusinessOfpi, PaymentIntentPaymentMethodDetailsIndividualOfpi");
                }

                @Override
                public PaymentIntentOfpiPaymentMethodDetails read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize PaymentIntentPaymentMethodDetailsBusinessOfpi
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentIntentPaymentMethodDetailsBusinessOfpi.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'PaymentIntentPaymentMethodDetailsBusinessOfpi'");
                        PaymentIntentOfpiPaymentMethodDetails ret = new PaymentIntentOfpiPaymentMethodDetails();
                        ret.setActualInstance(adapterPaymentIntentPaymentMethodDetailsBusinessOfpi.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentIntentPaymentMethodDetailsBusinessOfpi'", e);
                    }

                    // deserialize PaymentIntentPaymentMethodDetailsIndividualOfpi
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PaymentIntentPaymentMethodDetailsIndividualOfpi.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'PaymentIntentPaymentMethodDetailsIndividualOfpi'");
                        PaymentIntentOfpiPaymentMethodDetails ret = new PaymentIntentOfpiPaymentMethodDetails();
                        ret.setActualInstance(adapterPaymentIntentPaymentMethodDetailsIndividualOfpi.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'PaymentIntentPaymentMethodDetailsIndividualOfpi'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for PaymentIntentOfpiPaymentMethodDetails: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PaymentIntentOfpiPaymentMethodDetails() {
        super("anyOf", Boolean.FALSE);
    }

    public PaymentIntentOfpiPaymentMethodDetails(PaymentIntentPaymentMethodDetailsBusinessOfpi o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentIntentOfpiPaymentMethodDetails(PaymentIntentPaymentMethodDetailsIndividualOfpi o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentIntentPaymentMethodDetailsBusinessOfpi", new GenericType<PaymentIntentPaymentMethodDetailsBusinessOfpi>() {
        });
        schemas.put("PaymentIntentPaymentMethodDetailsIndividualOfpi", new GenericType<PaymentIntentPaymentMethodDetailsIndividualOfpi>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PaymentIntentOfpiPaymentMethodDetails.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * PaymentIntentPaymentMethodDetailsBusinessOfpi, PaymentIntentPaymentMethodDetailsIndividualOfpi
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PaymentIntentPaymentMethodDetailsBusinessOfpi) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentIntentPaymentMethodDetailsIndividualOfpi) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentIntentPaymentMethodDetailsBusinessOfpi, PaymentIntentPaymentMethodDetailsIndividualOfpi");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentIntentPaymentMethodDetailsBusinessOfpi, PaymentIntentPaymentMethodDetailsIndividualOfpi
     *
     * @return The actual instance (PaymentIntentPaymentMethodDetailsBusinessOfpi, PaymentIntentPaymentMethodDetailsIndividualOfpi)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentIntentPaymentMethodDetailsBusinessOfpi`. If the actual instance is not `PaymentIntentPaymentMethodDetailsBusinessOfpi`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentIntentPaymentMethodDetailsBusinessOfpi`
     * @throws ClassCastException if the instance is not `PaymentIntentPaymentMethodDetailsBusinessOfpi`
     */
    public PaymentIntentPaymentMethodDetailsBusinessOfpi getPaymentIntentPaymentMethodDetailsBusinessOfpi() throws ClassCastException {
        return (PaymentIntentPaymentMethodDetailsBusinessOfpi)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentIntentPaymentMethodDetailsIndividualOfpi`. If the actual instance is not `PaymentIntentPaymentMethodDetailsIndividualOfpi`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentIntentPaymentMethodDetailsIndividualOfpi`
     * @throws ClassCastException if the instance is not `PaymentIntentPaymentMethodDetailsIndividualOfpi`
     */
    public PaymentIntentPaymentMethodDetailsIndividualOfpi getPaymentIntentPaymentMethodDetailsIndividualOfpi() throws ClassCastException {
        return (PaymentIntentPaymentMethodDetailsIndividualOfpi)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentIntentOfpiPaymentMethodDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with PaymentIntentPaymentMethodDetailsBusinessOfpi
    try {
      PaymentIntentPaymentMethodDetailsBusinessOfpi.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with PaymentIntentPaymentMethodDetailsIndividualOfpi
    try {
      PaymentIntentPaymentMethodDetailsIndividualOfpi.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for PaymentIntentOfpiPaymentMethodDetails with anyOf schemas: PaymentIntentPaymentMethodDetailsBusinessOfpi, PaymentIntentPaymentMethodDetailsIndividualOfpi. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of PaymentIntentOfpiPaymentMethodDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentIntentOfpiPaymentMethodDetails
  * @throws IOException if the JSON string is invalid with respect to PaymentIntentOfpiPaymentMethodDetails
  */
  public static PaymentIntentOfpiPaymentMethodDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentIntentOfpiPaymentMethodDetails.class);
  }

 /**
  * Convert an instance of PaymentIntentOfpiPaymentMethodDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

