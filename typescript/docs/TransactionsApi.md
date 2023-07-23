# TransactionsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeRequest**](TransactionsApi.md#completeRequest) | **PATCH** /api/transactions | Complete a transactions request
[**delete**](TransactionsApi.md#delete) | **DELETE** /api/transactions/{id} | Delete a transaction
[**getDetails**](TransactionsApi.md#getDetails) | **GET** /api/transactions/{id} | Get a transaction\&#39;s details
[**list**](TransactionsApi.md#list) | **GET** /api/transactions | List all transactions
[**retrieve**](TransactionsApi.md#retrieve) | **POST** /api/transactions | Retrieve transactions for a link


# **completeRequest**

#### **PATCH** /api/transactions

### Description
Used to resume a Transaction retrieve session that was paused because an MFA token was required by the institution.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse = await belvo.transactions.completeRequest({
  omit: "link,balance",
  fields: "link,balance,account",
  session: "6e7b283c6efa449c9c028a16b5c249fa",
  token: "1234ab",
  link: "683005d6-f45c-4adb-b289-f1a12f50f80c",
  save_data: true,
});

console.log(completeRequestResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchBody** | **PatchBody**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<Transaction>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
**201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **delete**

#### **DELETE** /api/transactions/{id}

### Description
Delete a specific transaction from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.transactions.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `transaction.id` that you want to delete. | defaults to undefined


### Return type

void (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No content |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDetails**

#### **GET** /api/transactions/{id}

### Description
Get the details of a specific transaction.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.transactions.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `transaction.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Transaction**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **list**

#### **GET** /api/transactions

### Description
Get a paginated list of all existing transactions in your Belvo account. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.transactions.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  account: "d979df3a-5d0f-4cc9-9bd4-b75c28b45963",
  accountBalanceAvailable: "4000.00",
  accountBalanceAvailableLt: "6000.00",
  accountBalanceAvailableLte: "5999.00",
  accountBalanceAvailableRange: "3000.00,4350.00",
  accountBalanceCurrent: "4000.00",
  accountBalanceCurrentGt: "4020.00",
  accountBalanceCurrentGte: "4019.00",
  accountBalanceCurrentLt: "3000.00",
  accountBalanceCurrentLte: "2999.00",
  accountBalanceCurrentRange: "2999.00,4000.00",
  accountIn:
    "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509",
  accountType: "Cuentas de efectivo",
  accountTypeIn: "Cuentas de efectivo,Depositos Ahorro",
  accountingDate: "2022-05-05",
  accountingDateGt: "2022-05-06",
  accountingDateGte: "2022-05-04",
  accountingDateLt: "2022-03-02",
  accountingDateLte: "2022-03-01",
  accountingDateRange: "2022-03-01,2022-05-06",
  amount: "1000.00",
  amountGt: "520.00",
  amountGte: "519.00",
  amountLt: "540.00",
  amountLte: "541.00",
  amountRange: "519.00,541.00",
  collectedAt: "2022-05-01",
  collectedAtGt: "2022-05-05",
  collectedAtGte: "2022-05-04",
  collectedAtLt: "2022-04-01",
  collectedAtLte: "2022-03-30",
  collectedAtRange: "2022-03-03,2022-05-04",
  createdAt: "2022-05-01",
  createdAtGt: "2022-05-05",
  createdAtGte: "2022-05-04",
  createdAtLt: "2022-04-01",
  createdAtLte: "2022-03-30",
  createdAtRange: "2022-03-03,2022-05-04",
  creditCardDataBillNameIn: "maio-2022,feb-2022",
  currency: "COP",
  currencyIn: "COP,MXN",
  reference: "085904452810319225",
  referenceIn: "085904452810319225,8703",
  status: "PENDING",
  statusIn: "PENDING,PROCESSED",
  type: "OUTFLOW",
  typeIn: "INFLOW,OUTFLOW",
  valueDate: "2022-05-05",
  valueDateGt: "2022-05-06",
  valueDateGte: "2022-05-04",
  valueDateLt: "2022-03-02",
  valueDateLte: "2022-03-01",
  valueDateRange: "2022-03-01,2022-05-06",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **link** | [**string**] | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `account.id` filter as well in order to improve your performance.  | defaults to undefined
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **pageSize** | [**number**] | Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  | (optional) defaults to 100
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **account** | [**string**] | The `account.id` you want to filter by.  ℹ️ We highly recommend adding the `account.id` filter in order to improve your performance.  | (optional) defaults to undefined
 **accountBalanceAvailable** | [**string**] | Return transactions that have a `account.balance.available` matching exactly this value. | (optional) defaults to undefined
 **accountBalanceAvailableLt** | [**string**] | Return transactions that have a `account.balance.available` less than this value. | (optional) defaults to undefined
 **accountBalanceAvailableLte** | [**string**] | Return transactions that have a `account.balance.available` less than or equal to this value. | (optional) defaults to undefined
 **accountBalanceAvailableRange** | [**string**] | Return transactions that have a `account.balance.available` within a range of two values. | (optional) defaults to undefined
 **accountBalanceCurrent** | [**string**] | Return transactions that have a `account.balance.current` matching exactly this value. | (optional) defaults to undefined
 **accountBalanceCurrentGt** | [**string**] | Return transactions that have a `account.balance.current` greater than this value. | (optional) defaults to undefined
 **accountBalanceCurrentGte** | [**string**] | Return transactions that have a `account.balance.current` greater than or equal to this value. | (optional) defaults to undefined
 **accountBalanceCurrentLt** | [**string**] | Return transactions that have a `account.balance.current` less than this value. | (optional) defaults to undefined
 **accountBalanceCurrentLte** | [**string**] | Return transactions that have a `account.balance.current` less than or equal to this value. | (optional) defaults to undefined
 **accountBalanceCurrentRange** | [**string**] | Return transactions that have a `account.balance.current` within a range of two values. | (optional) defaults to undefined
 **accountIn** | [**string**] | Return transactions only for these `account.id`s. | (optional) defaults to undefined
 **accountType** | [**string**] | Return information only for transactions matching this account type, as designated by the institution. | (optional) defaults to undefined
 **accountTypeIn** | [**string**] | Return information only for transactions matching these account types, as designated by the institution. | (optional) defaults to undefined
 **accountingDate** | [**string**] | Return transactions that were processed by the institution on exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **accountingDateGt** | [**string**] | Return transactions that were processed by the institution after this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **accountingDateGte** | [**string**] | Return transactions that were processed by the institution on this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **accountingDateLt** | [**string**] | Return transactions that were processed by the institution before this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **accountingDateLte** | [**string**] | Return transactions that were processed by the institution on this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **accountingDateRange** | [**string**] | Return transactions that were processed by the institution in this date range (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **amount** | [**string**] | Return transactions matching exactly this value. | (optional) defaults to undefined
 **amountGt** | [**string**] | Return transactions greater than this value. | (optional) defaults to undefined
 **amountGte** | [**string**] | Return transactions greater than or equal to this value. | (optional) defaults to undefined
 **amountLt** | [**string**] | Return transactions less than this value. | (optional) defaults to undefined
 **amountLte** | [**string**] | Return transactions less than or equal to this value. | (optional) defaults to undefined
 **amountRange** | [**string**] | Return transactions between these two values. | (optional) defaults to undefined
 **collectedAt** | [**string**] | Return transactions that were retrieved from the institution on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **collectedAtGt** | [**string**] | Return transactions that were retrieved from the institution after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **collectedAtGte** | [**string**] | Return transactions that were retrieved from the institution after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **collectedAtLt** | [**string**] | Return transactions that were retrieved from the institution before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **collectedAtLte** | [**string**] | Return transactions that were retrieved from the institution before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **collectedAtRange** | [**string**] | Return transactions that were retrieved from the institution between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAt** | [**string**] | Return transactions that were last updated in Belvo\'s database on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return transactions that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return transactions that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return transactions that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return transactions that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return transactions that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **creditCardDataBillNameIn** | [**string**] | Return transactions for one of these bill names. | (optional) defaults to undefined
 **currency** | [**string**] | Return transactions in only this three-letter currency code. | (optional) defaults to undefined
 **currencyIn** | [**string**] | Return transactions in one of these three-letter currency codes. | (optional) defaults to undefined
 **reference** | [**string**] | Returns transactions with this institution-assigned reference number. | (optional) defaults to undefined
 **referenceIn** | [**string**] | Returns transactions with these institution-assigned reference numbers. | (optional) defaults to undefined
 **status** | [**string**] | Return transactions with this status. Can be either `PENDING`, `PROCESSED`, or `UNCATEGORIZED`. | (optional) defaults to undefined
 **statusIn** | [**string**] | Return transactions with these statuses. Can be either `PENDING`, `PROCESSED`, or `UNCATEGORIZED`. | (optional) defaults to undefined
 **type** | [**string**] | Return transactions with this type. Can be either `INFLOW` or `OUTFLOW`. | (optional) defaults to undefined
 **typeIn** | [**string**] | Return transactions with this types. Can be either `INFLOW` or `OUTFLOW`. | (optional) defaults to undefined
 **valueDate** | [**string**] | Return transactions that occurred on exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateGt** | [**string**] | Return transactions that occurred after this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateGte** | [**string**] | Return transactions that occurred on this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateLt** | [**string**] | Return transactions that occurred before this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateLte** | [**string**] | Return transactions that occurred on this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateRange** | [**string**] | Return transactions for this date range (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined


### Return type

**TransactionsPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **retrieve**

#### **POST** /api/transactions

### Description
Retrieve transactions for one or more accounts from a specific link.
<div style="background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px"> <strong>Info: </strong> When retrieving transactions, it is important to understand that the available transaction data ranges depend on each institution. <br><br>
If you try to access older information than what we can access, we will return all the data we can read within that date range. For example, if you request transactions for the last year and we can only access the last six months, we will return the information corresponding to these six months of data. </div>


### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.transactions.retrieve({
  xBelvoRequestMode: "async",
  omit: "link,balance",
  fields: "link,balance,account",
  link: "2ccd5e15-194a-4a19-a45a-e7223c7e6717",
  account: "d4617561-1c01-4b2f-83b6-a594f7b3bc57",
  date_from: "2020-08-05",
  date_to: "2020-10-05",
  token: "1234ab",
  save_data: true,
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionsRequest** | **TransactionsRequest**|  |
 **xBelvoRequestMode** | 'async' |  | (optional) defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<Transaction>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
**201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |
**202** | Accepted (when &#x60;X-Belvo-Request-Mode&#x60; is &#x60;async&#x60;) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


