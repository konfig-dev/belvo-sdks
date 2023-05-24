# TaxDeclarationsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](TaxDeclarationsApi.md#delete) | **DELETE** /api/tax-declarations/{id} | Delete a tax declration |
| [**getDetails**](TaxDeclarationsApi.md#getDetails) | **GET** /api/tax-declarations/{id} | Get a tax declaration&#39;s details |
| [**list**](TaxDeclarationsApi.md#list) | **GET** /api/tax-declarations | List all tax declarations |
| [**retrieve**](TaxDeclarationsApi.md#retrieve) | **POST** /api/tax-declarations | Retrieve tax declarations for a link |


<a name="delete"></a>
# **delete**
> delete(id).execute();

Delete a tax declration

Delete a specific Tax declaration from your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxDeclarationsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxDeclarationsApi api = new TaxDeclarationsApi(apiClient);
    UUID id = UUID.randomUUID(); // The `tax-declration.id` that you want to delete.
    try {
      api
              .delete(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxDeclarationsApi#delete");
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
      System.err.println("Exception when calling TaxDeclarationsApi#delete");
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
| **id** | **UUID**| The &#x60;tax-declration.id&#x60; that you want to delete. | |

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
> Object getDetails(id).omit(omit).fields(fields).execute();

Get a tax declaration&#39;s details

Get the details of a specific Tax declaration.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxDeclarationsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxDeclarationsApi api = new TaxDeclarationsApi(apiClient);
    UUID id = UUID.randomUUID(); // The `tax-declaration.id` you want to get detailed information about.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Object result = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxDeclarationsApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Object> response = api
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
      System.err.println("Exception when calling TaxDeclarationsApi#getDetails");
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
| **id** | **UUID**| The &#x60;tax-declaration.id&#x60; you want to get detailed information about. | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

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
| **200** | Ok |  -  |

<a name="list"></a>
# **list**
> Object list().page(page).pageSize(pageSize).omit(omit).fields(fields).link(link).linkIn(linkIn).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).id(id).idIn(idIn).year(year).yearGt(yearGt).yearGte(yearGte).yearLt(yearLt).yearLte(yearLte).yearRange(yearRange).execute();

List all tax declarations

Get a paginated list of all existing tax declarations in your Belvo account. By default, we return up to 100 results per page.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxDeclarationsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxDeclarationsApi api = new TaxDeclarationsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
    String linkIn = "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65"; // Return information for these `link.id`s.
    String createdAtGt = "2022-05-05"; // Return tax declarations that were last updated in Belvo's database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtGte = "2022-05-04"; // Return tax declarations that were last updated in Belvo's database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLt = "2022-04-01"; // Return tax declarations that were last updated in Belvo's database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLte = "2022-03-30"; // Return tax declarations that were last updated in Belvo's database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtRange = "2022-03-03,2022-05-04"; // Return tax declarations that were last updated in Belvo's database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String id = "eb42c21c-2d9e-4dc1-89b8-9401d4beca73"; // Return information for this `tax-declaration.id`.
    String idIn = "eb42c21c-2d9e-4dc1-89b8-9401d4beca73,82b3f18c-055b-4f82-9fae-d2201815ab0c"; // Return information for these `tax-declaration.id`s.
    String year = "2021"; // Return tax declarations for this year (`YYYY`).
    String yearGt = "2020"; // Return tax declarations for after this year (`YYYY`).
    String yearGte = "2019"; // Return tax declarations for this year or after (`YYYY`).
    String yearLt = "2018"; // Return tax declarations for before this year (`YYYY`).
    String yearLte = "2017"; // Return tax declarations for this year or earlier (`YYYY`).
    String yearRange = "2017,2021"; // Return tax declarations between these two years (`YYYY`).
    try {
      Object result = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .linkIn(linkIn)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .id(id)
              .idIn(idIn)
              .year(year)
              .yearGt(yearGt)
              .yearGte(yearGte)
              .yearLt(yearLt)
              .yearLte(yearLte)
              .yearRange(yearRange)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxDeclarationsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Object> response = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .linkIn(linkIn)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .id(id)
              .idIn(idIn)
              .year(year)
              .yearGt(yearGt)
              .yearGte(yearGte)
              .yearLt(yearLt)
              .yearLte(yearLte)
              .yearRange(yearRange)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxDeclarationsApi#list");
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
| **linkIn** | **String**| Return information for these &#x60;link.id&#x60;s. | [optional] |
| **createdAtGt** | **String**| Return tax declarations that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtGte** | **String**| Return tax declarations that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLt** | **String**| Return tax declarations that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLte** | **String**| Return tax declarations that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtRange** | **String**| Return tax declarations that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **id** | **String**| Return information for this &#x60;tax-declaration.id&#x60;. | [optional] |
| **idIn** | **String**| Return information for these &#x60;tax-declaration.id&#x60;s. | [optional] |
| **year** | **String**| Return tax declarations for this year (&#x60;YYYY&#x60;). | [optional] |
| **yearGt** | **String**| Return tax declarations for after this year (&#x60;YYYY&#x60;). | [optional] |
| **yearGte** | **String**| Return tax declarations for this year or after (&#x60;YYYY&#x60;). | [optional] |
| **yearLt** | **String**| Return tax declarations for before this year (&#x60;YYYY&#x60;). | [optional] |
| **yearLte** | **String**| Return tax declarations for this year or earlier (&#x60;YYYY&#x60;). | [optional] |
| **yearRange** | **String**| Return tax declarations between these two years (&#x60;YYYY&#x60;). | [optional] |

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
| **200** | Ok |  -  |

<a name="retrieve"></a>
# **retrieve**
> List&lt;Object&gt; retrieve(taxDeclarationsRequest).omit(omit).fields(fields).execute();

Retrieve tax declarations for a link

Retrieve tax declaration information for a specific fiscal link.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxDeclarationsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxDeclarationsApi api = new TaxDeclarationsApi(apiClient);
    UUID link = UUID.randomUUID(); // The fiscal `link.id` you want specific tax declaration information for.
    String yearFrom = "yearFrom_example"; // The starting year you want to get tax declaration for, in `YYYY` format. 
    String yearTo = "yearTo_example"; // The year you want to stop getting tax declaration for, in `YYYY` format. 
    Boolean attachPdf = false; // When this is set to `true`, you will receive the PDF as a binary string in the response.
    Boolean saveData = true; // Indicates whether or not to persist the data in Belvo. By default, this is set to `true` and we return a 201 Created response. When set to `false`, the data won't be persisted and we return a 200 OK response.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      List<Object> result = api
              .retrieve(link, yearFrom, yearTo)
              .attachPdf(attachPdf)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxDeclarationsApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<List<Object>> response = api
              .retrieve(link, yearFrom, yearTo)
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
      System.err.println("Exception when calling TaxDeclarationsApi#retrieve");
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
| **taxDeclarationsRequest** | [**TaxDeclarationsRequest**](TaxDeclarationsRequest.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

**List&lt;Object&gt;**

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

