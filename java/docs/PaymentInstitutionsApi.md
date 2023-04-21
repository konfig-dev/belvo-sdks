# PaymentInstitutionsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](PaymentInstitutionsApi.md#getDetails) | **GET** /payments/institutions/{id} | Get details about a payment institution |
| [**list**](PaymentInstitutionsApi.md#list) | **GET** /payments/institutions | List all payment institutions |


<a name="getDetails"></a>
# **getDetails**
> PaymentInstitution getDetails(id).execute();

Get details about a payment institution

Get the details about a specific payment institution

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentInstitutionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentInstitutionsApi api = new PaymentInstitutionsApi(apiClient);
    UUID id = UUID.fromString("a3b92311-1888-449f-acaa-49ae28d68fcd"); // The payment `institution.id` you want to get detailed information about.
    try {
      PaymentInstitution result = api
              .getDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstitutionsApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<PaymentInstitution> response = api
              .getDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstitutionsApi#getDetails");
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
| **id** | **UUID**| The payment &#x60;institution.id&#x60; you want to get detailed information about. | |

### Return type

[**PaymentInstitution**](PaymentInstitution.md)

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
> PaymentsInstitutionsPaginatedResponse list().page(page).country(country).countryIn(countryIn).createdAt(createdAt).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).execute();

List all payment institutions

List all available payment institutions.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentInstitutionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentInstitutionsApi api = new PaymentInstitutionsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    String country = "COL"; // Return institutions only for this country.
    String countryIn = "COL,BRA"; // Return institutions only for one of these countries.
    String createdAt = "2022-09-15"; // Return results only for this date (in `YYYY-MM-DD` format).
    String createdAtGt = "2022-09-15"; // Return results only after this date (in `YYYY-MM-DD` format).
    String createdAtGte = "2022-09-15"; // Return results only for this date and after (in `YYYY-MM-DD` format).
    String createdAtLt = "2022-09-15"; // Return results only before this date (in `YYYY-MM-DD` format).
    String createdAtLte = "2022-09-15"; // Return results only for this date and before (in `YYYY-MM-DD` format).
    String createdAtRange = "2022-09-15,2022-09-20"; // Return results between this date range (in `YYYY-MM-DD` format).
    try {
      PaymentsInstitutionsPaginatedResponse result = api
              .list()
              .page(page)
              .country(country)
              .countryIn(countryIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstitutionsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<PaymentsInstitutionsPaginatedResponse> response = api
              .list()
              .page(page)
              .country(country)
              .countryIn(countryIn)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentInstitutionsApi#list");
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
| **country** | **String**| Return institutions only for this country. | [optional] |
| **countryIn** | **String**| Return institutions only for one of these countries. | [optional] |
| **createdAt** | **String**| Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGt** | **String**| Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGte** | **String**| Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLt** | **String**| Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLte** | **String**| Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtRange** | **String**| Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |

### Return type

[**PaymentsInstitutionsPaginatedResponse**](PaymentsInstitutionsPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

