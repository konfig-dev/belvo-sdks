# ReceivableTransactionsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](ReceivableTransactionsApi.md#delete) | **DELETE** /receivables/transactions/{id} | Delete a receivable transaction
[**getDetails**](ReceivableTransactionsApi.md#getDetails) | **GET** /receivables/transactions/{id} | Get a receivable transaction\&#39;s details
[**list**](ReceivableTransactionsApi.md#list) | **GET** /receivables/transactions | List all receivable transactions
[**retrieve**](ReceivableTransactionsApi.md#retrieve) | **POST** /receivables/transactions | Retrieve receivable transactions for a link


# **delete**

#### **DELETE** /receivables/transactions/{id}

### Description
Delete a specific receivable transaction from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.receivableTransactions.delete({
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

#### **GET** /receivables/transactions/{id}

### Description
Get the details of a specific receivable transaction.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.receivableTransactions.getDetails({
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

**ReceivablesTransaction**

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

#### **GET** /receivables/transactions

### Description
Get a paginated list of all the existing receivable transactions in your Belvo account. We return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.receivableTransactions.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  account: "d979df3a-5d0f-4cc9-9bd4-b75c28b45963",
  accountIn:
    "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509",
  createdAtGt: "2022-05-05",
  createdAtGte: "2022-05-04",
  createdAtLt: "2022-04-01",
  createdAtLte: "2022-03-30",
  createdAtRange: "2022-03-03,2022-05-04",
  linkIn:
    "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65",
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
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **pageSize** | [**number**] | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  | (optional) defaults to 100
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **link** | [**string**] | The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance.  | (optional) defaults to undefined
 **account** | [**string**] | The `account.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance.  | (optional) defaults to undefined
 **accountIn** | [**string**] | Return receivable transactions only for these `account.id`s. | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return receivable transactions that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return receivable transactions that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return receivable transactions that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return receivable transactions that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return receivable transactions that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **linkIn** | [**string**] | Return information for these `link.id`s. | (optional) defaults to undefined
 **valueDate** | [**string**] | Return receivable transactions for exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateGt** | [**string**] | Return receivable transactions for after this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateGte** | [**string**] | Return receivable transactions for this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateLt** | [**string**] | Return receivable transactions for before this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateLte** | [**string**] | Return receivable transactions for this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateRange** | [**string**] | Return receivable transactions for this date range (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined


### Return type

**ReceivablesTransactionsPaginatedResponse**

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

#### **POST** /receivables/transactions

### Description
Retrieve all receivable transactions for an existing link.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.receivableTransactions.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "2ccd5e15-194a-4a19-a45a-e7223c7e6717",
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
 **receivableTransactionRequest** | **ReceivableTransactionRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**ReceivablesTransaction**

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
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


