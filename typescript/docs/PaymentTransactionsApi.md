# PaymentTransactionsApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetails**](PaymentTransactionsApi.md#getDetails) | **GET** /payments/transactions/{id} | Get details about a payment transaction
[**list**](PaymentTransactionsApi.md#list) | **GET** /payments/transactions | List all payment transactions


# **getDetails**

#### **GET** /payments/transactions/{id}

### Description
Get the details about a specific payment transaction.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.paymentTransactions.getDetails({
  id: "a3b92311-1888-449f-acaa-49ae28d68fcd",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `transaction.id` you want to get detailed information about. | defaults to undefined


### Return type

**PaymentTransaction**

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

#### **GET** /payments/transactions

### Description
List all payment transactions associated with your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.paymentTransactions.list({
  page: 1,
  idIn: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  createdAt: "2022-09-15",
  createdAtGt: "2022-09-15",
  createdAtGte: "2022-09-15",
  createdAtLt: "2022-09-15",
  createdAtLte: "2022-09-15",
  createdAtRange: "2022-09-15,2022-09-20",
  charge: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d",
  chargeIn:
    "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  beneficiary: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d",
  beneficiaryIn:
    "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  payer: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d",
  payerIn:
    "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  transactionType: "INFLOW",
  currency: "COP",
  description: "Training shoes",
  amount: "1000.00",
  amountGt: "1000.00",
  amountGte: "1000.00",
  amountLt: "1000.00",
  amountLte: "1000.00",
  amountRange: "1000.00,2000.00",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **idIn** | [**string**] | One or more payment `transaction.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **createdAt** | [**string**] | Return results only for this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return results only after this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return results only for this date and after (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return results only before this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return results only for this date and before (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return results between this date range (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **charge** | [**string**] | The `charge.id` you want to get results for. | (optional) defaults to undefined
 **chargeIn** | [**string**] | One or more `charge.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **beneficiary** | [**string**] | The `beneficiary.id` you want to get results for. | (optional) defaults to undefined
 **beneficiaryIn** | [**string**] | One or more `beneficiary.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **payer** | [**string**] | The payer\'s `bank-account.id` you want to get results for. | (optional) defaults to undefined
 **payerIn** | [**string**] | One or more payer `bank-account.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **transactionType** | [**string**] | Return results for a matched value type. | (optional) defaults to undefined
 **currency** | [**string**] | Return results for a matched value type. | (optional) defaults to undefined
 **description** | [**string**] | Return results for a matched value type. | (optional) defaults to undefined
 **amount** | [**string**] | Return results only for this value. | (optional) defaults to undefined
 **amountGt** | [**string**] | Return results only for more than this amount. | (optional) defaults to undefined
 **amountGte** | [**string**] | Return results only for and more than this amount. | (optional) defaults to undefined
 **amountLt** | [**string**] | Return results only for less than this amount. | (optional) defaults to undefined
 **amountLte** | [**string**] | Return results only for this amount or less. | (optional) defaults to undefined
 **amountRange** | [**string**] | Return results between this amount range | (optional) defaults to undefined


### Return type

**PaymentsTransactionsPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


