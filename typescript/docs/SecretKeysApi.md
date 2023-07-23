# SecretKeysApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SecretKeysApi.md#create) | **POST** /payments/secret-keys | Request API keys
[**list**](SecretKeysApi.md#list) | **GET** /payments/secret-keys | List all secret keys


# **create**

#### **POST** /payments/secret-keys

### Description
Request API keys to use with Belvo's Payments API.

You will need to send through the username and password (in plain text) you use to login to the Belvo dashboard in the Authorization header.

For example:

  ```curl
  POST https://api.belvo.com/payments/secret-keys/
  Authorization: Basic username:password
  ```


### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const createResponse = await belvo.secretKeys.create();

console.log(createResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<PaymentsRequestApiKeysResponse>**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Ok |  -  |
**400** | Validation Error |  -  |
**408** | Request Timeout Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **list**

#### **GET** /payments/secret-keys

### Description
Get a paginated list of all existing secret keys in your Belvo account. We return up to 100 results per page.


  **Note**: We only return the ID of the secret keys.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.secretKeys.list();

console.log(listResponse);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**SecretKeysPaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Authentication Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


