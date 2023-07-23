# PaymentInstitutionsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetails**](PaymentInstitutionsApi.md#getDetails) | **GET** /payments/institutions/{id} | Get details about a payment institution
[**list**](PaymentInstitutionsApi.md#list) | **GET** /payments/institutions | List all payment institutions


# **getDetails**

#### **GET** /payments/institutions/{id}

### Description
Get the details about a specific payment institution

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.paymentInstitutions.getDetails({
  id: "a3b92311-1888-449f-acaa-49ae28d68fcd",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The payment `institution.id` you want to get detailed information about. | defaults to undefined


### Return type

**PaymentInstitution**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |
**404** | Not Found Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **list**

#### **GET** /payments/institutions

### Description
List all available payment institutions.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.paymentInstitutions.list({
  page: 1,
  country: "COL",
  countryIn: "COL,BRA",
  createdAt: "2022-09-15",
  createdAtGt: "2022-09-15",
  createdAtGte: "2022-09-15",
  createdAtLt: "2022-09-15",
  createdAtLte: "2022-09-15",
  createdAtRange: "2022-09-15,2022-09-20",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **country** | [**string**] | Return institutions only for this country. | (optional) defaults to undefined
 **countryIn** | [**string**] | Return institutions only for one of these countries. | (optional) defaults to undefined
 **createdAt** | [**string**] | Return results only for this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return results only after this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return results only for this date and after (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return results only before this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return results only for this date and before (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return results between this date range (in `YYYY-MM-DD` format). | (optional) defaults to undefined


### Return type

**PaymentsInstitutionsPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


