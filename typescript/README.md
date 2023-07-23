# belvo-typescript-sdk@1.0.0

# Introduction  Belvo is an open banking API for Latin America that allows companies to access banking and fiscal information in a secure as well as agile way.  Through our API, you can access:   - **Bank information** such as account information, real-time balance, historical transactions, and account owner identification.  - **Fiscal information** such as received and sent invoices and tax returns.   <img src=\"https://files.readme.io/acf27d3-belvo_pipes.png\" alt=\"fiscal-endpoints\">   In this API reference you\'ll find all the information you need about each  endpoint and resource.   <div style=\"background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\">  <strong>Tip: </strong> Make sure that you also check out our Developer Portal for guides on <a href=\"https://developers.belvo.com/docs/get-started-in-5-minutes\" target=\"_blank\">how to get started</a>, using our <a href=\"https://developers.belvo.com/docs/test-in-sandbox\" target=\"_blank\">Sandbox environment</a>, as well as how to <a href=\"https://developers.belvo.com/docs/connect-widget\" target=\"_blank\">integrate the widget</a> or use our <a href=\"https://developers.belvo.com/docs/quickstart-application\" target=\"_blank\">quickstart application</a>.  </div>   ## Environment  We currently offer three environments: sandbox, development, and production.   When using our SDKs, make sure to use the **Alias** (and not the Base URL).   | Environment | Purpose | Access | |-----------|-------|-------| | **Sandbox** | The [Sandbox environment](https://developers.belvo.com/docs/test-in-sandbox) is dedicated for your testing and development phases. In this environment, you can create links without real credentials and you can pull test data from all endpoints. **⚠️The sandbox environment is refreshed frequently and your test data can be updated or deleted.** | Base URL (cURL): https://sandbox.belvo.com/ <br><br>Alias (SDKs): sandbox| |**Development**|The Development environment is dedicated for testing with real credentials and institutions with real-world institutions. You can create up to 25 links for free in this environment.| Base URL (cURL): https://development.belvo.com/ <br><br>Alias (SDKs): development | | **Production** | The Production environment is dedicated for live applications with real connections to institutions. In this environment, you will need real credentials to create links and you will pull real data from the institutions.| Base URL (cURL): https://api.belvo.com/ <br><br>Alias (SDKs): production|   For each environment, you\'ll need to [generate separate API keys](https://developers.belvo.com/docs/get-your-belvo-api-keys).   ## Response codes   We use the following HTTP status code in the response depending on the success or failure:   | Status Code | Description | |-----------|-------| | `200` | ✅ **Success** - The content is available in the response body. | | `201` | ✅ **Success** - The content was created successfully on Belvo. | | `204` | ✅ **Success** - No content to return. | | `400` | ❌ **Bad Request Error** - Request returned an error, detail in content.| | `401` | ❌ **Unauthorized** - The Belvo credentials provided are not valid.| | `404` | ❌ **Not Found** - The resource you try to access cannot be found.| | `405` | ❌ **Method Not Allowed** - The HTTP method you are using is not accepted for this resource.| | `408` | ❌ **Request Timeout** - The request timed out and was terminated by the server.| | `428` | ❌ **MFA Token Required** - MFA token was required by the institution to connect. | | `500` | ❌ **Internal Server Error** - The detail of the error is available in the response body.|   ## Error handling   ### Error messages   Belvo API errors are returned in JSON format. For example, an error might look like this:   ```json  [     {       \"request_id\": \"a6e1c493d7a29d91aed4338e6fcf077d\",       \"message\": \"This field is required.\",       \"code\": \"required\",       \"field\": \"link\"     } ]  ```   Typically, an error response will have the following parameters:  - `request_id`: a unique ID for the request, you should share it with the Belvo support team for investigations.  - `message`: human-readable description of the error.  - `code`: a unique code for the error. Check the table below to see how to handle each error code.  - `field` *(optional)*: The specific field in the request body that has an issue.    ### Request identifier  When you need help with a specific error, add the request identifier (`request_id`) in your message to the Belvo support team. This will speed up investigations and get you back up and running in no time at all.   ### Error codes and troubleshooting   For a full list of errors and how to troubleshoot them, please see our dedicated [Error handling articles](https://developers.belvo.com/docs/integration-overview#error-handling) in our DevPortal.    ### Retry policy   Please see our recommended [retry policies](https://developers.belvo.com/docs/integration-overview#error-retry-policy) in the DevPortal. 
## Installing

### npm
```
npm install belvo-typescript-sdk --save
```

### yarn
```
yarn add belvo-typescript-sdk
```

**Important note: this library can be used in both the client-side or server-side, but using it
in client-side browser code is not recommended as you would expose security credentials.**



## Getting Started

```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse = await belvo.accounts.completeRequest({
  omit: "link,balance",
  fields: "link,balance,account",
  session: "6e7b283c6efa449c9c028a16b5c249fa",
  token: "1234ab",
  link: "683005d6-f45c-4adb-b289-f1a12f50f80c",
  save_data: true,
});

console.log(completeRequestResponse);
```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.belvo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**completeRequest**](docs/AccountsApi.md#completeRequest) | **PATCH** /api/accounts | Complete an accounts request
*AccountsApi* | [**delete**](docs/AccountsApi.md#delete) | **DELETE** /api/accounts/{id} | Delete an account
*AccountsApi* | [**getDetails**](docs/AccountsApi.md#getDetails) | **GET** /api/accounts/{id} | Get an account\&#39;s details
*AccountsApi* | [**list**](docs/AccountsApi.md#list) | **GET** /api/accounts | List all accounts
*AccountsApi* | [**retrieve**](docs/AccountsApi.md#retrieve) | **POST** /api/accounts | Retrieve accounts for a link
*BalancesApi* | [**completeRequest**](docs/BalancesApi.md#completeRequest) | **PATCH** /api/balances | Complete a balances request
*BalancesApi* | [**delete**](docs/BalancesApi.md#delete) | **DELETE** /api/balances/{id} | Delete a balance
*BalancesApi* | [**getDetails**](docs/BalancesApi.md#getDetails) | **GET** /api/balances/{id} | Get a balance\&#39;s details
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
*EmploymentRecordsApi* | [**getDetails**](docs/EmploymentRecordsApi.md#getDetails) | **GET** /api/employment-records/{id} | Get an employment record\&#39;s details
*EmploymentRecordsApi* | [**list**](docs/EmploymentRecordsApi.md#list) | **GET** /api/employment-records | List all employment records
*EmploymentRecordsApi* | [**retrieve**](docs/EmploymentRecordsApi.md#retrieve) | **POST** /api/employment-records | Retrieve employment record details
*IncomeVerificationApi* | [**verify**](docs/IncomeVerificationApi.md#verify) | **POST** /api/enrich/incomes | Verify incomes
*IncomesApi* | [**completeRequest**](docs/IncomesApi.md#completeRequest) | **PATCH** /api/incomes | Complete an incomes request
*IncomesApi* | [**delete**](docs/IncomesApi.md#delete) | **DELETE** /api/incomes/{id} | Delete an income
*IncomesApi* | [**getDetails**](docs/IncomesApi.md#getDetails) | **GET** /api/incomes/{id} | Get an income\&#39;s details
*IncomesApi* | [**list**](docs/IncomesApi.md#list) | **GET** /api/incomes | List all incomes
*IncomesApi* | [**retrieve**](docs/IncomesApi.md#retrieve) | **POST** /api/incomes | Retrieve incomes for a link
*InstitutionsApi* | [**getDetails**](docs/InstitutionsApi.md#getDetails) | **GET** /api/institutions/{id} | Get an institution\&#39;s details
*InstitutionsApi* | [**list**](docs/InstitutionsApi.md#list) | **GET** /api/institutions | List all institutions
*InvestmentPortfoliosApi* | [**completeRequest**](docs/InvestmentPortfoliosApi.md#completeRequest) | **PATCH** /investments/portfolios | Complete a portfolios request
*InvestmentPortfoliosApi* | [**delete**](docs/InvestmentPortfoliosApi.md#delete) | **DELETE** /investments/portfolios/{id} | Delete a portfolio
*InvestmentPortfoliosApi* | [**getDetails**](docs/InvestmentPortfoliosApi.md#getDetails) | **GET** /investments/portfolios/{id} | Get a portfolio\&#39;s details
*InvestmentPortfoliosApi* | [**list**](docs/InvestmentPortfoliosApi.md#list) | **GET** /investments/portfolios | List all portfolios
*InvestmentPortfoliosApi* | [**retrieve**](docs/InvestmentPortfoliosApi.md#retrieve) | **POST** /investments/portfolios | Retrieve portfolios for a link
*InvoicesApi* | [**completeRequest**](docs/InvoicesApi.md#completeRequest) | **PATCH** /api/invoices | Complete an invoices request
*InvoicesApi* | [**delete**](docs/InvoicesApi.md#delete) | **DELETE** /api/invoices/{id} | Delete an invoice
*InvoicesApi* | [**getDetails**](docs/InvoicesApi.md#getDetails) | **GET** /api/invoices/{id} | Get an invoice\&#39;s details
*InvoicesApi* | [**list**](docs/InvoicesApi.md#list) | **GET** /api/invoices | List all invoices
*InvoicesApi* | [**retrieve**](docs/InvoicesApi.md#retrieve) | **POST** /api/invoices | Retrieve invoices for a link
*LinksApi* | [**changeAccessMode**](docs/LinksApi.md#changeAccessMode) | **PATCH** /api/links/{id} | Change a link\&#39;s access mode
*LinksApi* | [**completeRequest**](docs/LinksApi.md#completeRequest) | **PATCH** /api/links | Complete a links request
*LinksApi* | [**destroy**](docs/LinksApi.md#destroy) | **DELETE** /api/links/{id} | Delete a link
*LinksApi* | [**getDetails**](docs/LinksApi.md#getDetails) | **GET** /api/links/{id} | Get a link\&#39;s details
*LinksApi* | [**list**](docs/LinksApi.md#list) | **GET** /api/links | List all links
*LinksApi* | [**register**](docs/LinksApi.md#register) | **POST** /api/links | Register a new link
*LinksApi* | [**update**](docs/LinksApi.md#update) | **PUT** /api/links/{id} | Update a link\&#39;s credentials
*OwnersApi* | [**completeRequest**](docs/OwnersApi.md#completeRequest) | **PATCH** /api/owners | Complete an owners request
*OwnersApi* | [**delete**](docs/OwnersApi.md#delete) | **DELETE** /api/owners/{id} | Delete an owner
*OwnersApi* | [**getDetails**](docs/OwnersApi.md#getDetails) | **GET** /api/owners/{id} | Get an owner\&#39;s details
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
*ReceivableTransactionsApi* | [**getDetails**](docs/ReceivableTransactionsApi.md#getDetails) | **GET** /receivables/transactions/{id} | Get a receivable transaction\&#39;s details
*ReceivableTransactionsApi* | [**list**](docs/ReceivableTransactionsApi.md#list) | **GET** /receivables/transactions | List all receivable transactions
*ReceivableTransactionsApi* | [**retrieve**](docs/ReceivableTransactionsApi.md#retrieve) | **POST** /receivables/transactions | Retrieve receivable transactions for a link
*RecurringExpensesApi* | [**completeRequest**](docs/RecurringExpensesApi.md#completeRequest) | **PATCH** /api/recurring-expenses | Complete a recurring expenses request
*RecurringExpensesApi* | [**delete**](docs/RecurringExpensesApi.md#delete) | **DELETE** /api/recurring-expenses/{id} | Delete a recurring expense
*RecurringExpensesApi* | [**getDetails**](docs/RecurringExpensesApi.md#getDetails) | **GET** /api/recurring-expenses/{id} | Get a recurring expense\&#39;s details
*RecurringExpensesApi* | [**list**](docs/RecurringExpensesApi.md#list) | **GET** /api/recurring-expenses | List all recurring expenses
*RecurringExpensesApi* | [**retrieve**](docs/RecurringExpensesApi.md#retrieve) | **POST** /api/recurring-expenses | Retrieve recurring expenses for a link
*RiskInsightsApi* | [**completeRequest**](docs/RiskInsightsApi.md#completeRequest) | **PATCH** /api/risk-insights | Complete a risk insights request
*RiskInsightsApi* | [**delete**](docs/RiskInsightsApi.md#delete) | **DELETE** /api/risk-insights/{id} | Delete a risk insight
*RiskInsightsApi* | [**getDetails**](docs/RiskInsightsApi.md#getDetails) | **GET** /api/risk-insights/{id} | Get a risk insight\&#39;s details
*RiskInsightsApi* | [**list**](docs/RiskInsightsApi.md#list) | **GET** /api/risk-insights | List all risk insights
*RiskInsightsApi* | [**retrieve**](docs/RiskInsightsApi.md#retrieve) | **POST** /api/risk-insights | Retrieve risk insights for a link
*SecretKeysApi* | [**create**](docs/SecretKeysApi.md#create) | **POST** /payments/secret-keys | Request API keys
*SecretKeysApi* | [**list**](docs/SecretKeysApi.md#list) | **GET** /payments/secret-keys | List all secret keys
*TaxComplianceStatusApi* | [**delete**](docs/TaxComplianceStatusApi.md#delete) | **DELETE** /api/tax-compliance-status/{id} | Delete a tax compliance status
*TaxComplianceStatusApi* | [**getDetails**](docs/TaxComplianceStatusApi.md#getDetails) | **GET** /api/tax-compliance-status/{id} | Get a tax compliance status\&#39;s details
*TaxComplianceStatusApi* | [**list**](docs/TaxComplianceStatusApi.md#list) | **GET** /api/tax-compliance-status | List all tax compliance statuses
*TaxComplianceStatusApi* | [**retrieve**](docs/TaxComplianceStatusApi.md#retrieve) | **POST** /api/tax-compliance-status | Retrieve tax compliance statuses for a link
*TaxDeclarationsApi* | [**delete**](docs/TaxDeclarationsApi.md#delete) | **DELETE** /api/tax-declarations/{id} | Delete a tax declration
*TaxDeclarationsApi* | [**getDetails**](docs/TaxDeclarationsApi.md#getDetails) | **GET** /api/tax-declarations/{id} | Get a tax declaration\&#39;s details
*TaxDeclarationsApi* | [**list**](docs/TaxDeclarationsApi.md#list) | **GET** /api/tax-declarations | List all tax declarations
*TaxDeclarationsApi* | [**retrieve**](docs/TaxDeclarationsApi.md#retrieve) | **POST** /api/tax-declarations | Retrieve tax declarations for a link
*TaxRetentionsApi* | [**delete**](docs/TaxRetentionsApi.md#delete) | **DELETE** /api/tax-retentions/{id} | Delete a tax retention
*TaxRetentionsApi* | [**getDetails**](docs/TaxRetentionsApi.md#getDetails) | **GET** /api/tax-retentions/{id} | Get a tax retention\&#39;s details
*TaxRetentionsApi* | [**list**](docs/TaxRetentionsApi.md#list) | **GET** /api/tax-retentions | List all tax retentions
*TaxRetentionsApi* | [**retrieve**](docs/TaxRetentionsApi.md#retrieve) | **POST** /api/tax-retentions | Retrieve tax retentions for a link
*TaxReturnsApi* | [**delete**](docs/TaxReturnsApi.md#delete) | **DELETE** /api/tax-returns/{id} | Delete a tax return
*TaxReturnsApi* | [**getDetails**](docs/TaxReturnsApi.md#getDetails) | **GET** /api/tax-returns/{id} | Get a tax return\&#39;s details
*TaxReturnsApi* | [**list**](docs/TaxReturnsApi.md#list) | **GET** /api/tax-returns | List all tax returns
*TaxReturnsApi* | [**retrieve**](docs/TaxReturnsApi.md#retrieve) | **POST** /api/tax-returns | Retrieve tax returns for a link
*TaxStatusApi* | [**delete**](docs/TaxStatusApi.md#delete) | **DELETE** /api/tax-status/{id} | Delete a tax status
*TaxStatusApi* | [**getDetails**](docs/TaxStatusApi.md#getDetails) | **GET** /api/tax-status/{id} | Get a tax status\&#39;s details
*TaxStatusApi* | [**list**](docs/TaxStatusApi.md#list) | **GET** /api/tax-status | List all tax statuses
*TaxStatusApi* | [**retrieve**](docs/TaxStatusApi.md#retrieve) | **POST** /api/tax-status | Retrieve tax statuses for a link
*TransactionsApi* | [**completeRequest**](docs/TransactionsApi.md#completeRequest) | **PATCH** /api/transactions | Complete a transactions request
*TransactionsApi* | [**delete**](docs/TransactionsApi.md#delete) | **DELETE** /api/transactions/{id} | Delete a transaction
*TransactionsApi* | [**getDetails**](docs/TransactionsApi.md#getDetails) | **GET** /api/transactions/{id} | Get a transaction\&#39;s details
*TransactionsApi* | [**list**](docs/TransactionsApi.md#list) | **GET** /api/transactions | List all transactions
*TransactionsApi* | [**retrieve**](docs/TransactionsApi.md#retrieve) | **POST** /api/transactions | Retrieve transactions for a link

