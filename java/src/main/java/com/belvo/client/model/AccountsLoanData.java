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
import com.belvo.client.model.AccountsLoanDataFees;
import com.belvo.client.model.AccountsLoanDataInterestRate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * The loan options associated with this account.
 */
@ApiModel(description = "The loan options associated with this account.")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountsLoanData {
  public static final String SERIALIZED_NAME_COLLECTED_AT = "collected_at";
  @SerializedName(SERIALIZED_NAME_COLLECTED_AT)
  private OffsetDateTime collectedAt;

  public static final String SERIALIZED_NAME_CONTRACT_AMOUNT = "contract_amount";
  @SerializedName(SERIALIZED_NAME_CONTRACT_AMOUNT)
  private Float contractAmount;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Float principal;

  public static final String SERIALIZED_NAME_LOAN_TYPE = "loan_type";
  @SerializedName(SERIALIZED_NAME_LOAN_TYPE)
  private String loanType;

  public static final String SERIALIZED_NAME_PAYMENT_DAY = "payment_day";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DAY)
  private String paymentDay;

  public static final String SERIALIZED_NAME_OUTSTANDING_PRINCIPAL = "outstanding_principal";
  @SerializedName(SERIALIZED_NAME_OUTSTANDING_PRINCIPAL)
  private Float outstandingPrincipal;

  public static final String SERIALIZED_NAME_OUTSTANDING_BALANCE = "outstanding_balance";
  @SerializedName(SERIALIZED_NAME_OUTSTANDING_BALANCE)
  private Float outstandingBalance;

  public static final String SERIALIZED_NAME_MONTHLY_PAYMENT = "monthly_payment";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PAYMENT)
  private Float monthlyPayment;

  public static final String SERIALIZED_NAME_INTEREST_RATES = "interest_rates";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATES)
  private List<AccountsLoanDataInterestRate> interestRates = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private List<AccountsLoanDataFees> fees = null;

  public static final String SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS_TOTAL = "number_of_installments_total";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS_TOTAL)
  private Integer numberOfInstallmentsTotal;

  public static final String SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS_OUTSTANDING = "number_of_installments_outstanding";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_INSTALLMENTS_OUTSTANDING)
  private Integer numberOfInstallmentsOutstanding;

  public static final String SERIALIZED_NAME_CONTRACT_START_DATE = "contract_start_date";
  @SerializedName(SERIALIZED_NAME_CONTRACT_START_DATE)
  private LocalDate contractStartDate;

  public static final String SERIALIZED_NAME_CONTRACT_END_DATE = "contract_end_date";
  @SerializedName(SERIALIZED_NAME_CONTRACT_END_DATE)
  private LocalDate contractEndDate;

  public static final String SERIALIZED_NAME_CONTRACT_NUMBER = "contract_number";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NUMBER)
  private String contractNumber;

  public static final String SERIALIZED_NAME_CREDIT_LIMIT = "credit_limit";
  @SerializedName(SERIALIZED_NAME_CREDIT_LIMIT)
  private Double creditLimit;

  public static final String SERIALIZED_NAME_LAST_PERIOD_BALANCE = "last_period_balance";
  @SerializedName(SERIALIZED_NAME_LAST_PERIOD_BALANCE)
  private Double lastPeriodBalance;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private Double interestRate;

  public static final String SERIALIZED_NAME_LIMIT_DAY = "limit_day";
  @SerializedName(SERIALIZED_NAME_LIMIT_DAY)
  private String limitDay;

  public static final String SERIALIZED_NAME_CUTTING_DAY = "cutting_day";
  @SerializedName(SERIALIZED_NAME_CUTTING_DAY)
  private String cuttingDay;

  public static final String SERIALIZED_NAME_CUTTING_DATE = "cutting_date";
  @SerializedName(SERIALIZED_NAME_CUTTING_DATE)
  private String cuttingDate;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_DATE = "last_payment_date";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_DATE)
  private String lastPaymentDate;

  public static final String SERIALIZED_NAME_NO_INTEREST_PAYMENT = "no_interest_payment";
  @SerializedName(SERIALIZED_NAME_NO_INTEREST_PAYMENT)
  private Double noInterestPayment;

  public AccountsLoanData() {
  }

  public AccountsLoanData collectedAt(OffsetDateTime collectedAt) {
    
    
    this.collectedAt = collectedAt;
    return this;
  }

   /**
   * The ISO-8601 timestamp when the data point was collected.
   * @return collectedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-09T08:45:50.406032Z", required = true, value = "The ISO-8601 timestamp when the data point was collected.")

  public OffsetDateTime getCollectedAt() {
    return collectedAt;
  }


  public void setCollectedAt(OffsetDateTime collectedAt) {
    
    this.collectedAt = collectedAt;
  }


  public AccountsLoanData contractAmount(Float contractAmount) {
    
    
    this.contractAmount = contractAmount;
    return this;
  }

   /**
   * The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees.
   * @return contractAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202000", value = "The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees.")

  public Float getContractAmount() {
    return contractAmount;
  }


  public void setContractAmount(Float contractAmount) {
    
    this.contractAmount = contractAmount;
  }


  public AccountsLoanData principal(Float principal) {
    
    
    this.principal = principal;
    return this;
  }

   /**
   * Total amount of the loan (the amount the user receives).
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192000", required = true, value = "Total amount of the loan (the amount the user receives).")

  public Float getPrincipal() {
    return principal;
  }


  public void setPrincipal(Float principal) {
    
    this.principal = principal;
  }


  public AccountsLoanData loanType(String loanType) {
    
    
    this.loanType = loanType;
    return this;
  }

   /**
   * The type of the loan, according to the institution.
   * @return loanType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Consignado", value = "The type of the loan, according to the institution.")

  public String getLoanType() {
    return loanType;
  }


  public void setLoanType(String loanType) {
    
    this.loanType = loanType;
  }


  public AccountsLoanData paymentDay(String paymentDay) {
    
    
    this.paymentDay = paymentDay;
    return this;
  }

   /**
   * The day of the month by which the owner needs to pay the loan (&#x60;YYYY-MM-DD&#x60;).
   * @return paymentDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "27", value = "The day of the month by which the owner needs to pay the loan (`YYYY-MM-DD`).")

  public String getPaymentDay() {
    return paymentDay;
  }


  public void setPaymentDay(String paymentDay) {
    
    this.paymentDay = paymentDay;
  }


  public AccountsLoanData outstandingPrincipal(Float outstandingPrincipal) {
    
    
    this.outstandingPrincipal = outstandingPrincipal;
    return this;
  }

   /**
   * Outstanding loan amount, that is, how much remains to pay on the principal (not including interest). 
   * @return outstandingPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "142023", value = "Outstanding loan amount, that is, how much remains to pay on the principal (not including interest). ")

  public Float getOutstandingPrincipal() {
    return outstandingPrincipal;
  }


  public void setOutstandingPrincipal(Float outstandingPrincipal) {
    
    this.outstandingPrincipal = outstandingPrincipal;
  }


  public AccountsLoanData outstandingBalance(Float outstandingBalance) {
    
    
    this.outstandingBalance = outstandingBalance;
    return this;
  }

   /**
   * The amount remaining to pay in total, including interest.
   * @return outstandingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "182000", required = true, value = "The amount remaining to pay in total, including interest.")

  public Float getOutstandingBalance() {
    return outstandingBalance;
  }


  public void setOutstandingBalance(Float outstandingBalance) {
    
    this.outstandingBalance = outstandingBalance;
  }


  public AccountsLoanData monthlyPayment(Float monthlyPayment) {
    
    
    this.monthlyPayment = monthlyPayment;
    return this;
  }

   /**
   * The recurrent monthly payment, if applicable.
   * @return monthlyPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", required = true, value = "The recurrent monthly payment, if applicable.")

  public Float getMonthlyPayment() {
    return monthlyPayment;
  }


  public void setMonthlyPayment(Float monthlyPayment) {
    
    this.monthlyPayment = monthlyPayment;
  }


  public AccountsLoanData interestRates(List<AccountsLoanDataInterestRate> interestRates) {
    
    
    this.interestRates = interestRates;
    return this;
  }

  public AccountsLoanData addInterestRatesItem(AccountsLoanDataInterestRate interestRatesItem) {
    this.interestRates.add(interestRatesItem);
    return this;
  }

   /**
   * Breakdown of the interest applied to the loan.
   * @return interestRates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Breakdown of the interest applied to the loan.")

  public List<AccountsLoanDataInterestRate> getInterestRates() {
    return interestRates;
  }


  public void setInterestRates(List<AccountsLoanDataInterestRate> interestRates) {
    
    this.interestRates = interestRates;
  }


  public AccountsLoanData fees(List<AccountsLoanDataFees> fees) {
    
    
    this.fees = fees;
    return this;
  }

  public AccountsLoanData addFeesItem(AccountsLoanDataFees feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Breakdown of the fees applied to the loan.
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Breakdown of the fees applied to the loan.")

  public List<AccountsLoanDataFees> getFees() {
    return fees;
  }


  public void setFees(List<AccountsLoanDataFees> fees) {
    
    this.fees = fees;
  }


  public AccountsLoanData numberOfInstallmentsTotal(Integer numberOfInstallmentsTotal) {
    
    
    this.numberOfInstallmentsTotal = numberOfInstallmentsTotal;
    return this;
  }

   /**
   * The total number of installments required to pay the loan.
   * @return numberOfInstallmentsTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60", value = "The total number of installments required to pay the loan.")

  public Integer getNumberOfInstallmentsTotal() {
    return numberOfInstallmentsTotal;
  }


  public void setNumberOfInstallmentsTotal(Integer numberOfInstallmentsTotal) {
    
    this.numberOfInstallmentsTotal = numberOfInstallmentsTotal;
  }


  public AccountsLoanData numberOfInstallmentsOutstanding(Integer numberOfInstallmentsOutstanding) {
    
    
    this.numberOfInstallmentsOutstanding = numberOfInstallmentsOutstanding;
    return this;
  }

   /**
   * The number of installments left to pay.
   * @return numberOfInstallmentsOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48", value = "The number of installments left to pay.")

  public Integer getNumberOfInstallmentsOutstanding() {
    return numberOfInstallmentsOutstanding;
  }


  public void setNumberOfInstallmentsOutstanding(Integer numberOfInstallmentsOutstanding) {
    
    this.numberOfInstallmentsOutstanding = numberOfInstallmentsOutstanding;
  }


  public AccountsLoanData contractStartDate(LocalDate contractStartDate) {
    
    
    this.contractStartDate = contractStartDate;
    return this;
  }

   /**
   * The date when the loan contract was signed (&#x60;YYYY-MM-DD&#x60;).
   * @return contractStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Feb 29 16:00:00 PST 2020", value = "The date when the loan contract was signed (`YYYY-MM-DD`).")

  public LocalDate getContractStartDate() {
    return contractStartDate;
  }


  public void setContractStartDate(LocalDate contractStartDate) {
    
    this.contractStartDate = contractStartDate;
  }


  public AccountsLoanData contractEndDate(LocalDate contractEndDate) {
    
    
    this.contractEndDate = contractEndDate;
    return this;
  }

   /**
   * The date when the loan is expected to be completed.
   * @return contractEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Sep 30 17:00:00 PDT 2027", value = "The date when the loan is expected to be completed.")

  public LocalDate getContractEndDate() {
    return contractEndDate;
  }


  public void setContractEndDate(LocalDate contractEndDate) {
    
    this.contractEndDate = contractEndDate;
  }


  public AccountsLoanData contractNumber(String contractNumber) {
    
    
    this.contractNumber = contractNumber;
    return this;
  }

   /**
   * The contract number of the loan, as given by the institution.
   * @return contractNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "890ASLDJF87SD00", value = "The contract number of the loan, as given by the institution.")

  public String getContractNumber() {
    return contractNumber;
  }


  public void setContractNumber(String contractNumber) {
    
    this.contractNumber = contractNumber;
  }


  public AccountsLoanData creditLimit(Double creditLimit) {
    
    
    this.creditLimit = creditLimit;
    return this;
  }

  public AccountsLoanData creditLimit(Integer creditLimit) {
    
    
    this.creditLimit = creditLimit.doubleValue();
    return this;
  }

   /**
   * This field has been deprecated.  Please see &#x60;principal&#x60; instead. 
   * @return creditLimit
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see `principal` instead. ")

  public Double getCreditLimit() {
    return creditLimit;
  }


  public void setCreditLimit(Double creditLimit) {
    
    this.creditLimit = creditLimit;
  }


  public AccountsLoanData lastPeriodBalance(Double lastPeriodBalance) {
    
    
    this.lastPeriodBalance = lastPeriodBalance;
    return this;
  }

  public AccountsLoanData lastPeriodBalance(Integer lastPeriodBalance) {
    
    
    this.lastPeriodBalance = lastPeriodBalance.doubleValue();
    return this;
  }

   /**
   * This field has been deprecated.  Please see &#x60;outstanding_balance&#x60; instead. 
   * @return lastPeriodBalance
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see `outstanding_balance` instead. ")

  public Double getLastPeriodBalance() {
    return lastPeriodBalance;
  }


  public void setLastPeriodBalance(Double lastPeriodBalance) {
    
    this.lastPeriodBalance = lastPeriodBalance;
  }


  public AccountsLoanData interestRate(Double interestRate) {
    
    
    this.interestRate = interestRate;
    return this;
  }

  public AccountsLoanData interestRate(Integer interestRate) {
    
    
    this.interestRate = interestRate.doubleValue();
    return this;
  }

   /**
   * This field has been deprecated.  Please see the &#x60;interest_rates&#x60; object instead. 
   * @return interestRate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see the `interest_rates` object instead. ")

  public Double getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(Double interestRate) {
    
    this.interestRate = interestRate;
  }


  public AccountsLoanData limitDay(String limitDay) {
    
    
    this.limitDay = limitDay;
    return this;
  }

   /**
   * This field has been deprecated.  Please see &#x60;payment_day&#x60; instead. 
   * @return limitDay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  Please see `payment_day` instead. ")

  public String getLimitDay() {
    return limitDay;
  }


  public void setLimitDay(String limitDay) {
    
    this.limitDay = limitDay;
  }


  public AccountsLoanData cuttingDay(String cuttingDay) {
    
    
    this.cuttingDay = cuttingDay;
    return this;
  }

   /**
   * This field has been deprecated.  The closing day of the month for the loan. 
   * @return cuttingDay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The closing day of the month for the loan. ")

  public String getCuttingDay() {
    return cuttingDay;
  }


  public void setCuttingDay(String cuttingDay) {
    
    this.cuttingDay = cuttingDay;
  }


  public AccountsLoanData cuttingDate(String cuttingDate) {
    
    
    this.cuttingDate = cuttingDate;
    return this;
  }

   /**
   * This field has been deprecated.  The closing date of the loan period. 
   * @return cuttingDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The closing date of the loan period. ")

  public String getCuttingDate() {
    return cuttingDate;
  }


  public void setCuttingDate(String cuttingDate) {
    
    this.cuttingDate = cuttingDate;
  }


  public AccountsLoanData lastPaymentDate(String lastPaymentDate) {
    
    
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * This field has been deprecated.  The date when the last loan payment was made. 
   * @return lastPaymentDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The date when the last loan payment was made. ")

  public String getLastPaymentDate() {
    return lastPaymentDate;
  }


  public void setLastPaymentDate(String lastPaymentDate) {
    
    this.lastPaymentDate = lastPaymentDate;
  }


  public AccountsLoanData noInterestPayment(Double noInterestPayment) {
    
    
    this.noInterestPayment = noInterestPayment;
    return this;
  }

  public AccountsLoanData noInterestPayment(Integer noInterestPayment) {
    
    
    this.noInterestPayment = noInterestPayment.doubleValue();
    return this;
  }

   /**
   * This field has been deprecated.  The minimum amount required to pay to avoid generating interest. 
   * @return noInterestPayment
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field has been deprecated.  The minimum amount required to pay to avoid generating interest. ")

  public Double getNoInterestPayment() {
    return noInterestPayment;
  }


  public void setNoInterestPayment(Double noInterestPayment) {
    
    this.noInterestPayment = noInterestPayment;
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
   * @return the AccountsLoanData instance itself
   */
  public AccountsLoanData putAdditionalProperty(String key, Object value) {
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
    AccountsLoanData accountsLoanData = (AccountsLoanData) o;
    return Objects.equals(this.collectedAt, accountsLoanData.collectedAt) &&
        Objects.equals(this.contractAmount, accountsLoanData.contractAmount) &&
        Objects.equals(this.principal, accountsLoanData.principal) &&
        Objects.equals(this.loanType, accountsLoanData.loanType) &&
        Objects.equals(this.paymentDay, accountsLoanData.paymentDay) &&
        Objects.equals(this.outstandingPrincipal, accountsLoanData.outstandingPrincipal) &&
        Objects.equals(this.outstandingBalance, accountsLoanData.outstandingBalance) &&
        Objects.equals(this.monthlyPayment, accountsLoanData.monthlyPayment) &&
        Objects.equals(this.interestRates, accountsLoanData.interestRates) &&
        Objects.equals(this.fees, accountsLoanData.fees) &&
        Objects.equals(this.numberOfInstallmentsTotal, accountsLoanData.numberOfInstallmentsTotal) &&
        Objects.equals(this.numberOfInstallmentsOutstanding, accountsLoanData.numberOfInstallmentsOutstanding) &&
        Objects.equals(this.contractStartDate, accountsLoanData.contractStartDate) &&
        Objects.equals(this.contractEndDate, accountsLoanData.contractEndDate) &&
        Objects.equals(this.contractNumber, accountsLoanData.contractNumber) &&
        Objects.equals(this.creditLimit, accountsLoanData.creditLimit) &&
        Objects.equals(this.lastPeriodBalance, accountsLoanData.lastPeriodBalance) &&
        Objects.equals(this.interestRate, accountsLoanData.interestRate) &&
        Objects.equals(this.limitDay, accountsLoanData.limitDay) &&
        Objects.equals(this.cuttingDay, accountsLoanData.cuttingDay) &&
        Objects.equals(this.cuttingDate, accountsLoanData.cuttingDate) &&
        Objects.equals(this.lastPaymentDate, accountsLoanData.lastPaymentDate) &&
        Objects.equals(this.noInterestPayment, accountsLoanData.noInterestPayment)&&
        Objects.equals(this.additionalProperties, accountsLoanData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectedAt, contractAmount, principal, loanType, paymentDay, outstandingPrincipal, outstandingBalance, monthlyPayment, interestRates, fees, numberOfInstallmentsTotal, numberOfInstallmentsOutstanding, contractStartDate, contractEndDate, contractNumber, creditLimit, lastPeriodBalance, interestRate, limitDay, cuttingDay, cuttingDate, lastPaymentDate, noInterestPayment, additionalProperties);
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
    sb.append("class AccountsLoanData {\n");
    sb.append("    collectedAt: ").append(toIndentedString(collectedAt)).append("\n");
    sb.append("    contractAmount: ").append(toIndentedString(contractAmount)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    loanType: ").append(toIndentedString(loanType)).append("\n");
    sb.append("    paymentDay: ").append(toIndentedString(paymentDay)).append("\n");
    sb.append("    outstandingPrincipal: ").append(toIndentedString(outstandingPrincipal)).append("\n");
    sb.append("    outstandingBalance: ").append(toIndentedString(outstandingBalance)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    interestRates: ").append(toIndentedString(interestRates)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    numberOfInstallmentsTotal: ").append(toIndentedString(numberOfInstallmentsTotal)).append("\n");
    sb.append("    numberOfInstallmentsOutstanding: ").append(toIndentedString(numberOfInstallmentsOutstanding)).append("\n");
    sb.append("    contractStartDate: ").append(toIndentedString(contractStartDate)).append("\n");
    sb.append("    contractEndDate: ").append(toIndentedString(contractEndDate)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    lastPeriodBalance: ").append(toIndentedString(lastPeriodBalance)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    limitDay: ").append(toIndentedString(limitDay)).append("\n");
    sb.append("    cuttingDay: ").append(toIndentedString(cuttingDay)).append("\n");
    sb.append("    cuttingDate: ").append(toIndentedString(cuttingDate)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    noInterestPayment: ").append(toIndentedString(noInterestPayment)).append("\n");
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
    openapiFields.add("contract_amount");
    openapiFields.add("principal");
    openapiFields.add("loan_type");
    openapiFields.add("payment_day");
    openapiFields.add("outstanding_principal");
    openapiFields.add("outstanding_balance");
    openapiFields.add("monthly_payment");
    openapiFields.add("interest_rates");
    openapiFields.add("fees");
    openapiFields.add("number_of_installments_total");
    openapiFields.add("number_of_installments_outstanding");
    openapiFields.add("contract_start_date");
    openapiFields.add("contract_end_date");
    openapiFields.add("contract_number");
    openapiFields.add("credit_limit");
    openapiFields.add("last_period_balance");
    openapiFields.add("interest_rate");
    openapiFields.add("limit_day");
    openapiFields.add("cutting_day");
    openapiFields.add("cutting_date");
    openapiFields.add("last_payment_date");
    openapiFields.add("no_interest_payment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("collected_at");
    openapiRequiredFields.add("principal");
    openapiRequiredFields.add("outstanding_balance");
    openapiRequiredFields.add("monthly_payment");
    openapiRequiredFields.add("interest_rates");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountsLoanData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountsLoanData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountsLoanData is not found in the empty JSON string", AccountsLoanData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountsLoanData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("loan_type").isJsonNull() && (jsonObj.get("loan_type") != null && !jsonObj.get("loan_type").isJsonNull()) && !jsonObj.get("loan_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loan_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loan_type").toString()));
      }
      if (!jsonObj.get("payment_day").isJsonNull() && (jsonObj.get("payment_day") != null && !jsonObj.get("payment_day").isJsonNull()) && !jsonObj.get("payment_day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_day").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("interest_rates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `interest_rates` to be an array in the JSON string but got `%s`", jsonObj.get("interest_rates").toString()));
      }

      JsonArray jsonArrayinterestRates = jsonObj.getAsJsonArray("interest_rates");
      // validate the required field `interest_rates` (array)
      for (int i = 0; i < jsonArrayinterestRates.size(); i++) {
        AccountsLoanDataInterestRate.validateJsonObject(jsonArrayinterestRates.get(i).getAsJsonObject());
      };
      if (jsonObj.get("fees") != null && !jsonObj.get("fees").isJsonNull()) {
        JsonArray jsonArrayfees = jsonObj.getAsJsonArray("fees");
        if (jsonArrayfees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fees` to be an array in the JSON string but got `%s`", jsonObj.get("fees").toString()));
          }

          // validate the optional field `fees` (array)
          for (int i = 0; i < jsonArrayfees.size(); i++) {
            AccountsLoanDataFees.validateJsonObject(jsonArrayfees.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("contract_number").isJsonNull() && (jsonObj.get("contract_number") != null && !jsonObj.get("contract_number").isJsonNull()) && !jsonObj.get("contract_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_number").toString()));
      }
      if (!jsonObj.get("limit_day").isJsonNull() && (jsonObj.get("limit_day") != null && !jsonObj.get("limit_day").isJsonNull()) && !jsonObj.get("limit_day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit_day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit_day").toString()));
      }
      if (!jsonObj.get("cutting_day").isJsonNull() && (jsonObj.get("cutting_day") != null && !jsonObj.get("cutting_day").isJsonNull()) && !jsonObj.get("cutting_day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cutting_day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cutting_day").toString()));
      }
      if (!jsonObj.get("cutting_date").isJsonNull() && (jsonObj.get("cutting_date") != null && !jsonObj.get("cutting_date").isJsonNull()) && !jsonObj.get("cutting_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cutting_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cutting_date").toString()));
      }
      if (!jsonObj.get("last_payment_date").isJsonNull() && (jsonObj.get("last_payment_date") != null && !jsonObj.get("last_payment_date").isJsonNull()) && !jsonObj.get("last_payment_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_payment_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_payment_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountsLoanData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountsLoanData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountsLoanData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountsLoanData.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountsLoanData>() {
           @Override
           public void write(JsonWriter out, AccountsLoanData value) throws IOException {
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
           public AccountsLoanData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountsLoanData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountsLoanData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountsLoanData
  * @throws IOException if the JSON string is invalid with respect to AccountsLoanData
  */
  public static AccountsLoanData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountsLoanData.class);
  }

 /**
  * Convert an instance of AccountsLoanData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

