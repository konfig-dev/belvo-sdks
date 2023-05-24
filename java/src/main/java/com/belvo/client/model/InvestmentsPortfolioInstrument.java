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
import com.belvo.client.model.EnumInvestmentPortfolioInstrumentType;
import com.belvo.client.model.InvestmentsPortfolioInstrumentFees;
import com.belvo.client.model.InvestmentsPortfolioInstrumentInterestRate;
import com.belvo.client.model.InvestmentsPortfolioInstrumentPublicId;
import com.belvo.client.model.InvestmentsPortfolioInstrumentRedemptionConditions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * InvestmentsPortfolioInstrument
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvestmentsPortfolioInstrument {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PUBLIC_ID = "public_id";
  @SerializedName(SERIALIZED_NAME_PUBLIC_ID)
  private List<InvestmentsPortfolioInstrumentPublicId> publicId = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EnumInvestmentPortfolioInstrumentType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private String subtype;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Float quantity;

  public static final String SERIALIZED_NAME_BALANCE_GROSS = "balance_gross";
  @SerializedName(SERIALIZED_NAME_BALANCE_GROSS)
  private Float balanceGross;

  public static final String SERIALIZED_NAME_BALANCE_NET = "balance_net";
  @SerializedName(SERIALIZED_NAME_BALANCE_NET)
  private Float balanceNet;

  public static final String SERIALIZED_NAME_AVERAGE_ACQUISITION_PRICE = "average_acquisition_price";
  @SerializedName(SERIALIZED_NAME_AVERAGE_ACQUISITION_PRICE)
  private Float averageAcquisitionPrice;

  public static final String SERIALIZED_NAME_PROFIT = "profit";
  @SerializedName(SERIALIZED_NAME_PROFIT)
  private Float profit;

  public static final String SERIALIZED_NAME_OPEN_DATE = "open_date";
  @SerializedName(SERIALIZED_NAME_OPEN_DATE)
  private LocalDate openDate;

  public static final String SERIALIZED_NAME_REDEMPTION_CONDITIONS = "redemption_conditions";
  @SerializedName(SERIALIZED_NAME_REDEMPTION_CONDITIONS)
  private List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private List<InvestmentsPortfolioInstrumentFees> fees = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTEREST_RATES = "interest_rates";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATES)
  private List<InvestmentsPortfolioInstrumentInterestRate> interestRates = new ArrayList<>();

  public InvestmentsPortfolioInstrument() {
  }

  public InvestmentsPortfolioInstrument id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Belvo&#39;s unique ID for the current instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "Belvo's unique ID for the current instrument.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public InvestmentsPortfolioInstrument publicId(List<InvestmentsPortfolioInstrumentPublicId> publicId) {

    
    
    
    
    this.publicId = publicId;
    return this;
  }

  public InvestmentsPortfolioInstrument addPublicIdItem(InvestmentsPortfolioInstrumentPublicId publicIdItem) {
    this.publicId.add(publicIdItem);
    return this;
  }

   /**
   * The public identifiers for the instrument.
   * @return publicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The public identifiers for the instrument.")

  public List<InvestmentsPortfolioInstrumentPublicId> getPublicId() {
    return publicId;
  }


  public void setPublicId(List<InvestmentsPortfolioInstrumentPublicId> publicId) {

    
    
    
    this.publicId = publicId;
  }


  public InvestmentsPortfolioInstrument type(EnumInvestmentPortfolioInstrumentType type) {

    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EnumInvestmentPortfolioInstrumentType getType() {
    return type;
  }


  public void setType(EnumInvestmentPortfolioInstrumentType type) {

    
    
    
    this.type = type;
  }


  public InvestmentsPortfolioInstrument subtype(String subtype) {

    
    
    
    
    this.subtype = subtype;
    return this;
  }

   /**
   * The subtype for the instrument, as given by the institution.
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CBD", required = true, value = "The subtype for the instrument, as given by the institution.")

  public String getSubtype() {
    return subtype;
  }


  public void setSubtype(String subtype) {

    
    
    
    this.subtype = subtype;
  }


  public InvestmentsPortfolioInstrument name(String name) {

    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the instrument, as given by the institution.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CBD DIGITAL ESPECIAL", required = true, value = "The name of the instrument, as given by the institution.")

  public String getName() {
    return name;
  }


  public void setName(String name) {

    
    
    
    this.name = name;
  }


  public InvestmentsPortfolioInstrument currency(String currency) {

    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the instrument. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) - 🇺🇸 USD (US Dollar)   Please note that other currencies other than in the list above may be returned. 
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "The currency of the instrument. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) - 🇺🇸 USD (US Dollar)   Please note that other currencies other than in the list above may be returned. ")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {

    
    
    
    this.currency = currency;
  }


  public InvestmentsPortfolioInstrument price(Float price) {

    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * The current price of one share in the instrument.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.41", required = true, value = "The current price of one share in the instrument.")

  public Float getPrice() {
    return price;
  }


  public void setPrice(Float price) {

    
    
    
    this.price = price;
  }


  public InvestmentsPortfolioInstrument quantity(Float quantity) {

    
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The total amount of shares owned in the instrument.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27.46", required = true, value = "The total amount of shares owned in the instrument.")

  public Float getQuantity() {
    return quantity;
  }


  public void setQuantity(Float quantity) {

    
    
    
    this.quantity = quantity;
  }


  public InvestmentsPortfolioInstrument balanceGross(Float balanceGross) {

    
    
    
    
    this.balanceGross = balanceGross;
    return this;
  }

   /**
   * The total gross value of the instrument (including taxes).
   * @return balanceGross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.09", required = true, value = "The total gross value of the instrument (including taxes).")

  public Float getBalanceGross() {
    return balanceGross;
  }


  public void setBalanceGross(Float balanceGross) {

    
    
    
    this.balanceGross = balanceGross;
  }


  public InvestmentsPortfolioInstrument balanceNet(Float balanceNet) {

    
    
    
    
    this.balanceNet = balanceNet;
    return this;
  }

   /**
   * The total net value of the instrument (excluding taxes).
   * @return balanceNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.09", required = true, value = "The total net value of the instrument (excluding taxes).")

  public Float getBalanceNet() {
    return balanceNet;
  }


  public void setBalanceNet(Float balanceNet) {

    
    
    
    this.balanceNet = balanceNet;
  }


  public InvestmentsPortfolioInstrument averageAcquisitionPrice(Float averageAcquisitionPrice) {

    
    
    
    
    this.averageAcquisitionPrice = averageAcquisitionPrice;
    return this;
  }

   /**
   * The average price of each share acquired in the instrument.
   * @return averageAcquisitionPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.01", required = true, value = "The average price of each share acquired in the instrument.")

  public Float getAverageAcquisitionPrice() {
    return averageAcquisitionPrice;
  }


  public void setAverageAcquisitionPrice(Float averageAcquisitionPrice) {

    
    
    
    this.averageAcquisitionPrice = averageAcquisitionPrice;
  }


  public InvestmentsPortfolioInstrument profit(Float profit) {

    
    
    
    
    this.profit = profit;
    return this;
  }

   /**
   * The current profit earned in the instrument.
   * @return profit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.08", required = true, value = "The current profit earned in the instrument.")

  public Float getProfit() {
    return profit;
  }


  public void setProfit(Float profit) {

    
    
    
    this.profit = profit;
  }


  public InvestmentsPortfolioInstrument openDate(LocalDate openDate) {

    
    
    
    
    this.openDate = openDate;
    return this;
  }

   /**
   * The start date of the instrument. Only applicable for instruments of type &#x60;bond&#x60; or &#x60;savings&#x60;.
   * @return openDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Aug 09 17:00:00 PDT 2021", required = true, value = "The start date of the instrument. Only applicable for instruments of type `bond` or `savings`.")

  public LocalDate getOpenDate() {
    return openDate;
  }


  public void setOpenDate(LocalDate openDate) {

    
    
    
    this.openDate = openDate;
  }


  public InvestmentsPortfolioInstrument redemptionConditions(List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions) {

    
    
    
    
    this.redemptionConditions = redemptionConditions;
    return this;
  }

  public InvestmentsPortfolioInstrument addRedemptionConditionsItem(InvestmentsPortfolioInstrumentRedemptionConditions redemptionConditionsItem) {
    this.redemptionConditions.add(redemptionConditionsItem);
    return this;
  }

   /**
   * An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on. 
   * @return redemptionConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An array of conditions that apply to the instrument in order to retrieve the final value.  For example, the due date, the liquidity date, the previdencia type, and so on. ")

  public List<InvestmentsPortfolioInstrumentRedemptionConditions> getRedemptionConditions() {
    return redemptionConditions;
  }


  public void setRedemptionConditions(List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions) {

    
    
    
    this.redemptionConditions = redemptionConditions;
  }


  public InvestmentsPortfolioInstrument fees(List<InvestmentsPortfolioInstrumentFees> fees) {

    
    
    
    
    this.fees = fees;
    return this;
  }

  public InvestmentsPortfolioInstrument addFeesItem(InvestmentsPortfolioInstrumentFees feesItem) {
    this.fees.add(feesItem);
    return this;
  }

   /**
   * An array of fees that apply to the instrument.
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An array of fees that apply to the instrument.")

  public List<InvestmentsPortfolioInstrumentFees> getFees() {
    return fees;
  }


  public void setFees(List<InvestmentsPortfolioInstrumentFees> fees) {

    
    
    
    this.fees = fees;
  }


  public InvestmentsPortfolioInstrument interestRates(List<InvestmentsPortfolioInstrumentInterestRate> interestRates) {

    
    
    
    
    this.interestRates = interestRates;
    return this;
  }

  public InvestmentsPortfolioInstrument addInterestRatesItem(InvestmentsPortfolioInstrumentInterestRate interestRatesItem) {
    this.interestRates.add(interestRatesItem);
    return this;
  }

   /**
   * An array of interest rates that apply to the instrument.
   * @return interestRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An array of interest rates that apply to the instrument.")

  public List<InvestmentsPortfolioInstrumentInterestRate> getInterestRates() {
    return interestRates;
  }


  public void setInterestRates(List<InvestmentsPortfolioInstrumentInterestRate> interestRates) {

    
    
    
    this.interestRates = interestRates;
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
   * @return the InvestmentsPortfolioInstrument instance itself
   */
  public InvestmentsPortfolioInstrument putAdditionalProperty(String key, Object value) {
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
    InvestmentsPortfolioInstrument investmentsPortfolioInstrument = (InvestmentsPortfolioInstrument) o;
    return Objects.equals(this.id, investmentsPortfolioInstrument.id) &&
        Objects.equals(this.publicId, investmentsPortfolioInstrument.publicId) &&
        Objects.equals(this.type, investmentsPortfolioInstrument.type) &&
        Objects.equals(this.subtype, investmentsPortfolioInstrument.subtype) &&
        Objects.equals(this.name, investmentsPortfolioInstrument.name) &&
        Objects.equals(this.currency, investmentsPortfolioInstrument.currency) &&
        Objects.equals(this.price, investmentsPortfolioInstrument.price) &&
        Objects.equals(this.quantity, investmentsPortfolioInstrument.quantity) &&
        Objects.equals(this.balanceGross, investmentsPortfolioInstrument.balanceGross) &&
        Objects.equals(this.balanceNet, investmentsPortfolioInstrument.balanceNet) &&
        Objects.equals(this.averageAcquisitionPrice, investmentsPortfolioInstrument.averageAcquisitionPrice) &&
        Objects.equals(this.profit, investmentsPortfolioInstrument.profit) &&
        Objects.equals(this.openDate, investmentsPortfolioInstrument.openDate) &&
        Objects.equals(this.redemptionConditions, investmentsPortfolioInstrument.redemptionConditions) &&
        Objects.equals(this.fees, investmentsPortfolioInstrument.fees) &&
        Objects.equals(this.interestRates, investmentsPortfolioInstrument.interestRates)&&
        Objects.equals(this.additionalProperties, investmentsPortfolioInstrument.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, publicId, type, subtype, name, currency, price, quantity, balanceGross, balanceNet, averageAcquisitionPrice, profit, openDate, redemptionConditions, fees, interestRates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsPortfolioInstrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    balanceGross: ").append(toIndentedString(balanceGross)).append("\n");
    sb.append("    balanceNet: ").append(toIndentedString(balanceNet)).append("\n");
    sb.append("    averageAcquisitionPrice: ").append(toIndentedString(averageAcquisitionPrice)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    redemptionConditions: ").append(toIndentedString(redemptionConditions)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    interestRates: ").append(toIndentedString(interestRates)).append("\n");
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
    openapiFields.add("public_id");
    openapiFields.add("type");
    openapiFields.add("subtype");
    openapiFields.add("name");
    openapiFields.add("currency");
    openapiFields.add("price");
    openapiFields.add("quantity");
    openapiFields.add("balance_gross");
    openapiFields.add("balance_net");
    openapiFields.add("average_acquisition_price");
    openapiFields.add("profit");
    openapiFields.add("open_date");
    openapiFields.add("redemption_conditions");
    openapiFields.add("fees");
    openapiFields.add("interest_rates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("public_id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("subtype");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("balance_gross");
    openapiRequiredFields.add("balance_net");
    openapiRequiredFields.add("average_acquisition_price");
    openapiRequiredFields.add("profit");
    openapiRequiredFields.add("open_date");
    openapiRequiredFields.add("redemption_conditions");
    openapiRequiredFields.add("fees");
    openapiRequiredFields.add("interest_rates");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvestmentsPortfolioInstrument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvestmentsPortfolioInstrument.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvestmentsPortfolioInstrument is not found in the empty JSON string", InvestmentsPortfolioInstrument.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvestmentsPortfolioInstrument.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("public_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_id` to be an array in the JSON string but got `%s`", jsonObj.get("public_id").toString()));
      }

      JsonArray jsonArraypublicId = jsonObj.getAsJsonArray("public_id");
      // validate the required field `public_id` (array)
      for (int i = 0; i < jsonArraypublicId.size(); i++) {
        InvestmentsPortfolioInstrumentPublicId.validateJsonObject(jsonArraypublicId.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("subtype").isJsonNull() && !jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("redemption_conditions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redemption_conditions` to be an array in the JSON string but got `%s`", jsonObj.get("redemption_conditions").toString()));
      }

      JsonArray jsonArrayredemptionConditions = jsonObj.getAsJsonArray("redemption_conditions");
      // validate the required field `redemption_conditions` (array)
      for (int i = 0; i < jsonArrayredemptionConditions.size(); i++) {
        InvestmentsPortfolioInstrumentRedemptionConditions.validateJsonObject(jsonArrayredemptionConditions.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("fees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fees` to be an array in the JSON string but got `%s`", jsonObj.get("fees").toString()));
      }

      JsonArray jsonArrayfees = jsonObj.getAsJsonArray("fees");
      // validate the required field `fees` (array)
      for (int i = 0; i < jsonArrayfees.size(); i++) {
        InvestmentsPortfolioInstrumentFees.validateJsonObject(jsonArrayfees.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("interest_rates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `interest_rates` to be an array in the JSON string but got `%s`", jsonObj.get("interest_rates").toString()));
      }

      JsonArray jsonArrayinterestRates = jsonObj.getAsJsonArray("interest_rates");
      // validate the required field `interest_rates` (array)
      for (int i = 0; i < jsonArrayinterestRates.size(); i++) {
        InvestmentsPortfolioInstrumentInterestRate.validateJsonObject(jsonArrayinterestRates.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvestmentsPortfolioInstrument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvestmentsPortfolioInstrument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvestmentsPortfolioInstrument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvestmentsPortfolioInstrument.class));

       return (TypeAdapter<T>) new TypeAdapter<InvestmentsPortfolioInstrument>() {
           @Override
           public void write(JsonWriter out, InvestmentsPortfolioInstrument value) throws IOException {
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
           public InvestmentsPortfolioInstrument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvestmentsPortfolioInstrument instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvestmentsPortfolioInstrument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvestmentsPortfolioInstrument
  * @throws IOException if the JSON string is invalid with respect to InvestmentsPortfolioInstrument
  */
  public static InvestmentsPortfolioInstrument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvestmentsPortfolioInstrument.class);
  }

 /**
  * Convert an instance of InvestmentsPortfolioInstrument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

