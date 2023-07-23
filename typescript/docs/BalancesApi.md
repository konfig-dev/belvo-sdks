# BalancesApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeRequest**](BalancesApi.md#completeRequest) | **PATCH** /api/balances | Complete a balances request
[**delete**](BalancesApi.md#delete) | **DELETE** /api/balances/{id} | Delete a balance
[**getDetails**](BalancesApi.md#getDetails) | **GET** /api/balances/{id} | Get a balance\&#39;s details
[**list**](BalancesApi.md#list) | **GET** /api/balances | List all balances
[**retrieve**](BalancesApi.md#retrieve) | **POST** /api/balances | Retrieve balances for a link


# **completeRequest**

#### **PATCH** /api/balances

### Description
Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse = await belvo.balances.completeRequest({
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

**Array<Balance>**

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

#### **DELETE** /api/balances/{id}

### Description
Delete a specific balance from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.balances.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `balance.id` that you want to delete. | defaults to undefined


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

#### **GET** /api/balances/{id}

### Description
Get the details of a specific balance.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.balances.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `balance.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Balance**

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

#### **GET** /api/balances

### Description
Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.balances.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  account: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  accountIn:
    "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509",
  accountType: "Cuentas de efectivo",
  accountTypeIn: "Cuentas de efectivo,Credito",
  balance: "530.00",
  balanceLt: "540.00",
  balanceLte: "541.00",
  balanceGt: "520.00",
  balanceGte: "519.00",
  balanceRange: "519.00,541.00",
  currency: "COP",
  currencyIn: "COP,MXN",
  id: "73694155-b871-41ec-94e3-37d17ff62b5d",
  idIn: "73694155-b871-41ec-94e3-37d17ff62b5d,40968d42-7d89-49e3-9931-78baa8e0544e",
  institution: "erebor_mx_retail",
  institutionIn: "erebor_mx_retail,gringotts_mx_retail",
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
 **accountIn** | [**string**] | Return balances only for these `account.id`s. | (optional) defaults to undefined
 **accountType** | [**string**] | Return information only for accounts matching this account type, as designated by the institution. | (optional) defaults to undefined
 **accountTypeIn** | [**string**] | Return information only for accounts matching these account types, as designated by the institution. | (optional) defaults to undefined
 **balance** | [**string**] | Return balances matching exactly this value. | (optional) defaults to undefined
 **balanceLt** | [**string**] | Return balances less than this value. | (optional) defaults to undefined
 **balanceLte** | [**string**] | Return balances less than or equal to this value. | (optional) defaults to undefined
 **balanceGt** | [**string**] | Return balances greater than this value. | (optional) defaults to undefined
 **balanceGte** | [**string**] | Return balances greater than or equal to this value. | (optional) defaults to undefined
 **balanceRange** | [**string**] | Return balances between these two values. | (optional) defaults to undefined
 **currency** | [**string**] | Return balances that are in this three-letter currency code. | (optional) defaults to undefined
 **currencyIn** | [**string**] | Return balances that are in these three-letter currency codes. | (optional) defaults to undefined
 **id** | [**string**] | Return information only for this `balance.id`. | (optional) defaults to undefined
 **idIn** | [**string**] | Return information only for these `balance.id`s. | (optional) defaults to undefined
 **institution** | [**string**] | Return balances only for this institution (use the Belvo-designated name, such as `erebor_mx_retail`). | (optional) defaults to undefined
 **institutionIn** | [**string**] | Return balances only for these institutions (use the Belvo-designated names, such as `erebor_mx_retail` and `gringotts_mx_retail`). | (optional) defaults to undefined
 **linkIn** | [**string**] | Return balances only for these `link.id`s. | (optional) defaults to undefined
 **valueDate** | [**string**] | Return balances for exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateGt** | [**string**] | Return balances for after this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateGte** | [**string**] | Return balances for this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateLt** | [**string**] | Return balances for before this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateLte** | [**string**] | Return balances for this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **valueDateRange** | [**string**] | Return balances for this date range (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined


### Return type

**BalancesPaginatedResponse**

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

#### **POST** /api/balances

### Description
Retrieve balances from one or more accounts for a specific link within a specified date range.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.balances.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "2ccd5e15-194a-4a19-a45a-e7223c7e6717",
  account: "d4617561-1c01-4b2f-83b6-a594f7b3bc57",
  date_from: "2021-01-18",
  date_to: "2021-02-15",
  token: "1234ab",
  save_data: true,
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **balancesRequest** | **BalancesRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<Balance>**

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


