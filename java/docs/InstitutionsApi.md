# InstitutionsApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](InstitutionsApi.md#getDetails) | **GET** /api/institutions/{id} | Get an institution&#39;s details |
| [**list**](InstitutionsApi.md#list) | **GET** /api/institutions | List all institutions |


<a name="getDetails"></a>
# **getDetails**
> Institution getDetails(id).omit(omit).fields(fields).execute();

Get an institution&#39;s details

Get the details of a specific institution.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.InstitutionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    InstitutionsApi api = new InstitutionsApi(apiClient);
    String id = "id_example"; // The `institution.id` you want to get detailed information about.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Institution result = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Institution> response = api
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
      System.err.println("Exception when calling InstitutionsApi#getDetails");
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
| **id** | **String**| The &#x60;institution.id&#x60; you want to get detailed information about. | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**Institution**](Institution.md)

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
> InstitutionsPaginatedResponse list().page(page).pageSize(pageSize).omit(omit).fields(fields).countryCode(countryCode).countryCodeIn(countryCodeIn).displayName(displayName).name(name).nameIn(nameIn).resourcesAllin(resourcesAllin).status(status).statusIn(statusIn).type(type).typeIn(typeIn).website(website).execute();

List all institutions

Get a paginated list of all the institutions currently supported by Belvo. By default, we return up to 100 results per page.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.InstitutionsApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    InstitutionsApi api = new InstitutionsApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String countryCode = "MX"; // Return institutions only for this two-letter country code.
    String countryCodeIn = "CO,BR"; // Return institutions only for these two-letter country codes.
    String displayName = "Erebor Bank"; // Return institutions that partially match this display name.
    String name = "name_example";
    String nameIn = "erebor_br_retail,gotham_co_business"; // Return institutions with one or more of these Belvo-designated names.
    String resourcesAllin = "ACCOUNTS,OWNERS,TRANSACTIONS"; // Return institutions that support these resources.
    String status = "healthy"; // Return institutions with the given status. You can choose between `healthy` or `down`.
    String statusIn = "healthy,down"; // Return institutions with one of the given statuses. You can choose between `healthy` or `down`.
    String type = "fiscal"; // Return institutions of this type. You can choose between `bank` or `fiscal`.
    String typeIn = "fiscal,bank"; // Return institutions of one of these types. You can choose between `bank` or `fiscal`.
    String website = "https://www.erebor.mx"; // Return institutions with this website URL.
    try {
      InstitutionsPaginatedResponse result = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .countryCode(countryCode)
              .countryCodeIn(countryCodeIn)
              .displayName(displayName)
              .name(name)
              .nameIn(nameIn)
              .resourcesAllin(resourcesAllin)
              .status(status)
              .statusIn(statusIn)
              .type(type)
              .typeIn(typeIn)
              .website(website)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<InstitutionsPaginatedResponse> response = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .countryCode(countryCode)
              .countryCodeIn(countryCodeIn)
              .displayName(displayName)
              .name(name)
              .nameIn(nameIn)
              .resourcesAllin(resourcesAllin)
              .status(status)
              .statusIn(statusIn)
              .type(type)
              .typeIn(typeIn)
              .website(website)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#list");
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
| **countryCode** | **String**| Return institutions only for this two-letter country code. | [optional] |
| **countryCodeIn** | **String**| Return institutions only for these two-letter country codes. | [optional] |
| **displayName** | **String**| Return institutions that partially match this display name. | [optional] |
| **name** | **String**|  | [optional] |
| **nameIn** | **String**| Return institutions with one or more of these Belvo-designated names. | [optional] |
| **resourcesAllin** | **String**| Return institutions that support these resources. | [optional] |
| **status** | **String**| Return institutions with the given status. You can choose between &#x60;healthy&#x60; or &#x60;down&#x60;. | [optional] |
| **statusIn** | **String**| Return institutions with one of the given statuses. You can choose between &#x60;healthy&#x60; or &#x60;down&#x60;. | [optional] |
| **type** | **String**| Return institutions of this type. You can choose between &#x60;bank&#x60; or &#x60;fiscal&#x60;. | [optional] |
| **typeIn** | **String**| Return institutions of one of these types. You can choose between &#x60;bank&#x60; or &#x60;fiscal&#x60;. | [optional] |
| **website** | **String**| Return institutions with this website URL. | [optional] |

### Return type

[**InstitutionsPaginatedResponse**](InstitutionsPaginatedResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

