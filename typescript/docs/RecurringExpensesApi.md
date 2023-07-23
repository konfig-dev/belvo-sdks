# RecurringExpensesApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeRequest**](RecurringExpensesApi.md#completeRequest) | **PATCH** /api/recurring-expenses | Complete a recurring expenses request
[**delete**](RecurringExpensesApi.md#delete) | **DELETE** /api/recurring-expenses/{id} | Delete a recurring expense
[**getDetails**](RecurringExpensesApi.md#getDetails) | **GET** /api/recurring-expenses/{id} | Get a recurring expense\&#39;s details
[**list**](RecurringExpensesApi.md#list) | **GET** /api/recurring-expenses | List all recurring expenses
[**retrieve**](RecurringExpensesApi.md#retrieve) | **POST** /api/recurring-expenses | Retrieve recurring expenses for a link


# **completeRequest**

#### **PATCH** /api/recurring-expenses

### Description
Used to resume an Recurring Expenses retrieve session that was paused because an MFA token was required by the institution.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse = await belvo.recurringExpenses.completeRequest({
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

**Array<RecurringExpenses>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when save_data&#x3D;false) |  -  |
**201** | Created (when save_data&#x3D;true) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **delete**

#### **DELETE** /api/recurring-expenses/{id}

### Description
Delete a specific recurring expense from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.recurringExpenses.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `recurring-expenses.id` that you want to delete | defaults to undefined


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

#### **GET** /api/recurring-expenses/{id}

### Description
Get the details of a specific recurring expense.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.recurringExpenses.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `recurring-expenses.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<RecurringExpenses>**

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

#### **GET** /api/recurring-expenses

### Description
Get a paginated list of all recurring expenses in your Belvo account. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.recurringExpenses.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  account: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  accountIn:
    "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,d3d941ab-4ca5-43c1-8b23-db329ee4cb7e",
  id: "eb42c21c-2d9e-4dc1-89b8-9401d4beca73",
  idIn: "eb42c21c-2d9e-4dc1-89b8-9401d4beca73,82b3f18c-055b-4f82-9fae-d2201815ab0c",
  linkIn:
    "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65",
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
 **accountIn** | [**string**] | Return recurring expenses for these `accound.id`s. | (optional) defaults to undefined
 **id** | [**string**] | Return information for this `recurring-expense.id`. | (optional) defaults to undefined
 **idIn** | [**string**] | Return information for these `recurring-expense.id`s. | (optional) defaults to undefined
 **linkIn** | [**string**] | Return information for these `link.id`s. | (optional) defaults to undefined


### Return type

**RecurringExpensesPaginatedResponse**

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

#### **POST** /api/recurring-expenses

### Description
Retrieve recurring expense insights for <b>checking and savings accounts</b> from a specific link. You can receive insights for a period of up to 365 days, depending on the transaction history available for each [bank](https://developers.belvo.com/docs/institution).

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.recurringExpenses.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "2ccd5e15-194a-4a19-a45a-e7223c7e6717",
  token: "1234ab",
  save_data: true,
  date_from: "2022-08-01",
  date_to: "2022-12-30",
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringExpensesRequest** | **RecurringExpensesRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<RecurringExpenses>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when save_data&#x3D;false) |  -  |
**201** | Created (when save_data&#x3D;true) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


