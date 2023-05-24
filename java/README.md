# belvo-java-sdk

Belvo API Docs
- API version: 1.35.0

# Introduction

Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.

Through our API, you can access:


- **Bank information** such as account information, real-time
balance, historical transactions, and account owner identification.

- **Fiscal information** such as received and sent invoices and tax returns.


<img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\"
alt=\"fiscal-endpoints\">


In this API reference you'll find all the information you need about each

endpoint and resource.


<div style=\"background-color:#f4f6f8; border-left: 6px solid
#4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right:
25px\">

<strong>Tip: </strong> Make sure that you also check out our Developer
Portal for guides on <a
href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\"
target=\"_blank\">how to get started</a>, using our <a
href=\"https://developers.belvo.com/docs/test-in-sandbox\"
target=\"_blank\">Sandbox environment</a>, as well as how to <a
href=\"https://developers.belvo.com/docs/connect-widget\"
target=\"_blank\">integrate the widget</a> or use our <a
href=\"https://developers.belvo.com/docs/quickstart-application\"
target=\"_blank\">quickstart application</a>.

</div>


## Environment

We currently offer three environments: sandbox, development, and
production.


When using our SDKs, make sure to use the **Alias** (and not the Base URL).


| Environment | Purpose | Access |
|-----------|-------|-------|
| **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox|
|**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development |
| **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you
will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias
(SDKs): production|


For each environment, you'll need to [generate separate API
keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).


## Response codes


We use the following HTTP status code in the response depending on the
success or failure:


| Status Code | Description |
|-----------|-------|
| `200` | ✅ **Success** - The content is available in the response body. |
| `201` | ✅ **Success** - The content was created successfully on Belvo. |
| `204` | ✅ **Success** - No content to return. |
| `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.|
| `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.|
| `404` | ❌ **Not Found** - The resource you try to access cannot be found.|
| `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.|
| `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.|
| `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. |
| `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|


## Error handling


### Error messages


Belvo API errors are returned in JSON format. For example, an error might
look like this:


```json

[
    {
      \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",
      \"message\": \"This field is required.\",
      \"code\": \"required\",
      \"field\": \"link\"
    }
]

```


Typically, an error response will have the following parameters:

- `request_id`: a unique ID for the request, you should share it with the
Belvo support team for investigations.

- `message`: human-readable description of the error.

- `code`: a unique code for the error. Check the table below to see how to
handle each error code.

- `field` *(optional)*: The specific field in the request body that has an
issue.



### Request identifier

When you need help with a specific error, add the request identifier
(`request_id`) in your message to the Belvo support team. This will speed up
investigations and get you back up and running in no time at all.


### Error codes and troubleshooting


For a full list of errors and how to troubleshoot them, please see our
dedicated [Error handling
articles](https://developers.belvo.com/docs/integration-overview#error-handling)
in our DevPortal.



### Retry policy


Please see our recommended [retry
policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy)
in the DevPortal.


For more information, please visit [https://developers.belvo.com](https://developers.belvo.com)

*Automatically generated by the [Konfig](https://konfigthis.com)*


## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.belvo</groupId>
  <artifactId>belvo-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.belvo:belvo-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/belvo-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    AccountsApi api = new AccountsApi(apiClient);
    String session = "session_example"; // The session you want to resume. You need to use the `session` value that is provided in the 428 Token Required response that you receive after you make your POST request.
    UUID link = UUID.randomUUID(); // The `link.id` you want to resume. Must be the same `link.id` as the one you receive in the 428 Token Required response that contains the `session` ID.
    String token = "token_example"; // The MFA token generated by the institution and required to continue a session.
    Boolean saveData = true; // Indicates whether or not to persist the data in Belvo. By default, this is set to `true` and we return a 201 Created response. When set to `false`, the data won't be persisted and we return a 200 OK response.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      List<Account> result = api
              .completeRequest(session, link)
              .token(token)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#completeRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<List<Account>> response = api
              .completeRequest(session, link)
              .token(token)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#completeRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.belvo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**completeRequest**](docs/AccountsApi.md#completeRequest) | **PATCH** /api/accounts | Complete an accounts request
*AccountsApi* | [**delete**](docs/AccountsApi.md#delete) | **DELETE** /api/accounts/{id} | Delete an account
*AccountsApi* | [**getDetails**](docs/AccountsApi.md#getDetails) | **GET** /api/accounts/{id} | Get an account&#39;s details
*AccountsApi* | [**list**](docs/AccountsApi.md#list) | **GET** /api/accounts | List all accounts
*AccountsApi* | [**retrieve**](docs/AccountsApi.md#retrieve) | **POST** /api/accounts | Retrieve accounts for a link
*BalancesApi* | [**completeRequest**](docs/BalancesApi.md#completeRequest) | **PATCH** /api/balances | Complete a balances request
*BalancesApi* | [**delete**](docs/BalancesApi.md#delete) | **DELETE** /api/balances/{id} | Delete a balance
*BalancesApi* | [**getDetails**](docs/BalancesApi.md#getDetails) | **GET** /api/balances/{id} | Get a balance&#39;s details
*BalancesApi* | [**list**](docs/BalancesApi.md#list) | **GET** /api/balances | List all balances
*BalancesApi* | [**retrieve**](docs/BalancesApi.md#retrieve) | **POST** /api/balances | Retrieve balances for a link
*BankAccountsApi* | [**create**](docs/BankAccountsApi.md#create) | **POST** /payments/bank-accounts | Create a new bank account
*BankAccountsApi* | [**getDetails**](docs/BankAccountsApi.md#getDetails) | **GET** /payments/bank-accounts/{id} | Get details about a bank account
*BankAccountsApi* | [**list**](docs/BankAccountsApi.md#list) | **GET** /payments/bank-accounts | List all bank accounts
*CategorizationApi* | [**categorizeTransactions**](docs/CategorizationApi.md#categorizeTransactions) | **POST** /api/categorization | Categorize transactions
*CustomersApi* | [**create**](docs/CustomersApi.md#create) | **POST** /payments/customers | Create a new customer
*CustomersApi* | [**getDetails**](docs/CustomersApi.md#getDetails) | **GET** /payments/customers/{id} | Get details about a customer
*CustomersApi* | [**list**](docs/CustomersApi.md#list) | **GET** /payments/customers | List all customers
*EmploymentRecordsApi* | [**delete**](docs/EmploymentRecordsApi.md#delete) | **DELETE** /api/employment-records/{id} | Delete an employment record
*EmploymentRecordsApi* | [**getDetails**](docs/EmploymentRecordsApi.md#getDetails) | **GET** /api/employment-records/{id} | Get an employment record&#39;s details
*EmploymentRecordsApi* | [**list**](docs/EmploymentRecordsApi.md#list) | **GET** /api/employment-records | List all employment records
*EmploymentRecordsApi* | [**retrieve**](docs/EmploymentRecordsApi.md#retrieve) | **POST** /api/employment-records | Retrieve employment record details
*IncomeVerificationApi* | [**verify**](docs/IncomeVerificationApi.md#verify) | **POST** /api/enrich/incomes | Verify incomes
*IncomesApi* | [**completeRequest**](docs/IncomesApi.md#completeRequest) | **PATCH** /api/incomes | Complete an incomes request
*IncomesApi* | [**delete**](docs/IncomesApi.md#delete) | **DELETE** /api/incomes/{id} | Delete an income
*IncomesApi* | [**getDetails**](docs/IncomesApi.md#getDetails) | **GET** /api/incomes/{id} | Get an income&#39;s details
*IncomesApi* | [**list**](docs/IncomesApi.md#list) | **GET** /api/incomes | List all incomes
*IncomesApi* | [**retrieve**](docs/IncomesApi.md#retrieve) | **POST** /api/incomes | Retrieve incomes for a link
*InstitutionsApi* | [**getDetails**](docs/InstitutionsApi.md#getDetails) | **GET** /api/institutions/{id} | Get an institution&#39;s details
*InstitutionsApi* | [**list**](docs/InstitutionsApi.md#list) | **GET** /api/institutions | List all institutions
*InvestmentPortfoliosApi* | [**completeRequest**](docs/InvestmentPortfoliosApi.md#completeRequest) | **PATCH** /investments/portfolios | Complete a portfolios request
*InvestmentPortfoliosApi* | [**delete**](docs/InvestmentPortfoliosApi.md#delete) | **DELETE** /investments/portfolios/{id} | Delete a portfolio
*InvestmentPortfoliosApi* | [**getDetails**](docs/InvestmentPortfoliosApi.md#getDetails) | **GET** /investments/portfolios/{id} | Get a portfolio&#39;s details
*InvestmentPortfoliosApi* | [**list**](docs/InvestmentPortfoliosApi.md#list) | **GET** /investments/portfolios | List all portfolios
*InvestmentPortfoliosApi* | [**retrieve**](docs/InvestmentPortfoliosApi.md#retrieve) | **POST** /investments/portfolios | Retrieve portfolios for a link
*InvoicesApi* | [**completeRequest**](docs/InvoicesApi.md#completeRequest) | **PATCH** /api/invoices | Complete an invoices request
*InvoicesApi* | [**delete**](docs/InvoicesApi.md#delete) | **DELETE** /api/invoices/{id} | Delete an invoice
*InvoicesApi* | [**getDetails**](docs/InvoicesApi.md#getDetails) | **GET** /api/invoices/{id} | Get an invoice&#39;s details
*InvoicesApi* | [**list**](docs/InvoicesApi.md#list) | **GET** /api/invoices | List all invoices
*InvoicesApi* | [**retrieve**](docs/InvoicesApi.md#retrieve) | **POST** /api/invoices | Retrieve invoices for a link
*LinksApi* | [**changeAccessMode**](docs/LinksApi.md#changeAccessMode) | **PATCH** /api/links/{id} | Change a link&#39;s access mode
*LinksApi* | [**completeRequest**](docs/LinksApi.md#completeRequest) | **PATCH** /api/links | Complete a links request
*LinksApi* | [**destroy**](docs/LinksApi.md#destroy) | **DELETE** /api/links/{id} | Delete a link
*LinksApi* | [**getDetails**](docs/LinksApi.md#getDetails) | **GET** /api/links/{id} | Get a link&#39;s details
*LinksApi* | [**list**](docs/LinksApi.md#list) | **GET** /api/links | List all links
*LinksApi* | [**register**](docs/LinksApi.md#register) | **POST** /api/links | Register a new link
*LinksApi* | [**update**](docs/LinksApi.md#update) | **PUT** /api/links/{id} | Update a link&#39;s credentials
*OwnersApi* | [**completeRequest**](docs/OwnersApi.md#completeRequest) | **PATCH** /api/owners | Complete an owners request
*OwnersApi* | [**delete**](docs/OwnersApi.md#delete) | **DELETE** /api/owners/{id} | Delete an owner
*OwnersApi* | [**getDetails**](docs/OwnersApi.md#getDetails) | **GET** /api/owners/{id} | Get an owner&#39;s details
*OwnersApi* | [**list**](docs/OwnersApi.md#list) | **GET** /api/owners | List all owners
*OwnersApi* | [**retrieve**](docs/OwnersApi.md#retrieve) | **POST** /api/owners | Retrieve owners for a link
*PaymentInstitutionsApi* | [**getDetails**](docs/PaymentInstitutionsApi.md#getDetails) | **GET** /payments/institutions/{id} | Get details about a payment institution
*PaymentInstitutionsApi* | [**list**](docs/PaymentInstitutionsApi.md#list) | **GET** /payments/institutions | List all payment institutions
*PaymentIntentsApi* | [**complete**](docs/PaymentIntentsApi.md#complete) | **PATCH** /payments/payment-intents/{id} | Complete a payment intent
*PaymentIntentsApi* | [**create**](docs/PaymentIntentsApi.md#create) | **POST** /payments/payment-intents | Create a new payment intent
*PaymentIntentsApi* | [**getDetails**](docs/PaymentIntentsApi.md#getDetails) | **GET** /payments/payment-intents/{id} | Get details about a payment intent.
*PaymentIntentsApi* | [**list**](docs/PaymentIntentsApi.md#list) | **GET** /payments/payment-intents | List all payment intents
*PaymentLinksApi* | [**create**](docs/PaymentLinksApi.md#create) | **POST** /payments/payment-links | Create a payment link
*PaymentLinksApi* | [**getDetails**](docs/PaymentLinksApi.md#getDetails) | **GET** /payments/payment-links/{access_token} | Get details about a payment link
*PaymentLinksApi* | [**list**](docs/PaymentLinksApi.md#list) | **GET** /payments/payment-links | List all payment links
*PaymentTransactionsApi* | [**getDetails**](docs/PaymentTransactionsApi.md#getDetails) | **GET** /payments/transactions/{id} | Get details about a payment transaction
*PaymentTransactionsApi* | [**list**](docs/PaymentTransactionsApi.md#list) | **GET** /payments/transactions | List all payment transactions
*ReceivableTransactionsApi* | [**delete**](docs/ReceivableTransactionsApi.md#delete) | **DELETE** /receivables/transactions/{id} | Delete a receivable transaction
*ReceivableTransactionsApi* | [**getDetails**](docs/ReceivableTransactionsApi.md#getDetails) | **GET** /receivables/transactions/{id} | Get a receivable transaction&#39;s details
*ReceivableTransactionsApi* | [**list**](docs/ReceivableTransactionsApi.md#list) | **GET** /receivables/transactions | List all receivable transactions
*ReceivableTransactionsApi* | [**retrieve**](docs/ReceivableTransactionsApi.md#retrieve) | **POST** /receivables/transactions | Retrieve receivable transactions for a link
*RecurringExpensesApi* | [**completeRequest**](docs/RecurringExpensesApi.md#completeRequest) | **PATCH** /api/recurring-expenses | Complete a recurring expenses request
*RecurringExpensesApi* | [**delete**](docs/RecurringExpensesApi.md#delete) | **DELETE** /api/recurring-expenses/{id} | Delete a recurring expense
*RecurringExpensesApi* | [**getDetails**](docs/RecurringExpensesApi.md#getDetails) | **GET** /api/recurring-expenses/{id} | Get a recurring expense&#39;s details
*RecurringExpensesApi* | [**list**](docs/RecurringExpensesApi.md#list) | **GET** /api/recurring-expenses | List all recurring expenses
*RecurringExpensesApi* | [**retrieve**](docs/RecurringExpensesApi.md#retrieve) | **POST** /api/recurring-expenses | Retrieve recurring expenses for a link
*RiskInsightsApi* | [**completeRequest**](docs/RiskInsightsApi.md#completeRequest) | **PATCH** /api/risk-insights | Complete a risk insights request
*RiskInsightsApi* | [**delete**](docs/RiskInsightsApi.md#delete) | **DELETE** /api/risk-insights/{id} | Delete a risk insight
*RiskInsightsApi* | [**getDetails**](docs/RiskInsightsApi.md#getDetails) | **GET** /api/risk-insights/{id} | Get a risk insight&#39;s details
*RiskInsightsApi* | [**list**](docs/RiskInsightsApi.md#list) | **GET** /api/risk-insights | List all risk insights
*RiskInsightsApi* | [**retrieve**](docs/RiskInsightsApi.md#retrieve) | **POST** /api/risk-insights | Retrieve risk insights for a link
*SecretKeysApi* | [**create**](docs/SecretKeysApi.md#create) | **POST** /payments/secret-keys | Request API keys
*SecretKeysApi* | [**list**](docs/SecretKeysApi.md#list) | **GET** /payments/secret-keys | List all secret keys
*TaxComplianceStatusApi* | [**delete**](docs/TaxComplianceStatusApi.md#delete) | **DELETE** /api/tax-compliance-status/{id} | Delete a tax compliance status
*TaxComplianceStatusApi* | [**getDetails**](docs/TaxComplianceStatusApi.md#getDetails) | **GET** /api/tax-compliance-status/{id} | Get a tax compliance status&#39;s details
*TaxComplianceStatusApi* | [**list**](docs/TaxComplianceStatusApi.md#list) | **GET** /api/tax-compliance-status | List all tax compliance statuses
*TaxComplianceStatusApi* | [**retrieve**](docs/TaxComplianceStatusApi.md#retrieve) | **POST** /api/tax-compliance-status | Retrieve tax compliance statuses for a link
*TaxDeclarationsApi* | [**delete**](docs/TaxDeclarationsApi.md#delete) | **DELETE** /api/tax-declarations/{id} | Delete a tax declration
*TaxDeclarationsApi* | [**getDetails**](docs/TaxDeclarationsApi.md#getDetails) | **GET** /api/tax-declarations/{id} | Get a tax declaration&#39;s details
*TaxDeclarationsApi* | [**list**](docs/TaxDeclarationsApi.md#list) | **GET** /api/tax-declarations | List all tax declarations
*TaxDeclarationsApi* | [**retrieve**](docs/TaxDeclarationsApi.md#retrieve) | **POST** /api/tax-declarations | Retrieve tax declarations for a link
*TaxRetentionsApi* | [**delete**](docs/TaxRetentionsApi.md#delete) | **DELETE** /api/tax-retentions/{id} | Delete a tax retention
*TaxRetentionsApi* | [**getDetails**](docs/TaxRetentionsApi.md#getDetails) | **GET** /api/tax-retentions/{id} | Get a tax retention&#39;s details
*TaxRetentionsApi* | [**list**](docs/TaxRetentionsApi.md#list) | **GET** /api/tax-retentions | List all tax retentions
*TaxRetentionsApi* | [**retrieve**](docs/TaxRetentionsApi.md#retrieve) | **POST** /api/tax-retentions | Retrieve tax retentions for a link
*TaxReturnsApi* | [**delete**](docs/TaxReturnsApi.md#delete) | **DELETE** /api/tax-returns/{id} | Delete a tax return
*TaxReturnsApi* | [**getDetails**](docs/TaxReturnsApi.md#getDetails) | **GET** /api/tax-returns/{id} | Get a tax return&#39;s details
*TaxReturnsApi* | [**list**](docs/TaxReturnsApi.md#list) | **GET** /api/tax-returns | List all tax returns
*TaxReturnsApi* | [**retrieve**](docs/TaxReturnsApi.md#retrieve) | **POST** /api/tax-returns | Retrieve tax returns for a link
*TaxStatusApi* | [**delete**](docs/TaxStatusApi.md#delete) | **DELETE** /api/tax-status/{id} | Delete a tax status
*TaxStatusApi* | [**getDetails**](docs/TaxStatusApi.md#getDetails) | **GET** /api/tax-status/{id} | Get a tax status&#39;s details
*TaxStatusApi* | [**list**](docs/TaxStatusApi.md#list) | **GET** /api/tax-status | List all tax statuses
*TaxStatusApi* | [**retrieve**](docs/TaxStatusApi.md#retrieve) | **POST** /api/tax-status | Retrieve tax statuses for a link
*TransactionsApi* | [**completeRequest**](docs/TransactionsApi.md#completeRequest) | **PATCH** /api/transactions | Complete a transactions request
*TransactionsApi* | [**delete**](docs/TransactionsApi.md#delete) | **DELETE** /api/transactions/{id} | Delete a transaction
*TransactionsApi* | [**getDetails**](docs/TransactionsApi.md#getDetails) | **GET** /api/transactions/{id} | Get a transaction&#39;s details
*TransactionsApi* | [**list**](docs/TransactionsApi.md#list) | **GET** /api/transactions | List all transactions
*TransactionsApi* | [**retrieve**](docs/TransactionsApi.md#retrieve) | **POST** /api/transactions | Retrieve transactions for a link


## Documentation for Models

 - [AccessToResourceDenied](docs/AccessToResourceDenied.md)
 - [Account](docs/Account.md)
 - [AccountsBalance](docs/AccountsBalance.md)
 - [AccountsCreditData](docs/AccountsCreditData.md)
 - [AccountsFundsData](docs/AccountsFundsData.md)
 - [AccountsFundsDataPublicIdentifications](docs/AccountsFundsDataPublicIdentifications.md)
 - [AccountsLoanData](docs/AccountsLoanData.md)
 - [AccountsLoanDataFees](docs/AccountsLoanDataFees.md)
 - [AccountsLoanDataInterestRate](docs/AccountsLoanDataInterestRate.md)
 - [AccountsPaginatedResponse](docs/AccountsPaginatedResponse.md)
 - [AccountsReceivablesData](docs/AccountsReceivablesData.md)
 - [AnnualCostsAndDeductionsStatementBusiness](docs/AnnualCostsAndDeductionsStatementBusiness.md)
 - [AnnualIncomeStatementBusiness](docs/AnnualIncomeStatementBusiness.md)
 - [AnnualIncomeStatementIndividual](docs/AnnualIncomeStatementIndividual.md)
 - [AnnualTotalsIndividual](docs/AnnualTotalsIndividual.md)
 - [AsynchronousAccepted202](docs/AsynchronousAccepted202.md)
 - [Balance](docs/Balance.md)
 - [BalancesPaginatedResponse](docs/BalancesPaginatedResponse.md)
 - [BalancesRequest](docs/BalancesRequest.md)
 - [BankAccountBusinessPse](docs/BankAccountBusinessPse.md)
 - [BankAccountDetailsOfpi](docs/BankAccountDetailsOfpi.md)
 - [BankAccountDetailsOfpiPix](docs/BankAccountDetailsOfpiPix.md)
 - [BankAccountDetailsOpenFinance](docs/BankAccountDetailsOpenFinance.md)
 - [BankAccountDetailsOpenFinancePix](docs/BankAccountDetailsOpenFinancePix.md)
 - [BankAccountHolderRequestOfpi](docs/BankAccountHolderRequestOfpi.md)
 - [BankAccountInformationContentPse](docs/BankAccountInformationContentPse.md)
 - [BankAccountInformationPse](docs/BankAccountInformationPse.md)
 - [BankAccountOfpiResponse](docs/BankAccountOfpiResponse.md)
 - [BankAccountPaginatedResponse](docs/BankAccountPaginatedResponse.md)
 - [BeneficiaryBankAccountOfpi](docs/BeneficiaryBankAccountOfpi.md)
 - [BeneficiaryBankAccountPse](docs/BeneficiaryBankAccountPse.md)
 - [Categorization](docs/Categorization.md)
 - [CategorizationBody](docs/CategorizationBody.md)
 - [CategorizationBodyRequest](docs/CategorizationBodyRequest.md)
 - [CategorizationMerchantData](docs/CategorizationMerchantData.md)
 - [CategorizationRequest](docs/CategorizationRequest.md)
 - [ChangeAccessMode](docs/ChangeAccessMode.md)
 - [Charge](docs/Charge.md)
 - [ChargePaymentMethodDetailsOfpi](docs/ChargePaymentMethodDetailsOfpi.md)
 - [ChargePaymentMethodDetailsOfpiContent](docs/ChargePaymentMethodDetailsOfpiContent.md)
 - [ChargePaymentMethodDetailsPse](docs/ChargePaymentMethodDetailsPse.md)
 - [ChargePaymentMethodDetailsPseContent](docs/ChargePaymentMethodDetailsPseContent.md)
 - [CreateBankAccountOfpi](docs/CreateBankAccountOfpi.md)
 - [CreateBankAccountPse](docs/CreateBankAccountPse.md)
 - [CreateCustomerOfpi](docs/CreateCustomerOfpi.md)
 - [CreateCustomerPse](docs/CreateCustomerPse.md)
 - [CreatePaymentIntentPse](docs/CreatePaymentIntentPse.md)
 - [CreatePaymentLinkOfpi](docs/CreatePaymentLinkOfpi.md)
 - [CreatePaymentLinkPse](docs/CreatePaymentLinkPse.md)
 - [CustomerOfpi](docs/CustomerOfpi.md)
 - [CustomerPaginatedResponse](docs/CustomerPaginatedResponse.md)
 - [CustomerPse](docs/CustomerPse.md)
 - [DisplayConfirmationRequiredContentPse](docs/DisplayConfirmationRequiredContentPse.md)
 - [DisplayConfirmationRequiredOfpi](docs/DisplayConfirmationRequiredOfpi.md)
 - [DisplayCredentialsRequiredContentPse](docs/DisplayCredentialsRequiredContentPse.md)
 - [DisplayCustomerBankAccountsContentPse](docs/DisplayCustomerBankAccountsContentPse.md)
 - [DisplayPaymentFailed](docs/DisplayPaymentFailed.md)
 - [DisplayPaymentMethodInformationContentOfpi](docs/DisplayPaymentMethodInformationContentOfpi.md)
 - [DisplayPaymentMethodInformationContentPse](docs/DisplayPaymentMethodInformationContentPse.md)
 - [DisplayPaymentProcessing](docs/DisplayPaymentProcessing.md)
 - [DisplayPaymentSucceeded](docs/DisplayPaymentSucceeded.md)
 - [DisplayTokenRequiredContentPse](docs/DisplayTokenRequiredContentPse.md)
 - [DocumentIdBusiness](docs/DocumentIdBusiness.md)
 - [DocumentIdIndividual](docs/DocumentIdIndividual.md)
 - [DocumentInformationBusiness](docs/DocumentInformationBusiness.md)
 - [DocumentInformationIndividual](docs/DocumentInformationIndividual.md)
 - [EmploymentRecord](docs/EmploymentRecord.md)
 - [EmploymentRecordDetail](docs/EmploymentRecordDetail.md)
 - [EmploymentRecordDocumentId](docs/EmploymentRecordDocumentId.md)
 - [EmploymentRecordEmploymentStatusUpdates](docs/EmploymentRecordEmploymentStatusUpdates.md)
 - [EmploymentRecordEntitlement](docs/EmploymentRecordEntitlement.md)
 - [EmploymentRecordFile](docs/EmploymentRecordFile.md)
 - [EmploymentRecordPersonalData](docs/EmploymentRecordPersonalData.md)
 - [EmploymentRecordRequest](docs/EmploymentRecordRequest.md)
 - [EmploymentRecordSocialSecuritySummary](docs/EmploymentRecordSocialSecuritySummary.md)
 - [EmploymentRecordsPaginatedResponse](docs/EmploymentRecordsPaginatedResponse.md)
 - [EnumAccountCategory](docs/EnumAccountCategory.md)
 - [EnumBankAccountHolderTypeOfpi](docs/EnumBankAccountHolderTypeOfpi.md)
 - [EnumBankAccountHolderTypePse](docs/EnumBankAccountHolderTypePse.md)
 - [EnumBankAccountPixAccountTypeOfpi](docs/EnumBankAccountPixAccountTypeOfpi.md)
 - [EnumCategorizationAccountCategory](docs/EnumCategorizationAccountCategory.md)
 - [EnumCategorizationAccountHolderType](docs/EnumCategorizationAccountHolderType.md)
 - [EnumCategorizationTransactionCategory](docs/EnumCategorizationTransactionCategory.md)
 - [EnumCategorizationTransactionSubcategory](docs/EnumCategorizationTransactionSubcategory.md)
 - [EnumCategorizationTransactionType](docs/EnumCategorizationTransactionType.md)
 - [EnumCustomerIdentifierTypeOfpi](docs/EnumCustomerIdentifierTypeOfpi.md)
 - [EnumCustomerIdentifierTypePse](docs/EnumCustomerIdentifierTypePse.md)
 - [EnumCustomerType](docs/EnumCustomerType.md)
 - [EnumEmploymentRecordDocumentType](docs/EnumEmploymentRecordDocumentType.md)
 - [EnumEmploymentRecordStatus](docs/EnumEmploymentRecordStatus.md)
 - [EnumEmploymentRecordStatusUpdateEvents](docs/EnumEmploymentRecordStatusUpdateEvents.md)
 - [EnumIncomeMinimumConfidenceLevelRequest](docs/EnumIncomeMinimumConfidenceLevelRequest.md)
 - [EnumIncomeSourceType](docs/EnumIncomeSourceType.md)
 - [EnumIncomeStreamConfidence](docs/EnumIncomeStreamConfidence.md)
 - [EnumIncomeStreamFrequency](docs/EnumIncomeStreamFrequency.md)
 - [EnumIncomeStreamType](docs/EnumIncomeStreamType.md)
 - [EnumIncomeVerificationAccountCategory](docs/EnumIncomeVerificationAccountCategory.md)
 - [EnumIncomeVerificationAccountHolderType](docs/EnumIncomeVerificationAccountHolderType.md)
 - [EnumIncomeVerificationType](docs/EnumIncomeVerificationType.md)
 - [EnumInstitutionIntegrationType](docs/EnumInstitutionIntegrationType.md)
 - [EnumInstitutionStatus](docs/EnumInstitutionStatus.md)
 - [EnumInstitutionType](docs/EnumInstitutionType.md)
 - [EnumInvestmentPortfolioInstrumentType](docs/EnumInvestmentPortfolioInstrumentType.md)
 - [EnumInvestmentPortfolioType](docs/EnumInvestmentPortfolioType.md)
 - [EnumInvoiceAllowedIncomeTypesRequest](docs/EnumInvoiceAllowedIncomeTypesRequest.md)
 - [EnumInvoiceDianInvoiceType](docs/EnumInvoiceDianInvoiceType.md)
 - [EnumInvoiceDianPaymentMethod](docs/EnumInvoiceDianPaymentMethod.md)
 - [EnumInvoiceSatInvoiceType](docs/EnumInvoiceSatInvoiceType.md)
 - [EnumInvoiceSatPaymentMethod](docs/EnumInvoiceSatPaymentMethod.md)
 - [EnumInvoiceType](docs/EnumInvoiceType.md)
 - [EnumLinkAccessModeRequest](docs/EnumLinkAccessModeRequest.md)
 - [EnumLinkAccessModeResponse](docs/EnumLinkAccessModeResponse.md)
 - [EnumLinkRefreshRate](docs/EnumLinkRefreshRate.md)
 - [EnumLinkStatus](docs/EnumLinkStatus.md)
 - [EnumLoanDataFeeType](docs/EnumLoanDataFeeType.md)
 - [EnumLoanDataInterestRateType](docs/EnumLoanDataInterestRateType.md)
 - [EnumPaymentIntentHolderTypePse](docs/EnumPaymentIntentHolderTypePse.md)
 - [EnumPaymentIntentStatus](docs/EnumPaymentIntentStatus.md)
 - [EnumPaymentLinkAllowedPaymentMethod](docs/EnumPaymentLinkAllowedPaymentMethod.md)
 - [EnumPaymentLinkProvider](docs/EnumPaymentLinkProvider.md)
 - [EnumPaymentLinksStatus](docs/EnumPaymentLinksStatus.md)
 - [EnumPaymentTransactionType](docs/EnumPaymentTransactionType.md)
 - [EnumPaymentsCountry](docs/EnumPaymentsCountry.md)
 - [EnumPaymentsCurrency](docs/EnumPaymentsCurrency.md)
 - [EnumReceivableTransactionFeeType](docs/EnumReceivableTransactionFeeType.md)
 - [EnumReceivableTransactionStatus](docs/EnumReceivableTransactionStatus.md)
 - [EnumReceivableTransactionType](docs/EnumReceivableTransactionType.md)
 - [EnumRecurringExpenseCategory](docs/EnumRecurringExpenseCategory.md)
 - [EnumRecurringExpenseFrequency](docs/EnumRecurringExpenseFrequency.md)
 - [EnumRecurringExpensePaymentType](docs/EnumRecurringExpensePaymentType.md)
 - [EnumTaxComplianceStatusOutcome](docs/EnumTaxComplianceStatusOutcome.md)
 - [EnumTaxRetentionPaymentStatus](docs/EnumTaxRetentionPaymentStatus.md)
 - [EnumTaxRetentionReceiverNationality](docs/EnumTaxRetentionReceiverNationality.md)
 - [EnumTaxRetentionType](docs/EnumTaxRetentionType.md)
 - [EnumTransactionBillStatus](docs/EnumTransactionBillStatus.md)
 - [EnumTransactionCategory](docs/EnumTransactionCategory.md)
 - [EnumTransactionStatus](docs/EnumTransactionStatus.md)
 - [EnumTransactionSubcategory](docs/EnumTransactionSubcategory.md)
 - [EnumTransactionType](docs/EnumTransactionType.md)
 - [EquityStatementBusiness](docs/EquityStatementBusiness.md)
 - [EquityStatementIndividual](docs/EquityStatementIndividual.md)
 - [EyodIncomeVerificationBodyRequest](docs/EyodIncomeVerificationBodyRequest.md)
 - [EyodIncomeVerificationRequest](docs/EyodIncomeVerificationRequest.md)
 - [GrossIncomeIndividual](docs/GrossIncomeIndividual.md)
 - [HolderBankAccountInformationPse](docs/HolderBankAccountInformationPse.md)
 - [HolderBankAccountPse](docs/HolderBankAccountPse.md)
 - [HolderBusinessPse](docs/HolderBusinessPse.md)
 - [HolderBusinessResponsePse](docs/HolderBusinessResponsePse.md)
 - [HolderInformationBusinessOfpi](docs/HolderInformationBusinessOfpi.md)
 - [HolderInformationBusinessOfpiResponse](docs/HolderInformationBusinessOfpiResponse.md)
 - [HolderInformationBusinessPse](docs/HolderInformationBusinessPse.md)
 - [HolderInformationBusinessPseResponse](docs/HolderInformationBusinessPseResponse.md)
 - [HolderInformationIndividualOfpi](docs/HolderInformationIndividualOfpi.md)
 - [HolderInformationIndividualOfpiResponse](docs/HolderInformationIndividualOfpiResponse.md)
 - [HolderResponseOfpi](docs/HolderResponseOfpi.md)
 - [Income](docs/Income.md)
 - [IncomeStreamsBody](docs/IncomeStreamsBody.md)
 - [IncomesPaginatedResponse](docs/IncomesPaginatedResponse.md)
 - [IncomesRequest](docs/IncomesRequest.md)
 - [Institution](docs/Institution.md)
 - [InstitutionAccount](docs/InstitutionAccount.md)
 - [InstitutionDownError](docs/InstitutionDownError.md)
 - [InstitutionFormField](docs/InstitutionFormField.md)
 - [InstitutionInactiveError](docs/InstitutionInactiveError.md)
 - [InstitutionUnavailableError](docs/InstitutionUnavailableError.md)
 - [InstitutionsFeature](docs/InstitutionsFeature.md)
 - [InstitutionsFormField](docs/InstitutionsFormField.md)
 - [InstitutionsFormFieldValues](docs/InstitutionsFormFieldValues.md)
 - [InstitutionsPaginatedResponse](docs/InstitutionsPaginatedResponse.md)
 - [InvalidAccessMode](docs/InvalidAccessMode.md)
 - [InvalidLinkError](docs/InvalidLinkError.md)
 - [InvalidPeriodError](docs/InvalidPeriodError.md)
 - [InvestmentsPortfolio](docs/InvestmentsPortfolio.md)
 - [InvestmentsPortfolioInstrument](docs/InvestmentsPortfolioInstrument.md)
 - [InvestmentsPortfolioInstrumentFees](docs/InvestmentsPortfolioInstrumentFees.md)
 - [InvestmentsPortfolioInstrumentInterestRate](docs/InvestmentsPortfolioInstrumentInterestRate.md)
 - [InvestmentsPortfolioInstrumentPublicId](docs/InvestmentsPortfolioInstrumentPublicId.md)
 - [InvestmentsPortfolioInstrumentRedemptionConditions](docs/InvestmentsPortfolioInstrumentRedemptionConditions.md)
 - [InvestmentsPortfoliosPaginatedResponse](docs/InvestmentsPortfoliosPaginatedResponse.md)
 - [InvoiceDetailDian](docs/InvoiceDetailDian.md)
 - [InvoiceDetailRetainedTaxSat](docs/InvoiceDetailRetainedTaxSat.md)
 - [InvoiceDetailSat](docs/InvoiceDetailSat.md)
 - [InvoiceDian](docs/InvoiceDian.md)
 - [InvoiceSenderDetailsDian](docs/InvoiceSenderDetailsDian.md)
 - [InvoiceWarningsDian](docs/InvoiceWarningsDian.md)
 - [InvoiceWarningsSat](docs/InvoiceWarningsSat.md)
 - [InvoiceWithIdSat](docs/InvoiceWithIdSat.md)
 - [InvoicesPaymentsDian](docs/InvoicesPaymentsDian.md)
 - [InvoicesPaymentsRelatedDocumentsDian](docs/InvoicesPaymentsRelatedDocumentsDian.md)
 - [InvoicesPaymentsRelatedDocumentsSat](docs/InvoicesPaymentsRelatedDocumentsSat.md)
 - [InvoicesPaymentsSat](docs/InvoicesPaymentsSat.md)
 - [InvoicesPayrollDian](docs/InvoicesPayrollDian.md)
 - [InvoicesPayrollSat](docs/InvoicesPayrollSat.md)
 - [InvoicesReceiverDetailsDian](docs/InvoicesReceiverDetailsDian.md)
 - [InvoicesRequest](docs/InvoicesRequest.md)
 - [InvoicesResponsePaginatedResponse](docs/InvoicesResponsePaginatedResponse.md)
 - [LastErrorInvalidCredentials](docs/LastErrorInvalidCredentials.md)
 - [LastErrorInvalidToken](docs/LastErrorInvalidToken.md)
 - [LastErrorLoginError](docs/LastErrorLoginError.md)
 - [LastErrorPaymentError](docs/LastErrorPaymentError.md)
 - [LastErrorSessionExpired](docs/LastErrorSessionExpired.md)
 - [LastErrorTwoFactor](docs/LastErrorTwoFactor.md)
 - [Link](docs/Link.md)
 - [LinksPutRequest](docs/LinksPutRequest.md)
 - [LinksRequest](docs/LinksRequest.md)
 - [Model400ValidationError](docs/Model400ValidationError.md)
 - [Model401UnauthorizedError](docs/Model401UnauthorizedError.md)
 - [Model404NotFoundError](docs/Model404NotFoundError.md)
 - [Model408RequestTimeoutError](docs/Model408RequestTimeoutError.md)
 - [Model500UnexpectedError](docs/Model500UnexpectedError.md)
 - [NeedsRedirectContent](docs/NeedsRedirectContent.md)
 - [NeedsRedirectContentPse](docs/NeedsRedirectContentPse.md)
 - [NetIncomeIndividual](docs/NetIncomeIndividual.md)
 - [NextStepDisplayConfirmationRequiredOfpi](docs/NextStepDisplayConfirmationRequiredOfpi.md)
 - [NextStepDisplayConfirmationRequiredPse](docs/NextStepDisplayConfirmationRequiredPse.md)
 - [NextStepDisplayCredentialsRequiredPse](docs/NextStepDisplayCredentialsRequiredPse.md)
 - [NextStepDisplayCustomerBankAccountsPse](docs/NextStepDisplayCustomerBankAccountsPse.md)
 - [NextStepDisplayNeedsRedirectPse](docs/NextStepDisplayNeedsRedirectPse.md)
 - [NextStepDisplayPaymentFailed](docs/NextStepDisplayPaymentFailed.md)
 - [NextStepDisplayPaymentMethodInformation](docs/NextStepDisplayPaymentMethodInformation.md)
 - [NextStepDisplayPaymentMethodInformationPse](docs/NextStepDisplayPaymentMethodInformationPse.md)
 - [NextStepDisplayPaymentProcessing](docs/NextStepDisplayPaymentProcessing.md)
 - [NextStepDisplayPaymentSucceeded](docs/NextStepDisplayPaymentSucceeded.md)
 - [NextStepDisplayTokenRequiredPse](docs/NextStepDisplayTokenRequiredPse.md)
 - [NextStepNeedsRedirect](docs/NextStepNeedsRedirect.md)
 - [NonTaxableIncomeIndividual](docs/NonTaxableIncomeIndividual.md)
 - [NotFoundError](docs/NotFoundError.md)
 - [Owner](docs/Owner.md)
 - [OwnerDocumentId](docs/OwnerDocumentId.md)
 - [OwnersPaginatedResponse](docs/OwnersPaginatedResponse.md)
 - [PaginatedResponseLink](docs/PaginatedResponseLink.md)
 - [PatchBody](docs/PatchBody.md)
 - [PatchBodyWithoutSaveData](docs/PatchBodyWithoutSaveData.md)
 - [PatchPaymentIntentPse](docs/PatchPaymentIntentPse.md)
 - [PatchPaymentIntentsBodyPse](docs/PatchPaymentIntentsBodyPse.md)
 - [PatchPaymentMethodDetailsPse](docs/PatchPaymentMethodDetailsPse.md)
 - [PaymentInstitution](docs/PaymentInstitution.md)
 - [PaymentIntentOfpi](docs/PaymentIntentOfpi.md)
 - [PaymentIntentOfpiPaymentMethodDetails](docs/PaymentIntentOfpiPaymentMethodDetails.md)
 - [PaymentIntentPaginatedResponse](docs/PaymentIntentPaginatedResponse.md)
 - [PaymentIntentPaymentMethodDetailsBodyBusinessOfpi](docs/PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.md)
 - [PaymentIntentPaymentMethodDetailsBodyIndividualOfpi](docs/PaymentIntentPaymentMethodDetailsBodyIndividualOfpi.md)
 - [PaymentIntentPaymentMethodDetailsBodyPse](docs/PaymentIntentPaymentMethodDetailsBodyPse.md)
 - [PaymentIntentPaymentMethodDetailsBusinessOfpi](docs/PaymentIntentPaymentMethodDetailsBusinessOfpi.md)
 - [PaymentIntentPaymentMethodDetailsIndividualOfpi](docs/PaymentIntentPaymentMethodDetailsIndividualOfpi.md)
 - [PaymentIntentPaymentMethodDetailsPse](docs/PaymentIntentPaymentMethodDetailsPse.md)
 - [PaymentIntentPse](docs/PaymentIntentPse.md)
 - [PaymentIntentsPaymentMethodDetailsBodyPse](docs/PaymentIntentsPaymentMethodDetailsBodyPse.md)
 - [PaymentIntentsPaymentMethodDetailsPse](docs/PaymentIntentsPaymentMethodDetailsPse.md)
 - [PaymentLinkCallbackUrls](docs/PaymentLinkCallbackUrls.md)
 - [PaymentLinkCallbackUrlsResponse](docs/PaymentLinkCallbackUrlsResponse.md)
 - [PaymentLinkListOfpi](docs/PaymentLinkListOfpi.md)
 - [PaymentLinkListPse](docs/PaymentLinkListPse.md)
 - [PaymentLinkOfpi](docs/PaymentLinkOfpi.md)
 - [PaymentLinkPaginatedResponse](docs/PaymentLinkPaginatedResponse.md)
 - [PaymentLinkPse](docs/PaymentLinkPse.md)
 - [PaymentLinksPaymentMethodDetailsBodyOfpi](docs/PaymentLinksPaymentMethodDetailsBodyOfpi.md)
 - [PaymentLinksPaymentMethodDetailsBodyPse](docs/PaymentLinksPaymentMethodDetailsBodyPse.md)
 - [PaymentMethodDetailsOfpi](docs/PaymentMethodDetailsOfpi.md)
 - [PaymentMethodDetailsPse](docs/PaymentMethodDetailsPse.md)
 - [PaymentMethodInfoCustomerBankAccountsPse](docs/PaymentMethodInfoCustomerBankAccountsPse.md)
 - [PaymentMethodInformationBodyOfpi](docs/PaymentMethodInformationBodyOfpi.md)
 - [PaymentMethodInformationBodyPse](docs/PaymentMethodInformationBodyPse.md)
 - [PaymentMethodInformationDetailsPse](docs/PaymentMethodInformationDetailsPse.md)
 - [PaymentMethodInformationOfpi](docs/PaymentMethodInformationOfpi.md)
 - [PaymentMethodInformationPse](docs/PaymentMethodInformationPse.md)
 - [PaymentTransaction](docs/PaymentTransaction.md)
 - [PaymentsInstitutionsPaginatedResponse](docs/PaymentsInstitutionsPaginatedResponse.md)
 - [PaymentsRequestApiKeysResponse](docs/PaymentsRequestApiKeysResponse.md)
 - [PaymentsTransactionsPaginatedResponse](docs/PaymentsTransactionsPaginatedResponse.md)
 - [PaymentsWay](docs/PaymentsWay.md)
 - [PensionIncomeStatementIndividual](docs/PensionIncomeStatementIndividual.md)
 - [ProvidersPse](docs/ProvidersPse.md)
 - [ReceivableTransactionRequest](docs/ReceivableTransactionRequest.md)
 - [ReceivablesTransaction](docs/ReceivablesTransaction.md)
 - [ReceivablesTransactionAccount](docs/ReceivablesTransactionAccount.md)
 - [ReceivablesTransactionNumberOfInstallments](docs/ReceivablesTransactionNumberOfInstallments.md)
 - [ReceivablesTransactionsPaginatedResponse](docs/ReceivablesTransactionsPaginatedResponse.md)
 - [RecevablesTransactionFees](docs/RecevablesTransactionFees.md)
 - [RecurringExpenseSourceTransaction](docs/RecurringExpenseSourceTransaction.md)
 - [RecurringExpenses](docs/RecurringExpenses.md)
 - [RecurringExpensesPaginatedResponse](docs/RecurringExpensesPaginatedResponse.md)
 - [RecurringExpensesRequest](docs/RecurringExpensesRequest.md)
 - [ReportingId](docs/ReportingId.md)
 - [RetentionBreakdown](docs/RetentionBreakdown.md)
 - [RiskInsights](docs/RiskInsights.md)
 - [RiskInsightsBalanceMetrics](docs/RiskInsightsBalanceMetrics.md)
 - [RiskInsightsCashflowMetrics](docs/RiskInsightsCashflowMetrics.md)
 - [RiskInsightsCreditCardMetrics](docs/RiskInsightsCreditCardMetrics.md)
 - [RiskInsightsLoansMetrics](docs/RiskInsightsLoansMetrics.md)
 - [RiskInsightsPaginatedResponse](docs/RiskInsightsPaginatedResponse.md)
 - [RiskInsightsTransactionMetrics](docs/RiskInsightsTransactionMetrics.md)
 - [SecretKeys](docs/SecretKeys.md)
 - [SecretKeysPaginatedResponse](docs/SecretKeysPaginatedResponse.md)
 - [SessionExpiredError](docs/SessionExpiredError.md)
 - [StandardRequest](docs/StandardRequest.md)
 - [TaxAssessmentBusiness](docs/TaxAssessmentBusiness.md)
 - [TaxAssessmentIndividual](docs/TaxAssessmentIndividual.md)
 - [TaxComplianceStatus](docs/TaxComplianceStatus.md)
 - [TaxComplianceStatusPaginatedResponse](docs/TaxComplianceStatusPaginatedResponse.md)
 - [TaxComplianceStatusRequest](docs/TaxComplianceStatusRequest.md)
 - [TaxDeclarationBusiness](docs/TaxDeclarationBusiness.md)
 - [TaxDeclarationBusinessPaginated](docs/TaxDeclarationBusinessPaginated.md)
 - [TaxDeclarationIndividual](docs/TaxDeclarationIndividual.md)
 - [TaxDeclarationIndividualPaginated](docs/TaxDeclarationIndividualPaginated.md)
 - [TaxDeclarationsRequest](docs/TaxDeclarationsRequest.md)
 - [TaxPayerInformationBusiness](docs/TaxPayerInformationBusiness.md)
 - [TaxPayerInformationIndividual](docs/TaxPayerInformationIndividual.md)
 - [TaxRetentions](docs/TaxRetentions.md)
 - [TaxRetentionsPaginatedResponse](docs/TaxRetentionsPaginatedResponse.md)
 - [TaxRetentionsRequest](docs/TaxRetentionsRequest.md)
 - [TaxReturnBusiness](docs/TaxReturnBusiness.md)
 - [TaxReturnBusinessMonthly](docs/TaxReturnBusinessMonthly.md)
 - [TaxReturnPersonal](docs/TaxReturnPersonal.md)
 - [TaxReturnPersonalMonthly](docs/TaxReturnPersonalMonthly.md)
 - [TaxReturnsBusinessMonthlyPaginated](docs/TaxReturnsBusinessMonthlyPaginated.md)
 - [TaxReturnsBusinessPaginated](docs/TaxReturnsBusinessPaginated.md)
 - [TaxReturnsMonthlyRequest](docs/TaxReturnsMonthlyRequest.md)
 - [TaxReturnsPersonalMonthlyPaginated](docs/TaxReturnsPersonalMonthlyPaginated.md)
 - [TaxReturnsPersonalPaginated](docs/TaxReturnsPersonalPaginated.md)
 - [TaxReturnsYearlyRequest](docs/TaxReturnsYearlyRequest.md)
 - [TaxStatusAddressBetweenStreetDian](docs/TaxStatusAddressBetweenStreetDian.md)
 - [TaxStatusAddressBetweenStreetSat](docs/TaxStatusAddressBetweenStreetSat.md)
 - [TaxStatusAddressDian](docs/TaxStatusAddressDian.md)
 - [TaxStatusAddressSat](docs/TaxStatusAddressSat.md)
 - [TaxStatusDian](docs/TaxStatusDian.md)
 - [TaxStatusEconomicActivityDian](docs/TaxStatusEconomicActivityDian.md)
 - [TaxStatusEconomicActivitySat](docs/TaxStatusEconomicActivitySat.md)
 - [TaxStatusObligationsDian](docs/TaxStatusObligationsDian.md)
 - [TaxStatusObligationsSat](docs/TaxStatusObligationsSat.md)
 - [TaxStatusPaginatedResponse](docs/TaxStatusPaginatedResponse.md)
 - [TaxStatusRegimensDian](docs/TaxStatusRegimensDian.md)
 - [TaxStatusRegimensSat](docs/TaxStatusRegimensSat.md)
 - [TaxStatusRequest](docs/TaxStatusRequest.md)
 - [TaxStatusSat](docs/TaxStatusSat.md)
 - [TaxStatusTaxPayerInformationDian](docs/TaxStatusTaxPayerInformationDian.md)
 - [TaxStatusTaxPayerInformationSat](docs/TaxStatusTaxPayerInformationSat.md)
 - [TokenRequiredResponse](docs/TokenRequiredResponse.md)
 - [TokenRequiredResponseTokenGenerationData](docs/TokenRequiredResponseTokenGenerationData.md)
 - [TooManySessionsError](docs/TooManySessionsError.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionBankAccountBodyPse](docs/TransactionBankAccountBodyPse.md)
 - [TransactionCreditCardData](docs/TransactionCreditCardData.md)
 - [TransactionMerchantData](docs/TransactionMerchantData.md)
 - [TransactionsPaginatedResponse](docs/TransactionsPaginatedResponse.md)
 - [TransactionsRequest](docs/TransactionsRequest.md)
 - [UnconfirmedLinkError](docs/UnconfirmedLinkError.md)
 - [UnexpectedError](docs/UnexpectedError.md)
 - [UnsupportedOperationError](docs/UnsupportedOperationError.md)
 - [ValidationError](docs/ValidationError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
