# TaxReturnsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](TaxReturnsApi.md#delete) | **DELETE** /api/tax-returns/{id} | Delete a tax return
[**getDetails**](TaxReturnsApi.md#getDetails) | **GET** /api/tax-returns/{id} | Get a tax return\&#39;s details
[**list**](TaxReturnsApi.md#list) | **GET** /api/tax-returns | List all tax returns
[**retrieve**](TaxReturnsApi.md#retrieve) | **POST** /api/tax-returns | Retrieve tax returns for a link


# **delete**

#### **DELETE** /api/tax-returns/{id}

### Description
Delete a specific tax return from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.taxReturns.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The ID of the tax return you want to delete. | defaults to undefined


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

#### **GET** /api/tax-returns/{id}

### Description
Get the details of a specific tax return.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.taxReturns.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `tax-return.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**TaxReturnsGetDetailsResponse**

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

#### **GET** /api/tax-returns

### Description
Get a paginated list of all existing tax returns in your Belvo account. By default, we return up to 100 results per page. The results will include a mix of both monthly and yearly tax returns.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.taxReturns.list({
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
  id: "eb42c21c-2d9e-4dc1-89b8-9401d4beca73",
  idIn: "eb42c21c-2d9e-4dc1-89b8-9401d4beca73,82b3f18c-055b-4f82-9fae-d2201815ab0c",
  ejercicio: "2018",
  ejercicioLt: "2020",
  ejercicioLte: "2021",
  ejercicioGt: "2019",
  ejercicioGte: "2017",
  ejercicioRange: "2015,2021",
  tipoDeclaracion: "Normal",
  tipoDeclaracionIn: "Normal,Commercial",
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
 **createdAtGt** | [**string**] | Return tax returns that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return tax returns that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return tax returns that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return tax returns that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return tax returns that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **id** | [**string**] | Return information for this `tax-return.id`. | (optional) defaults to undefined
 **idIn** | [**string**] | Return information for these `tax-return.id`s. | (optional) defaults to undefined
 **ejercicio** | [**string**] | Return tax returns for exactly this year (`YYYY`). | (optional) defaults to undefined
 **ejercicioLt** | [**string**] | Return tax returns for before this year (`YYYY`). | (optional) defaults to undefined
 **ejercicioLte** | [**string**] | Return tax returns for this year and earlier (`YYYY`). | (optional) defaults to undefined
 **ejercicioGt** | [**string**] | Return tax returns for after this year (`YYYY`). | (optional) defaults to undefined
 **ejercicioGte** | [**string**] | Return tax returns for this year or later (`YYYY`). | (optional) defaults to undefined
 **ejercicioRange** | [**string**] | Return tax returns for this range of years (`YYYY`). | (optional) defaults to undefined
 **tipoDeclaracion** | [**string**] | Return tax returns with this declaration type. | (optional) defaults to undefined
 **tipoDeclaracionIn** | [**string**] | Return tax returns with these declaration types. | (optional) defaults to undefined
 **linkIn** | [**string**] | Return information for these `link.id`s. | (optional) defaults to undefined


### Return type

**TaxReturnsListResponse**

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

#### **POST** /api/tax-returns

### Description
Retrieve tax return information for a specific fiscal link.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.taxReturns.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "d4617561-1c01-4b2f-83b6-a594f7b3bc57",
  attach_pdf: false,
  save_data: true,
  type: "monthly",
  date_from: "2018-01-01",
  date_to: "2019-01-01",
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxReturnsRetrieveRequest** | **TaxReturnsRetrieveRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<TaxReturnsRetrieveResponseInner>**

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


