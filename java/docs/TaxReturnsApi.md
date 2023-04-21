# TaxReturnsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**delete**](TaxReturnsApi.md#delete) | **DELETE** /api/tax-returns/{id} | Delete a tax return |
| [**getDetails**](TaxReturnsApi.md#getDetails) | **GET** /api/tax-returns/{id} | Get a tax return&#39;s details |
| [**list**](TaxReturnsApi.md#list) | **GET** /api/tax-returns | List all tax returns |
| [**retrieve**](TaxReturnsApi.md#retrieve) | **POST** /api/tax-returns | Retrieve tax returns for a link |


<a name="delete"></a>
# **delete**
> delete(id).execute();

Delete a tax return

Delete a specific tax return from your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxReturnsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxReturnsApi api = new TaxReturnsApi(apiClient);
    UUID id = UUID.randomUUID(); // The ID of the tax return you want to delete.
    try {
      api
              .delete(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxReturnsApi#delete");
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
      System.err.println("Exception when calling TaxReturnsApi#delete");
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
| **id** | **UUID**| The ID of the tax return you want to delete. | |

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

Get a tax return&#39;s details

Get the details of a specific tax return.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxReturnsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxReturnsApi api = new TaxReturnsApi(apiClient);
    UUID id = UUID.randomUUID(); // The `tax-return.id` you want to get detailed information about.
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
      System.err.println("Exception when calling TaxReturnsApi#getDetails");
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
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxReturnsApi#getDetails");
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
| **id** | **UUID**| The &#x60;tax-return.id&#x60; you want to get detailed information about. | |
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
> Object list().page(page).pageSize(pageSize).omit(omit).fields(fields).link(link).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).id(id).idIn(idIn).ejercicio(ejercicio).ejercicioLt(ejercicioLt).ejercicioLte(ejercicioLte).ejercicioGt(ejercicioGt).ejercicioGte(ejercicioGte).ejercicioRange(ejercicioRange).tipoDeclaracion(tipoDeclaracion).tipoDeclaracionIn(tipoDeclaracionIn).linkIn(linkIn).execute();

List all tax returns

Get a paginated list of all existing tax returns in your Belvo account. By default, we return up to 100 results per page. The results will include a mix of both monthly and yearly tax returns.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxReturnsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxReturnsApi api = new TaxReturnsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance. 
    String createdAtGt = "2022-05-05"; // Return tax returns that were last updated in Belvo's database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtGte = "2022-05-04"; // Return tax returns that were last updated in Belvo's database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLt = "2022-04-01"; // Return tax returns that were last updated in Belvo's database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLte = "2022-03-30"; // Return tax returns that were last updated in Belvo's database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtRange = "2022-03-03,2022-05-04"; // Return tax returns that were last updated in Belvo's database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String id = "eb42c21c-2d9e-4dc1-89b8-9401d4beca73"; // Return information for this `tax-return.id`.
    String idIn = "eb42c21c-2d9e-4dc1-89b8-9401d4beca73,82b3f18c-055b-4f82-9fae-d2201815ab0c"; // Return information for these `tax-return.id`s.
    String ejercicio = "2018"; // Return tax returns for exactly this year (`YYYY`).
    String ejercicioLt = "2020"; // Return tax returns for before this year (`YYYY`).
    String ejercicioLte = "2021"; // Return tax returns for this year and earlier (`YYYY`).
    String ejercicioGt = "2019"; // Return tax returns for after this year (`YYYY`).
    String ejercicioGte = "2017"; // Return tax returns for this year or later (`YYYY`).
    String ejercicioRange = "2015,2021"; // Return tax returns for this range of years (`YYYY`).
    String tipoDeclaracion = "Normal"; // Return tax returns with this declaration type.
    String tipoDeclaracionIn = "Normal,Commercial"; // Return tax returns with these declaration types.
    String linkIn = "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65"; // Return information for these `link.id`s.
    try {
      Object result = api
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
              .ejercicio(ejercicio)
              .ejercicioLt(ejercicioLt)
              .ejercicioLte(ejercicioLte)
              .ejercicioGt(ejercicioGt)
              .ejercicioGte(ejercicioGte)
              .ejercicioRange(ejercicioRange)
              .tipoDeclaracion(tipoDeclaracion)
              .tipoDeclaracionIn(tipoDeclaracionIn)
              .linkIn(linkIn)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxReturnsApi#list");
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
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .id(id)
              .idIn(idIn)
              .ejercicio(ejercicio)
              .ejercicioLt(ejercicioLt)
              .ejercicioLte(ejercicioLte)
              .ejercicioGt(ejercicioGt)
              .ejercicioGte(ejercicioGte)
              .ejercicioRange(ejercicioRange)
              .tipoDeclaracion(tipoDeclaracion)
              .tipoDeclaracionIn(tipoDeclaracionIn)
              .linkIn(linkIn)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxReturnsApi#list");
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
| **createdAtGt** | **String**| Return tax returns that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtGte** | **String**| Return tax returns that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLt** | **String**| Return tax returns that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLte** | **String**| Return tax returns that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtRange** | **String**| Return tax returns that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **id** | **String**| Return information for this &#x60;tax-return.id&#x60;. | [optional] |
| **idIn** | **String**| Return information for these &#x60;tax-return.id&#x60;s. | [optional] |
| **ejercicio** | **String**| Return tax returns for exactly this year (&#x60;YYYY&#x60;). | [optional] |
| **ejercicioLt** | **String**| Return tax returns for before this year (&#x60;YYYY&#x60;). | [optional] |
| **ejercicioLte** | **String**| Return tax returns for this year and earlier (&#x60;YYYY&#x60;). | [optional] |
| **ejercicioGt** | **String**| Return tax returns for after this year (&#x60;YYYY&#x60;). | [optional] |
| **ejercicioGte** | **String**| Return tax returns for this year or later (&#x60;YYYY&#x60;). | [optional] |
| **ejercicioRange** | **String**| Return tax returns for this range of years (&#x60;YYYY&#x60;). | [optional] |
| **tipoDeclaracion** | **String**| Return tax returns with this declaration type. | [optional] |
| **tipoDeclaracionIn** | **String**| Return tax returns with these declaration types. | [optional] |
| **linkIn** | **String**| Return information for these &#x60;link.id&#x60;s. | [optional] |

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
> List&lt;Object&gt; retrieve(body).omit(omit).fields(fields).execute();

Retrieve tax returns for a link

Retrieve tax return information for a specific fiscal link.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.TaxReturnsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    TaxReturnsApi api = new TaxReturnsApi(apiClient);
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      List<Object> result = api
              .retrieve()
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxReturnsApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<List<Object>> response = api
              .retrieve()
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxReturnsApi#retrieve");
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
| **body** | **Object**|  | |
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

