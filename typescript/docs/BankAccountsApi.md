# BankAccountsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](BankAccountsApi.md#create) | **POST** /payments/bank-accounts | Create a new bank account
[**getDetails**](BankAccountsApi.md#getDetails) | **GET** /payments/bank-accounts/{id} | Get details about a bank account
[**list**](BankAccountsApi.md#list) | **GET** /payments/bank-accounts | List all bank accounts


# **create**

#### **POST** /payments/bank-accounts

### Description
Create a new bank account from which to send or request funds.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const createResponse = await belvo.bankAccounts.create({
  institution: "f512d996-583a-4a91-8b5b-eba2e103b068",
  holder: null,
  details: null,
});

console.log(createResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccountsCreateRequest** | **BankAccountsCreateRequest**|  |


### Return type

**BankAccountsCreateResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK (Created) |  -  |
**400** | Validation Error |  -  |
**401** | Authentication Error |  -  |
**408** | Request Timeout Error |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDetails**

#### **GET** /payments/bank-accounts/{id}

### Description
Get the details about a specific bank account

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.bankAccounts.getDetails({
  id: "a3b92311-1888-449f-acaa-49ae28d68fcd",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `bank-account.id` you want to get detailed information about. | defaults to undefined


### Return type

**BankAccountsGetDetailsResponse**

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

#### **GET** /payments/bank-accounts

### Description
List all bank accounts associated with your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.bankAccounts.list({
  page: 1,
  idIn: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  createdAt: "2022-09-15",
  createdAtGt: "2022-09-15",
  createdAtGte: "2022-09-15",
  createdAtLt: "2022-09-15",
  createdAtLte: "2022-09-15",
  createdAtRange: "2022-09-15,2022-09-20",
  number: "1231564526",
  numberIn: "1231564526,15648325",
  customer: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d",
  institution: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d",
  holderType: "INDIVIDUAL",
  holderTypeIn: "INDIVIDUAL,BUSINESS",
  providers: "payments_way",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **idIn** | [**string**] | One or more `bank-account.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **createdAt** | [**string**] | Return results only for this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return results only after this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return results only for this date and after (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return results only before this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return results only for this date and before (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return results between this date range (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **number** | [**string**] | Return results that exactly match a value. | (optional) defaults to undefined
 **numberIn** | [**string**] | Return results for listed numbers. | (optional) defaults to undefined
 **customer** | [**string**] | The `customer.id` you want to get results for. | (optional) defaults to undefined
 **institution** | [**string**] | The `institution.id` you want to get results for. | (optional) defaults to undefined
 **holderType** | [**string**] | Return results for a matched value type. | (optional) defaults to undefined
 **holderTypeIn** | [**string**] | Return results for listed holder types. | (optional) defaults to undefined
 **providers** | [**string**] | Return results only for this value. | (optional) defaults to undefined


### Return type

**BankAccountPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


