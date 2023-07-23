# TaxRetentionsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](TaxRetentionsApi.md#delete) | **DELETE** /api/tax-retentions/{id} | Delete a tax retention
[**getDetails**](TaxRetentionsApi.md#getDetails) | **GET** /api/tax-retentions/{id} | Get a tax retention\&#39;s details
[**list**](TaxRetentionsApi.md#list) | **GET** /api/tax-retentions | List all tax retentions
[**retrieve**](TaxRetentionsApi.md#retrieve) | **POST** /api/tax-retentions | Retrieve tax retentions for a link


# **delete**

#### **DELETE** /api/tax-retentions/{id}

### Description
Delete a specific tax retention from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.taxRetentions.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `tax-retention.id` that you want to delete. | defaults to undefined


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

#### **GET** /api/tax-retentions/{id}

### Description
Get the details of a specific tax retention.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.taxRetentions.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `tax-retention.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**TaxRetentions**

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

#### **GET** /api/tax-retentions

### Description
Get a paginated list of all existing tax retentions in your Belvo account. We return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.taxRetentions.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  createdAtGt: "2022-05-05",
  createdAtGte: "2022-05-04",
  createdAtLt: "2022-04-01",
  createdAtLte: "2022-03-30",
  createdAtRange: "2022-03-03,2022-05-04",
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
 **link** | [**string**] | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance.  | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return tax retentions that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return tax retentions that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return tax retentions that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return tax retentions that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return tax retentions that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **linkIn** | [**string**] | Return information for these `link.id`s. | (optional) defaults to undefined


### Return type

**TaxRetentionsPaginatedResponse**

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

#### **POST** /api/tax-retentions

### Description
Retrieve tax retention information from a specific link. The maximum number of tax retentions that can be returned for a period is 500.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.taxRetentions.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "9e432f18-36ca-4bd6-a3f3-1971e58dc1e8",
  date_from: "2020-01-01",
  date_to: "2020-02-01",
  type: "INFLOW",
  attach_xml: true,
  save_data: true,
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRetentionsRequest** | **TaxRetentionsRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<TaxRetentions>**

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
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


