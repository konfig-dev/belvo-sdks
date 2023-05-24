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
import com.belvo.client.model.AccountsBalance;
import com.belvo.client.model.AccountsCreditData;
import com.belvo.client.model.AccountsFundsData;
import com.belvo.client.model.AccountsLoanData;
import com.belvo.client.model.AccountsReceivablesData;
import com.belvo.client.model.EnumAccountCategory;
import com.belvo.client.model.InstitutionAccount;
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
 * Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report. 
 */
@ApiModel(description = "Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report. ")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Account {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private InstitutionAccount institution;

  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private EnumAccountCategory category;

  public static final String SERIALIZED_NAME_BALANCE_TYPE = "balance_type";
  @SerializedName(SERIALIZED_NAME_BALANCE_TYPE)
  private String balanceType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private AccountsBalance balance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_PUBLIC_IDENTIFICATION_NAME = "public_identification_name";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IDENTIFICATION_NAME)
  private String publicIdentificationName;

  public static final String SERIALIZED_NAME_PUBLIC_IDENTIFICATION_VALUE = "public_identification_value";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IDENTIFICATION_VALUE)
  private String publicIdentificationValue;

  public static final String SERIALIZED_NAME_LAST_ACCESSED_AT = "last_accessed_at";
  @SerializedName(SERIALIZED_NAME_LAST_ACCESSED_AT)
  private OffsetDateTime lastAccessedAt;

  public static final String SERIALIZED_NAME_CREDIT_DATA = "credit_data";
  @SerializedName(SERIALIZED_NAME_CREDIT_DATA)
  private AccountsCreditData creditData;

  public static final String SERIALIZED_NAME_LOAN_DATA = "loan_data";
  @SerializedName(SERIALIZED_NAME_LOAN_DATA)
  private AccountsLoanData loanData;

  public static final String SERIALIZED_NAME_FUNDS_DATA = "funds_data";
  @SerializedName(SERIALIZED_NAME_FUNDS_DATA)
  private List<AccountsFundsData> fundsData = null;

  public static final String SERIALIZED_NAME_RECEIVABLES_DATA = "receivables_data";
  @SerializedName(SERIALIZED_NAME_RECEIVABLES_DATA)
  private AccountsReceivablesData receivablesData;

  public static final String SERIALIZED_NAME_BANK_PRODUCT_ID = "bank_product_id";
  @SerializedName(SERIALIZED_NAME_BANK_PRODUCT_ID)
  private String bankProductId;

  public static final String SERIALIZED_NAME_INTERNAL_IDENTIFICATION = "internal_identification";
  @SerializedName(SERIALIZED_NAME_INTERNAL_IDENTIFICATION)
  private String internalIdentification;

  public Account() {
  }

  public Account id(UUID id) {

    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier created by Belvo used to reference the current account.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0d3ffb69-f83b-456e-ad8e-208d0998d71d", value = "The unique identifier created by Belvo used to reference the current account.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {

    
    
    
    this.id = id;
  }


  public Account link(String link) {

    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * The &#x60;link.id&#x60; the account belongs to.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30cb4806-6e00-48a4-91c9-ca55968576c8", value = "The `link.id` the account belongs to.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {

    
    
    
    this.link = link;
  }


  public Account institution(InstitutionAccount institution) {

    
    
    
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstitutionAccount getInstitution() {
    return institution;
  }


  public void setInstitution(InstitutionAccount institution) {

    
    
    
    this.institution = institution;
  }


  public Account collectedAt(OffsetDateTime collectedAt) {

    
    
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-09-27T13:01:41.941Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {

    
    
    
    this.collectedAt = collectedAt;
  }


  public Account createdAt(OffsetDateTime createdAt) {

    
    
    
    
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


  public Account category(EnumAccountCategory category) {

    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public EnumAccountCategory getCategory() {
    return category;
  }


  public void setCategory(EnumAccountCategory category) {

    
    
    
    this.category = category;
  }


  public Account balanceType(String balanceType) {

    
    
    
    
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative. 
   * @return balanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ASSET", required = true, value = "Indicates whether this account is either an `ASSET` or a `LIABILITY`. You can consider the balance of an `ASSET` as being positive, while the balance of a `LIABILITY` as negative. ")

  public String getBalanceType() {
    return balanceType;
  }


  public void setBalanceType(String balanceType) {

    
    
    
    this.balanceType = balanceType;
  }


  public Account type(String type) {

    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The account type, as designated by the institution.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cuentas de efectivo", required = true, value = "The account type, as designated by the institution.")

  public String getType() {
    return type;
  }


  public void setType(String type) {

    
    
    
    this.type = type;
  }


  public Account name(String name) {

    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The account name, as given by the institution.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cuenta Perfiles- M.N. - MXN-666", required = true, value = "The account name, as given by the institution.")

  public String getName() {
    return name;
  }


  public void setName(String name) {

    
    
    
    this.name = name;
  }


  public Account number(String number) {

    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * The account number, as designated by the institution.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4057068115181", required = true, value = "The account number, as designated by the institution.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {

    
    
    
    this.number = number;
  }


  public Account balance(AccountsBalance balance) {

    
    
    
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountsBalance getBalance() {
    return balance;
  }


  public void setBalance(AccountsBalance balance) {

    
    
    
    this.balance = balance;
  }


  public Account currency(String currency) {

    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency of the account. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MXN", required = true, value = "The currency of the account. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {

    
    
    
    this.currency = currency;
  }


  public Account publicIdentificationName(String publicIdentificationName) {

    
    
    
    
    this.publicIdentificationName = publicIdentificationName;
    return this;
  }

   /**
   * The public name for the type of identification. For example: &#x60;\&quot;CLABE\&quot;&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be &#x60;AGENCY/ACCOUNT&#x60;. 
   * @return publicIdentificationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CLABE", required = true, value = "The public name for the type of identification. For example: `\"CLABE\"`.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be `AGENCY/ACCOUNT`. ")

  public String getPublicIdentificationName() {
    return publicIdentificationName;
  }


  public void setPublicIdentificationName(String publicIdentificationName) {

    
    
    
    this.publicIdentificationName = publicIdentificationName;
  }


  public Account publicIdentificationValue(String publicIdentificationValue) {

    
    
    
    
    this.publicIdentificationValue = publicIdentificationValue;
    return this;
  }

   /**
   * The value for the &#x60;public_identification_name&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash. For example: &#x60;0444/45722-0&#x60;. 
   * @return publicIdentificationValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150194683119900273", required = true, value = "The value for the `public_identification_name`.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash. For example: `0444/45722-0`. ")

  public String getPublicIdentificationValue() {
    return publicIdentificationValue;
  }


  public void setPublicIdentificationValue(String publicIdentificationValue) {

    
    
    
    this.publicIdentificationValue = publicIdentificationValue;
  }


  public Account lastAccessedAt(OffsetDateTime lastAccessedAt) {

    
    
    
    
    this.lastAccessedAt = lastAccessedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp of Belvo&#39;s most recent successful access to the institution for the given link.
   * @return lastAccessedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-09T10:28:40Z", required = true, value = "The ISO-8601 timestamp of Belvo's most recent successful access to the institution for the given link.")

  public OffsetDateTime getLastAccessedAt() {
    return lastAccessedAt;
  }


  public void setLastAccessedAt(OffsetDateTime lastAccessedAt) {

    
    
    
    this.lastAccessedAt = lastAccessedAt;
  }


  public Account creditData(AccountsCreditData creditData) {

    
    
    
    
    this.creditData = creditData;
    return this;
  }

   /**
   * Get creditData
   * @return creditData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AccountsCreditData getCreditData() {
    return creditData;
  }


  public void setCreditData(AccountsCreditData creditData) {

    
    
    
    this.creditData = creditData;
  }


  public Account loanData(AccountsLoanData loanData) {

    
    
    
    
    this.loanData = loanData;
    return this;
  }

   /**
   * Get loanData
   * @return loanData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AccountsLoanData getLoanData() {
    return loanData;
  }


  public void setLoanData(AccountsLoanData loanData) {

    
    
    
    this.loanData = loanData;
  }


  public Account fundsData(List<AccountsFundsData> fundsData) {

    
    
    
    
    this.fundsData = fundsData;
    return this;
  }

  public Account addFundsDataItem(AccountsFundsData fundsDataItem) {
    if (this.fundsData == null) {
      this.fundsData = new ArrayList<>();
    }
    this.fundsData.add(fundsDataItem);
    return this;
  }

   /**
   * One or more funds that contribute to the the pension account.
   * @return fundsData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more funds that contribute to the the pension account.")

  public List<AccountsFundsData> getFundsData() {
    return fundsData;
  }


  public void setFundsData(List<AccountsFundsData> fundsData) {

    
    
    
    this.fundsData = fundsData;
  }


  public Account receivablesData(AccountsReceivablesData receivablesData) {

    
    
    
    
    this.receivablesData = receivablesData;
    return this;
  }

   /**
   * Get receivablesData
   * @return receivablesData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountsReceivablesData getReceivablesData() {
    return receivablesData;
  }


  public void setReceivablesData(AccountsReceivablesData receivablesData) {

    
    
    
    this.receivablesData = receivablesData;
  }


  public Account bankProductId(String bankProductId) {

    
    
    
    
    this.bankProductId = bankProductId;
    return this;
  }

   /**
   * *This field has been deprecated.*  *The institution&#39;s product ID for the account type.* 
   * @return bankProductId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The institution's product ID for the account type.* ")

  public String getBankProductId() {
    return bankProductId;
  }


  public void setBankProductId(String bankProductId) {

    
    
    
    this.bankProductId = bankProductId;
  }


  public Account internalIdentification(String internalIdentification) {

    
    
    
    
    this.internalIdentification = internalIdentification;
    return this;
  }

   /**
   * *This field has been deprecated.*  *The institution&#39;s internal identification for the account.* 
   * @return internalIdentification
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "*This field has been deprecated.*  *The institution's internal identification for the account.* ")

  public String getInternalIdentification() {
    return internalIdentification;
  }


  public void setInternalIdentification(String internalIdentification) {

    
    
    
    this.internalIdentification = internalIdentification;
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
   * @return the Account instance itself
   */
  public Account putAdditionalProperty(String key, Object value) {
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
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.link, account.link) &&
        Objects.equals(this.institution, account.institution) &&
        Objects.equals(this.collectedAt, account.collectedAt) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.category, account.category) &&
        Objects.equals(this.balanceType, account.balanceType) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.number, account.number) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.publicIdentificationName, account.publicIdentificationName) &&
        Objects.equals(this.publicIdentificationValue, account.publicIdentificationValue) &&
        Objects.equals(this.lastAccessedAt, account.lastAccessedAt) &&
        Objects.equals(this.creditData, account.creditData) &&
        Objects.equals(this.loanData, account.loanData) &&
        Objects.equals(this.fundsData, account.fundsData) &&
        Objects.equals(this.receivablesData, account.receivablesData) &&
        Objects.equals(this.bankProductId, account.bankProductId) &&
        Objects.equals(this.internalIdentification, account.internalIdentification)&&
        Objects.equals(this.additionalProperties, account.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, institution, collectedAt, createdAt, category, balanceType, type, name, number, balance, currency, publicIdentificationName, publicIdentificationValue, lastAccessedAt, creditData, loanData, fundsData, receivablesData, bankProductId, internalIdentification, additionalProperties);
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
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    publicIdentificationName: ").append(toIndentedString(publicIdentificationName)).append("\n");
    sb.append("    publicIdentificationValue: ").append(toIndentedString(publicIdentificationValue)).append("\n");
    sb.append("    lastAccessedAt: ").append(toIndentedString(lastAccessedAt)).append("\n");
    sb.append("    creditData: ").append(toIndentedString(creditData)).append("\n");
    sb.append("    loanData: ").append(toIndentedString(loanData)).append("\n");
    sb.append("    fundsData: ").append(toIndentedString(fundsData)).append("\n");
    sb.append("    receivablesData: ").append(toIndentedString(receivablesData)).append("\n");
    sb.append("    bankProductId: ").append(toIndentedString(bankProductId)).append("\n");
    sb.append("    internalIdentification: ").append(toIndentedString(internalIdentification)).append("\n");
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
    openapiFields.add("link");
    openapiFields.add("institution");
    openapiFields.add("collected_at");
    openapiFields.add("created_at");
    openapiFields.add("category");
    openapiFields.add("balance_type");
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("number");
    openapiFields.add("balance");
    openapiFields.add("currency");
    openapiFields.add("public_identification_name");
    openapiFields.add("public_identification_value");
    openapiFields.add("last_accessed_at");
    openapiFields.add("credit_data");
    openapiFields.add("loan_data");
    openapiFields.add("funds_data");
    openapiFields.add("receivables_data");
    openapiFields.add("bank_product_id");
    openapiFields.add("internal_identification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("balance_type");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("public_identification_name");
    openapiRequiredFields.add("public_identification_value");
    openapiRequiredFields.add("last_accessed_at");
    openapiRequiredFields.add("credit_data");
    openapiRequiredFields.add("loan_data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Account
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Account.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("link").isJsonNull() && (jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      // validate the optional field `institution`
      if (jsonObj.get("institution") != null && !jsonObj.get("institution").isJsonNull()) {
        InstitutionAccount.validateJsonObject(jsonObj.getAsJsonObject("institution"));
      }
      if (!jsonObj.get("balance_type").isJsonNull() && !jsonObj.get("balance_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balance_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balance_type").toString()));
      }
      if (!jsonObj.get("type").isJsonNull() && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("number").isJsonNull() && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // validate the required field `balance`
      AccountsBalance.validateJsonObject(jsonObj.getAsJsonObject("balance"));
      if (!jsonObj.get("currency").isJsonNull() && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("public_identification_name").isJsonNull() && !jsonObj.get("public_identification_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_identification_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_identification_name").toString()));
      }
      if (!jsonObj.get("public_identification_value").isJsonNull() && !jsonObj.get("public_identification_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_identification_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_identification_value").toString()));
      }
      // validate the required field `credit_data`
      AccountsCreditData.validateJsonObject(jsonObj.getAsJsonObject("credit_data"));
      // validate the required field `loan_data`
      AccountsLoanData.validateJsonObject(jsonObj.getAsJsonObject("loan_data"));
      if (jsonObj.get("funds_data") != null && !jsonObj.get("funds_data").isJsonNull()) {
        JsonArray jsonArrayfundsData = jsonObj.getAsJsonArray("funds_data");
        if (jsonArrayfundsData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("funds_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `funds_data` to be an array in the JSON string but got `%s`", jsonObj.get("funds_data").toString()));
          }

          // validate the optional field `funds_data` (array)
          for (int i = 0; i < jsonArrayfundsData.size(); i++) {
            AccountsFundsData.validateJsonObject(jsonArrayfundsData.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `receivables_data`
      if (jsonObj.get("receivables_data") != null && !jsonObj.get("receivables_data").isJsonNull()) {
        AccountsReceivablesData.validateJsonObject(jsonObj.getAsJsonObject("receivables_data"));
      }
      if (!jsonObj.get("bank_product_id").isJsonNull() && (jsonObj.get("bank_product_id") != null && !jsonObj.get("bank_product_id").isJsonNull()) && !jsonObj.get("bank_product_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_product_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_product_id").toString()));
      }
      if (!jsonObj.get("internal_identification").isJsonNull() && (jsonObj.get("internal_identification") != null && !jsonObj.get("internal_identification").isJsonNull()) && !jsonObj.get("internal_identification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internal_identification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internal_identification").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
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
           public Account read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Account instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Account given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Account
  * @throws IOException if the JSON string is invalid with respect to Account
  */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

 /**
  * Convert an instance of Account to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

