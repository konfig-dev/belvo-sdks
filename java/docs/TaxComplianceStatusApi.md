# TaxComplianceStatusApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](TaxComplianceStatusApi.md#delete) | **DELETE** /api/tax-compliance-status/{id} | Delete a tax compliance status |
| [**getDetails**](TaxComplianceStatusApi.md#getDetails) | **GET** /api/tax-compliance-status/{id} | Get a tax compliance status&#39;s details |
| [**list**](TaxComplianceStatusApi.md#list) | **GET** /api/tax-compliance-status | List all tax compliance statuses |
| [**retrieve**](TaxComplianceStatusApi.md#retrieve) | **POST** /api/tax-compliance-status | Retrieve tax compliance statuses for a link |


<a name="delete"></a>
# **delete**
> delete(id).execute();

Delete a tax compliance status

Delete a specific Tax compliance status from your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxComplianceStatusApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxComplianceStatusApi api = new TaxComplianceStatusApi(apiClient);
    UUID id = UUID.randomUUID(); // The `tax-compliance-status.id` that you want to delete.
    try {
      api
              .delete(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#delete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      api
              .delete(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#delete");
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
| **id** | **UUID**| The &#x60;tax-compliance-status.id&#x60; that you want to delete. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |

<a name="getDetails"></a>
# **getDetails**
> TaxComplianceStatus getDetails(id).omit(omit).fields(fields).execute();

Get a tax compliance status&#39;s details

Get the details of a specific Tax compliance status.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxComplianceStatusApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxComplianceStatusApi api = new TaxComplianceStatusApi(apiClient);
    UUID id = UUID.randomUUID(); // The `tax-compliance-status.id` you want to get detailed information about.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      TaxComplianceStatus result = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<TaxComplianceStatus> response = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#getDetails");
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
| **id** | **UUID**| The &#x60;tax-compliance-status.id&#x60; you want to get detailed information about. | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**TaxComplianceStatus**](TaxComplianceStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="list"></a>
# **list**
> TaxComplianceStatusPaginatedResponse list().page(page).pageSize(pageSize).omit(omit).fields(fields).link(link).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).id(id).idIn(idIn).linkIn(linkIn).execute();

List all tax compliance statuses

Get a paginated list of all existing Tax compliance statuses in your Belvo account. By default, we return up to 100 results per page.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxComplianceStatusApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxComplianceStatusApi api = new TaxComplianceStatusApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
    String createdAtGt = "2022-05-05"; // Return tax compliance statuses that were last updated in Belvo's database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtGte = "2022-05-04"; // Return tax compliance statuses that were last updated in Belvo's database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLt = "2022-04-01"; // Return tax compliance statuses that were last updated in Belvo's database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLte = "2022-03-30"; // Return tax compliance statuses that were last updated in Belvo's database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtRange = "2022-03-03,2022-05-04"; // Return tax compliance statuses that were last updated in Belvo's database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String id = "eb42c21c-2d9e-4dc1-89b8-9401d4beca73"; // Return information for this `tax-compliance-status.id`.
    String idIn = "eb42c21c-2d9e-4dc1-89b8-9401d4beca73,82b3f18c-055b-4f82-9fae-d2201815ab0c"; // Return information for these `tax-compliance-status.id`s.
    String linkIn = "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65"; // Return information for these `link.id`s.
    try {
      TaxComplianceStatusPaginatedResponse result = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .id(id)
              .idIn(idIn)
              .linkIn(linkIn)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<TaxComplianceStatusPaginatedResponse> response = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .id(id)
              .idIn(idIn)
              .linkIn(linkIn)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#list");
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
| **pageSize** | **Integer**| Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  | [optional] [default to 100] |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding the &#x60;link.id&#x60; filter in order to improve your performance.  | [optional] |
| **createdAtGt** | **String**| Return tax compliance statuses that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtGte** | **String**| Return tax compliance statuses that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLt** | **String**| Return tax compliance statuses that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLte** | **String**| Return tax compliance statuses that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtRange** | **String**| Return tax compliance statuses that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **id** | **String**| Return information for this &#x60;tax-compliance-status.id&#x60;. | [optional] |
| **idIn** | **String**| Return information for these &#x60;tax-compliance-status.id&#x60;s. | [optional] |
| **linkIn** | **String**| Return information for these &#x60;link.id&#x60;s. | [optional] |

### Return type

[**TaxComplianceStatusPaginatedResponse**](TaxComplianceStatusPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="retrieve"></a>
# **retrieve**
> TaxComplianceStatus retrieve(taxComplianceStatusRequest).omit(omit).fields(fields).execute();

Retrieve tax compliance statuses for a link

Retrieve the Tax compliance status information for a specific fiscal link.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxComplianceStatusApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxComplianceStatusApi api = new TaxComplianceStatusApi(apiClient);
    UUID link = UUID.randomUUID(); // The fiscal `link.id` to use.
    Boolean attachPdf = false; // When set to `true`, you will receive the PDF in binary format in the response.
    Boolean saveData = true; // Indicates whether or not to persist the data in Belvo. By default, this is set to `true` and we return a 201 Created response. When set to `false`, the data won't be persisted and we return a 200 OK response.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      TaxComplianceStatus result = api
              .retrieve(link)
              .attachPdf(attachPdf)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<TaxComplianceStatus> response = api
              .retrieve(link)
              .attachPdf(attachPdf)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxComplianceStatusApi#retrieve");
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
| **taxComplianceStatusRequest** | [**TaxComplianceStatusRequest**](TaxComplianceStatusRequest.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**TaxComplianceStatus**](TaxComplianceStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
| **201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |

