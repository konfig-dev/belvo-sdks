# CustomersApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CustomersApi.md#create) | **POST** /payments/customers | Create a new customer
[**getDetails**](CustomersApi.md#getDetails) | **GET** /payments/customers/{id} | Get details about a customer
[**list**](CustomersApi.md#list) | **GET** /payments/customers | List all customers


# **create**

#### **POST** /payments/customers

### Description
Create a new customer to send or request funds.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const createResponse = await belvo.customers.create({
  customer_type: "INDIVIDUAL",
  name: "Caetano Veloso",
  country: "COL",
  email: "caetano.veloso@musicabrazil.br",
  identifier: "1018760936",
  identifier_type: "CPF",
  address: "Rua de Caetano Veloso 432, 70200 Brasilia",
  phone: "231.002.999-00",
});

console.log(createResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customersCreateRequest** | **CustomersCreateRequest**|  |


### Return type

**CustomersCreateResponse**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK (Created) |  -  |
**400** | Validation Error |  -  |
**401** | Authentication Error |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDetails**

#### **GET** /payments/customers/{id}

### Description
Get the details about a specific customer

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.customers.getDetails({
  id: "a3b92311-1888-449f-acaa-49ae28d68fcd",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `customer.id` you want to get detailed information about. | defaults to undefined


### Return type

**CustomersGetDetailsResponse**

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

#### **GET** /payments/customers

### Description
List all customers associated with your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.customers.list({
  page: 1,
  idIn: "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264",
  createdAt: "2022-09-15",
  createdAtGt: "2022-09-15",
  createdAtGte: "2022-09-15",
  createdAtLt: "2022-09-15",
  createdAtLte: "2022-09-15",
  createdAtRange: "2022-09-15,2022-09-20",
  customerType: "INDIVIDUAL",
  search: "car",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **idIn** | [**string**] | One or more `customer.id`s (comma separated) that you want to get results for. | (optional) defaults to undefined
 **createdAt** | [**string**] | Return results only for this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return results only after this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return results only for this date and after (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return results only before this date (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return results only for this date and before (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return results between this date range (in `YYYY-MM-DD` format). | (optional) defaults to undefined
 **customerType** | [**string**] | Return results only for this customer type (either `INDIVIDUAL` or `BUSINESS`). | (optional) defaults to undefined
 **search** | [**string**] | Return results for one or more customers that match either the name or email you searched for.   **Note:** This filter supports both full and partial search queries, with a minimum of three characters required. For example, searching for `car` may match the following values:    - `Carlos Vives`   - `Carmen Domínguez`    - `carlos.vives@musicacolombia.co` | (optional) defaults to undefined


### Return type

**CustomerPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


