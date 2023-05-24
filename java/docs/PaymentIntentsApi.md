# PaymentIntentsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**complete**](PaymentIntentsApi.md#complete) | **PATCH** /payments/payment-intents/{id} | Complete a payment intent |
| [**create**](PaymentIntentsApi.md#create) | **POST** /payments/payment-intents | Create a new payment intent |
| [**getDetails**](PaymentIntentsApi.md#getDetails) | **GET** /payments/payment-intents/{id} | Get details about a payment intent. |
| [**list**](PaymentIntentsApi.md#list) | **GET** /payments/payment-intents | List all payment intents |


<a name="complete"></a>
# **complete**
> Object complete(id).patchPaymentIntentPse(patchPaymentIntentPse).execute();

Complete a payment intent

Complete a new payment intent.  During the payment intent flow, you&#39;ll need to prompt your customer to provide additional information about their institution, bank account, and login credentials. This is done by sending PATCH calls with the information that Belvo asked you display in each &#x60;next_step&#x60; object. If you need more information on how to complete a payment intent, check our PSE payment initiation guides for  🇨🇴 Colombia.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentIntentsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentIntentsApi api = new PaymentIntentsApi(apiClient);
    Object paymentMethodDetails = null;
    UUID id = UUID.fromString("a3b92311-1888-449f-acaa-49ae28d68fcd"); // The `payment-intent.id` you want to get detailed information about.
    Boolean confirm = true; // Boolean that indicates whether this request confirms the payment intent.   **Note:** You'll need to send this parameter set to `true` when the payment intent next_step returns `ready_to_confirm: true`, meaning the payment intent is ready to be confirmed. 
    try {
      Object result = api
              .complete(paymentMethodDetails, id)
              .confirm(confirm)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#complete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Object> response = api
              .complete(paymentMethodDetails, id)
              .confirm(confirm)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#complete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| The &#x60;payment-intent.id&#x60; you want to get detailed information about. | |
| **patchPaymentIntentPse** | [**PatchPaymentIntentPse**](PatchPaymentIntentPse.md)|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK (Created) |  -  |

<a name="create"></a>
# **create**
> Object create().body(body).execute();

Create a new payment intent

Create a payment intent.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentIntentsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentIntentsApi api = new PaymentIntentsApi(apiClient);
    try {
      Object result = api
              .create()
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Object> response = api
              .create()
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#create");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK (Created) |  -  |

<a name="getDetails"></a>
# **getDetails**
> Object getDetails(id).execute();

Get details about a payment intent.

Get the details about a specific payment intent.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentIntentsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentIntentsApi api = new PaymentIntentsApi(apiClient);
    UUID id = UUID.fromString("a3b92311-1888-449f-acaa-49ae28d68fcd"); // The `payment-intent.id` you want to get detailed information about.
    try {
      Object result = api
              .getDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Object> response = api
              .getDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| The &#x60;payment-intent.id&#x60; you want to get detailed information about. | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="list"></a>
# **list**
> PaymentIntentPaginatedResponse list().page(page).idIn(idIn).createdAt(createdAt).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).provider(provider).paymentMethodType(paymentMethodType).customer(customer).customerIn(customerIn).amount(amount).amountGt(amountGt).amountGte(amountGte).amountLt(amountLt).amountLte(amountLte).status(status).statusIn(statusIn).execute();

List all payment intents

List all payment intents associated with your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentIntentsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentIntentsApi api = new PaymentIntentsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    String idIn = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264"; // One or more `payment-intent.id`s (comma separated) that you want to get results for.
    String createdAt = "2022-09-15"; // Return results only for this date (in `YYYY-MM-DD` format).
    String createdAtGt = "2022-09-15"; // Return results only after this date (in `YYYY-MM-DD` format).
    String createdAtGte = "2022-09-15"; // Return results only for this date and after (in `YYYY-MM-DD` format).
    String createdAtLt = "2022-09-15"; // Return results only before this date (in `YYYY-MM-DD` format).
    String createdAtLte = "2022-09-15"; // Return results only for this date and before (in `YYYY-MM-DD` format).
    String createdAtRange = "2022-09-15,2022-09-20"; // Return results between this date range (in `YYYY-MM-DD` format).
    String provider = "payments_way"; // Return results only for this value.
    String paymentMethodType = "pse"; // Return results only for this value.
    String customer = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d"; // The `customer.id` you want to get results for.
    String customerIn = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264"; // One or more `customer.id`s (comma separated) that you want to get results for.
    String amount = "1000"; // Return results only for this value.
    String amountGt = "1000"; // Return results only for more than this amount.
    String amountGte = "1000"; // Return results only for and more than this amount.
    String amountLt = "1000"; // Return results only for less than this amount.
    String amountLte = "1000"; // Return results only for this amount or less.
    String status = "SUCCEEDED"; // Return results only for this value.
    String statusIn = "PROCESSING,SUCCEEDED"; // Return results for listed status.
    try {
      PaymentIntentPaginatedResponse result = api
              .list()
              .page(page)
              .idIn(idIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .provider(provider)
              .paymentMethodType(paymentMethodType)
              .customer(customer)
              .customerIn(customerIn)
              .amount(amount)
              .amountGt(amountGt)
              .amountGte(amountGte)
              .amountLt(amountLt)
              .amountLte(amountLte)
              .status(status)
              .statusIn(statusIn)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<PaymentIntentPaginatedResponse> response = api
              .list()
              .page(page)
              .idIn(idIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .provider(provider)
              .paymentMethodType(paymentMethodType)
              .customer(customer)
              .customerIn(customerIn)
              .amount(amount)
              .amountGt(amountGt)
              .amountGte(amountGte)
              .amountLt(amountLt)
              .amountLte(amountLte)
              .status(status)
              .statusIn(statusIn)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **idIn** | **String**| One or more &#x60;payment-intent.id&#x60;s (comma separated) that you want to get results for. | [optional] |
| **createdAt** | **String**| Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGt** | **String**| Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGte** | **String**| Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLt** | **String**| Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLte** | **String**| Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtRange** | **String**| Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **provider** | **String**| Return results only for this value. | [optional] |
| **paymentMethodType** | **String**| Return results only for this value. | [optional] |
| **customer** | **String**| The &#x60;customer.id&#x60; you want to get results for. | [optional] |
| **customerIn** | **String**| One or more &#x60;customer.id&#x60;s (comma separated) that you want to get results for. | [optional] |
| **amount** | **String**| Return results only for this value. | [optional] |
| **amountGt** | **String**| Return results only for more than this amount. | [optional] |
| **amountGte** | **String**| Return results only for and more than this amount. | [optional] |
| **amountLt** | **String**| Return results only for less than this amount. | [optional] |
| **amountLte** | **String**| Return results only for this amount or less. | [optional] |
| **status** | **String**| Return results only for this value. | [optional] |
| **statusIn** | **String**| Return results for listed status. | [optional] |

### Return type

[**PaymentIntentPaginatedResponse**](PaymentIntentPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

