# BankAccountsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](BankAccountsApi.md#create) | **POST** /payments/bank-accounts | Create a new bank account |
| [**getDetails**](BankAccountsApi.md#getDetails) | **GET** /payments/bank-accounts/{id} | Get details about a bank account |
| [**list**](BankAccountsApi.md#list) | **GET** /payments/bank-accounts | List all bank accounts |


<a name="create"></a>
# **create**
> Object create().body(body).execute();

Create a new bank account

Create a new bank account from which to send or request funds.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BankAccountsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BankAccountsApi api = new BankAccountsApi(apiClient);
    try {
      Object result = api
              .create()
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#create");
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
      System.err.println("Exception when calling BankAccountsApi#create");
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

Get details about a bank account

Get the details about a specific bank account

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BankAccountsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BankAccountsApi api = new BankAccountsApi(apiClient);
    UUID id = UUID.fromString("a3b92311-1888-449f-acaa-49ae28d68fcd"); // The `bank-account.id` you want to get detailed information about.
    try {
      Object result = api
              .getDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#getDetails");
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
      System.err.println("Exception when calling BankAccountsApi#getDetails");
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
| **id** | **UUID**| The &#x60;bank-account.id&#x60; you want to get detailed information about. | |

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
> BankAccountPaginatedResponse list().page(page).idIn(idIn).createdAt(createdAt).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).number(number).numberIn(numberIn).customer(customer).institution(institution).holderType(holderType).holderTypeIn(holderTypeIn).providers(providers).execute();

List all bank accounts

List all bank accounts associated with your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BankAccountsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BankAccountsApi api = new BankAccountsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    String idIn = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d,bfe57b64-f033-4a00-97f8-83ec88440264"; // One or more `bank-account.id`s (comma separated) that you want to get results for.
    String createdAt = "2022-09-15"; // Return results only for this date (in `YYYY-MM-DD` format).
    String createdAtGt = "2022-09-15"; // Return results only after this date (in `YYYY-MM-DD` format).
    String createdAtGte = "2022-09-15"; // Return results only for this date and after (in `YYYY-MM-DD` format).
    String createdAtLt = "2022-09-15"; // Return results only before this date (in `YYYY-MM-DD` format).
    String createdAtLte = "2022-09-15"; // Return results only for this date and before (in `YYYY-MM-DD` format).
    String createdAtRange = "2022-09-15,2022-09-20"; // Return results between this date range (in `YYYY-MM-DD` format).
    String number = "1231564526"; // Return results that exactly match a value.
    String numberIn = "1231564526,15648325"; // Return results for listed numbers.
    String customer = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d"; // The `customer.id` you want to get results for.
    String institution = "24e5b3a5-19aa-40fe-91e5-4db7f22ecc2d"; // The `institution.id` you want to get results for.
    String holderType = "INDIVIDUAL"; // Return results for a matched value type.
    String holderTypeIn = "INDIVIDUAL,BUSINESS"; // Return results for listed holder types.
    String providers = "payments_way"; // Return results only for this value.
    try {
      BankAccountPaginatedResponse result = api
              .list()
              .page(page)
              .idIn(idIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .number(number)
              .numberIn(numberIn)
              .customer(customer)
              .institution(institution)
              .holderType(holderType)
              .holderTypeIn(holderTypeIn)
              .providers(providers)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<BankAccountPaginatedResponse> response = api
              .list()
              .page(page)
              .idIn(idIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .number(number)
              .numberIn(numberIn)
              .customer(customer)
              .institution(institution)
              .holderType(holderType)
              .holderTypeIn(holderTypeIn)
              .providers(providers)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#list");
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
| **idIn** | **String**| One or more &#x60;bank-account.id&#x60;s (comma separated) that you want to get results for. | [optional] |
| **createdAt** | **String**| Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGt** | **String**| Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGte** | **String**| Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLt** | **String**| Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLte** | **String**| Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtRange** | **String**| Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **number** | **String**| Return results that exactly match a value. | [optional] |
| **numberIn** | **String**| Return results for listed numbers. | [optional] |
| **customer** | **String**| The &#x60;customer.id&#x60; you want to get results for. | [optional] |
| **institution** | **String**| The &#x60;institution.id&#x60; you want to get results for. | [optional] |
| **holderType** | **String**| Return results for a matched value type. | [optional] |
| **holderTypeIn** | **String**| Return results for listed holder types. | [optional] |
| **providers** | **String**| Return results only for this value. | [optional] |

### Return type

[**BankAccountPaginatedResponse**](BankAccountPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

