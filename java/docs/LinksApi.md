# LinksApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeAccessMode**](LinksApi.md#changeAccessMode) | **PATCH** /api/links/{id} | Change a link&#39;s access mode |
| [**completeRequest**](LinksApi.md#completeRequest) | **PATCH** /api/links | Complete a links request |
| [**destroy**](LinksApi.md#destroy) | **DELETE** /api/links/{id} | Delete a link |
| [**getDetails**](LinksApi.md#getDetails) | **GET** /api/links/{id} | Get a link&#39;s details |
| [**list**](LinksApi.md#list) | **GET** /api/links | List all links |
| [**register**](LinksApi.md#register) | **POST** /api/links | Register a new link |
| [**update**](LinksApi.md#update) | **PUT** /api/links/{id} | Update a link&#39;s credentials |


<a name="changeAccessMode"></a>
# **changeAccessMode**
> Link changeAccessMode(id, changeAccessMode).omit(omit).fields(fields).execute();

Change a link&#39;s access mode

Change a link&#39;s access mode from &#x60;single&#x60; to &#x60;recurrent&#x60; or from &#x60;recurrent&#x60; to single. ℹ️ **Note**: When you change a link from &#x60;single&#x60;&#x60; to &#x60;recurrent&#x60;, they will only be updated the next day at the scheduled interval.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.LinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    LinksApi api = new LinksApi(apiClient);
    EnumLinkAccessModeRequest accessMode = EnumLinkAccessModeRequest.fromValue("single");
    UUID id = UUID.fromString("e4bb1afb-4a4f-4dd6-8be0-e615d233185b"); // The `link.id` you want to change the `access_mode` for.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Link result = api
              .changeAccessMode(accessMode, id)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#changeAccessMode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Link> response = api
              .changeAccessMode(accessMode, id)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#changeAccessMode");
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
| **id** | **UUID**| The &#x60;link.id&#x60; you want to change the &#x60;access_mode&#x60; for. | |
| **changeAccessMode** | [**ChangeAccessMode**](ChangeAccessMode.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**Link**](Link.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="completeRequest"></a>
# **completeRequest**
> Link completeRequest(patchBodyWithoutSaveData).omit(omit).fields(fields).execute();

Complete a links request

Used to resume a Link register session that was paused because an MFA token was required by the institution.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.LinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    LinksApi api = new LinksApi(apiClient);
    String session = "session_example"; // The session you want to resume. You need to use the `session` value that is provided in the 428 Token Required response that you receive after you make your POST request.
    UUID link = UUID.randomUUID(); // The `link.id` you want to resume. Must be the same `link.id` as the one you receive in the 428 Token Required response that contains the `session` ID.
    String token = "token_example"; // The MFA token generated by the institution and required to continue a session.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Link result = api
              .completeRequest(session, link)
              .token(token)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#completeRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Link> response = api
              .completeRequest(session, link)
              .token(token)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#completeRequest");
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
| **patchBodyWithoutSaveData** | [**PatchBodyWithoutSaveData**](PatchBodyWithoutSaveData.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**Link**](Link.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="destroy"></a>
# **destroy**
> destroy(id).execute();

Delete a link

Delete a specific link and all associated accounts, transactions, and owners from your Belvo account. # Deleting links in batches To delete links in bulk, we recommend looping through the list of links you want to delete and making the delete request.    &gt; 🚧 **Rate limiting and IP blocking**   &gt;    &gt; An important technical note for performing operations in batches is to take into consideration our rate-limiting: up to 80 requests every 30 seconds. If you exceed this limit, you run the risk of Belvo blocking your IP from making further requests.   &gt;    &gt; For more information, or if your IP address has been blocked, please contact our [support team](https://support.belvo.com/hc/en-us/requests/new).

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.LinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    LinksApi api = new LinksApi(apiClient);
    UUID id = UUID.randomUUID(); // The `link.id` that you want to delete.
    try {
      api
              .destroy(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#destroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      api
              .destroy(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#destroy");
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
| **id** | **UUID**| The &#x60;link.id&#x60; that you want to delete. | |

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
> Link getDetails(id).omit(omit).fields(fields).execute();

Get a link&#39;s details

Get the details of a specific link.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.LinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    LinksApi api = new LinksApi(apiClient);
    UUID id = UUID.randomUUID(); // The `link.id` you want to get detailed information about.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Link result = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Link> response = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#getDetails");
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
| **id** | **UUID**| The &#x60;link.id&#x60; you want to get detailed information about. | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**Link**](Link.md)

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
> PaginatedResponseLink list().page(page).pageSize(pageSize).omit(omit).fields(fields).accessMode(accessMode).createdAt(createdAt).createdAtGt(createdAtGt).createdAtGte(createdAtGte).createdAtLt(createdAtLt).createdAtLte(createdAtLte).createdAtRange(createdAtRange).createdByNotIn(createdByNotIn).externalId(externalId).externalIdIn(externalIdIn).id(id).idIn(idIn).institution(institution).institutionIn(institutionIn).institutionUserId(institutionUserId).institutionUserIdIn(institutionUserIdIn).refreshRate(refreshRate).status(status).statusIn(statusIn).execute();

List all links

Get a paginated list of all the existing links in your Belvo account. By default, we return up to 100 results per page.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.LinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    LinksApi api = new LinksApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String accessMode = "single"; // Return links only with this access mode. Can be either `single` or `recurrent`.
    String createdAt = "2022-05-01"; // Return links that were last updated in Belvo's database on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtGt = "2022-05-05"; // Return links that were last updated in Belvo's database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtGte = "2022-05-04"; // Return links that were last updated in Belvo's database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLt = "2022-04-01"; // Return links that were last updated in Belvo's database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtLte = "2022-03-30"; // Return links that were last updated in Belvo's database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdAtRange = "2022-03-03,2022-05-04"; // Return links that were last updated in Belvo's database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp).
    String createdByNotIn = "578947e2-3c9a-4401-bbad-59b2f2d2b91b,d3d941ab-4ca5-43c1-8b23-db329ee4cb7e"; // Return links that were not created by these Belvo users.
    String externalId = "InternalUser4000"; // Return links with this external ID.
    String externalIdIn = "InternalUser4000,InternalUser4001"; // Return links with these external IDs.
    String id = "73694155-b871-41ec-94e3-37d17ff62b5d"; // Return information only for this `link.id`.
    String idIn = "73694155-b871-41ec-94e3-37d17ff62b5d,40968d42-7d89-49e3-9931-78baa8e0544e"; // Return information only for these `link.id`s.
    String institution = "erebor_mx_retail"; // Return links created for this institution (use the Belvo-designated name, such as `erebor_mx_retail`).
    String institutionIn = "erebor_mx_retail,gringotts_co_retail"; // Return links created for these institutions (use the Belvo-designated name, such as `erebor_mx_retail` and `gringotts_co_retail`).
    String institutionUserId = "ezFoxjPDr7YnASnOaft5F3zt7D0kurgDNlLtZFjxUo0="; // Return links with this specific institution user ID.
    String institutionUserIdIn = "ezFoxjPDr7YnASnOaft5F3zt7D0kurgDNlLtZFjxUo0=,YwuTM0uEEh1BbVgDZBcNpa_-Tm3l2q8ZkZNrlhp-pNA="; // Return links with these institution user IDs.
    String refreshRate = "24h"; // Return links with this refresh rate. Choose between `6h`, `12h`, `24h`, `7d`, or `30d`.
    String status = "invalid"; // Return links with this status. Choose between `valid`, `invalid`, `unconfirmed`, or `token_required`.
    String statusIn = "invalid,unconfirmed"; // Return links with these statuses. Choose between `valid`, `invalid`, `unconfirmed`, or `token_required`.
    try {
      PaginatedResponseLink result = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .accessMode(accessMode)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .createdByNotIn(createdByNotIn)
              .externalId(externalId)
              .externalIdIn(externalIdIn)
              .id(id)
              .idIn(idIn)
              .institution(institution)
              .institutionIn(institutionIn)
              .institutionUserId(institutionUserId)
              .institutionUserIdIn(institutionUserIdIn)
              .refreshRate(refreshRate)
              .status(status)
              .statusIn(statusIn)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<PaginatedResponseLink> response = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .accessMode(accessMode)
              .createdAt(createdAt)
              .createdAtGt(createdAtGt)
              .createdAtGte(createdAtGte)
              .createdAtLt(createdAtLt)
              .createdAtLte(createdAtLte)
              .createdAtRange(createdAtRange)
              .createdByNotIn(createdByNotIn)
              .externalId(externalId)
              .externalIdIn(externalIdIn)
              .id(id)
              .idIn(idIn)
              .institution(institution)
              .institutionIn(institutionIn)
              .institutionUserId(institutionUserId)
              .institutionUserIdIn(institutionUserIdIn)
              .refreshRate(refreshRate)
              .status(status)
              .statusIn(statusIn)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#list");
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
| **accessMode** | **String**| Return links only with this access mode. Can be either &#x60;single&#x60; or &#x60;recurrent&#x60;. | [optional] |
| **createdAt** | **String**| Return links that were last updated in Belvo&#39;s database on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtGt** | **String**| Return links that were last updated in Belvo&#39;s database after this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtGte** | **String**| Return links that were last updated in Belvo&#39;s database after or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLt** | **String**| Return links that were last updated in Belvo&#39;s database before this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtLte** | **String**| Return links that were last updated in Belvo&#39;s database before or on this date (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdAtRange** | **String**| Return links that were last updated in Belvo&#39;s database between two dates (&#x60;YYYY-MM-DD&#x60; or full &#x60;ISO-8601&#x60; timestamp). | [optional] |
| **createdByNotIn** | **String**| Return links that were not created by these Belvo users. | [optional] |
| **externalId** | **String**| Return links with this external ID. | [optional] |
| **externalIdIn** | **String**| Return links with these external IDs. | [optional] |
| **id** | **String**| Return information only for this &#x60;link.id&#x60;. | [optional] |
| **idIn** | **String**| Return information only for these &#x60;link.id&#x60;s. | [optional] |
| **institution** | **String**| Return links created for this institution (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60;). | [optional] |
| **institutionIn** | **String**| Return links created for these institutions (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60; and &#x60;gringotts_co_retail&#x60;). | [optional] |
| **institutionUserId** | **String**| Return links with this specific institution user ID. | [optional] |
| **institutionUserIdIn** | **String**| Return links with these institution user IDs. | [optional] |
| **refreshRate** | **String**| Return links with this refresh rate. Choose between &#x60;6h&#x60;, &#x60;12h&#x60;, &#x60;24h&#x60;, &#x60;7d&#x60;, or &#x60;30d&#x60;. | [optional] |
| **status** | **String**| Return links with this status. Choose between &#x60;valid&#x60;, &#x60;invalid&#x60;, &#x60;unconfirmed&#x60;, or &#x60;token_required&#x60;. | [optional] |
| **statusIn** | **String**| Return links with these statuses. Choose between &#x60;valid&#x60;, &#x60;invalid&#x60;, &#x60;unconfirmed&#x60;, or &#x60;token_required&#x60;. | [optional] |

### Return type

[**PaginatedResponseLink**](PaginatedResponseLink.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

<a name="register"></a>
# **register**
> Link register(linksRequest).omit(omit).fields(fields).execute();

Register a new link

Register a new link with your Belvo account.  &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle link creation and link status updates. &lt;/div&gt; 

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.LinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    LinksApi api = new LinksApi(apiClient);
    String institution = "institution_example"; // The Belvo name for the institution.
    String username = "username_example"; // The end-user's username (or ID) used to log in to the institution.
    String password = "password_example"; // The end-user's password used to log in to the institution.  ℹ️ **Note**: You must send through a password for all institutions except for IMSS (`imss_mx_employment`). 
    String externalId = "externalId_example"; // An additional identifier for the link, provided by you, to store in the Belvo database. **Cannot** include any Personal Identifiable Information (PII). **Must** be at least three characters long.  If we identify that the identifier contains PII, we will force a `null` value. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier).
    String username2 = "username2_example"; // The end-user's second username (or email address) used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. 
    String username3 = "username3_example"; // The end-user's third username used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a third username, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. 
    String password2 = "password2_example"; // The end-user's second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. 
    String token = "token_example"; // The MFA token required by the bank to log in.  We do not recommend sending the authentication token in the same request as registering the user. See our [Handling multi-factor authentication](https://developers.belvo.com/docs/handling-2-factor-authentication) article for more information and best practices. 
    EnumLinkAccessModeRequest accessMode = EnumLinkAccessModeRequest.fromValue("single");
    Boolean fetchHistorical = true; // Indicates whether or not to retrieve historical information for the link or not. For links where `access_mode=single`, the default is `false`. For links where `access_mode=recurrent` this is hardcoded to `true`. 
    String credentialsStorage = "credentialsStorage_example"; // Indicates whether or not to store credentials (and the duration for which to store the credentials). By default, this is set to `store`. For links where `access_mode=recurrent`, this must be set to `store`.  Choose either:   - `store` to store credentials   - `nostore` to not store credentials   - `30d` to store credentials only for 30 days 
    String usernameType = "usernameType_example"; // Type of document to be used as a username.  Some banking institutions accept different documents to be used as the `username` to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte'*, and so on.  For banks that require a document to log in, you **must** provide the `username_type` parameter to specify which document is used when creating the link.  ℹ️ To know which institutions require the `username_type` parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response.  For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | `001` | Cédula de Ciudadanía | | `002` | Cédula de Extranjería | | `003` | Pasaporte | | `004` | Tarjeta de Identidad | | `005` | Registro Civil | | `006` | Número Identificación Personal | | `020` | NIT | | `021` | NIT Persona Natural | | `022` | NIT Persona Extranjera | | `023` | NIT Persona Jurídica | | `024` | NIT Menores | | `025` | NIT Desasociado | | `030` | Trj. Seguro Social Extranjero | | `031` | Sociedad Extranjera sin NIT en Colombia | | `032` | Fideicomiso | | `033` | RIF Venezuela | | `034` | CIF | | `035` | Número de Identidad | | `036` | RTN | | `037` | Cédula de Identidad | | `038` | DIMEX | | `039` | CED | | `040` | PAS | | `041` | Documento Único de Identidad | | `042` | NIT Salvadoreño | | `100` | Agência e conta | | `101` | Código do operador | | `102` | Cartão de crédito | | `103` | CPF | 
    String certificate = "certificate_example"; // For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `certificate`. If the `certificate` parameter is used, you *must* also provide the `private_key` parameter. 
    String privateKey = "privateKey_example"; // For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `private_key`. If the `private_key` parameter is used, you *must* also provide the `certificate` parameter. 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Link result = api
              .register(institution, username)
              .password(password)
              .externalId(externalId)
              .username2(username2)
              .username3(username3)
              .password2(password2)
              .token(token)
              .accessMode(accessMode)
              .fetchHistorical(fetchHistorical)
              .credentialsStorage(credentialsStorage)
              .usernameType(usernameType)
              .certificate(certificate)
              .privateKey(privateKey)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#register");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Link> response = api
              .register(institution, username)
              .password(password)
              .externalId(externalId)
              .username2(username2)
              .username3(username3)
              .password2(password2)
              .token(token)
              .accessMode(accessMode)
              .fetchHistorical(fetchHistorical)
              .credentialsStorage(credentialsStorage)
              .usernameType(usernameType)
              .certificate(certificate)
              .privateKey(privateKey)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#register");
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
| **linksRequest** | [**LinksRequest**](LinksRequest.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**Link**](Link.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="update"></a>
# **update**
> Link update(id, linksPutRequest).omit(omit).fields(fields).execute();

Update a link&#39;s credentials

Update the credentials of a specific link. If the successfully updated link is a recurrent one, we automatically trigger an update of the link. If we find fresh data, you&#39;ll [receive historical update](https://developers.belvo.com/docs/webhooks) webhooks. &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #4CAF50;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Note: &lt;/strong&gt; We recommend using our &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/connect-widget\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Connect Widget&lt;/a&gt; to handle updating &lt;code&gt;invalid&lt;/code&gt; or &lt;code&gt;token_required&lt;/code&gt; links. &lt;/div&gt; 

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.LinksApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    LinksApi api = new LinksApi(apiClient);
    String password = "password_example"; // The end-user's password used to log in to the institution.
    UUID id = UUID.randomUUID(); // The `link.id` you want to update.
    String password2 = "password2_example"; // The end-user's second password used to log in to the institution.  ℹ️ This is only required by some institutions. To know which institutions require a second password, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response. 
    String token = "token_example"; // The MFA token required by the bank to log in. 
    String usernameType = "usernameType_example"; // Type of document to be used as a username.    Some banking institutions accept different documents to be used as the `username` to login. For example, the *Cédula de Ciudadanía*, *Cédula de Extranjería*, *Pasaporte'*, and so on.    For banks that require a document to log in, you **must** provide the `username_type` parameter to specify which document is used when creating the link.    ℹ️ To know which institutions require the `username_type` parameter, get the [details](https://developers.belvo.com/reference/detailinstitution) for the institution and check the `form_fields` array in the response.    For a list of standards codes, see the table below.  | Code | Description | |-----------|-------| | `001` | Cédula de Ciudadanía | | `002` | Cédula de Extranjería | | `003` | Pasaporte | | `004` | Tarjeta de Identidad | | `005` | Registro Civil | | `006` | Número Identificación Personal | | `020` | NIT | | `021` | NIT Persona Natural | | `022` | NIT Persona Extranjera | | `023` | NIT Persona Jurídica | | `024` | NIT Menores | | `025` | NIT Desasociado | | `030` | Trj. Seguro Social Extranjero | | `031` | Sociedad Extranjera sin NIT en Colombia | | `032` | Fideicomiso | | `033` | RIF Venezuela | | `034` | CIF | | `035` | Número de Identidad | | `036` | RTN | | `037` | Cédula de Identidad | | `038` | DIMEX | | `039` | CED | | `040` | PAS | | `041` | Documento Único de Identidad | | `042` | NIT Salvadoreño | | `100` | Agência e conta | | `101` | Código do operador | | `102` | Cartão de crédito | | `103` | CPF | 
    String certificate = "certificate_example"; // For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `certificate`. If the `certificate` parameter is used, you *must* also provide the `private_key` parameter. 
    String privateKey = "privateKey_example"; // For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.  Belvo supports a base64 encoded `private_key`. If the `private_key` parameter is used, you *must* also provide the `certificate` parameter. 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Link result = api
              .update(password, id)
              .password2(password2)
              .token(token)
              .usernameType(usernameType)
              .certificate(certificate)
              .privateKey(privateKey)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#update");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Link> response = api
              .update(password, id)
              .password2(password2)
              .token(token)
              .usernameType(usernameType)
              .certificate(certificate)
              .privateKey(privateKey)
              .omit(omit)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LinksApi#update");
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
| **id** | **UUID**| The &#x60;link.id&#x60; you want to update. | |
| **linksPutRequest** | [**LinksPutRequest**](LinksPutRequest.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**Link**](Link.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |

