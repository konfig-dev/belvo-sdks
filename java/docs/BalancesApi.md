# BalancesApi

All URIs are relative to *https://sandbox.belvo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeRequest**](BalancesApi.md#completeRequest) | **PATCH** /api/balances | Complete a balances request |
| [**delete**](BalancesApi.md#delete) | **DELETE** /api/balances/{id} | Delete a balance |
| [**getDetails**](BalancesApi.md#getDetails) | **GET** /api/balances/{id} | Get a balance&#39;s details |
| [**list**](BalancesApi.md#list) | **GET** /api/balances | List all balances |
| [**retrieve**](BalancesApi.md#retrieve) | **POST** /api/balances | Retrieve balances for a link |


<a name="completeRequest"></a>
# **completeRequest**
> List&lt;Balance&gt; completeRequest(patchBody).omit(omit).fields(fields).execute();

Complete a balances request

Used to resume a Balance retrieve session that was paused because an MFA token was required by the institution.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BalancesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BalancesApi api = new BalancesApi(apiClient);
    String session = "session_example"; // The session you want to resume. You need to use the `session` value that is provided in the 428 Token Required response that you receive after you make your POST request.
    UUID link = UUID.randomUUID(); // The `link.id` you want to resume. Must be the same `link.id` as the one you receive in the 428 Token Required response that contains the `session` ID.
    String token = "token_example"; // The MFA token generated by the institution and required to continue a session.
    Boolean saveData = true; // Indicates whether or not to persist the data in Belvo. By default, this is set to `true` and we return a 201 Created response. When set to `false`, the data won't be persisted and we return a 200 OK response.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      List<Balance> result = api
              .completeRequest(session, link)
              .token(token)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#completeRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<List<Balance>> response = api
              .completeRequest(session, link)
              .token(token)
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
      System.err.println("Exception when calling BalancesApi#completeRequest");
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
| **patchBody** | [**PatchBody**](PatchBody.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**List&lt;Balance&gt;**](Balance.md)

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

<a name="delete"></a>
# **delete**
> delete(id).execute();

Delete a balance

Delete a specific balance from your Belvo account.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BalancesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BalancesApi api = new BalancesApi(apiClient);
    UUID id = UUID.randomUUID(); // The `balance.id` that you want to delete.
    try {
      api
              .delete(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#delete");
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
      System.err.println("Exception when calling BalancesApi#delete");
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
| **id** | **UUID**| The &#x60;balance.id&#x60; that you want to delete. | |

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
> Balance getDetails(id).omit(omit).fields(fields).execute();

Get a balance&#39;s details

Get the details of a specific balance.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BalancesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BalancesApi api = new BalancesApi(apiClient);
    UUID id = UUID.randomUUID(); // The `balance.id` you want to get detailed information about.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      Balance result = api
              .getDetails(id)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#getDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<Balance> response = api
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
      System.err.println("Exception when calling BalancesApi#getDetails");
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
| **id** | **UUID**| The &#x60;balance.id&#x60; you want to get detailed information about. | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**Balance**](Balance.md)

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
> BalancesPaginatedResponse list().page(page).pageSize(pageSize).omit(omit).fields(fields).link(link).account(account).accountIn(accountIn).accountType(accountType).accountTypeIn(accountTypeIn).balance(balance).balanceLt(balanceLt).balanceLte(balanceLte).balanceGt(balanceGt).balanceGte(balanceGte).balanceRange(balanceRange).currency(currency).currencyIn(currencyIn).id(id).idIn(idIn).institution(institution).institutionIn(institutionIn).linkIn(linkIn).valueDate(valueDate).valueDateGt(valueDateGt).valueDateGte(valueDateGte).valueDateLt(valueDateLt).valueDateLte(valueDateLte).valueDateRange(valueDateRange).execute();

List all balances

Get a paginated list of all existing balances in your Belvo account. By default, we return up to 100 results per page.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BalancesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BalancesApi api = new BalancesApi(apiClient);
    Integer page = 1; // A page number within the paginated result set.
    Integer pageSize = 100; // Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000). 
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    UUID link = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // The `link.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
    UUID account = UUID.fromString("8848bd0c-9c7e-4f53-a732-ec896b11d4c4"); // The `account.id` you want to filter by.  ℹ️ We highly recommend adding either the `link.id` or the `account.id` filters in order to improve your performance. 
    String accountIn = "24ccab1d-3a86-4136-a6eb-e04bf52b356f,beb2b197-3cf7-428d-bef3-f415c0d57509"; // Return balances only for these `account.id`s.
    String accountType = "Cuentas de efectivo"; // Return information only for accounts matching this account type, as designated by the institution.
    String accountTypeIn = "Cuentas de efectivo,Credito"; // Return information only for accounts matching these account types, as designated by the institution.
    String balance = "530.00"; // Return balances matching exactly this value.
    String balanceLt = "540.00"; // Return balances less than this value.
    String balanceLte = "541.00"; // Return balances less than or equal to this value.
    String balanceGt = "520.00"; // Return balances greater than this value.
    String balanceGte = "519.00"; // Return balances greater than or equal to this value.
    String balanceRange = "519.00,541.00"; // Return balances between these two values.
    String currency = "COP"; // Return balances that are in this three-letter currency code.
    String currencyIn = "COP,MXN"; // Return balances that are in these three-letter currency codes.
    String id = "73694155-b871-41ec-94e3-37d17ff62b5d"; // Return information only for this `balance.id`.
    String idIn = "73694155-b871-41ec-94e3-37d17ff62b5d,40968d42-7d89-49e3-9931-78baa8e0544e"; // Return information only for these `balance.id`s.
    String institution = "erebor_mx_retail"; // Return balances only for this institution (use the Belvo-designated name, such as `erebor_mx_retail`).
    String institutionIn = "erebor_mx_retail,gringotts_mx_retail"; // Return balances only for these institutions (use the Belvo-designated names, such as `erebor_mx_retail` and `gringotts_mx_retail`).
    String linkIn = "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65"; // Return balances only for these `link.id`s.
    String valueDate = "2022-05-05"; // Return balances for exactly this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateGt = "2022-05-06"; // Return balances for after this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateGte = "2022-05-04"; // Return balances for this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateLt = "2022-03-02"; // Return balances for before this date (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateLte = "2022-03-01"; // Return balances for this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp).
    String valueDateRange = "2022-03-01,2022-05-06"; // Return balances for this date range (`YYYY-MM-DD` or full ISO-8601 timestamp).
    try {
      BalancesPaginatedResponse result = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .account(account)
              .accountIn(accountIn)
              .accountType(accountType)
              .accountTypeIn(accountTypeIn)
              .balance(balance)
              .balanceLt(balanceLt)
              .balanceLte(balanceLte)
              .balanceGt(balanceGt)
              .balanceGte(balanceGte)
              .balanceRange(balanceRange)
              .currency(currency)
              .currencyIn(currencyIn)
              .id(id)
              .idIn(idIn)
              .institution(institution)
              .institutionIn(institutionIn)
              .linkIn(linkIn)
              .valueDate(valueDate)
              .valueDateGt(valueDateGt)
              .valueDateGte(valueDateGte)
              .valueDateLt(valueDateLt)
              .valueDateLte(valueDateLte)
              .valueDateRange(valueDateRange)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#list");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<BalancesPaginatedResponse> response = api
              .list()
              .page(page)
              .pageSize(pageSize)
              .omit(omit)
              .fields(fields)
              .link(link)
              .account(account)
              .accountIn(accountIn)
              .accountType(accountType)
              .accountTypeIn(accountTypeIn)
              .balance(balance)
              .balanceLt(balanceLt)
              .balanceLte(balanceLte)
              .balanceGt(balanceGt)
              .balanceGte(balanceGte)
              .balanceRange(balanceRange)
              .currency(currency)
              .currencyIn(currencyIn)
              .id(id)
              .idIn(idIn)
              .institution(institution)
              .institutionIn(institutionIn)
              .linkIn(linkIn)
              .valueDate(valueDate)
              .valueDateGt(valueDateGt)
              .valueDateGte(valueDateGte)
              .valueDateLt(valueDateLt)
              .valueDateLte(valueDateLte)
              .valueDateRange(valueDateRange)
              .executeWithHttpInfo();
      System.out.println(response.getData());
      System.out.println(response.getHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#list");
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
| **link** | **UUID**| The &#x60;link.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **account** | **UUID**| The &#x60;account.id&#x60; you want to filter by.  ℹ️ We highly recommend adding either the &#x60;link.id&#x60; or the &#x60;account.id&#x60; filters in order to improve your performance.  | [optional] |
| **accountIn** | **String**| Return balances only for these &#x60;account.id&#x60;s. | [optional] |
| **accountType** | **String**| Return information only for accounts matching this account type, as designated by the institution. | [optional] |
| **accountTypeIn** | **String**| Return information only for accounts matching these account types, as designated by the institution. | [optional] |
| **balance** | **String**| Return balances matching exactly this value. | [optional] |
| **balanceLt** | **String**| Return balances less than this value. | [optional] |
| **balanceLte** | **String**| Return balances less than or equal to this value. | [optional] |
| **balanceGt** | **String**| Return balances greater than this value. | [optional] |
| **balanceGte** | **String**| Return balances greater than or equal to this value. | [optional] |
| **balanceRange** | **String**| Return balances between these two values. | [optional] |
| **currency** | **String**| Return balances that are in this three-letter currency code. | [optional] |
| **currencyIn** | **String**| Return balances that are in these three-letter currency codes. | [optional] |
| **id** | **String**| Return information only for this &#x60;balance.id&#x60;. | [optional] |
| **idIn** | **String**| Return information only for these &#x60;balance.id&#x60;s. | [optional] |
| **institution** | **String**| Return balances only for this institution (use the Belvo-designated name, such as &#x60;erebor_mx_retail&#x60;). | [optional] |
| **institutionIn** | **String**| Return balances only for these institutions (use the Belvo-designated names, such as &#x60;erebor_mx_retail&#x60; and &#x60;gringotts_mx_retail&#x60;). | [optional] |
| **linkIn** | **String**| Return balances only for these &#x60;link.id&#x60;s. | [optional] |
| **valueDate** | **String**| Return balances for exactly this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateGt** | **String**| Return balances for after this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateGte** | **String**| Return balances for this date or later (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateLt** | **String**| Return balances for before this date (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateLte** | **String**| Return balances for this date or earlier (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |
| **valueDateRange** | **String**| Return balances for this date range (&#x60;YYYY-MM-DD&#x60; or full ISO-8601 timestamp). | [optional] |

### Return type

[**BalancesPaginatedResponse**](BalancesPaginatedResponse.md)

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
> List&lt;Balance&gt; retrieve(balancesRequest).omit(omit).fields(fields).execute();

Retrieve balances for a link

Retrieve balances from one or more accounts for a specific link within a specified date range.

### Example
```java
import com.belvo.client.ApiClient;
import com.belvo.client.ApiException;
import com.belvo.client.ApiResponse;
import com.belvo.client.Configuration;
import com.belvo.client.auth.*;
import com.belvo.client.model.*;
import com.belvo.client.api.BalancesApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    // Set custom base path if desired
    // apiClient.setBasePath("https://sandbox.belvo.com");
    
    // Configure HTTP basic authorization: basicAuth
    apiClient.setUsername("YOUR USERNAME");
    apiClient.setPassword("YOUR PASSWORD");

    BalancesApi api = new BalancesApi(apiClient);
    UUID link = UUID.randomUUID(); // The `link.id` that you want to get information for.
    String dateFrom = "dateFrom_example"; // Date from which you want to start receiving balances, in `YYYY-MM-DD` format.  ⚠️ The value of `date_from` cannot be greater than `date_to`.
    String dateTo = "dateTo_example"; // Date that you want to stop receiving balances, in `YYYY-MM-DD` format.  ⚠️ The value of `date_to` cannot be greater than today's date (in other words, no future dates).
    UUID account = UUID.randomUUID(); // If provided, only balances matching this `account.id` are returned.
    String token = "token_example"; // The OTP token generated by the bank.
    Boolean saveData = true; // Indicates whether or not to persist the data in Belvo. By default, this is set to `true` and we return a 201 Created response. When set to `false`, the data won't be persisted and we return a 200 OK response.
    String omit = "link,balance"; // Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    String fields = "link,balance,account"; // Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article.
    try {
      List<Balance> result = api
              .retrieve(link, dateFrom, dateTo)
              .account(account)
              .token(token)
              .saveData(saveData)
              .omit(omit)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.toJson()); // Serialize response back to JSON 
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#retrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request 
    try {
      ApiResponse<List<Balance>> response = api
              .retrieve(link, dateFrom, dateTo)
              .account(account)
              .token(token)
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
      System.err.println("Exception when calling BalancesApi#retrieve");
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
| **balancesRequest** | [**BalancesRequest**](BalancesRequest.md)|  | |
| **omit** | **String**| Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |
| **fields** | **String**| Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | [optional] |

### Return type

[**List&lt;Balance&gt;**](Balance.md)

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

