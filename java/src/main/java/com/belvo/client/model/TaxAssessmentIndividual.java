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
 * Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld.
 */
@ApiModel(description = "Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxAssessmentIndividual {
  public static final String SERIALIZED_NAME_FORTUITOUS_PROFIT_TAX = "fortuitous_profit_tax";
  @SerializedName(SERIALIZED_NAME_FORTUITOUS_PROFIT_TAX)
  private Float fortuitousProfitTax;

  public static final String SERIALIZED_NAME_TOTAL_TAX_ON_TAXABLE_NET_INCOME = "total_tax_on_taxable_net_income";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_ON_TAXABLE_NET_INCOME)
  private Float totalTaxOnTaxableNetIncome;

  public static final String SERIALIZED_NAME_NET_INCOME_TAX = "net_income_tax";
  @SerializedName(SERIALIZED_NAME_NET_INCOME_TAX)
  private Float netIncomeTax;

  public static final String SERIALIZED_NAME_TOTAL_TAX_DUE = "total_tax_due";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_DUE)
  private Float totalTaxDue;

  public static final String SERIALIZED_NAME_PREVIOUS_YEAR_BALANCE = "previous_year_balance";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_YEAR_BALANCE)
  private Float previousYearBalance;

  public static final String SERIALIZED_NAME_TOTAL_WITHHELD_TAX = "total_withheld_tax";
  @SerializedName(SERIALIZED_NAME_TOTAL_WITHHELD_TAX)
  private Float totalWithheldTax;

  public static final String SERIALIZED_NAME_BALANCE_PAYABLE = "balance_payable";
  @SerializedName(SERIALIZED_NAME_BALANCE_PAYABLE)
  private Float balancePayable;

  public static final String SERIALIZED_NAME_BALANCE_REFUNDABLE = "balance_refundable";
  @SerializedName(SERIALIZED_NAME_BALANCE_REFUNDABLE)
  private Float balanceRefundable;

  public static final String SERIALIZED_NAME_TOTAL_PAYMENT = "total_payment";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAYMENT)
  private Float totalPayment;

  public TaxAssessmentIndividual() {
  }

  public TaxAssessmentIndividual fortuitousProfitTax(Float fortuitousProfitTax) {

    
    
    
    
    this.fortuitousProfitTax = fortuitousProfitTax;
    return this;
  }

   /**
   * The tax applied on your unexpected income (such as lottery wins or house sales).
   * @return fortuitousProfitTax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "The tax applied on your unexpected income (such as lottery wins or house sales).")

  public Float getFortuitousProfitTax() {
    return fortuitousProfitTax;
  }


  public void setFortuitousProfitTax(Float fortuitousProfitTax) {

    
    
    
    this.fortuitousProfitTax = fortuitousProfitTax;
  }


  public TaxAssessmentIndividual totalTaxOnTaxableNetIncome(Float totalTaxOnTaxableNetIncome) {

    
    
    
    
    this.totalTaxOnTaxableNetIncome = totalTaxOnTaxableNetIncome;
    return this;
  }

   /**
   * The calculated total tax that can be applied on the tax payer&#39;s taxable income (total income - exemptions - deductions).
   * @return totalTaxOnTaxableNetIncome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9144000", required = true, value = "The calculated total tax that can be applied on the tax payer's taxable income (total income - exemptions - deductions).")

  public Float getTotalTaxOnTaxableNetIncome() {
    return totalTaxOnTaxableNetIncome;
  }


  public void setTotalTaxOnTaxableNetIncome(Float totalTaxOnTaxableNetIncome) {

    
    
    
    this.totalTaxOnTaxableNetIncome = totalTaxOnTaxableNetIncome;
  }


  public TaxAssessmentIndividual netIncomeTax(Float netIncomeTax) {

    
    
    
    
    this.netIncomeTax = netIncomeTax;
    return this;
  }

   /**
   * After additional deductions that you can apply, this will be the net income tax. If not further deduction are identified, this value will be the same as &#x60;total_tax_on_taxable_net_income&#x60;.
   * @return netIncomeTax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9144000", required = true, value = "After additional deductions that you can apply, this will be the net income tax. If not further deduction are identified, this value will be the same as `total_tax_on_taxable_net_income`.")

  public Float getNetIncomeTax() {
    return netIncomeTax;
  }


  public void setNetIncomeTax(Float netIncomeTax) {

    
    
    
    this.netIncomeTax = netIncomeTax;
  }


  public TaxAssessmentIndividual totalTaxDue(Float totalTaxDue) {

    
    
    
    
    this.totalTaxDue = totalTaxDue;
    return this;
  }

   /**
   * After further deductions, this is the final calculated tax that the taxpayer is required to pay.
   * @return totalTaxDue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "9144000", required = true, value = "After further deductions, this is the final calculated tax that the taxpayer is required to pay.")

  public Float getTotalTaxDue() {
    return totalTaxDue;
  }


  public void setTotalTaxDue(Float totalTaxDue) {

    
    
    
    this.totalTaxDue = totalTaxDue;
  }


  public TaxAssessmentIndividual previousYearBalance(Float previousYearBalance) {

    
    
    
    
    this.previousYearBalance = previousYearBalance;
    return this;
  }

   /**
   * Only applicable for DIAN.   The amount the tax payer has as a \&quot;credit\&quot; fromt he previous year (this is equal to the &#x60;balance_refundable&#x60;) of the previous year. 
   * @return previousYearBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1514000", required = true, value = "Only applicable for DIAN.   The amount the tax payer has as a \"credit\" fromt he previous year (this is equal to the `balance_refundable`) of the previous year. ")

  public Float getPreviousYearBalance() {
    return previousYearBalance;
  }


  public void setPreviousYearBalance(Float previousYearBalance) {

    
    
    
    this.previousYearBalance = previousYearBalance;
  }


  public TaxAssessmentIndividual totalWithheldTax(Float totalWithheldTax) {

    
    
    
    
    this.totalWithheldTax = totalWithheldTax;
    return this;
  }

   /**
   * The total tax already withheld in the current fiscal year.
   * @return totalWithheldTax
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7714000", required = true, value = "The total tax already withheld in the current fiscal year.")

  public Float getTotalWithheldTax() {
    return totalWithheldTax;
  }


  public void setTotalWithheldTax(Float totalWithheldTax) {

    
    
    
    this.totalWithheldTax = totalWithheldTax;
  }


  public TaxAssessmentIndividual balancePayable(Float balancePayable) {

    
    
    
    
    this.balancePayable = balancePayable;
    return this;
  }

   /**
   * How much the tax payer is required to pay.
   * @return balancePayable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "How much the tax payer is required to pay.")

  public Float getBalancePayable() {
    return balancePayable;
  }


  public void setBalancePayable(Float balancePayable) {

    
    
    
    this.balancePayable = balancePayable;
  }


  public TaxAssessmentIndividual balanceRefundable(Float balanceRefundable) {

    
    
    
    
    this.balanceRefundable = balanceRefundable;
    return this;
  }

   /**
   * How much the tax payer is expected to receive. For DIAN, this will count as credit for the next fiscal year (see &#x60;previous_year_balance&#x60;).
   * @return balanceRefundable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "84000", required = true, value = "How much the tax payer is expected to receive. For DIAN, this will count as credit for the next fiscal year (see `previous_year_balance`).")

  public Float getBalanceRefundable() {
    return balanceRefundable;
  }


  public void setBalanceRefundable(Float balanceRefundable) {

    
    
    
    this.balanceRefundable = balanceRefundable;
  }


  public TaxAssessmentIndividual totalPayment(Float totalPayment) {

    
    
    
    
    this.totalPayment = totalPayment;
    return this;
  }

   /**
   * The total the tax payer is required to pay, taking into account deductions and fiscal credits.
   * @return totalPayment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "The total the tax payer is required to pay, taking into account deductions and fiscal credits.")

  public Float getTotalPayment() {
    return totalPayment;
  }


  public void setTotalPayment(Float totalPayment) {

    
    
    
    this.totalPayment = totalPayment;
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
   * @return the TaxAssessmentIndividual instance itself
   */
  public TaxAssessmentIndividual putAdditionalProperty(String key, Object value) {
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
    TaxAssessmentIndividual taxAssessmentIndividual = (TaxAssessmentIndividual) o;
    return Objects.equals(this.fortuitousProfitTax, taxAssessmentIndividual.fortuitousProfitTax) &&
        Objects.equals(this.totalTaxOnTaxableNetIncome, taxAssessmentIndividual.totalTaxOnTaxableNetIncome) &&
        Objects.equals(this.netIncomeTax, taxAssessmentIndividual.netIncomeTax) &&
        Objects.equals(this.totalTaxDue, taxAssessmentIndividual.totalTaxDue) &&
        Objects.equals(this.previousYearBalance, taxAssessmentIndividual.previousYearBalance) &&
        Objects.equals(this.totalWithheldTax, taxAssessmentIndividual.totalWithheldTax) &&
        Objects.equals(this.balancePayable, taxAssessmentIndividual.balancePayable) &&
        Objects.equals(this.balanceRefundable, taxAssessmentIndividual.balanceRefundable) &&
        Objects.equals(this.totalPayment, taxAssessmentIndividual.totalPayment)&&
        Objects.equals(this.additionalProperties, taxAssessmentIndividual.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fortuitousProfitTax, totalTaxOnTaxableNetIncome, netIncomeTax, totalTaxDue, previousYearBalance, totalWithheldTax, balancePayable, balanceRefundable, totalPayment, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxAssessmentIndividual {\n");
    sb.append("    fortuitousProfitTax: ").append(toIndentedString(fortuitousProfitTax)).append("\n");
    sb.append("    totalTaxOnTaxableNetIncome: ").append(toIndentedString(totalTaxOnTaxableNetIncome)).append("\n");
    sb.append("    netIncomeTax: ").append(toIndentedString(netIncomeTax)).append("\n");
    sb.append("    totalTaxDue: ").append(toIndentedString(totalTaxDue)).append("\n");
    sb.append("    previousYearBalance: ").append(toIndentedString(previousYearBalance)).append("\n");
    sb.append("    totalWithheldTax: ").append(toIndentedString(totalWithheldTax)).append("\n");
    sb.append("    balancePayable: ").append(toIndentedString(balancePayable)).append("\n");
    sb.append("    balanceRefundable: ").append(toIndentedString(balanceRefundable)).append("\n");
    sb.append("    totalPayment: ").append(toIndentedString(totalPayment)).append("\n");
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
    openapiFields.add("fortuitous_profit_tax");
    openapiFields.add("total_tax_on_taxable_net_income");
    openapiFields.add("net_income_tax");
    openapiFields.add("total_tax_due");
    openapiFields.add("previous_year_balance");
    openapiFields.add("total_withheld_tax");
    openapiFields.add("balance_payable");
    openapiFields.add("balance_refundable");
    openapiFields.add("total_payment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fortuitous_profit_tax");
    openapiRequiredFields.add("total_tax_on_taxable_net_income");
    openapiRequiredFields.add("net_income_tax");
    openapiRequiredFields.add("total_tax_due");
    openapiRequiredFields.add("previous_year_balance");
    openapiRequiredFields.add("total_withheld_tax");
    openapiRequiredFields.add("balance_payable");
    openapiRequiredFields.add("balance_refundable");
    openapiRequiredFields.add("total_payment");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxAssessmentIndividual
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxAssessmentIndividual.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxAssessmentIndividual is not found in the empty JSON string", TaxAssessmentIndividual.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxAssessmentIndividual.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxAssessmentIndividual.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxAssessmentIndividual' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxAssessmentIndividual> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxAssessmentIndividual.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxAssessmentIndividual>() {
           @Override
           public void write(JsonWriter out, TaxAssessmentIndividual value) throws IOException {
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
           public TaxAssessmentIndividual read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxAssessmentIndividual instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxAssessmentIndividual given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxAssessmentIndividual
  * @throws IOException if the JSON string is invalid with respect to TaxAssessmentIndividual
  */
  public static TaxAssessmentIndividual fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxAssessmentIndividual.class);
  }

 /**
  * Convert an instance of TaxAssessmentIndividual to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

