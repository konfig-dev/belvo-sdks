# PaymentIntentsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complete**](PaymentIntentsApi.md#complete) | **PATCH** /payments/payment-intents/{id} | Complete a payment intent
[**create**](PaymentIntentsApi.md#create) | **POST** /payments/payment-intents | Create a new payment intent
[**getDetails**](PaymentIntentsApi.md#getDetails) | **GET** /payments/payment-intents/{id} | Get details about a payment intent.
[**list**](PaymentIntentsApi.md#list) | **GET** /payments/payment-intents | List all payment intents


# **complete**

#### **PATCH** /payments/payment-intents/{id}

### Description
Complete a new payment intent.

During the payment intent flow, you'll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each `next_step` object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeResponse = await belvo.paymentIntents.complete({
  id: "a3b92311-1888-449f-acaa-49ae28d68fcd",
  payment_method_details: null,
  confirm: true,
});

console.log(completeResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchPaymentIntentPse** | **PatchPaymentIntentPse**|  |
 **id** | [**string**] | The `payment-intent.id` you want to get detailed information about. | defaults to undefined


### Return type

**PaymentIntentsCompleteResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK (Created) |  -  |
**400** | Validation Error |  -  |
**404** | Not Found Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **create**

#### **POST** /payments/payment-intents

### Description
Create a payment intent.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const createResponse = await belvo.paymentIntents.create({
  description: "Training shoes",
  amount: "350000",
  customer: "06dc2f14-1217-4480-9b36-550a944a39d1",
  allowed_payment_method_types: ["open_finance"],
  payment_method_details: {
    pse: {
      beneficiary_bank_account: "a80d5a9d-20ae-479a-8dd7-ff3443bcbbfc",
      callback_url: "https://www.acmecorp.com/checkout/3487321",
      belvo_flow: true,
    },
  },
  provider: "belvo",
});

console.log(createResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentIntentsCreateRequest** | **PaymentIntentsCreateRequest**|  |


### Return type

**PaymentIntentsCreateResponse**

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

#### **GET** /payments/payment-intents/{id}

### Description
Get the details about a specific payment intent.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.paymentIntents.getDetails({
  id: "a3b92311-1888-449f-acaa-49ae28d68fcd",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `payment-intent.id` you want to get detailed information about. | defaults to undefined


### Return type

**PaymentIntentsGetDetailsResponse**

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

#### **GET** /payments/payment-intents

### Description
List all payment intents associated with your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.paymentIntents.list({
  page: 1,
  idIn: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  createdAt: "2022-09-15",
  createdAtGt: "2022-09-15",
  createdAtGte: "2022-09-15",
  createdAtLt: "2022-09-15",
  createdAtLte: "2022-09-15",
  createdAtRange: "2022-09-15,2022-09-20",
  provider: "payments_way",
  paymentMethodType: "pse",
  customer: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d",
  customerIn:
    "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  amount: "1000",
  amountGt: "1000",
  amountGte: "1000",
  amountLt: "1000",
  amountLte: "1000",
  status: "SUCCEEDED",
  statusIn: "PROCESSING,SUCCEEDED",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **idIn** | [**string**] | One or more `payment-intent.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **createdAt** | [**string**] | Return results only for this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return results only after this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return results only for this date and after (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return results only before this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return results only for this date and before (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return results between this date range (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **provider** | [**string**] | Return results only for this value. | (optional) defaults to undefined
 **paymentMethodType** | [**string**] | Return results only for this value. | (optional) defaults to undefined
 **customer** | [**string**] | The `customer.id` you want to get results for. | (optional) defaults to undefined
 **customerIn** | [**string**] | One or more `customer.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **amount** | [**string**] | Return results only for this value. | (optional) defaults to undefined
 **amountGt** | [**string**] | Return results only for more than this amount. | (optional) defaults to undefined
 **amountGte** | [**string**] | Return results only for and more than this amount. | (optional) defaults to undefined
 **amountLt** | [**string**] | Return results only for less than this amount. | (optional) defaults to undefined
 **amountLte** | [**string**] | Return results only for this amount or less. | (optional) defaults to undefined
 **status** | [**string**] | Return results only for this value. | (optional) defaults to undefined
 **statusIn** | [**string**] | Return results for listed status. | (optional) defaults to undefined


### Return type

**PaymentIntentPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


