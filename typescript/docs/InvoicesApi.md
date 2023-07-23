# InvoicesApi

All URIs are relative to *https://sandbox.belvo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**completeRequest**](InvoicesApi.md#completeRequest) | **PATCH** /api/invoices | Complete an invoices request
[**delete**](InvoicesApi.md#delete) | **DELETE** /api/invoices/{id} | Delete an invoice
[**getDetails**](InvoicesApi.md#getDetails) | **GET** /api/invoices/{id} | Get an invoice\&#39;s details
[**list**](InvoicesApi.md#list) | **GET** /api/invoices | List all invoices
[**retrieve**](InvoicesApi.md#retrieve) | **POST** /api/invoices | Retrieve invoices for a link


# **completeRequest**

#### **PATCH** /api/invoices

### Description
Used to resume an Invoice retrieve session that was paused because an MFA token was required by the institution.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const completeRequestResponse = await belvo.invoices.completeRequest({
  omit: "link,balance",
  fields: "link,balance,account",
  session: "6e7b283c6efa449c9c028a16b5c249fa",
  token: "1234ab",
  link: "683005d6-f45c-4adb-b289-f1a12f50f80c",
  save_data: true,
});

console.log(completeRequestResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patchBody** | **PatchBody**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<InvoicesResponsePaginatedResponseResultsInner>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
**201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**428** | MFA Token Required |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **delete**

#### **DELETE** /api/invoices/{id}

### Description
Delete a specific invoice from your Belvo account.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const deleteResponse = await belvo.invoices.delete({
  id: "id_example",
});

console.log(deleteResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `invoice.id` that you want to delete. | defaults to undefined


### Return type

void (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No content |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **getDetails**

#### **GET** /api/invoices/{id}

### Description
Get the details of a specific invoice.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const getDetailsResponse = await belvo.invoices.getDetails({
  id: "id_example",
  omit: "link,balance",
  fields: "link,balance,account",
});

console.log(getDetailsResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | The `invoice.id` you want to get detailed information about. | defaults to undefined
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**InvoicesGetDetailsResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **list**

#### **GET** /api/invoices

### Description
Get a paginated list of all existing invoices in your Belvo account. By default, we return 100 results per page.

### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const listResponse = await belvo.invoices.list({
  page: 1,
  pageSize: 100,
  omit: "link,balance",
  fields: "link,balance,account",
  link: "8848bd0c-9c7e-4f53-a732-ec896b11d4c4",
  createdAtGt: "2022-05-05",
  createdAtGte: "2022-05-04",
  createdAtLt: "2022-04-01",
  createdAtLte: "2022-03-30",
  createdAtRange: "2022-03-03,2022-05-04",
  id: "73694155-b871-41ec-94e3-37d17ff62b5d",
  idIn: "73694155-b871-41ec-94e3-37d17ff62b5d,40968d42-7d89-49e3-9931-78baa8e0544e",
  invoiceDate: "2022-05-05",
  invoiceDateLt: "2022-03-02",
  invoiceDateLte: "2022-03-01",
  invoiceDateGt: "2022-05-06",
  invoiceDateGte: "2022-05-04",
  invoiceDateRange: "2022-03-01,2022-05-06",
  invoiceIdentification: "862B9918-3K6H-4E0B-NAI9-2BE2D833B840",
  invoiceIdentificationIn:
    "862B9918-3K6H-4E0B-NAI9-2BE2D833B840,992B9918-3G6H-4E0B-DAI9-2BE2D833B833",
  linkIn:
    "8848bd0c-9c7e-4f53-a732-ec896b11d4c4,cc2b13cf-336e-497c-9fad-e074b580df65",
  status: "Vigente",
  statusIn: "Vigente,Cancelado",
  totalAmount: "1000.00",
  totalAmountLt: "540.00",
  totalAmountLte: "541.00",
  totalAmountGt: "520.00",
  totalAmountGte: "519.00",
  totalAmountRange: "519.00,541.00",
  type: "OUTFLOW",
  typeIn: "OUTFLOW,INFLOW",
});

console.log(listResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**number**] | A page number within the paginated result set. | (optional) defaults to undefined
 **pageSize** | [**number**] | Indicates how many results to return per page. By default we return 100 results per page.   ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).  | (optional) defaults to 100
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **link** | [**string**] | The `link.id` you want to filter by.  ℹ️ We highly recommend adding the `link.id` filter in order to improve your performance.  | (optional) defaults to undefined
 **createdAtGt** | [**string**] | Return invoices that were last updated in Belvo\'s database after this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtGte** | [**string**] | Return invoices that were last updated in Belvo\'s database after or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLt** | [**string**] | Return invoices that were last updated in Belvo\'s database before this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtLte** | [**string**] | Return invoices that were last updated in Belvo\'s database before or on this date (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **createdAtRange** | [**string**] | Return invoices that were last updated in Belvo\'s database between two dates (`YYYY-MM-DD` or full `ISO-8601` timestamp). | (optional) defaults to undefined
 **id** | [**string**] | Return information only for this `invoice.id`. | (optional) defaults to undefined
 **idIn** | [**string**] | Return information only for these `invoice.id`s. | (optional) defaults to undefined
 **invoiceDate** | [**string**] | Return invoices issued exactly on this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **invoiceDateLt** | [**string**] | Return balances issued before this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **invoiceDateLte** | [**string**] | Return balances issued on this date or earlier (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **invoiceDateGt** | [**string**] | Return invoices issued after this date (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **invoiceDateGte** | [**string**] | Return invoices issued on this date or later (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **invoiceDateRange** | [**string**] | Return invoices issued within this date range (`YYYY-MM-DD` or full ISO-8601 timestamp). | (optional) defaults to undefined
 **invoiceIdentification** | [**string**] | Return an invoice with this ID (as provided by the insitution). | (optional) defaults to undefined
 **invoiceIdentificationIn** | [**string**] | Return invoices with these IDs (as provided by the institution). | (optional) defaults to undefined
 **linkIn** | [**string**] | Return invoices only for these `link.id`s. | (optional) defaults to undefined
 **status** | [**string**] | Return invoices with this status. Can be either `Vigente` (valid) or `Cancelado` (cancelled). | (optional) defaults to undefined
 **statusIn** | [**string**] | Return invoices with these statuses. Can be either `Vigente` (valid) or `Cancelado` (cancelled). | (optional) defaults to undefined
 **totalAmount** | [**string**] | Return invoices matching exactly this value. | (optional) defaults to undefined
 **totalAmountLt** | [**string**] | Return invoices less than this value. | (optional) defaults to undefined
 **totalAmountLte** | [**string**] | Return invoices less than or equal to this value. | (optional) defaults to undefined
 **totalAmountGt** | [**string**] | Return invoices greater than this value. | (optional) defaults to undefined
 **totalAmountGte** | [**string**] | Return invoices greater than or equal to this value. | (optional) defaults to undefined
 **totalAmountRange** | [**string**] | Return invoices between these two values. | (optional) defaults to undefined
 **type** | [**string**] | Return invoices of this type. Can be either `OUTFLOW` or `INFLOW`. | (optional) defaults to undefined
 **typeIn** | [**string**] | Return invoices of these types. Can be either `OUTFLOW` or `INFLOW`. | (optional) defaults to undefined


### Return type

**InvoicesResponsePaginatedResponse**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**401** | Authentication to Belvo API failed |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# **retrieve**

#### **POST** /api/invoices

### Description
Retrieve invoice information from a specific fiscal link.
<div style="background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px"> <strong>Info: </strong> You can ask for up to **one** year (365 days) of invoices per request. If you need invoices for more than one year, just make another request. </div>


### Example


```typescript
import { Belvo } from "belvo-typescript-sdk";

const belvo = new Belvo({
  // Defining the base path is optional and defaults to https://sandbox.belvo.com
  // basePath: "https://sandbox.belvo.com",
});

const retrieveResponse = await belvo.invoices.retrieve({
  omit: "link,balance",
  fields: "link,balance,account",
  link: "d4617561-1c01-4b2f-83b6-a594f7b3bc57",
  date_from: "2020-01-01",
  date_to: "2020-02-01",
  type: "INFLOW",
  attach_xml: false,
  save_data: true,
});

console.log(retrieveResponse);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoicesRequest** | **InvoicesRequest**|  |
 **omit** | [**string**] | Omit certain fields from being returned in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined
 **fields** | [**string**] | Return only the specified fields in the response. For more information, see our [Filtering responses](https://developers.belvo.com/docs/searching-and-filtering) DevPortal article. | (optional) defaults to undefined


### Return type

**Array<InvoicesResponsePaginatedResponseResultsInner>**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok (when &#x60;save_data&#x3D;false&#x60;) |  -  |
**201** | Created (when &#x60;save_data&#x3D;true&#x60;) |  -  |
**400** | Bad request error |  -  |
**401** | Authentication to Belvo API failed |  -  |
**408** | Request Timeout |  -  |
**500** | Unexpected Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


