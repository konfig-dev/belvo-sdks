# PaymentLinksApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](PaymentLinksApi.md#create) | **POST** /payments/payment-links | Create a payment link
[**getDetails**](PaymentLinksApi.md#getDetails) | **GET** /payments/payment-links/{access_token} | Get details about a payment link
[**list**](PaymentLinksApi.md#list) | **GET** /payments/payment-links | List all payment links


# **create**

#### **POST** /payments/payment-links

### Description
Create a new payment link to start a hosted-widget payment.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const createResponse = await belvo.paymentLinks.create({
  description: "Shoe payment",
  amount: "2853.78",
  customer: "06dc2f14-1217-4480-9b36-550a944a39d1",
  allowed_payment_method_types: ["open_finance"],
  provider: "belvo",
  payment_method_details: {
    open_finance: {
      beneficiary_bank_account: "a80d5a9d-20ae-479a-8dd7-ff3443bcbbfc",
      callback_url: "https://www.acmecorp.com/checkout/3487321",
    },
  },
  expires_in: "7d",
});

console.log(createResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentLinksCreateRequest** | **PaymentLinksCreateRequest**|  |


### Return type

**PaymentLinksCreateResponse**

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

#### **GET** /payments/payment-links/{access_token}

### Description
Get the details about a payment link.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.paymentLinks.getDetails({
  accessToken: "YggaKvPbM5aJhksu1BEwDI5FKTcUc5wZqNB-wH7MFGU",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | [**string**] | The `access_token` of the payment link you want to get detailed information about.   **Note:** You can retrieve the `access_token` for a payment link by making a [GET List all payment links](https://developers.belvo.com/reference/listpaymentlinks) request. | defaults to undefined


### Return type

**PaymentLinksGetDetailsResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK (Created) |  -  |
**401** | Authentication Error |  -  |
**404** | Not Found Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **list**

#### **GET** /payments/payment-links

### Description
List all payment links associated with your Belvo account. By default, we return up to 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.paymentLinks.list({
  page: 1,
  pageSize: 100,
  createdAt: "2022-09-15",
  createdAtGt: "2022-09-15",
  createdAtGte: "2022-09-15",
  createdAtLt: "2022-09-15",
  createdAtLte: "2022-09-15",
  createdAtRange: "2022-09-15,2022-09-20",
  status: "ACTIVE",
  ordering: "-created_at",
  search: "trai",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **pageSize** | [**number**] | Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 100. If you enter a value greater than 100, our API will default to the maximum value (1000).  | (optional) defaults to 100
 **createdAt** | [**string**] | Return results only for this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return results only after this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return results only for this date and after (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return results only before this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return results only for this date and before (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return results between this date range (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **status** | 'ACTIVE', 'INACTIVE' | Return payment links with this status. Can be either `ACTIVE` or `INACTIVE`. | (optional) defaults to undefined
 **ordering** | 'created_at', '-created_at' | Return results in a specified time order. Can be either:    - `created_at` returns payment links from newest to oldest (in ascending order).   - `-created_at` returns payment links from oldest to newest (in descending order). | (optional) defaults to undefined
 **search** | [**string**] | Return results for one or more payment links that match the description you searched for.   **Note:** This filter supports both full and partial search queries, with a minimum of three characters required. For example, searching for `trai` may match the following values:    - `Awesome training sneakers`    - `Training equipment` | (optional) defaults to undefined


### Return type

**PaymentLinkPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


