# belvo-python-sdk@1.0.0
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



## Requirements

Python >=3.7

## Installing

```sh
pip install belvo-python-sdk==1.0.0
```

## Getting Started

```python
from pprint import pprint
from belvo_client import Belvo, ApiException

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://sandbox.belvo.com",
    # Configure HTTP basic authorization: basicAuth
    username="YOUR_USERNAME",
    password="YOUR_PASSWORD",
)

try:
    # Complete an accounts request
    complete_request_response = belvo.accounts.complete_request(
        session="6e7b283c6efa449c9c028a16b5c249fa",  # required
        link="683005d6-f45c-4adb-b289-f1a12f50f80c",  # required
        token="1234ab",  # optional
        save_data=True,  # optional
        omit="link,balance",  # optional
        fields="link,balance,account",  # optional
    )
    pprint(complete_request_response.body)
    pprint(complete_request_response.headers)
    pprint(complete_request_response.status)
    pprint(complete_request_response.round_trip_time)
except ApiException as e:
    print("Exception when calling AccountsApi.complete_request: %s\n" % e)
    pprint(e.body)
    pprint(e.headers)
    pprint(e.status)
    pprint(e.reason)
    pprint(e.round_trip_time)
```

## Async

`async` support is available by prepending `a` to any method.

```python
import asyncio
from pprint import pprint
from belvo_client import Belvo, ApiException

belvo = Belvo(
    # Defining the host is optional and defaults to https://sandbox.belvo.com
    # See configuration.py for a list of all supported configuration parameters.
    host="https://sandbox.belvo.com",
    # Configure HTTP basic authorization: basicAuth
    username="YOUR_USERNAME",
    password="YOUR_PASSWORD",
)


async def main():
    try:
        # Complete an accounts request
        complete_request_response = await belvo.accounts.acomplete_request(
            session="6e7b283c6efa449c9c028a16b5c249fa",  # required
            link="683005d6-f45c-4adb-b289-f1a12f50f80c",  # required
            token="1234ab",  # optional
            save_data=True,  # optional
            omit="link,balance",  # optional
            fields="link,balance,account",  # optional
        )
        pprint(complete_request_response.body)
        pprint(complete_request_response.headers)
        pprint(complete_request_response.status)
        pprint(complete_request_response.round_trip_time)
    except ApiException as e:
        print("Exception when calling AccountsApi.complete_request: %s\n" % e)
        pprint(e.body)
        pprint(e.headers)
        pprint(e.status)
        pprint(e.reason)
        pprint(e.round_trip_time)


asyncio.run(main())
```


## Documentation for API Endpoints

All URIs are relative to *https://sandbox.belvo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**complete_request**](docs/apis/tags/AccountsApi.md#complete_request) | **patch** /api/accounts | Complete an accounts request
*AccountsApi* | [**delete**](docs/apis/tags/AccountsApi.md#delete) | **delete** /api/accounts/{id} | Delete an account
*AccountsApi* | [**get_details**](docs/apis/tags/AccountsApi.md#get_details) | **get** /api/accounts/{id} | Get an account&#x27;s details
*AccountsApi* | [**list**](docs/apis/tags/AccountsApi.md#list) | **get** /api/accounts | List all accounts
*AccountsApi* | [**retrieve**](docs/apis/tags/AccountsApi.md#retrieve) | **post** /api/accounts | Retrieve accounts for a link
*BalancesApi* | [**complete_request**](docs/apis/tags/BalancesApi.md#complete_request) | **patch** /api/balances | Complete a balances request
*BalancesApi* | [**delete**](docs/apis/tags/BalancesApi.md#delete) | **delete** /api/balances/{id} | Delete a balance
*BalancesApi* | [**get_details**](docs/apis/tags/BalancesApi.md#get_details) | **get** /api/balances/{id} | Get a balance&#x27;s details
*BalancesApi* | [**list**](docs/apis/tags/BalancesApi.md#list) | **get** /api/balances | List all balances
*BalancesApi* | [**retrieve**](docs/apis/tags/BalancesApi.md#retrieve) | **post** /api/balances | Retrieve balances for a link
*BankAccountsApi* | [**create**](docs/apis/tags/BankAccountsApi.md#create) | **post** /payments/bank-accounts | Create a new bank account
*BankAccountsApi* | [**get_details**](docs/apis/tags/BankAccountsApi.md#get_details) | **get** /payments/bank-accounts/{id} | Get details about a bank account
*BankAccountsApi* | [**list**](docs/apis/tags/BankAccountsApi.md#list) | **get** /payments/bank-accounts | List all bank accounts
*CategorizationApi* | [**categorize_transactions**](docs/apis/tags/CategorizationApi.md#categorize_transactions) | **post** /api/categorization | Categorize transactions
*CustomersApi* | [**create**](docs/apis/tags/CustomersApi.md#create) | **post** /payments/customers | Create a new customer
*CustomersApi* | [**get_details**](docs/apis/tags/CustomersApi.md#get_details) | **get** /payments/customers/{id} | Get details about a customer
*CustomersApi* | [**list**](docs/apis/tags/CustomersApi.md#list) | **get** /payments/customers | List all customers
*EmploymentRecordsApi* | [**delete**](docs/apis/tags/EmploymentRecordsApi.md#delete) | **delete** /api/employment-records/{id} | Delete an employment record
*EmploymentRecordsApi* | [**get_details**](docs/apis/tags/EmploymentRecordsApi.md#get_details) | **get** /api/employment-records/{id} | Get an employment record&#x27;s details
*EmploymentRecordsApi* | [**list**](docs/apis/tags/EmploymentRecordsApi.md#list) | **get** /api/employment-records | List all employment records
*EmploymentRecordsApi* | [**retrieve**](docs/apis/tags/EmploymentRecordsApi.md#retrieve) | **post** /api/employment-records | Retrieve employment record details
*IncomeVerificationApi* | [**verify**](docs/apis/tags/IncomeVerificationApi.md#verify) | **post** /api/enrich/incomes | Verify incomes
*IncomesApi* | [**complete_request**](docs/apis/tags/IncomesApi.md#complete_request) | **patch** /api/incomes | Complete an incomes request
*IncomesApi* | [**delete**](docs/apis/tags/IncomesApi.md#delete) | **delete** /api/incomes/{id} | Delete an income
*IncomesApi* | [**get_details**](docs/apis/tags/IncomesApi.md#get_details) | **get** /api/incomes/{id} | Get an income&#x27;s details
*IncomesApi* | [**list**](docs/apis/tags/IncomesApi.md#list) | **get** /api/incomes | List all incomes
*IncomesApi* | [**retrieve**](docs/apis/tags/IncomesApi.md#retrieve) | **post** /api/incomes | Retrieve incomes for a link
*InstitutionsApi* | [**get_details**](docs/apis/tags/InstitutionsApi.md#get_details) | **get** /api/institutions/{id} | Get an institution&#x27;s details
*InstitutionsApi* | [**list**](docs/apis/tags/InstitutionsApi.md#list) | **get** /api/institutions | List all institutions
*InvestmentPortfoliosApi* | [**complete_request**](docs/apis/tags/InvestmentPortfoliosApi.md#complete_request) | **patch** /investments/portfolios | Complete a portfolios request
*InvestmentPortfoliosApi* | [**delete**](docs/apis/tags/InvestmentPortfoliosApi.md#delete) | **delete** /investments/portfolios/{id} | Delete a portfolio
*InvestmentPortfoliosApi* | [**get_details**](docs/apis/tags/InvestmentPortfoliosApi.md#get_details) | **get** /investments/portfolios/{id} | Get a portfolio&#x27;s details
*InvestmentPortfoliosApi* | [**list**](docs/apis/tags/InvestmentPortfoliosApi.md#list) | **get** /investments/portfolios | List all portfolios
*InvestmentPortfoliosApi* | [**retrieve**](docs/apis/tags/InvestmentPortfoliosApi.md#retrieve) | **post** /investments/portfolios | Retrieve portfolios for a link
*InvoicesApi* | [**complete_request**](docs/apis/tags/InvoicesApi.md#complete_request) | **patch** /api/invoices | Complete an invoices request
*InvoicesApi* | [**delete**](docs/apis/tags/InvoicesApi.md#delete) | **delete** /api/invoices/{id} | Delete an invoice
*InvoicesApi* | [**get_details**](docs/apis/tags/InvoicesApi.md#get_details) | **get** /api/invoices/{id} | Get an invoice&#x27;s details
*InvoicesApi* | [**list**](docs/apis/tags/InvoicesApi.md#list) | **get** /api/invoices | List all invoices
*InvoicesApi* | [**retrieve**](docs/apis/tags/InvoicesApi.md#retrieve) | **post** /api/invoices | Retrieve invoices for a link
*LinksApi* | [**change_access_mode**](docs/apis/tags/LinksApi.md#change_access_mode) | **patch** /api/links/{id} | Change a link&#x27;s access mode
*LinksApi* | [**complete_request**](docs/apis/tags/LinksApi.md#complete_request) | **patch** /api/links | Complete a links request
*LinksApi* | [**destroy**](docs/apis/tags/LinksApi.md#destroy) | **delete** /api/links/{id} | Delete a link
*LinksApi* | [**get_details**](docs/apis/tags/LinksApi.md#get_details) | **get** /api/links/{id} | Get a link&#x27;s details
*LinksApi* | [**list**](docs/apis/tags/LinksApi.md#list) | **get** /api/links | List all links
*LinksApi* | [**register**](docs/apis/tags/LinksApi.md#register) | **post** /api/links | Register a new link
*LinksApi* | [**update**](docs/apis/tags/LinksApi.md#update) | **put** /api/links/{id} | Update a link&#x27;s credentials
*OwnersApi* | [**complete_request**](docs/apis/tags/OwnersApi.md#complete_request) | **patch** /api/owners | Complete an owners request
*OwnersApi* | [**delete**](docs/apis/tags/OwnersApi.md#delete) | **delete** /api/owners/{id} | Delete an owner
*OwnersApi* | [**get_details**](docs/apis/tags/OwnersApi.md#get_details) | **get** /api/owners/{id} | Get an owner&#x27;s details
*OwnersApi* | [**list**](docs/apis/tags/OwnersApi.md#list) | **get** /api/owners | List all owners
*OwnersApi* | [**retrieve**](docs/apis/tags/OwnersApi.md#retrieve) | **post** /api/owners | Retrieve owners for a link
*PaymentInstitutionsApi* | [**get_details**](docs/apis/tags/PaymentInstitutionsApi.md#get_details) | **get** /payments/institutions/{id} | Get details about a payment institution
*PaymentInstitutionsApi* | [**list**](docs/apis/tags/PaymentInstitutionsApi.md#list) | **get** /payments/institutions | List all payment institutions
*PaymentIntentsApi* | [**complete**](docs/apis/tags/PaymentIntentsApi.md#complete) | **patch** /payments/payment-intents/{id} | Complete a payment intent
*PaymentIntentsApi* | [**create**](docs/apis/tags/PaymentIntentsApi.md#create) | **post** /payments/payment-intents | Create a new payment intent
*PaymentIntentsApi* | [**get_details**](docs/apis/tags/PaymentIntentsApi.md#get_details) | **get** /payments/payment-intents/{id} | Get details about a payment intent.
*PaymentIntentsApi* | [**list**](docs/apis/tags/PaymentIntentsApi.md#list) | **get** /payments/payment-intents | List all payment intents
*PaymentLinksApi* | [**create**](docs/apis/tags/PaymentLinksApi.md#create) | **post** /payments/payment-links | Create a payment link
*PaymentLinksApi* | [**get_details**](docs/apis/tags/PaymentLinksApi.md#get_details) | **get** /payments/payment-links/{access_token} | Get details about a payment link
*PaymentLinksApi* | [**list**](docs/apis/tags/PaymentLinksApi.md#list) | **get** /payments/payment-links | List all payment links
*PaymentTransactionsApi* | [**get_details**](docs/apis/tags/PaymentTransactionsApi.md#get_details) | **get** /payments/transactions/{id} | Get details about a payment transaction
*PaymentTransactionsApi* | [**list**](docs/apis/tags/PaymentTransactionsApi.md#list) | **get** /payments/transactions | List all payment transactions
*ReceivableTransactionsApi* | [**delete**](docs/apis/tags/ReceivableTransactionsApi.md#delete) | **delete** /receivables/transactions/{id} | Delete a receivable transaction
*ReceivableTransactionsApi* | [**get_details**](docs/apis/tags/ReceivableTransactionsApi.md#get_details) | **get** /receivables/transactions/{id} | Get a receivable transaction&#x27;s details
*ReceivableTransactionsApi* | [**list**](docs/apis/tags/ReceivableTransactionsApi.md#list) | **get** /receivables/transactions | List all receivable transactions
*ReceivableTransactionsApi* | [**retrieve**](docs/apis/tags/ReceivableTransactionsApi.md#retrieve) | **post** /receivables/transactions | Retrieve receivable transactions for a link
*RecurringExpensesApi* | [**complete_request**](docs/apis/tags/RecurringExpensesApi.md#complete_request) | **patch** /api/recurring-expenses | Complete a recurring expenses request
*RecurringExpensesApi* | [**delete**](docs/apis/tags/RecurringExpensesApi.md#delete) | **delete** /api/recurring-expenses/{id} | Delete a recurring expense
*RecurringExpensesApi* | [**get_details**](docs/apis/tags/RecurringExpensesApi.md#get_details) | **get** /api/recurring-expenses/{id} | Get a recurring expense&#x27;s details
*RecurringExpensesApi* | [**list**](docs/apis/tags/RecurringExpensesApi.md#list) | **get** /api/recurring-expenses | List all recurring expenses
*RecurringExpensesApi* | [**retrieve**](docs/apis/tags/RecurringExpensesApi.md#retrieve) | **post** /api/recurring-expenses | Retrieve recurring expenses for a link
*RiskInsightsApi* | [**complete_request**](docs/apis/tags/RiskInsightsApi.md#complete_request) | **patch** /api/risk-insights | Complete a risk insights request
*RiskInsightsApi* | [**delete**](docs/apis/tags/RiskInsightsApi.md#delete) | **delete** /api/risk-insights/{id} | Delete a risk insight
*RiskInsightsApi* | [**get_details**](docs/apis/tags/RiskInsightsApi.md#get_details) | **get** /api/risk-insights/{id} | Get a risk insight&#x27;s details
*RiskInsightsApi* | [**list**](docs/apis/tags/RiskInsightsApi.md#list) | **get** /api/risk-insights | List all risk insights
*RiskInsightsApi* | [**retrieve**](docs/apis/tags/RiskInsightsApi.md#retrieve) | **post** /api/risk-insights | Retrieve risk insights for a link
*SecretKeysApi* | [**create**](docs/apis/tags/SecretKeysApi.md#create) | **post** /payments/secret-keys | Request API keys
*SecretKeysApi* | [**list**](docs/apis/tags/SecretKeysApi.md#list) | **get** /payments/secret-keys | List all secret keys
*TaxComplianceStatusApi* | [**delete**](docs/apis/tags/TaxComplianceStatusApi.md#delete) | **delete** /api/tax-compliance-status/{id} | Delete a tax compliance status
*TaxComplianceStatusApi* | [**get_details**](docs/apis/tags/TaxComplianceStatusApi.md#get_details) | **get** /api/tax-compliance-status/{id} | Get a tax compliance status&#x27;s details
*TaxComplianceStatusApi* | [**list**](docs/apis/tags/TaxComplianceStatusApi.md#list) | **get** /api/tax-compliance-status | List all tax compliance statuses
*TaxComplianceStatusApi* | [**retrieve**](docs/apis/tags/TaxComplianceStatusApi.md#retrieve) | **post** /api/tax-compliance-status | Retrieve tax compliance statuses for a link
*TaxDeclarationsApi* | [**delete**](docs/apis/tags/TaxDeclarationsApi.md#delete) | **delete** /api/tax-declarations/{id} | Delete a tax declration
*TaxDeclarationsApi* | [**get_details**](docs/apis/tags/TaxDeclarationsApi.md#get_details) | **get** /api/tax-declarations/{id} | Get a tax declaration&#x27;s details
*TaxDeclarationsApi* | [**list**](docs/apis/tags/TaxDeclarationsApi.md#list) | **get** /api/tax-declarations | List all tax declarations
*TaxDeclarationsApi* | [**retrieve**](docs/apis/tags/TaxDeclarationsApi.md#retrieve) | **post** /api/tax-declarations | Retrieve tax declarations for a link
*TaxRetentionsApi* | [**delete**](docs/apis/tags/TaxRetentionsApi.md#delete) | **delete** /api/tax-retentions/{id} | Delete a tax retention
*TaxRetentionsApi* | [**get_details**](docs/apis/tags/TaxRetentionsApi.md#get_details) | **get** /api/tax-retentions/{id} | Get a tax retention&#x27;s details
*TaxRetentionsApi* | [**list**](docs/apis/tags/TaxRetentionsApi.md#list) | **get** /api/tax-retentions | List all tax retentions
*TaxRetentionsApi* | [**retrieve**](docs/apis/tags/TaxRetentionsApi.md#retrieve) | **post** /api/tax-retentions | Retrieve tax retentions for a link
*TaxReturnsApi* | [**delete**](docs/apis/tags/TaxReturnsApi.md#delete) | **delete** /api/tax-returns/{id} | Delete a tax return
*TaxReturnsApi* | [**get_details**](docs/apis/tags/TaxReturnsApi.md#get_details) | **get** /api/tax-returns/{id} | Get a tax return&#x27;s details
*TaxReturnsApi* | [**list**](docs/apis/tags/TaxReturnsApi.md#list) | **get** /api/tax-returns | List all tax returns
*TaxReturnsApi* | [**retrieve**](docs/apis/tags/TaxReturnsApi.md#retrieve) | **post** /api/tax-returns | Retrieve tax returns for a link
*TaxStatusApi* | [**delete**](docs/apis/tags/TaxStatusApi.md#delete) | **delete** /api/tax-status/{id} | Delete a tax status
*TaxStatusApi* | [**get_details**](docs/apis/tags/TaxStatusApi.md#get_details) | **get** /api/tax-status/{id} | Get a tax status&#x27;s details
*TaxStatusApi* | [**list**](docs/apis/tags/TaxStatusApi.md#list) | **get** /api/tax-status | List all tax statuses
*TaxStatusApi* | [**retrieve**](docs/apis/tags/TaxStatusApi.md#retrieve) | **post** /api/tax-status | Retrieve tax statuses for a link
*TransactionsApi* | [**complete_request**](docs/apis/tags/TransactionsApi.md#complete_request) | **patch** /api/transactions | Complete a transactions request
*TransactionsApi* | [**delete**](docs/apis/tags/TransactionsApi.md#delete) | **delete** /api/transactions/{id} | Delete a transaction
*TransactionsApi* | [**get_details**](docs/apis/tags/TransactionsApi.md#get_details) | **get** /api/transactions/{id} | Get a transaction&#x27;s details
*TransactionsApi* | [**list**](docs/apis/tags/TransactionsApi.md#list) | **get** /api/transactions | List all transactions
*TransactionsApi* | [**retrieve**](docs/apis/tags/TransactionsApi.md#retrieve) | **post** /api/transactions | Retrieve transactions for a link

## Documentation For Models

 - [AccessToResourceDenied](docs/models/AccessToResourceDenied.md)
 - [Account](docs/models/Account.md)
 - [AccountsBalance](docs/models/AccountsBalance.md)
 - [AccountsCompleteRequest201Response](docs/models/AccountsCompleteRequest201Response.md)
 - [AccountsCompleteRequest400Response](docs/models/AccountsCompleteRequest400Response.md)
 - [AccountsCompleteRequest401Response](docs/models/AccountsCompleteRequest401Response.md)
 - [AccountsCompleteRequest408Response](docs/models/AccountsCompleteRequest408Response.md)
 - [AccountsCompleteRequest428Response](docs/models/AccountsCompleteRequest428Response.md)
 - [AccountsCompleteRequest500Response](docs/models/AccountsCompleteRequest500Response.md)
 - [AccountsCompleteRequestResponse](docs/models/AccountsCompleteRequestResponse.md)
 - [AccountsCreditData](docs/models/AccountsCreditData.md)
 - [AccountsDelete404Response](docs/models/AccountsDelete404Response.md)
 - [AccountsDeleteResponse](docs/models/AccountsDeleteResponse.md)
 - [AccountsFundsData](docs/models/AccountsFundsData.md)
 - [AccountsFundsDataPublicIdentifications](docs/models/AccountsFundsDataPublicIdentifications.md)
 - [AccountsGetDetails404Response](docs/models/AccountsGetDetails404Response.md)
 - [AccountsGetDetailsResponse](docs/models/AccountsGetDetailsResponse.md)
 - [AccountsListResponse](docs/models/AccountsListResponse.md)
 - [AccountsLoanData](docs/models/AccountsLoanData.md)
 - [AccountsLoanDataFees](docs/models/AccountsLoanDataFees.md)
 - [AccountsLoanDataInterestRate](docs/models/AccountsLoanDataInterestRate.md)
 - [AccountsPaginatedResponse](docs/models/AccountsPaginatedResponse.md)
 - [AccountsReceivablesData](docs/models/AccountsReceivablesData.md)
 - [AccountsRetrieve201Response](docs/models/AccountsRetrieve201Response.md)
 - [AccountsRetrieve400Response](docs/models/AccountsRetrieve400Response.md)
 - [AccountsRetrieve401Response](docs/models/AccountsRetrieve401Response.md)
 - [AccountsRetrieve408Response](docs/models/AccountsRetrieve408Response.md)
 - [AccountsRetrieve428Response](docs/models/AccountsRetrieve428Response.md)
 - [AccountsRetrieve500Response](docs/models/AccountsRetrieve500Response.md)
 - [AccountsRetrieveResponse](docs/models/AccountsRetrieveResponse.md)
 - [AnnualCostsAndDeductionsStatementBusiness](docs/models/AnnualCostsAndDeductionsStatementBusiness.md)
 - [AnnualIncomeStatementBusiness](docs/models/AnnualIncomeStatementBusiness.md)
 - [AnnualIncomeStatementIndividual](docs/models/AnnualIncomeStatementIndividual.md)
 - [AnnualTotalsIndividual](docs/models/AnnualTotalsIndividual.md)
 - [AsynchronousAccepted202](docs/models/AsynchronousAccepted202.md)
 - [Balance](docs/models/Balance.md)
 - [BalancesCompleteRequest201Response](docs/models/BalancesCompleteRequest201Response.md)
 - [BalancesCompleteRequest400Response](docs/models/BalancesCompleteRequest400Response.md)
 - [BalancesCompleteRequest401Response](docs/models/BalancesCompleteRequest401Response.md)
 - [BalancesCompleteRequest408Response](docs/models/BalancesCompleteRequest408Response.md)
 - [BalancesCompleteRequest428Response](docs/models/BalancesCompleteRequest428Response.md)
 - [BalancesCompleteRequest500Response](docs/models/BalancesCompleteRequest500Response.md)
 - [BalancesCompleteRequestResponse](docs/models/BalancesCompleteRequestResponse.md)
 - [BalancesDelete404Response](docs/models/BalancesDelete404Response.md)
 - [BalancesDeleteResponse](docs/models/BalancesDeleteResponse.md)
 - [BalancesGetDetails404Response](docs/models/BalancesGetDetails404Response.md)
 - [BalancesGetDetailsResponse](docs/models/BalancesGetDetailsResponse.md)
 - [BalancesListResponse](docs/models/BalancesListResponse.md)
 - [BalancesPaginatedResponse](docs/models/BalancesPaginatedResponse.md)
 - [BalancesRequest](docs/models/BalancesRequest.md)
 - [BalancesRetrieve201Response](docs/models/BalancesRetrieve201Response.md)
 - [BalancesRetrieve400Response](docs/models/BalancesRetrieve400Response.md)
 - [BalancesRetrieve401Response](docs/models/BalancesRetrieve401Response.md)
 - [BalancesRetrieve408Response](docs/models/BalancesRetrieve408Response.md)
 - [BalancesRetrieve428Response](docs/models/BalancesRetrieve428Response.md)
 - [BalancesRetrieve500Response](docs/models/BalancesRetrieve500Response.md)
 - [BalancesRetrieveResponse](docs/models/BalancesRetrieveResponse.md)
 - [BankAccountBusinessPse](docs/models/BankAccountBusinessPse.md)
 - [BankAccountDetailsOfpi](docs/models/BankAccountDetailsOfpi.md)
 - [BankAccountDetailsOfpiPix](docs/models/BankAccountDetailsOfpiPix.md)
 - [BankAccountDetailsOpenFinance](docs/models/BankAccountDetailsOpenFinance.md)
 - [BankAccountDetailsOpenFinancePix](docs/models/BankAccountDetailsOpenFinancePix.md)
 - [BankAccountHolderRequestOfpi](docs/models/BankAccountHolderRequestOfpi.md)
 - [BankAccountInformationContentPse](docs/models/BankAccountInformationContentPse.md)
 - [BankAccountInformationPse](docs/models/BankAccountInformationPse.md)
 - [BankAccountOfpiResponse](docs/models/BankAccountOfpiResponse.md)
 - [BankAccountPaginatedResponse](docs/models/BankAccountPaginatedResponse.md)
 - [BankAccountPseResponse](docs/models/BankAccountPseResponse.md)
 - [BankAccountsCreate400Response](docs/models/BankAccountsCreate400Response.md)
 - [BankAccountsCreate401Response](docs/models/BankAccountsCreate401Response.md)
 - [BankAccountsCreate408Response](docs/models/BankAccountsCreate408Response.md)
 - [BankAccountsCreate500Response](docs/models/BankAccountsCreate500Response.md)
 - [BankAccountsCreateRequest](docs/models/BankAccountsCreateRequest.md)
 - [BankAccountsCreateResponse](docs/models/BankAccountsCreateResponse.md)
 - [BankAccountsGetDetails401Response](docs/models/BankAccountsGetDetails401Response.md)
 - [BankAccountsGetDetails404Response](docs/models/BankAccountsGetDetails404Response.md)
 - [BankAccountsGetDetailsResponse](docs/models/BankAccountsGetDetailsResponse.md)
 - [BankAccountsListResponse](docs/models/BankAccountsListResponse.md)
 - [BeneficiaryBankAccountOfpi](docs/models/BeneficiaryBankAccountOfpi.md)
 - [BeneficiaryBankAccountPse](docs/models/BeneficiaryBankAccountPse.md)
 - [Categorization](docs/models/Categorization.md)
 - [CategorizationBody](docs/models/CategorizationBody.md)
 - [CategorizationBodyRequest](docs/models/CategorizationBodyRequest.md)
 - [CategorizationCategorizeTransactions401Response](docs/models/CategorizationCategorizeTransactions401Response.md)
 - [CategorizationCategorizeTransactions403Response](docs/models/CategorizationCategorizeTransactions403Response.md)
 - [CategorizationCategorizeTransactions500Response](docs/models/CategorizationCategorizeTransactions500Response.md)
 - [CategorizationCategorizeTransactionsResponse](docs/models/CategorizationCategorizeTransactionsResponse.md)
 - [CategorizationMerchantData](docs/models/CategorizationMerchantData.md)
 - [CategorizationRequest](docs/models/CategorizationRequest.md)
 - [ChangeAccessMode](docs/models/ChangeAccessMode.md)
 - [Charge](docs/models/Charge.md)
 - [ChargePaymentMethodDetailsOfpi](docs/models/ChargePaymentMethodDetailsOfpi.md)
 - [ChargePaymentMethodDetailsOfpiContent](docs/models/ChargePaymentMethodDetailsOfpiContent.md)
 - [ChargePaymentMethodDetailsPse](docs/models/ChargePaymentMethodDetailsPse.md)
 - [ChargePaymentMethodDetailsPseContent](docs/models/ChargePaymentMethodDetailsPseContent.md)
 - [CreateBankAccountOfpi](docs/models/CreateBankAccountOfpi.md)
 - [CreateBankAccountPse](docs/models/CreateBankAccountPse.md)
 - [CreateCustomerOfpi](docs/models/CreateCustomerOfpi.md)
 - [CreateCustomerPse](docs/models/CreateCustomerPse.md)
 - [CreatePaymentIntentPse](docs/models/CreatePaymentIntentPse.md)
 - [CreatePaymentLinkOfpi](docs/models/CreatePaymentLinkOfpi.md)
 - [CreatePaymentLinkPse](docs/models/CreatePaymentLinkPse.md)
 - [CustomerOfpi](docs/models/CustomerOfpi.md)
 - [CustomerPaginatedResponse](docs/models/CustomerPaginatedResponse.md)
 - [CustomerPse](docs/models/CustomerPse.md)
 - [CustomersCreate400Response](docs/models/CustomersCreate400Response.md)
 - [CustomersCreate401Response](docs/models/CustomersCreate401Response.md)
 - [CustomersCreate500Response](docs/models/CustomersCreate500Response.md)
 - [CustomersCreateRequest](docs/models/CustomersCreateRequest.md)
 - [CustomersCreateResponse](docs/models/CustomersCreateResponse.md)
 - [CustomersGetDetails401Response](docs/models/CustomersGetDetails401Response.md)
 - [CustomersGetDetails404Response](docs/models/CustomersGetDetails404Response.md)
 - [CustomersGetDetailsResponse](docs/models/CustomersGetDetailsResponse.md)
 - [CustomersListResponse](docs/models/CustomersListResponse.md)
 - [DisplayConfirmationRequiredContentPse](docs/models/DisplayConfirmationRequiredContentPse.md)
 - [DisplayConfirmationRequiredOfpi](docs/models/DisplayConfirmationRequiredOfpi.md)
 - [DisplayCredentialsRequiredContentPse](docs/models/DisplayCredentialsRequiredContentPse.md)
 - [DisplayCustomerBankAccountsContentPse](docs/models/DisplayCustomerBankAccountsContentPse.md)
 - [DisplayPaymentFailed](docs/models/DisplayPaymentFailed.md)
 - [DisplayPaymentMethodInformationContentOfpi](docs/models/DisplayPaymentMethodInformationContentOfpi.md)
 - [DisplayPaymentMethodInformationContentPse](docs/models/DisplayPaymentMethodInformationContentPse.md)
 - [DisplayPaymentProcessing](docs/models/DisplayPaymentProcessing.md)
 - [DisplayPaymentSucceeded](docs/models/DisplayPaymentSucceeded.md)
 - [DisplayTokenRequiredContentPse](docs/models/DisplayTokenRequiredContentPse.md)
 - [DocumentIdBusiness](docs/models/DocumentIdBusiness.md)
 - [DocumentIdIndividual](docs/models/DocumentIdIndividual.md)
 - [DocumentInformationBusiness](docs/models/DocumentInformationBusiness.md)
 - [DocumentInformationIndividual](docs/models/DocumentInformationIndividual.md)
 - [EmploymentRecord](docs/models/EmploymentRecord.md)
 - [EmploymentRecordDetail](docs/models/EmploymentRecordDetail.md)
 - [EmploymentRecordDocumentId](docs/models/EmploymentRecordDocumentId.md)
 - [EmploymentRecordEmploymentStatusUpdates](docs/models/EmploymentRecordEmploymentStatusUpdates.md)
 - [EmploymentRecordEntitlement](docs/models/EmploymentRecordEntitlement.md)
 - [EmploymentRecordFile](docs/models/EmploymentRecordFile.md)
 - [EmploymentRecordPersonalData](docs/models/EmploymentRecordPersonalData.md)
 - [EmploymentRecordRequest](docs/models/EmploymentRecordRequest.md)
 - [EmploymentRecordSocialSecuritySummary](docs/models/EmploymentRecordSocialSecuritySummary.md)
 - [EmploymentRecordsDelete404Response](docs/models/EmploymentRecordsDelete404Response.md)
 - [EmploymentRecordsDeleteResponse](docs/models/EmploymentRecordsDeleteResponse.md)
 - [EmploymentRecordsGetDetails404Response](docs/models/EmploymentRecordsGetDetails404Response.md)
 - [EmploymentRecordsGetDetailsResponse](docs/models/EmploymentRecordsGetDetailsResponse.md)
 - [EmploymentRecordsListResponse](docs/models/EmploymentRecordsListResponse.md)
 - [EmploymentRecordsPaginatedResponse](docs/models/EmploymentRecordsPaginatedResponse.md)
 - [EmploymentRecordsRetrieve201Response](docs/models/EmploymentRecordsRetrieve201Response.md)
 - [EmploymentRecordsRetrieve400Response](docs/models/EmploymentRecordsRetrieve400Response.md)
 - [EmploymentRecordsRetrieve401Response](docs/models/EmploymentRecordsRetrieve401Response.md)
 - [EmploymentRecordsRetrieve408Response](docs/models/EmploymentRecordsRetrieve408Response.md)
 - [EmploymentRecordsRetrieve428Response](docs/models/EmploymentRecordsRetrieve428Response.md)
 - [EmploymentRecordsRetrieve500Response](docs/models/EmploymentRecordsRetrieve500Response.md)
 - [EmploymentRecordsRetrieveResponse](docs/models/EmploymentRecordsRetrieveResponse.md)
 - [EnumAccountCategory](docs/models/EnumAccountCategory.md)
 - [EnumBankAccountHolderTypeOfpi](docs/models/EnumBankAccountHolderTypeOfpi.md)
 - [EnumBankAccountHolderTypePse](docs/models/EnumBankAccountHolderTypePse.md)
 - [EnumBankAccountPixAccountTypeOfpi](docs/models/EnumBankAccountPixAccountTypeOfpi.md)
 - [EnumCategorizationAccountCategory](docs/models/EnumCategorizationAccountCategory.md)
 - [EnumCategorizationAccountHolderType](docs/models/EnumCategorizationAccountHolderType.md)
 - [EnumCategorizationTransactionCategory](docs/models/EnumCategorizationTransactionCategory.md)
 - [EnumCategorizationTransactionSubcategory](docs/models/EnumCategorizationTransactionSubcategory.md)
 - [EnumCategorizationTransactionType](docs/models/EnumCategorizationTransactionType.md)
 - [EnumCustomerIdentifierTypeOfpi](docs/models/EnumCustomerIdentifierTypeOfpi.md)
 - [EnumCustomerIdentifierTypePse](docs/models/EnumCustomerIdentifierTypePse.md)
 - [EnumCustomerType](docs/models/EnumCustomerType.md)
 - [EnumEmploymentRecordDocumentType](docs/models/EnumEmploymentRecordDocumentType.md)
 - [EnumEmploymentRecordStatus](docs/models/EnumEmploymentRecordStatus.md)
 - [EnumEmploymentRecordStatusUpdateEvents](docs/models/EnumEmploymentRecordStatusUpdateEvents.md)
 - [EnumIncomeMinimumConfidenceLevelRequest](docs/models/EnumIncomeMinimumConfidenceLevelRequest.md)
 - [EnumIncomeSourceType](docs/models/EnumIncomeSourceType.md)
 - [EnumIncomeStreamConfidence](docs/models/EnumIncomeStreamConfidence.md)
 - [EnumIncomeStreamFrequency](docs/models/EnumIncomeStreamFrequency.md)
 - [EnumIncomeStreamType](docs/models/EnumIncomeStreamType.md)
 - [EnumIncomeVerificationAccountCategory](docs/models/EnumIncomeVerificationAccountCategory.md)
 - [EnumIncomeVerificationAccountHolderType](docs/models/EnumIncomeVerificationAccountHolderType.md)
 - [EnumIncomeVerificationType](docs/models/EnumIncomeVerificationType.md)
 - [EnumInstitutionIntegrationType](docs/models/EnumInstitutionIntegrationType.md)
 - [EnumInstitutionStatus](docs/models/EnumInstitutionStatus.md)
 - [EnumInstitutionType](docs/models/EnumInstitutionType.md)
 - [EnumInvestmentPortfolioInstrumentType](docs/models/EnumInvestmentPortfolioInstrumentType.md)
 - [EnumInvestmentPortfolioType](docs/models/EnumInvestmentPortfolioType.md)
 - [EnumInvoiceAllowedIncomeTypesRequest](docs/models/EnumInvoiceAllowedIncomeTypesRequest.md)
 - [EnumInvoiceDianInvoiceType](docs/models/EnumInvoiceDianInvoiceType.md)
 - [EnumInvoiceDianPaymentMethod](docs/models/EnumInvoiceDianPaymentMethod.md)
 - [EnumInvoiceSatInvoiceType](docs/models/EnumInvoiceSatInvoiceType.md)
 - [EnumInvoiceSatPaymentMethod](docs/models/EnumInvoiceSatPaymentMethod.md)
 - [EnumInvoiceType](docs/models/EnumInvoiceType.md)
 - [EnumLinkAccessModeRequest](docs/models/EnumLinkAccessModeRequest.md)
 - [EnumLinkAccessModeResponse](docs/models/EnumLinkAccessModeResponse.md)
 - [EnumLinkRefreshRate](docs/models/EnumLinkRefreshRate.md)
 - [EnumLinkStatus](docs/models/EnumLinkStatus.md)
 - [EnumLoanDataFeeType](docs/models/EnumLoanDataFeeType.md)
 - [EnumLoanDataInterestRateType](docs/models/EnumLoanDataInterestRateType.md)
 - [EnumPaymentIntentHolderTypePse](docs/models/EnumPaymentIntentHolderTypePse.md)
 - [EnumPaymentIntentStatus](docs/models/EnumPaymentIntentStatus.md)
 - [EnumPaymentLinkAllowedPaymentMethod](docs/models/EnumPaymentLinkAllowedPaymentMethod.md)
 - [EnumPaymentLinkProvider](docs/models/EnumPaymentLinkProvider.md)
 - [EnumPaymentLinksStatus](docs/models/EnumPaymentLinksStatus.md)
 - [EnumPaymentTransactionType](docs/models/EnumPaymentTransactionType.md)
 - [EnumPaymentsCountry](docs/models/EnumPaymentsCountry.md)
 - [EnumPaymentsCurrency](docs/models/EnumPaymentsCurrency.md)
 - [EnumReceivableTransactionFeeType](docs/models/EnumReceivableTransactionFeeType.md)
 - [EnumReceivableTransactionStatus](docs/models/EnumReceivableTransactionStatus.md)
 - [EnumReceivableTransactionType](docs/models/EnumReceivableTransactionType.md)
 - [EnumRecurringExpenseCategory](docs/models/EnumRecurringExpenseCategory.md)
 - [EnumRecurringExpenseFrequency](docs/models/EnumRecurringExpenseFrequency.md)
 - [EnumRecurringExpensePaymentType](docs/models/EnumRecurringExpensePaymentType.md)
 - [EnumTaxComplianceStatusOutcome](docs/models/EnumTaxComplianceStatusOutcome.md)
 - [EnumTaxRetentionPaymentStatus](docs/models/EnumTaxRetentionPaymentStatus.md)
 - [EnumTaxRetentionReceiverNationality](docs/models/EnumTaxRetentionReceiverNationality.md)
 - [EnumTaxRetentionType](docs/models/EnumTaxRetentionType.md)
 - [EnumTransactionBillStatus](docs/models/EnumTransactionBillStatus.md)
 - [EnumTransactionCategory](docs/models/EnumTransactionCategory.md)
 - [EnumTransactionStatus](docs/models/EnumTransactionStatus.md)
 - [EnumTransactionSubcategory](docs/models/EnumTransactionSubcategory.md)
 - [EnumTransactionType](docs/models/EnumTransactionType.md)
 - [EquityStatementBusiness](docs/models/EquityStatementBusiness.md)
 - [EquityStatementIndividual](docs/models/EquityStatementIndividual.md)
 - [EyodIncomeVerificationBodyRequest](docs/models/EyodIncomeVerificationBodyRequest.md)
 - [EyodIncomeVerificationRequest](docs/models/EyodIncomeVerificationRequest.md)
 - [GrossIncomeIndividual](docs/models/GrossIncomeIndividual.md)
 - [HolderBankAccountInformationPse](docs/models/HolderBankAccountInformationPse.md)
 - [HolderBankAccountPse](docs/models/HolderBankAccountPse.md)
 - [HolderBusinessPse](docs/models/HolderBusinessPse.md)
 - [HolderBusinessResponsePse](docs/models/HolderBusinessResponsePse.md)
 - [HolderInformationBusinessOfpi](docs/models/HolderInformationBusinessOfpi.md)
 - [HolderInformationBusinessOfpiResponse](docs/models/HolderInformationBusinessOfpiResponse.md)
 - [HolderInformationBusinessPse](docs/models/HolderInformationBusinessPse.md)
 - [HolderInformationBusinessPseResponse](docs/models/HolderInformationBusinessPseResponse.md)
 - [HolderInformationIndividualOfpi](docs/models/HolderInformationIndividualOfpi.md)
 - [HolderInformationIndividualOfpiResponse](docs/models/HolderInformationIndividualOfpiResponse.md)
 - [HolderResponseOfpi](docs/models/HolderResponseOfpi.md)
 - [Income](docs/models/Income.md)
 - [IncomeStreamsBody](docs/models/IncomeStreamsBody.md)
 - [IncomeVerificationVerify400Response](docs/models/IncomeVerificationVerify400Response.md)
 - [IncomeVerificationVerify401Response](docs/models/IncomeVerificationVerify401Response.md)
 - [IncomeVerificationVerify403Response](docs/models/IncomeVerificationVerify403Response.md)
 - [IncomeVerificationVerify500Response](docs/models/IncomeVerificationVerify500Response.md)
 - [IncomeVerificationVerifyResponse](docs/models/IncomeVerificationVerifyResponse.md)
 - [IncomesCompleteRequest201Response](docs/models/IncomesCompleteRequest201Response.md)
 - [IncomesCompleteRequest400Response](docs/models/IncomesCompleteRequest400Response.md)
 - [IncomesCompleteRequest401Response](docs/models/IncomesCompleteRequest401Response.md)
 - [IncomesCompleteRequest408Response](docs/models/IncomesCompleteRequest408Response.md)
 - [IncomesCompleteRequest428Response](docs/models/IncomesCompleteRequest428Response.md)
 - [IncomesCompleteRequest500Response](docs/models/IncomesCompleteRequest500Response.md)
 - [IncomesCompleteRequestResponse](docs/models/IncomesCompleteRequestResponse.md)
 - [IncomesDelete404Response](docs/models/IncomesDelete404Response.md)
 - [IncomesDeleteResponse](docs/models/IncomesDeleteResponse.md)
 - [IncomesGetDetails401Response](docs/models/IncomesGetDetails401Response.md)
 - [IncomesGetDetails404Response](docs/models/IncomesGetDetails404Response.md)
 - [IncomesGetDetailsResponse](docs/models/IncomesGetDetailsResponse.md)
 - [IncomesListResponse](docs/models/IncomesListResponse.md)
 - [IncomesPaginatedResponse](docs/models/IncomesPaginatedResponse.md)
 - [IncomesRequest](docs/models/IncomesRequest.md)
 - [IncomesRetrieve401Response](docs/models/IncomesRetrieve401Response.md)
 - [IncomesRetrieve408Response](docs/models/IncomesRetrieve408Response.md)
 - [IncomesRetrieve428Response](docs/models/IncomesRetrieve428Response.md)
 - [IncomesRetrieve500Response](docs/models/IncomesRetrieve500Response.md)
 - [IncomesRetrieveResponse](docs/models/IncomesRetrieveResponse.md)
 - [Institution](docs/models/Institution.md)
 - [InstitutionAccount](docs/models/InstitutionAccount.md)
 - [InstitutionDownError](docs/models/InstitutionDownError.md)
 - [InstitutionFormField](docs/models/InstitutionFormField.md)
 - [InstitutionInactiveError](docs/models/InstitutionInactiveError.md)
 - [InstitutionUnavailableError](docs/models/InstitutionUnavailableError.md)
 - [InstitutionsFeature](docs/models/InstitutionsFeature.md)
 - [InstitutionsFormField](docs/models/InstitutionsFormField.md)
 - [InstitutionsFormFieldValues](docs/models/InstitutionsFormFieldValues.md)
 - [InstitutionsGetDetails404Response](docs/models/InstitutionsGetDetails404Response.md)
 - [InstitutionsGetDetailsResponse](docs/models/InstitutionsGetDetailsResponse.md)
 - [InstitutionsListResponse](docs/models/InstitutionsListResponse.md)
 - [InstitutionsPaginatedResponse](docs/models/InstitutionsPaginatedResponse.md)
 - [InvalidAccessMode](docs/models/InvalidAccessMode.md)
 - [InvalidLinkError](docs/models/InvalidLinkError.md)
 - [InvalidPeriodError](docs/models/InvalidPeriodError.md)
 - [InvestmentPortfoliosCompleteRequest401Response](docs/models/InvestmentPortfoliosCompleteRequest401Response.md)
 - [InvestmentPortfoliosCompleteRequest428Response](docs/models/InvestmentPortfoliosCompleteRequest428Response.md)
 - [InvestmentPortfoliosCompleteRequest500Response](docs/models/InvestmentPortfoliosCompleteRequest500Response.md)
 - [InvestmentPortfoliosCompleteRequestResponse](docs/models/InvestmentPortfoliosCompleteRequestResponse.md)
 - [InvestmentPortfoliosDelete404Response](docs/models/InvestmentPortfoliosDelete404Response.md)
 - [InvestmentPortfoliosDeleteResponse](docs/models/InvestmentPortfoliosDeleteResponse.md)
 - [InvestmentPortfoliosGetDetails404Response](docs/models/InvestmentPortfoliosGetDetails404Response.md)
 - [InvestmentPortfoliosGetDetailsResponse](docs/models/InvestmentPortfoliosGetDetailsResponse.md)
 - [InvestmentPortfoliosListResponse](docs/models/InvestmentPortfoliosListResponse.md)
 - [InvestmentPortfoliosRetrieve401Response](docs/models/InvestmentPortfoliosRetrieve401Response.md)
 - [InvestmentPortfoliosRetrieve428Response](docs/models/InvestmentPortfoliosRetrieve428Response.md)
 - [InvestmentPortfoliosRetrieve500Response](docs/models/InvestmentPortfoliosRetrieve500Response.md)
 - [InvestmentPortfoliosRetrieveResponse](docs/models/InvestmentPortfoliosRetrieveResponse.md)
 - [InvestmentsPortfolio](docs/models/InvestmentsPortfolio.md)
 - [InvestmentsPortfolioInstrument](docs/models/InvestmentsPortfolioInstrument.md)
 - [InvestmentsPortfolioInstrumentFees](docs/models/InvestmentsPortfolioInstrumentFees.md)
 - [InvestmentsPortfolioInstrumentInterestRate](docs/models/InvestmentsPortfolioInstrumentInterestRate.md)
 - [InvestmentsPortfolioInstrumentPublicId](docs/models/InvestmentsPortfolioInstrumentPublicId.md)
 - [InvestmentsPortfolioInstrumentRedemptionConditions](docs/models/InvestmentsPortfolioInstrumentRedemptionConditions.md)
 - [InvestmentsPortfoliosPaginatedResponse](docs/models/InvestmentsPortfoliosPaginatedResponse.md)
 - [InvoiceDetailDian](docs/models/InvoiceDetailDian.md)
 - [InvoiceDetailRetainedTaxSat](docs/models/InvoiceDetailRetainedTaxSat.md)
 - [InvoiceDetailSat](docs/models/InvoiceDetailSat.md)
 - [InvoiceDian](docs/models/InvoiceDian.md)
 - [InvoiceSenderDetailsDian](docs/models/InvoiceSenderDetailsDian.md)
 - [InvoiceWarningsDian](docs/models/InvoiceWarningsDian.md)
 - [InvoiceWarningsSat](docs/models/InvoiceWarningsSat.md)
 - [InvoiceWithIdSat](docs/models/InvoiceWithIdSat.md)
 - [InvoicesCompleteRequest201Response](docs/models/InvoicesCompleteRequest201Response.md)
 - [InvoicesCompleteRequest400Response](docs/models/InvoicesCompleteRequest400Response.md)
 - [InvoicesCompleteRequest401Response](docs/models/InvoicesCompleteRequest401Response.md)
 - [InvoicesCompleteRequest408Response](docs/models/InvoicesCompleteRequest408Response.md)
 - [InvoicesCompleteRequest428Response](docs/models/InvoicesCompleteRequest428Response.md)
 - [InvoicesCompleteRequest500Response](docs/models/InvoicesCompleteRequest500Response.md)
 - [InvoicesCompleteRequestResponse](docs/models/InvoicesCompleteRequestResponse.md)
 - [InvoicesDelete404Response](docs/models/InvoicesDelete404Response.md)
 - [InvoicesDeleteResponse](docs/models/InvoicesDeleteResponse.md)
 - [InvoicesGetDetails401Response](docs/models/InvoicesGetDetails401Response.md)
 - [InvoicesGetDetails404Response](docs/models/InvoicesGetDetails404Response.md)
 - [InvoicesGetDetailsResponse](docs/models/InvoicesGetDetailsResponse.md)
 - [InvoicesListResponse](docs/models/InvoicesListResponse.md)
 - [InvoicesPaymentsDian](docs/models/InvoicesPaymentsDian.md)
 - [InvoicesPaymentsRelatedDocumentsDian](docs/models/InvoicesPaymentsRelatedDocumentsDian.md)
 - [InvoicesPaymentsRelatedDocumentsSat](docs/models/InvoicesPaymentsRelatedDocumentsSat.md)
 - [InvoicesPaymentsSat](docs/models/InvoicesPaymentsSat.md)
 - [InvoicesPayrollDian](docs/models/InvoicesPayrollDian.md)
 - [InvoicesPayrollSat](docs/models/InvoicesPayrollSat.md)
 - [InvoicesReceiverDetailsDian](docs/models/InvoicesReceiverDetailsDian.md)
 - [InvoicesRequest](docs/models/InvoicesRequest.md)
 - [InvoicesResponsePaginatedResponse](docs/models/InvoicesResponsePaginatedResponse.md)
 - [InvoicesRetrieve201Response](docs/models/InvoicesRetrieve201Response.md)
 - [InvoicesRetrieve400Response](docs/models/InvoicesRetrieve400Response.md)
 - [InvoicesRetrieve401Response](docs/models/InvoicesRetrieve401Response.md)
 - [InvoicesRetrieve408Response](docs/models/InvoicesRetrieve408Response.md)
 - [InvoicesRetrieve500Response](docs/models/InvoicesRetrieve500Response.md)
 - [InvoicesRetrieveResponse](docs/models/InvoicesRetrieveResponse.md)
 - [LastErrorInvalidCredentials](docs/models/LastErrorInvalidCredentials.md)
 - [LastErrorInvalidToken](docs/models/LastErrorInvalidToken.md)
 - [LastErrorLoginError](docs/models/LastErrorLoginError.md)
 - [LastErrorPaymentError](docs/models/LastErrorPaymentError.md)
 - [LastErrorSessionExpired](docs/models/LastErrorSessionExpired.md)
 - [LastErrorTwoFactor](docs/models/LastErrorTwoFactor.md)
 - [Link](docs/models/Link.md)
 - [LinksChangeAccessMode401Response](docs/models/LinksChangeAccessMode401Response.md)
 - [LinksChangeAccessMode404Response](docs/models/LinksChangeAccessMode404Response.md)
 - [LinksChangeAccessMode428Response](docs/models/LinksChangeAccessMode428Response.md)
 - [LinksChangeAccessMode500Response](docs/models/LinksChangeAccessMode500Response.md)
 - [LinksChangeAccessModeResponse](docs/models/LinksChangeAccessModeResponse.md)
 - [LinksCompleteRequest401Response](docs/models/LinksCompleteRequest401Response.md)
 - [LinksCompleteRequest428Response](docs/models/LinksCompleteRequest428Response.md)
 - [LinksCompleteRequest500Response](docs/models/LinksCompleteRequest500Response.md)
 - [LinksCompleteRequestResponse](docs/models/LinksCompleteRequestResponse.md)
 - [LinksDestroy404Response](docs/models/LinksDestroy404Response.md)
 - [LinksDestroyResponse](docs/models/LinksDestroyResponse.md)
 - [LinksGetDetails404Response](docs/models/LinksGetDetails404Response.md)
 - [LinksGetDetailsResponse](docs/models/LinksGetDetailsResponse.md)
 - [LinksListResponse](docs/models/LinksListResponse.md)
 - [LinksPutRequest](docs/models/LinksPutRequest.md)
 - [LinksRegister401Response](docs/models/LinksRegister401Response.md)
 - [LinksRegister428Response](docs/models/LinksRegister428Response.md)
 - [LinksRegister500Response](docs/models/LinksRegister500Response.md)
 - [LinksRegisterResponse](docs/models/LinksRegisterResponse.md)
 - [LinksRequest](docs/models/LinksRequest.md)
 - [LinksUpdate401Response](docs/models/LinksUpdate401Response.md)
 - [LinksUpdate404Response](docs/models/LinksUpdate404Response.md)
 - [LinksUpdate428Response](docs/models/LinksUpdate428Response.md)
 - [LinksUpdate500Response](docs/models/LinksUpdate500Response.md)
 - [LinksUpdateResponse](docs/models/LinksUpdateResponse.md)
 - [Model400ValidationError](docs/models/Model400ValidationError.md)
 - [Model401UnauthorizedError](docs/models/Model401UnauthorizedError.md)
 - [Model404NotFoundError](docs/models/Model404NotFoundError.md)
 - [Model408RequestTimeoutError](docs/models/Model408RequestTimeoutError.md)
 - [Model500UnexpectedError](docs/models/Model500UnexpectedError.md)
 - [NeedsRedirectContent](docs/models/NeedsRedirectContent.md)
 - [NeedsRedirectContentPse](docs/models/NeedsRedirectContentPse.md)
 - [NetIncomeIndividual](docs/models/NetIncomeIndividual.md)
 - [NextStepDisplayConfirmationRequiredOfpi](docs/models/NextStepDisplayConfirmationRequiredOfpi.md)
 - [NextStepDisplayConfirmationRequiredPse](docs/models/NextStepDisplayConfirmationRequiredPse.md)
 - [NextStepDisplayCredentialsRequiredPse](docs/models/NextStepDisplayCredentialsRequiredPse.md)
 - [NextStepDisplayCustomerBankAccountsPse](docs/models/NextStepDisplayCustomerBankAccountsPse.md)
 - [NextStepDisplayNeedsRedirectPse](docs/models/NextStepDisplayNeedsRedirectPse.md)
 - [NextStepDisplayPaymentFailed](docs/models/NextStepDisplayPaymentFailed.md)
 - [NextStepDisplayPaymentMethodInformation](docs/models/NextStepDisplayPaymentMethodInformation.md)
 - [NextStepDisplayPaymentMethodInformationPse](docs/models/NextStepDisplayPaymentMethodInformationPse.md)
 - [NextStepDisplayPaymentProcessing](docs/models/NextStepDisplayPaymentProcessing.md)
 - [NextStepDisplayPaymentSucceeded](docs/models/NextStepDisplayPaymentSucceeded.md)
 - [NextStepDisplayTokenRequiredPse](docs/models/NextStepDisplayTokenRequiredPse.md)
 - [NextStepNeedsRedirect](docs/models/NextStepNeedsRedirect.md)
 - [NonTaxableIncomeIndividual](docs/models/NonTaxableIncomeIndividual.md)
 - [NotFoundError](docs/models/NotFoundError.md)
 - [Owner](docs/models/Owner.md)
 - [OwnerDocumentId](docs/models/OwnerDocumentId.md)
 - [OwnersCompleteRequest201Response](docs/models/OwnersCompleteRequest201Response.md)
 - [OwnersCompleteRequest400Response](docs/models/OwnersCompleteRequest400Response.md)
 - [OwnersCompleteRequest401Response](docs/models/OwnersCompleteRequest401Response.md)
 - [OwnersCompleteRequest408Response](docs/models/OwnersCompleteRequest408Response.md)
 - [OwnersCompleteRequest428Response](docs/models/OwnersCompleteRequest428Response.md)
 - [OwnersCompleteRequest500Response](docs/models/OwnersCompleteRequest500Response.md)
 - [OwnersCompleteRequestResponse](docs/models/OwnersCompleteRequestResponse.md)
 - [OwnersDelete404Response](docs/models/OwnersDelete404Response.md)
 - [OwnersDeleteResponse](docs/models/OwnersDeleteResponse.md)
 - [OwnersGetDetails404Response](docs/models/OwnersGetDetails404Response.md)
 - [OwnersGetDetailsResponse](docs/models/OwnersGetDetailsResponse.md)
 - [OwnersListResponse](docs/models/OwnersListResponse.md)
 - [OwnersPaginatedResponse](docs/models/OwnersPaginatedResponse.md)
 - [OwnersRetrieve201Response](docs/models/OwnersRetrieve201Response.md)
 - [OwnersRetrieve400Response](docs/models/OwnersRetrieve400Response.md)
 - [OwnersRetrieve401Response](docs/models/OwnersRetrieve401Response.md)
 - [OwnersRetrieve408Response](docs/models/OwnersRetrieve408Response.md)
 - [OwnersRetrieve428Response](docs/models/OwnersRetrieve428Response.md)
 - [OwnersRetrieve500Response](docs/models/OwnersRetrieve500Response.md)
 - [OwnersRetrieveResponse](docs/models/OwnersRetrieveResponse.md)
 - [PaginatedResponseLink](docs/models/PaginatedResponseLink.md)
 - [PatchBody](docs/models/PatchBody.md)
 - [PatchBodyWithoutSaveData](docs/models/PatchBodyWithoutSaveData.md)
 - [PatchPaymentIntentPse](docs/models/PatchPaymentIntentPse.md)
 - [PatchPaymentIntentsBodyPse](docs/models/PatchPaymentIntentsBodyPse.md)
 - [PatchPaymentMethodDetailsPse](docs/models/PatchPaymentMethodDetailsPse.md)
 - [PaymentInstitution](docs/models/PaymentInstitution.md)
 - [PaymentInstitutionsGetDetails404Response](docs/models/PaymentInstitutionsGetDetails404Response.md)
 - [PaymentInstitutionsGetDetailsResponse](docs/models/PaymentInstitutionsGetDetailsResponse.md)
 - [PaymentInstitutionsListResponse](docs/models/PaymentInstitutionsListResponse.md)
 - [PaymentIntentOfpi](docs/models/PaymentIntentOfpi.md)
 - [PaymentIntentPaginatedResponse](docs/models/PaymentIntentPaginatedResponse.md)
 - [PaymentIntentPaymentMethodDetailsBodyBusinessOfpi](docs/models/PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.md)
 - [PaymentIntentPaymentMethodDetailsBodyIndividualOfpi](docs/models/PaymentIntentPaymentMethodDetailsBodyIndividualOfpi.md)
 - [PaymentIntentPaymentMethodDetailsBodyPse](docs/models/PaymentIntentPaymentMethodDetailsBodyPse.md)
 - [PaymentIntentPaymentMethodDetailsBusinessOfpi](docs/models/PaymentIntentPaymentMethodDetailsBusinessOfpi.md)
 - [PaymentIntentPaymentMethodDetailsIndividualOfpi](docs/models/PaymentIntentPaymentMethodDetailsIndividualOfpi.md)
 - [PaymentIntentPaymentMethodDetailsPse](docs/models/PaymentIntentPaymentMethodDetailsPse.md)
 - [PaymentIntentPse](docs/models/PaymentIntentPse.md)
 - [PaymentIntentsComplete400Response](docs/models/PaymentIntentsComplete400Response.md)
 - [PaymentIntentsComplete404Response](docs/models/PaymentIntentsComplete404Response.md)
 - [PaymentIntentsCompleteResponse](docs/models/PaymentIntentsCompleteResponse.md)
 - [PaymentIntentsCreate400Response](docs/models/PaymentIntentsCreate400Response.md)
 - [PaymentIntentsCreate401Response](docs/models/PaymentIntentsCreate401Response.md)
 - [PaymentIntentsCreate408Response](docs/models/PaymentIntentsCreate408Response.md)
 - [PaymentIntentsCreate500Response](docs/models/PaymentIntentsCreate500Response.md)
 - [PaymentIntentsCreateRequest](docs/models/PaymentIntentsCreateRequest.md)
 - [PaymentIntentsCreateResponse](docs/models/PaymentIntentsCreateResponse.md)
 - [PaymentIntentsGetDetails401Response](docs/models/PaymentIntentsGetDetails401Response.md)
 - [PaymentIntentsGetDetails404Response](docs/models/PaymentIntentsGetDetails404Response.md)
 - [PaymentIntentsGetDetailsResponse](docs/models/PaymentIntentsGetDetailsResponse.md)
 - [PaymentIntentsListResponse](docs/models/PaymentIntentsListResponse.md)
 - [PaymentIntentsPaymentMethodDetailsBodyPse](docs/models/PaymentIntentsPaymentMethodDetailsBodyPse.md)
 - [PaymentIntentsPaymentMethodDetailsPse](docs/models/PaymentIntentsPaymentMethodDetailsPse.md)
 - [PaymentLinkCallbackUrls](docs/models/PaymentLinkCallbackUrls.md)
 - [PaymentLinkCallbackUrlsResponse](docs/models/PaymentLinkCallbackUrlsResponse.md)
 - [PaymentLinkListOfpi](docs/models/PaymentLinkListOfpi.md)
 - [PaymentLinkListPse](docs/models/PaymentLinkListPse.md)
 - [PaymentLinkOfpi](docs/models/PaymentLinkOfpi.md)
 - [PaymentLinkPaginatedResponse](docs/models/PaymentLinkPaginatedResponse.md)
 - [PaymentLinkPse](docs/models/PaymentLinkPse.md)
 - [PaymentLinksCreate400Response](docs/models/PaymentLinksCreate400Response.md)
 - [PaymentLinksCreate401Response](docs/models/PaymentLinksCreate401Response.md)
 - [PaymentLinksCreate408Response](docs/models/PaymentLinksCreate408Response.md)
 - [PaymentLinksCreate500Response](docs/models/PaymentLinksCreate500Response.md)
 - [PaymentLinksCreateRequest](docs/models/PaymentLinksCreateRequest.md)
 - [PaymentLinksCreateResponse](docs/models/PaymentLinksCreateResponse.md)
 - [PaymentLinksGetDetails401Response](docs/models/PaymentLinksGetDetails401Response.md)
 - [PaymentLinksGetDetails404Response](docs/models/PaymentLinksGetDetails404Response.md)
 - [PaymentLinksGetDetailsResponse](docs/models/PaymentLinksGetDetailsResponse.md)
 - [PaymentLinksListResponse](docs/models/PaymentLinksListResponse.md)
 - [PaymentLinksPaymentMethodDetailsBodyOfpi](docs/models/PaymentLinksPaymentMethodDetailsBodyOfpi.md)
 - [PaymentLinksPaymentMethodDetailsBodyPse](docs/models/PaymentLinksPaymentMethodDetailsBodyPse.md)
 - [PaymentMethodDetailsOfpi](docs/models/PaymentMethodDetailsOfpi.md)
 - [PaymentMethodDetailsPse](docs/models/PaymentMethodDetailsPse.md)
 - [PaymentMethodInfoCustomerBankAccountsPse](docs/models/PaymentMethodInfoCustomerBankAccountsPse.md)
 - [PaymentMethodInformationBodyOfpi](docs/models/PaymentMethodInformationBodyOfpi.md)
 - [PaymentMethodInformationBodyPse](docs/models/PaymentMethodInformationBodyPse.md)
 - [PaymentMethodInformationDetailsPse](docs/models/PaymentMethodInformationDetailsPse.md)
 - [PaymentMethodInformationOfpi](docs/models/PaymentMethodInformationOfpi.md)
 - [PaymentMethodInformationPse](docs/models/PaymentMethodInformationPse.md)
 - [PaymentTransaction](docs/models/PaymentTransaction.md)
 - [PaymentTransactionsGetDetails404Response](docs/models/PaymentTransactionsGetDetails404Response.md)
 - [PaymentTransactionsGetDetailsResponse](docs/models/PaymentTransactionsGetDetailsResponse.md)
 - [PaymentTransactionsListResponse](docs/models/PaymentTransactionsListResponse.md)
 - [PaymentsInstitutionsPaginatedResponse](docs/models/PaymentsInstitutionsPaginatedResponse.md)
 - [PaymentsRequestApiKeysResponse](docs/models/PaymentsRequestApiKeysResponse.md)
 - [PaymentsTransactionsPaginatedResponse](docs/models/PaymentsTransactionsPaginatedResponse.md)
 - [PaymentsWay](docs/models/PaymentsWay.md)
 - [PensionIncomeStatementIndividual](docs/models/PensionIncomeStatementIndividual.md)
 - [ProvidersPse](docs/models/ProvidersPse.md)
 - [ReceivableTransactionRequest](docs/models/ReceivableTransactionRequest.md)
 - [ReceivableTransactionsDelete404Response](docs/models/ReceivableTransactionsDelete404Response.md)
 - [ReceivableTransactionsDeleteResponse](docs/models/ReceivableTransactionsDeleteResponse.md)
 - [ReceivableTransactionsGetDetailsResponse](docs/models/ReceivableTransactionsGetDetailsResponse.md)
 - [ReceivableTransactionsListResponse](docs/models/ReceivableTransactionsListResponse.md)
 - [ReceivableTransactionsRetrieve401Response](docs/models/ReceivableTransactionsRetrieve401Response.md)
 - [ReceivableTransactionsRetrieve428Response](docs/models/ReceivableTransactionsRetrieve428Response.md)
 - [ReceivableTransactionsRetrieve500Response](docs/models/ReceivableTransactionsRetrieve500Response.md)
 - [ReceivableTransactionsRetrieveResponse](docs/models/ReceivableTransactionsRetrieveResponse.md)
 - [ReceivablesTransaction](docs/models/ReceivablesTransaction.md)
 - [ReceivablesTransactionAccount](docs/models/ReceivablesTransactionAccount.md)
 - [ReceivablesTransactionNumberOfInstallments](docs/models/ReceivablesTransactionNumberOfInstallments.md)
 - [ReceivablesTransactionsPaginatedResponse](docs/models/ReceivablesTransactionsPaginatedResponse.md)
 - [RecevablesTransactionFees](docs/models/RecevablesTransactionFees.md)
 - [RecurringExpenseSourceTransaction](docs/models/RecurringExpenseSourceTransaction.md)
 - [RecurringExpenses](docs/models/RecurringExpenses.md)
 - [RecurringExpensesCompleteRequest201Response](docs/models/RecurringExpensesCompleteRequest201Response.md)
 - [RecurringExpensesCompleteRequest400Response](docs/models/RecurringExpensesCompleteRequest400Response.md)
 - [RecurringExpensesCompleteRequest401Response](docs/models/RecurringExpensesCompleteRequest401Response.md)
 - [RecurringExpensesCompleteRequest408Response](docs/models/RecurringExpensesCompleteRequest408Response.md)
 - [RecurringExpensesCompleteRequest428Response](docs/models/RecurringExpensesCompleteRequest428Response.md)
 - [RecurringExpensesCompleteRequest500Response](docs/models/RecurringExpensesCompleteRequest500Response.md)
 - [RecurringExpensesCompleteRequestResponse](docs/models/RecurringExpensesCompleteRequestResponse.md)
 - [RecurringExpensesDelete404Response](docs/models/RecurringExpensesDelete404Response.md)
 - [RecurringExpensesDeleteResponse](docs/models/RecurringExpensesDeleteResponse.md)
 - [RecurringExpensesGetDetails401Response](docs/models/RecurringExpensesGetDetails401Response.md)
 - [RecurringExpensesGetDetails404Response](docs/models/RecurringExpensesGetDetails404Response.md)
 - [RecurringExpensesGetDetailsResponse](docs/models/RecurringExpensesGetDetailsResponse.md)
 - [RecurringExpensesListResponse](docs/models/RecurringExpensesListResponse.md)
 - [RecurringExpensesPaginatedResponse](docs/models/RecurringExpensesPaginatedResponse.md)
 - [RecurringExpensesRequest](docs/models/RecurringExpensesRequest.md)
 - [RecurringExpensesRetrieve201Response](docs/models/RecurringExpensesRetrieve201Response.md)
 - [RecurringExpensesRetrieve400Response](docs/models/RecurringExpensesRetrieve400Response.md)
 - [RecurringExpensesRetrieve401Response](docs/models/RecurringExpensesRetrieve401Response.md)
 - [RecurringExpensesRetrieve408Response](docs/models/RecurringExpensesRetrieve408Response.md)
 - [RecurringExpensesRetrieve428Response](docs/models/RecurringExpensesRetrieve428Response.md)
 - [RecurringExpensesRetrieve500Response](docs/models/RecurringExpensesRetrieve500Response.md)
 - [RecurringExpensesRetrieveResponse](docs/models/RecurringExpensesRetrieveResponse.md)
 - [ReportingId](docs/models/ReportingId.md)
 - [RequestTimeoutError](docs/models/RequestTimeoutError.md)
 - [RetentionBreakdown](docs/models/RetentionBreakdown.md)
 - [RiskInsights](docs/models/RiskInsights.md)
 - [RiskInsightsBalanceMetrics](docs/models/RiskInsightsBalanceMetrics.md)
 - [RiskInsightsCashflowMetrics](docs/models/RiskInsightsCashflowMetrics.md)
 - [RiskInsightsCompleteRequest201Response](docs/models/RiskInsightsCompleteRequest201Response.md)
 - [RiskInsightsCompleteRequest400Response](docs/models/RiskInsightsCompleteRequest400Response.md)
 - [RiskInsightsCompleteRequest401Response](docs/models/RiskInsightsCompleteRequest401Response.md)
 - [RiskInsightsCompleteRequest408Response](docs/models/RiskInsightsCompleteRequest408Response.md)
 - [RiskInsightsCompleteRequest428Response](docs/models/RiskInsightsCompleteRequest428Response.md)
 - [RiskInsightsCompleteRequest500Response](docs/models/RiskInsightsCompleteRequest500Response.md)
 - [RiskInsightsCompleteRequestResponse](docs/models/RiskInsightsCompleteRequestResponse.md)
 - [RiskInsightsCreditCardMetrics](docs/models/RiskInsightsCreditCardMetrics.md)
 - [RiskInsightsDelete404Response](docs/models/RiskInsightsDelete404Response.md)
 - [RiskInsightsDeleteResponse](docs/models/RiskInsightsDeleteResponse.md)
 - [RiskInsightsGetDetails401Response](docs/models/RiskInsightsGetDetails401Response.md)
 - [RiskInsightsGetDetails404Response](docs/models/RiskInsightsGetDetails404Response.md)
 - [RiskInsightsGetDetailsResponse](docs/models/RiskInsightsGetDetailsResponse.md)
 - [RiskInsightsListResponse](docs/models/RiskInsightsListResponse.md)
 - [RiskInsightsLoansMetrics](docs/models/RiskInsightsLoansMetrics.md)
 - [RiskInsightsPaginatedResponse](docs/models/RiskInsightsPaginatedResponse.md)
 - [RiskInsightsRetrieve201Response](docs/models/RiskInsightsRetrieve201Response.md)
 - [RiskInsightsRetrieve400Response](docs/models/RiskInsightsRetrieve400Response.md)
 - [RiskInsightsRetrieve401Response](docs/models/RiskInsightsRetrieve401Response.md)
 - [RiskInsightsRetrieve408Response](docs/models/RiskInsightsRetrieve408Response.md)
 - [RiskInsightsRetrieve428Response](docs/models/RiskInsightsRetrieve428Response.md)
 - [RiskInsightsRetrieve500Response](docs/models/RiskInsightsRetrieve500Response.md)
 - [RiskInsightsRetrieveResponse](docs/models/RiskInsightsRetrieveResponse.md)
 - [RiskInsightsTransactionMetrics](docs/models/RiskInsightsTransactionMetrics.md)
 - [SecretKeys](docs/models/SecretKeys.md)
 - [SecretKeysCreate400Response](docs/models/SecretKeysCreate400Response.md)
 - [SecretKeysCreate408Response](docs/models/SecretKeysCreate408Response.md)
 - [SecretKeysCreateResponse](docs/models/SecretKeysCreateResponse.md)
 - [SecretKeysListResponse](docs/models/SecretKeysListResponse.md)
 - [SecretKeysPaginatedResponse](docs/models/SecretKeysPaginatedResponse.md)
 - [SessionExpiredError](docs/models/SessionExpiredError.md)
 - [StandardRequest](docs/models/StandardRequest.md)
 - [TaxAssessmentBusiness](docs/models/TaxAssessmentBusiness.md)
 - [TaxAssessmentIndividual](docs/models/TaxAssessmentIndividual.md)
 - [TaxComplianceStatus](docs/models/TaxComplianceStatus.md)
 - [TaxComplianceStatusDelete404Response](docs/models/TaxComplianceStatusDelete404Response.md)
 - [TaxComplianceStatusDeleteResponse](docs/models/TaxComplianceStatusDeleteResponse.md)
 - [TaxComplianceStatusGetDetails404Response](docs/models/TaxComplianceStatusGetDetails404Response.md)
 - [TaxComplianceStatusGetDetailsResponse](docs/models/TaxComplianceStatusGetDetailsResponse.md)
 - [TaxComplianceStatusListResponse](docs/models/TaxComplianceStatusListResponse.md)
 - [TaxComplianceStatusPaginatedResponse](docs/models/TaxComplianceStatusPaginatedResponse.md)
 - [TaxComplianceStatusRequest](docs/models/TaxComplianceStatusRequest.md)
 - [TaxComplianceStatusRetrieve401Response](docs/models/TaxComplianceStatusRetrieve401Response.md)
 - [TaxComplianceStatusRetrieve408Response](docs/models/TaxComplianceStatusRetrieve408Response.md)
 - [TaxComplianceStatusRetrieve500Response](docs/models/TaxComplianceStatusRetrieve500Response.md)
 - [TaxComplianceStatusRetrieveResponse](docs/models/TaxComplianceStatusRetrieveResponse.md)
 - [TaxDeclarationBusiness](docs/models/TaxDeclarationBusiness.md)
 - [TaxDeclarationBusinessPaginated](docs/models/TaxDeclarationBusinessPaginated.md)
 - [TaxDeclarationIndividual](docs/models/TaxDeclarationIndividual.md)
 - [TaxDeclarationIndividualPaginated](docs/models/TaxDeclarationIndividualPaginated.md)
 - [TaxDeclarationsDelete404Response](docs/models/TaxDeclarationsDelete404Response.md)
 - [TaxDeclarationsDeleteResponse](docs/models/TaxDeclarationsDeleteResponse.md)
 - [TaxDeclarationsGetDetails401Response](docs/models/TaxDeclarationsGetDetails401Response.md)
 - [TaxDeclarationsGetDetails404Response](docs/models/TaxDeclarationsGetDetails404Response.md)
 - [TaxDeclarationsGetDetailsResponse](docs/models/TaxDeclarationsGetDetailsResponse.md)
 - [TaxDeclarationsList401Response](docs/models/TaxDeclarationsList401Response.md)
 - [TaxDeclarationsListResponse](docs/models/TaxDeclarationsListResponse.md)
 - [TaxDeclarationsRequest](docs/models/TaxDeclarationsRequest.md)
 - [TaxDeclarationsRetrieve201Response](docs/models/TaxDeclarationsRetrieve201Response.md)
 - [TaxDeclarationsRetrieve400Response](docs/models/TaxDeclarationsRetrieve400Response.md)
 - [TaxDeclarationsRetrieve401Response](docs/models/TaxDeclarationsRetrieve401Response.md)
 - [TaxDeclarationsRetrieve500Response](docs/models/TaxDeclarationsRetrieve500Response.md)
 - [TaxDeclarationsRetrieveResponse](docs/models/TaxDeclarationsRetrieveResponse.md)
 - [TaxPayerInformationBusiness](docs/models/TaxPayerInformationBusiness.md)
 - [TaxPayerInformationIndividual](docs/models/TaxPayerInformationIndividual.md)
 - [TaxRetentions](docs/models/TaxRetentions.md)
 - [TaxRetentionsDelete404Response](docs/models/TaxRetentionsDelete404Response.md)
 - [TaxRetentionsDeleteResponse](docs/models/TaxRetentionsDeleteResponse.md)
 - [TaxRetentionsGetDetails404Response](docs/models/TaxRetentionsGetDetails404Response.md)
 - [TaxRetentionsGetDetailsResponse](docs/models/TaxRetentionsGetDetailsResponse.md)
 - [TaxRetentionsListResponse](docs/models/TaxRetentionsListResponse.md)
 - [TaxRetentionsPaginatedResponse](docs/models/TaxRetentionsPaginatedResponse.md)
 - [TaxRetentionsRequest](docs/models/TaxRetentionsRequest.md)
 - [TaxRetentionsRetrieve201Response](docs/models/TaxRetentionsRetrieve201Response.md)
 - [TaxRetentionsRetrieve400Response](docs/models/TaxRetentionsRetrieve400Response.md)
 - [TaxRetentionsRetrieve401Response](docs/models/TaxRetentionsRetrieve401Response.md)
 - [TaxRetentionsRetrieve408Response](docs/models/TaxRetentionsRetrieve408Response.md)
 - [TaxRetentionsRetrieve500Response](docs/models/TaxRetentionsRetrieve500Response.md)
 - [TaxRetentionsRetrieveResponse](docs/models/TaxRetentionsRetrieveResponse.md)
 - [TaxReturnBusiness](docs/models/TaxReturnBusiness.md)
 - [TaxReturnBusinessMonthly](docs/models/TaxReturnBusinessMonthly.md)
 - [TaxReturnPersonal](docs/models/TaxReturnPersonal.md)
 - [TaxReturnPersonalMonthly](docs/models/TaxReturnPersonalMonthly.md)
 - [TaxReturnsBusinessMonthlyPaginated](docs/models/TaxReturnsBusinessMonthlyPaginated.md)
 - [TaxReturnsBusinessPaginated](docs/models/TaxReturnsBusinessPaginated.md)
 - [TaxReturnsDelete404Response](docs/models/TaxReturnsDelete404Response.md)
 - [TaxReturnsDeleteResponse](docs/models/TaxReturnsDeleteResponse.md)
 - [TaxReturnsGetDetails401Response](docs/models/TaxReturnsGetDetails401Response.md)
 - [TaxReturnsGetDetails404Response](docs/models/TaxReturnsGetDetails404Response.md)
 - [TaxReturnsGetDetailsResponse](docs/models/TaxReturnsGetDetailsResponse.md)
 - [TaxReturnsList401Response](docs/models/TaxReturnsList401Response.md)
 - [TaxReturnsListResponse](docs/models/TaxReturnsListResponse.md)
 - [TaxReturnsMonthlyRequest](docs/models/TaxReturnsMonthlyRequest.md)
 - [TaxReturnsPersonalMonthlyPaginated](docs/models/TaxReturnsPersonalMonthlyPaginated.md)
 - [TaxReturnsPersonalPaginated](docs/models/TaxReturnsPersonalPaginated.md)
 - [TaxReturnsRetrieve201Response](docs/models/TaxReturnsRetrieve201Response.md)
 - [TaxReturnsRetrieve400Response](docs/models/TaxReturnsRetrieve400Response.md)
 - [TaxReturnsRetrieve401Response](docs/models/TaxReturnsRetrieve401Response.md)
 - [TaxReturnsRetrieve500Response](docs/models/TaxReturnsRetrieve500Response.md)
 - [TaxReturnsRetrieveRequest](docs/models/TaxReturnsRetrieveRequest.md)
 - [TaxReturnsRetrieveResponse](docs/models/TaxReturnsRetrieveResponse.md)
 - [TaxReturnsYearlyRequest](docs/models/TaxReturnsYearlyRequest.md)
 - [TaxStatusAddressBetweenStreetDian](docs/models/TaxStatusAddressBetweenStreetDian.md)
 - [TaxStatusAddressBetweenStreetSat](docs/models/TaxStatusAddressBetweenStreetSat.md)
 - [TaxStatusAddressDian](docs/models/TaxStatusAddressDian.md)
 - [TaxStatusAddressSat](docs/models/TaxStatusAddressSat.md)
 - [TaxStatusDelete404Response](docs/models/TaxStatusDelete404Response.md)
 - [TaxStatusDeleteResponse](docs/models/TaxStatusDeleteResponse.md)
 - [TaxStatusDian](docs/models/TaxStatusDian.md)
 - [TaxStatusEconomicActivityDian](docs/models/TaxStatusEconomicActivityDian.md)
 - [TaxStatusEconomicActivitySat](docs/models/TaxStatusEconomicActivitySat.md)
 - [TaxStatusGetDetails401Response](docs/models/TaxStatusGetDetails401Response.md)
 - [TaxStatusGetDetails404Response](docs/models/TaxStatusGetDetails404Response.md)
 - [TaxStatusGetDetailsResponse](docs/models/TaxStatusGetDetailsResponse.md)
 - [TaxStatusListResponse](docs/models/TaxStatusListResponse.md)
 - [TaxStatusObligationsDian](docs/models/TaxStatusObligationsDian.md)
 - [TaxStatusObligationsSat](docs/models/TaxStatusObligationsSat.md)
 - [TaxStatusPaginatedResponse](docs/models/TaxStatusPaginatedResponse.md)
 - [TaxStatusRegimensDian](docs/models/TaxStatusRegimensDian.md)
 - [TaxStatusRegimensSat](docs/models/TaxStatusRegimensSat.md)
 - [TaxStatusRequest](docs/models/TaxStatusRequest.md)
 - [TaxStatusRetrieve201Response](docs/models/TaxStatusRetrieve201Response.md)
 - [TaxStatusRetrieve400Response](docs/models/TaxStatusRetrieve400Response.md)
 - [TaxStatusRetrieve401Response](docs/models/TaxStatusRetrieve401Response.md)
 - [TaxStatusRetrieve408Response](docs/models/TaxStatusRetrieve408Response.md)
 - [TaxStatusRetrieve500Response](docs/models/TaxStatusRetrieve500Response.md)
 - [TaxStatusRetrieveResponse](docs/models/TaxStatusRetrieveResponse.md)
 - [TaxStatusSat](docs/models/TaxStatusSat.md)
 - [TaxStatusTaxPayerInformationDian](docs/models/TaxStatusTaxPayerInformationDian.md)
 - [TaxStatusTaxPayerInformationSat](docs/models/TaxStatusTaxPayerInformationSat.md)
 - [TokenRequiredResponse](docs/models/TokenRequiredResponse.md)
 - [TokenRequiredResponseTokenGenerationData](docs/models/TokenRequiredResponseTokenGenerationData.md)
 - [TooManySessionsError](docs/models/TooManySessionsError.md)
 - [Transaction](docs/models/Transaction.md)
 - [TransactionBankAccountBodyPse](docs/models/TransactionBankAccountBodyPse.md)
 - [TransactionBankAccountPse](docs/models/TransactionBankAccountPse.md)
 - [TransactionCreditCardData](docs/models/TransactionCreditCardData.md)
 - [TransactionMerchantData](docs/models/TransactionMerchantData.md)
 - [TransactionsCompleteRequest201Response](docs/models/TransactionsCompleteRequest201Response.md)
 - [TransactionsCompleteRequest400Response](docs/models/TransactionsCompleteRequest400Response.md)
 - [TransactionsCompleteRequest401Response](docs/models/TransactionsCompleteRequest401Response.md)
 - [TransactionsCompleteRequest408Response](docs/models/TransactionsCompleteRequest408Response.md)
 - [TransactionsCompleteRequest428Response](docs/models/TransactionsCompleteRequest428Response.md)
 - [TransactionsCompleteRequest500Response](docs/models/TransactionsCompleteRequest500Response.md)
 - [TransactionsCompleteRequestResponse](docs/models/TransactionsCompleteRequestResponse.md)
 - [TransactionsDelete404Response](docs/models/TransactionsDelete404Response.md)
 - [TransactionsDeleteResponse](docs/models/TransactionsDeleteResponse.md)
 - [TransactionsGetDetails404Response](docs/models/TransactionsGetDetails404Response.md)
 - [TransactionsGetDetailsResponse](docs/models/TransactionsGetDetailsResponse.md)
 - [TransactionsListResponse](docs/models/TransactionsListResponse.md)
 - [TransactionsPaginatedResponse](docs/models/TransactionsPaginatedResponse.md)
 - [TransactionsRequest](docs/models/TransactionsRequest.md)
 - [TransactionsRetrieve201Response](docs/models/TransactionsRetrieve201Response.md)
 - [TransactionsRetrieve400Response](docs/models/TransactionsRetrieve400Response.md)
 - [TransactionsRetrieve401Response](docs/models/TransactionsRetrieve401Response.md)
 - [TransactionsRetrieve408Response](docs/models/TransactionsRetrieve408Response.md)
 - [TransactionsRetrieve428Response](docs/models/TransactionsRetrieve428Response.md)
 - [TransactionsRetrieve500Response](docs/models/TransactionsRetrieve500Response.md)
 - [TransactionsRetrieveResponse](docs/models/TransactionsRetrieveResponse.md)
 - [UnauthorizedError](docs/models/UnauthorizedError.md)
 - [UnconfirmedLinkError](docs/models/UnconfirmedLinkError.md)
 - [UnexpectedError](docs/models/UnexpectedError.md)
 - [UnsupportedOperationError](docs/models/UnsupportedOperationError.md)
 - [ValidationError](docs/models/ValidationError.md)


## Author
This Python package is automatically generated by [Konfig](https://konfigthis.com)
