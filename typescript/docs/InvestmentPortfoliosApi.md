# InvestmentPortfoliosApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeRequest**](InvestmentPortfoliosApi.md#completeRequest) | **PATCH** /investments/portfolios | Complete a portfolios request
[**delete**](InvestmentPortfoliosApi.md#delete) | **DELETE** /investments/portfolios/{id} | Delete a portfolio
[**getDetails**](InvestmentPortfoliosApi.md#getDetails) | **GET** /investments/portfolios/{id} | Get a portfolio\&#39;s details
[**list**](InvestmentPortfoliosApi.md#list) | **GET** /investments/portfolios | List all portfolios
[**retrieve**](InvestmentPortfoliosApi.md#retrieve) | **POST** /investments/portfolios | Retrieve portfolios for a link


# **completeRequest**

#### **PATCH** /investments/portfolios

### Description
Used to resume a portfolio retrieve session that was paused because an MFA token was required by the institution.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse =
  await belvo.investmentPortfolios.completeRequest({
    omit: "link,balance",
    fields: "link,balance,account",
    session: "6e7b283c6efa449c9c028a16b5c249fa",
    token: "1234ab",
    link: "683005d6-f45c-4adb-b289-f1a12f50f80c",
  });

console.log(completeRequestResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchBodyWithoutSaveData** | **PatchBodyWithoutSaveData**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**InvestmentsPortfolio**

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

# **delete**

#### **DELETE** /investments/portfolios/{id}

### Description
Delete a specific investment portfolio and all associated instruments, transactions, and owners from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.investmentPortfolios.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `portfolio.id` that you want to delete. | defaults to undefined


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

#### **GET** /investments/portfolios/{id}

### Description
Get the details of a specific portfolio.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.investmentPortfolios.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `portfolio.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**InvestmentsPortfolio**

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

#### **GET** /investments/portfolios

### Description
Get a paginated list of all the existing portfolios (and their instruments) in your Belvo account. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.investmentPortfolios.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
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
 **link** | [**string**] | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance.  | (optional) defaults to undefined
 **createdAtGt** | [**string**] |  | (optional) defaults to undefined
 **createdAtGte** | [**string**] |  | (optional) defaults to undefined
 **createdAtLt** | [**string**] |  | (optional) defaults to undefined
 **createdAtLte** | [**string**] |  | (optional) defaults to undefined
 **createdAtRange** | [**string**] |  | (optional) defaults to undefined
 **linkIn** | [**string**] |  | (optional) defaults to undefined


### Return type

**InvestmentsPortfoliosPaginatedResponse**

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

#### **POST** /investments/portfolios

### Description
Retrieve all portfolios for an existing link.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.investmentPortfolios.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "2ccd5e15-194a-4a19-a45a-e7223c7e6717",
  token: "1234ab",
  save_data: true,
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standardRequest** | **StandardRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**InvestmentsPortfolio**

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


