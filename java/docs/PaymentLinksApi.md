# PaymentLinksApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](PaymentLinksApi.md#create) | **POST** /payments/payment-links | Create a payment link |
| [**getDetails**](PaymentLinksApi.md#getDetails) | **GET** /payments/payment-links/{access_token} | Get details about a payment link |
| [**list**](PaymentLinksApi.md#list) | **GET** /payments/payment-links | List all payment links |


<a name="create"></a>
# **create**
> Object create().body(body).execute();

Create a payment link

Create a new payment link to start a hosted-widget payment.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentLinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentLinksApi api = new PaymentLinksApi(apiClient);
    try {
      Object result = api
              .create()
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#create");
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
      System.err.println("Exception when calling PaymentLinksApi#create");
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
> Object getDetails(accessToken).execute();

Get details about a payment link

Get the details about a payment link.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentLinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentLinksApi api = new PaymentLinksApi(apiClient);
    String accessToken = "YggaKvPbM5aJhksu1BEwDI5FKTcUc5wZqNB-wH7MFGU"; // The `access_token` of the payment link you want to get detailed information about.   **Note:** You can retrieve the `access_token` for a payment link by making a [GET List all payment links](https://developers.belvo.com/reference/listpaymentlinks) request.
    try {
      Object result = api
              .getDetails(accessToken)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Object> response = api
              .getDetails(accessToken)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#getDetails");
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
| **accessToken** | **String**| The &#x60;access_token&#x60; of the payment link you want to get detailed information about.   **Note:** You can retrieve the &#x60;access_token&#x60; for a payment link by making a [GET List all payment links](https://developers.belvo.com/reference/listpaymentlinks) request. | |

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
| **200** | OK (Created) |  -  |

<a name="list"></a>
# **list**
> PaymentLinkPaginatedResponse list().page(page).pageSize(pageSize).createdAt(createdAt).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).status(status).ordering(ordering).search(search).execute();

List all payment links

List all payment links associated with your Belvo account. By default, we return up to 100 results per page.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.PaymentLinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    PaymentLinksApi api = new PaymentLinksApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 100. If you enter a value greater than 100, our API will default to the maximum value (1000). 
    String createdAt = "2022-09-15"; // Return results only for this date (in `YYYY-MM-DD` format).
    String createdAtGt = "2022-09-15"; // Return results only after this date (in `YYYY-MM-DD` format).
    String createdAtGte = "2022-09-15"; // Return results only for this date and after (in `YYYY-MM-DD` format).
    String createdAtLt = "2022-09-15"; // Return results only before this date (in `YYYY-MM-DD` format).
    String createdAtLte = "2022-09-15"; // Return results only for this date and before (in `YYYY-MM-DD` format).
    String createdAtRange = "2022-09-15,2022-09-20"; // Return results between this date range (in `YYYY-MM-DD` format).
    String status = "ACTIVE"; // Return payment links with this status. Can be either `ACTIVE` or `INACTIVE`.
    String ordering = "created_at"; // Return results in a specified time order. Can be either:    - `created_at` returns payment links from newest to oldest (in ascending order).   - `-created_at` returns payment links from oldest to newest (in descending order).
    String search = "trai"; // Return results for one or more payment links that match the description you searched for.   **Note:** This filter supports both full and partial search queries, with a minimum of three characters required. For example, searching for `trai` may match the following values:    - `Awesome training sneakers`    - `Training equipment`
    try {
      PaymentLinkPaginatedResponse result = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .status(status)
              .ordering(ordering)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<PaymentLinkPaginatedResponse> response = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .status(status)
              .ordering(ordering)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#list");
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
| **pageSize** | **Integer**| Indicates how many results to return per page. By default we return 100 results per page.  ℹ️ The minimum number of results returned per page is 1 and the maximum is 100. If you enter a value greater than 100, our API will default to the maximum value (1000).  | [optional] [default to 100] |
| **createdAt** | **String**| Return results only for this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGt** | **String**| Return results only after this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtGte** | **String**| Return results only for this date and after (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLt** | **String**| Return results only before this date (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtLte** | **String**| Return results only for this date and before (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **createdAtRange** | **String**| Return results between this date range (in &#x60;YYYY-MM-DD&#x60; format). | [optional] |
| **status** | **String**| Return payment links with this status. Can be either &#x60;ACTIVE&#x60; or &#x60;INACTIVE&#x60;. | [optional] [enum: ACTIVE, INACTIVE] |
| **ordering** | **String**| Return results in a specified time order. Can be either:    - &#x60;created_at&#x60; returns payment links from newest to oldest (in ascending order).   - &#x60;-created_at&#x60; returns payment links from oldest to newest (in descending order). | [optional] [enum: created_at, -created_at] |
| **search** | **String**| Return results for one or more payment links that match the description you searched for.   **Note:** This filter supports both full and partial search queries, with a minimum of three characters required. For example, searching for &#x60;trai&#x60; may match the following values:    - &#x60;Awesome training sneakers&#x60;    - &#x60;Training equipment&#x60; | [optional] |

### Return type

[**PaymentLinkPaginatedResponse**](PaymentLinkPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

