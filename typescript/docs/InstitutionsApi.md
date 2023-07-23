# InstitutionsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetails**](InstitutionsApi.md#getDetails) | **GET** /api/institutions/{id} | Get an institution\&#39;s details
[**list**](InstitutionsApi.md#list) | **GET** /api/institutions | List all institutions


# **getDetails**

#### **GET** /api/institutions/{id}

### Description
Get the details of a specific institution.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.institutions.getDetails({
  id: "4",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `institution.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Institution**

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

#### **GET** /api/institutions

### Description
Get a paginated list of all the institutions currently supported by Belvo. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.institutions.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  countryCode: "MX",
  countryCodeIn: "CO,BR",
  displayName: "Erebor Bank",
  nameIn: "erebor_br_retail,gotham_co_business",
  resourcesAllin: "ACCOUNTS,OWNERS,TRANSACTIONS",
  status: "healthy",
  statusIn: "healthy,down",
  type: "fiscal",
  typeIn: "fiscal,bank",
  website: "https://www.erebor.mx",
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
 **countryCode** | [**string**] | Return institutions only for this two-letter country code. | (optional) defaults to undefined
 **countryCodeIn** | [**string**] | Return institutions only for these two-letter country codes. | (optional) defaults to undefined
 **displayName** | [**string**] | Return institutions that partially match this display name. | (optional) defaults to undefined
 **name** | [**string**] |  | (optional) defaults to undefined
 **nameIn** | [**string**] | Return institutions with one or more of these Belvo-designated names. | (optional) defaults to undefined
 **resourcesAllin** | [**string**] | Return institutions that support these resources. | (optional) defaults to undefined
 **status** | [**string**] | Return institutions with the given status. You can choose between `healthy` or `down`. | (optional) defaults to undefined
 **statusIn** | [**string**] | Return institutions with one of the given statuses. You can choose between `healthy` or `down`. | (optional) defaults to undefined
 **type** | [**string**] | Return institutions of this type. You can choose between `bank` or `fiscal`. | (optional) defaults to undefined
 **typeIn** | [**string**] | Return institutions of one of these types. You can choose between `bank` or `fiscal`. | (optional) defaults to undefined
 **website** | [**string**] | Return institutions with this website URL. | (optional) defaults to undefined


### Return type

**InstitutionsPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


